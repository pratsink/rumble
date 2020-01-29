package sparksoniq.spark.ml;

import org.apache.spark.ml.Transformer;
import org.apache.spark.ml.param.Param;
import org.apache.spark.ml.param.ParamMap;
import org.rumbledb.api.Item;
import sparksoniq.exceptions.OurBadException;
import sparksoniq.jsoniq.item.AtomicItem;
import sparksoniq.jsoniq.runtime.metadata.IteratorMetadata;
import sparksoniq.semantics.types.AtomicTypes;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class RumbleMLUtils {
    public static ParamMap convertRumbleObjectItemToSparkMLParamMap(
            Class<?> transformerClass,
            String transformerName,
            Transformer transformer,
            Item paramMapItem,
            IteratorMetadata metadata
    ) {
        ParamMap result = new ParamMap();
        // paramMapItem is expected to be an ObjectItem
        for (int paramIndex = 0; paramIndex < paramMapItem.getKeys().size(); paramIndex++) {
            String paramName = paramMapItem.getKeys().get(paramIndex);
            Item paramValue = paramMapItem.getValues().get(paramIndex);

            RumbleMLCatalog.validateParameterForTransformer(transformerName, paramName, metadata);
            String paramJavaTypeName = RumbleMLCatalog.getParamJavaTypeName(paramName, metadata);

            Object paramValueInJava = convertParamItemToJava(paramValue, paramJavaTypeName);

            try {
                Param<Object> sparkMLParam = (Param<Object>) transformerClass.getMethod(paramName).invoke(transformer);
                result.put(sparkMLParam.w(paramValueInJava));
            } catch (
                    NoSuchMethodException
                    | IllegalAccessException
                    | InvocationTargetException
                    | ClassCastException e
            ) {
                throw new OurBadException(
                        "Error while extracting " + paramName + " for " + transformerName + ".",
                        metadata
                );
            }
        }
        return result;
    }

    private static Object convertParamItemToJava(Item param, String paramJavaTypeName) {
        if (paramJavaTypeName.endsWith("[]")) {
            List<Object> paramAsListInJava = new ArrayList<>();
            // paramValue is expected to be an ArrayItem
            param.getItems().forEach(item -> {
                paramAsListInJava.add(
                    convertParamItemToJava(
                        item,
                        paramJavaTypeName.substring(0, paramJavaTypeName.length() - 2)
                    )
                );
            });
            return paramAsListInJava;
        } else if (expectedJavaTypeMatchesRumbleAtomic(paramJavaTypeName)) {
            return convertRumbleAtomicToJava((AtomicItem) param, paramJavaTypeName);
        } else {
            // complex SparkML parameters such as Estimator, Transformer, Classifier etc. are not implemented yet
            throw new OurBadException("Not Implemented");
        }
    }

    private static boolean expectedJavaTypeMatchesRumbleAtomic(String javaTypeName) {
        return (javaTypeName.equals("boolean")
            || javaTypeName.equals("String")
            || javaTypeName.equals("int")
            || javaTypeName.equals("double")
            || javaTypeName.equals("long"));
    }

    private static Object convertRumbleAtomicToJava(AtomicItem atomicItem, String javaTypeName) {
        switch (javaTypeName) {
            case "boolean":
                return atomicItem.castAs(AtomicTypes.BooleanItem).getBooleanValue();
            case "String":
                return atomicItem.castAs(AtomicTypes.StringItem).getStringValue();
            case "int":
                return atomicItem.castAs(AtomicTypes.IntegerItem).getIntegerValue();
            case "double":
            case "long":
                return atomicItem.castAs(AtomicTypes.DoubleItem).getDoubleValue();
            default:
                throw new OurBadException(
                        "Unrecognized Java type name found \""
                            + javaTypeName
                            + "\" while casting from atomic parameters."
                );
        }
    }
}