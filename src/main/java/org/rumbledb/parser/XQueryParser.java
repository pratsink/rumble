// Generated from ./XQueryParser.g4 by ANTLR 4.7

// Java header
package org.rumbledb.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EscapeQuot=1, EscapeApos=2, DOUBLE_LBRACE=3, DOUBLE_RBRACE=4, IntegerLiteral=5, 
		DecimalLiteral=6, DoubleLiteral=7, DFPropertyName=8, PredefinedEntityRef=9, 
		CharRef=10, Quot=11, Apos=12, COMMENT=13, XMLDECL=14, PI=15, CDATA=16, 
		PRAGMA=17, WS=18, EQUAL=19, NOT_EQUAL=20, LPAREN=21, RPAREN=22, LBRACKET=23, 
		RBRACKET=24, LBRACE=25, RBRACE=26, STAR=27, PLUS=28, MINUS=29, COMMA=30, 
		DOT=31, DDOT=32, COLON=33, COLON_EQ=34, SEMICOLON=35, SLASH=36, DSLASH=37, 
		BACKSLASH=38, VBAR=39, LANGLE=40, RANGLE=41, QUESTION=42, AT=43, DOLLAR=44, 
		MOD=45, BANG=46, HASH=47, CARAT=48, ARROW=49, GRAVE=50, CONCATENATION=51, 
		TILDE=52, KW_ALLOWING=53, KW_ANCESTOR=54, KW_ANCESTOR_OR_SELF=55, KW_AND=56, 
		KW_ARRAY=57, KW_AS=58, KW_ASCENDING=59, KW_AT=60, KW_ATTRIBUTE=61, KW_BASE_URI=62, 
		KW_BOUNDARY_SPACE=63, KW_BINARY=64, KW_BY=65, KW_CASE=66, KW_CAST=67, 
		KW_CASTABLE=68, KW_CATCH=69, KW_CHILD=70, KW_COLLATION=71, KW_COMMENT=72, 
		KW_CONSTRUCTION=73, KW_CONTEXT=74, KW_COPY_NS=75, KW_COUNT=76, KW_DECLARE=77, 
		KW_DEFAULT=78, KW_DESCENDANT=79, KW_DESCENDANT_OR_SELF=80, KW_DESCENDING=81, 
		KW_DECIMAL_FORMAT=82, KW_DIV=83, KW_DOCUMENT=84, KW_DOCUMENT_NODE=85, 
		KW_ELEMENT=86, KW_ELSE=87, KW_EMPTY=88, KW_EMPTY_SEQUENCE=89, KW_ENCODING=90, 
		KW_END=91, KW_EQ=92, KW_EVERY=93, KW_EXCEPT=94, KW_EXTERNAL=95, KW_FOLLOWING=96, 
		KW_FOLLOWING_SIBLING=97, KW_FOR=98, KW_FUNCTION=99, KW_GE=100, KW_GREATEST=101, 
		KW_GROUP=102, KW_GT=103, KW_IDIV=104, KW_IF=105, KW_IMPORT=106, KW_IN=107, 
		KW_INHERIT=108, KW_INSTANCE=109, KW_INTERSECT=110, KW_IS=111, KW_ITEM=112, 
		KW_LAX=113, KW_LE=114, KW_LEAST=115, KW_LET=116, KW_LT=117, KW_MAP=118, 
		KW_MOD=119, KW_MODULE=120, KW_NAMESPACE=121, KW_NE=122, KW_NEXT=123, KW_NAMESPACE_NODE=124, 
		KW_NO_INHERIT=125, KW_NO_PRESERVE=126, KW_NODE=127, KW_OF=128, KW_ONLY=129, 
		KW_OPTION=130, KW_OR=131, KW_ORDER=132, KW_ORDERED=133, KW_ORDERING=134, 
		KW_PARENT=135, KW_PRECEDING=136, KW_PRECEDING_SIBLING=137, KW_PRESERVE=138, 
		KW_PREVIOUS=139, KW_PI=140, KW_RETURN=141, KW_SATISFIES=142, KW_SCHEMA=143, 
		KW_SCHEMA_ATTR=144, KW_SCHEMA_ELEM=145, KW_SELF=146, KW_SLIDING=147, KW_SOME=148, 
		KW_STABLE=149, KW_START=150, KW_STRICT=151, KW_STRIP=152, KW_SWITCH=153, 
		KW_TEXT=154, KW_THEN=155, KW_TO=156, KW_TREAT=157, KW_TRY=158, KW_TUMBLING=159, 
		KW_TYPE=160, KW_TYPESWITCH=161, KW_UNION=162, KW_UNORDERED=163, KW_UPDATE=164, 
		KW_VALIDATE=165, KW_VARIABLE=166, KW_VERSION=167, KW_WHEN=168, KW_WHERE=169, 
		KW_WINDOW=170, KW_XQUERY=171, KW_ARRAY_NODE=172, KW_BOOLEAN_NODE=173, 
		KW_NULL_NODE=174, KW_NUMBER_NODE=175, KW_OBJECT_NODE=176, KW_REPLACE=177, 
		KW_WITH=178, KW_VALUE=179, KW_INSERT=180, KW_INTO=181, KW_DELETE=182, 
		KW_RENAME=183, URIQualifiedName=184, FullQName=185, NCNameWithLocalWildcard=186, 
		NCNameWithPrefixWildcard=187, NCName=188, XQDOC_COMMENT_START=189, XQDOC_COMMENT_END=190, 
		XQDocComment=191, XQComment=192, CHAR=193, ENTER_STRING=194, EXIT_INTERPOLATION=195, 
		ContentChar=196, BASIC_CHAR=197, ENTER_INTERPOLATION=198, EXIT_STRING=199, 
		EscapeQuot_QuotString=200, DOUBLE_LBRACE_QuotString=201, DOUBLE_RBRACE_QuotString=202, 
		EscapeApos_AposString=203;
	public static final int
		RULE_module = 0, RULE_xqDocComment = 1, RULE_versionDecl = 2, RULE_mainModule = 3, 
		RULE_queryBody = 4, RULE_libraryModule = 5, RULE_moduleDecl = 6, RULE_prolog = 7, 
		RULE_defaultNamespaceDecl = 8, RULE_setter = 9, RULE_boundarySpaceDecl = 10, 
		RULE_defaultCollationDecl = 11, RULE_baseURIDecl = 12, RULE_constructionDecl = 13, 
		RULE_orderingModeDecl = 14, RULE_emptyOrderDecl = 15, RULE_copyNamespacesDecl = 16, 
		RULE_preserveMode = 17, RULE_inheritMode = 18, RULE_decimalFormatDecl = 19, 
		RULE_schemaImport = 20, RULE_schemaPrefix = 21, RULE_moduleImport = 22, 
		RULE_namespaceDecl = 23, RULE_varDecl = 24, RULE_varValue = 25, RULE_varDefaultValue = 26, 
		RULE_contextItemDecl = 27, RULE_functionDecl = 28, RULE_functionParams = 29, 
		RULE_functionParam = 30, RULE_annotations = 31, RULE_annotation = 32, 
		RULE_annotList = 33, RULE_annotationParam = 34, RULE_functionReturn = 35, 
		RULE_optionDecl = 36, RULE_expr = 37, RULE_exprSingle = 38, RULE_flworExpr = 39, 
		RULE_initialClause = 40, RULE_intermediateClause = 41, RULE_forClause = 42, 
		RULE_forBinding = 43, RULE_allowingEmpty = 44, RULE_positionalVar = 45, 
		RULE_letClause = 46, RULE_letBinding = 47, RULE_windowClause = 48, RULE_tumblingWindowClause = 49, 
		RULE_slidingWindowClause = 50, RULE_windowStartCondition = 51, RULE_windowEndCondition = 52, 
		RULE_windowVars = 53, RULE_countClause = 54, RULE_whereClause = 55, RULE_groupByClause = 56, 
		RULE_groupingSpecList = 57, RULE_groupingSpec = 58, RULE_orderByClause = 59, 
		RULE_orderSpec = 60, RULE_returnClause = 61, RULE_quantifiedExpr = 62, 
		RULE_quantifiedVar = 63, RULE_switchExpr = 64, RULE_switchCaseClause = 65, 
		RULE_switchCaseOperand = 66, RULE_typeswitchExpr = 67, RULE_caseClause = 68, 
		RULE_sequenceUnionType = 69, RULE_ifExpr = 70, RULE_tryCatchExpr = 71, 
		RULE_tryClause = 72, RULE_enclosedTryTargetExpression = 73, RULE_catchClause = 74, 
		RULE_enclosedExpression = 75, RULE_catchErrorList = 76, RULE_existUpdateExpr = 77, 
		RULE_existReplaceExpr = 78, RULE_existValueExpr = 79, RULE_existInsertExpr = 80, 
		RULE_existDeleteExpr = 81, RULE_existRenameExpr = 82, RULE_orExpr = 83, 
		RULE_andExpr = 84, RULE_comparisonExpr = 85, RULE_stringConcatExpr = 86, 
		RULE_rangeExpr = 87, RULE_additiveExpr = 88, RULE_multiplicativeExpr = 89, 
		RULE_unionExpr = 90, RULE_intersectExceptExpr = 91, RULE_instanceOfExpr = 92, 
		RULE_treatExpr = 93, RULE_castableExpr = 94, RULE_castExpr = 95, RULE_arrowExpr = 96, 
		RULE_unaryExpr = 97, RULE_valueExpr = 98, RULE_generalComp = 99, RULE_valueComp = 100, 
		RULE_nodeComp = 101, RULE_validateExpr = 102, RULE_validationMode = 103, 
		RULE_extensionExpr = 104, RULE_simpleMapExpr = 105, RULE_pathExpr = 106, 
		RULE_relativePathExpr = 107, RULE_stepExpr = 108, RULE_axisStep = 109, 
		RULE_forwardStep = 110, RULE_forwardAxis = 111, RULE_abbrevForwardStep = 112, 
		RULE_reverseStep = 113, RULE_reverseAxis = 114, RULE_abbrevReverseStep = 115, 
		RULE_nodeTest = 116, RULE_nameTest = 117, RULE_wildcard = 118, RULE_postfixExpr = 119, 
		RULE_argumentList = 120, RULE_predicateList = 121, RULE_predicate = 122, 
		RULE_lookup = 123, RULE_keySpecifier = 124, RULE_arrowFunctionSpecifier = 125, 
		RULE_primaryExpr = 126, RULE_literal = 127, RULE_numericLiteral = 128, 
		RULE_varRef = 129, RULE_varName = 130, RULE_parenthesizedExpr = 131, RULE_contextItemExpr = 132, 
		RULE_orderedExpr = 133, RULE_unorderedExpr = 134, RULE_functionCall = 135, 
		RULE_argument = 136, RULE_nodeConstructor = 137, RULE_directConstructor = 138, 
		RULE_dirElemConstructorOpenClose = 139, RULE_dirElemConstructorSingleTag = 140, 
		RULE_dirAttributeList = 141, RULE_dirAttributeValueApos = 142, RULE_dirAttributeValueQuot = 143, 
		RULE_dirAttributeValue = 144, RULE_dirAttributeContentQuot = 145, RULE_dirAttributeContentApos = 146, 
		RULE_dirElemContent = 147, RULE_commonContent = 148, RULE_computedConstructor = 149, 
		RULE_compMLJSONConstructor = 150, RULE_compMLJSONArrayConstructor = 151, 
		RULE_compMLJSONObjectConstructor = 152, RULE_compMLJSONNumberConstructor = 153, 
		RULE_compMLJSONBooleanConstructor = 154, RULE_compMLJSONNullConstructor = 155, 
		RULE_compBinaryConstructor = 156, RULE_compDocConstructor = 157, RULE_compElemConstructor = 158, 
		RULE_enclosedContentExpr = 159, RULE_compAttrConstructor = 160, RULE_compNamespaceConstructor = 161, 
		RULE_prefix = 162, RULE_enclosedPrefixExpr = 163, RULE_enclosedURIExpr = 164, 
		RULE_compTextConstructor = 165, RULE_compCommentConstructor = 166, RULE_compPIConstructor = 167, 
		RULE_functionItemExpr = 168, RULE_namedFunctionRef = 169, RULE_inlineFunctionRef = 170, 
		RULE_functionBody = 171, RULE_mapConstructor = 172, RULE_mapConstructorEntry = 173, 
		RULE_arrayConstructor = 174, RULE_squareArrayConstructor = 175, RULE_curlyArrayConstructor = 176, 
		RULE_stringConstructor = 177, RULE_stringConstructorContent = 178, RULE_charNoGrave = 179, 
		RULE_charNoLBrace = 180, RULE_charNoRBrack = 181, RULE_stringConstructorChars = 182, 
		RULE_stringConstructorInterpolation = 183, RULE_unaryLookup = 184, RULE_singleType = 185, 
		RULE_typeDeclaration = 186, RULE_sequenceType = 187, RULE_itemType = 188, 
		RULE_atomicOrUnionType = 189, RULE_kindTest = 190, RULE_anyKindTest = 191, 
		RULE_binaryNodeTest = 192, RULE_documentTest = 193, RULE_textTest = 194, 
		RULE_commentTest = 195, RULE_namespaceNodeTest = 196, RULE_piTest = 197, 
		RULE_attributeTest = 198, RULE_attributeNameOrWildcard = 199, RULE_schemaAttributeTest = 200, 
		RULE_elementTest = 201, RULE_elementNameOrWildcard = 202, RULE_schemaElementTest = 203, 
		RULE_elementDeclaration = 204, RULE_attributeName = 205, RULE_elementName = 206, 
		RULE_simpleTypeName = 207, RULE_typeName = 208, RULE_functionTest = 209, 
		RULE_anyFunctionTest = 210, RULE_typedFunctionTest = 211, RULE_mapTest = 212, 
		RULE_anyMapTest = 213, RULE_typedMapTest = 214, RULE_arrayTest = 215, 
		RULE_anyArrayTest = 216, RULE_typedArrayTest = 217, RULE_parenthesizedItemTest = 218, 
		RULE_attributeDeclaration = 219, RULE_mlNodeTest = 220, RULE_mlArrayNodeTest = 221, 
		RULE_mlObjectNodeTest = 222, RULE_mlNumberNodeTest = 223, RULE_mlBooleanNodeTest = 224, 
		RULE_mlNullNodeTest = 225, RULE_eqName = 226, RULE_qName = 227, RULE_ncName = 228, 
		RULE_functionName = 229, RULE_keyword = 230, RULE_keywordNotOKForFunction = 231, 
		RULE_keywordOKForFunction = 232, RULE_uriLiteral = 233, RULE_stringLiteralQuot = 234, 
		RULE_stringLiteralApos = 235, RULE_stringLiteral = 236, RULE_stringContentQuot = 237, 
		RULE_stringContentApos = 238, RULE_noQuotesNoBracesNoAmpNoLAng = 239;
	public static final String[] ruleNames = {
		"module", "xqDocComment", "versionDecl", "mainModule", "queryBody", "libraryModule", 
		"moduleDecl", "prolog", "defaultNamespaceDecl", "setter", "boundarySpaceDecl", 
		"defaultCollationDecl", "baseURIDecl", "constructionDecl", "orderingModeDecl", 
		"emptyOrderDecl", "copyNamespacesDecl", "preserveMode", "inheritMode", 
		"decimalFormatDecl", "schemaImport", "schemaPrefix", "moduleImport", "namespaceDecl", 
		"varDecl", "varValue", "varDefaultValue", "contextItemDecl", "functionDecl", 
		"functionParams", "functionParam", "annotations", "annotation", "annotList", 
		"annotationParam", "functionReturn", "optionDecl", "expr", "exprSingle", 
		"flworExpr", "initialClause", "intermediateClause", "forClause", "forBinding", 
		"allowingEmpty", "positionalVar", "letClause", "letBinding", "windowClause", 
		"tumblingWindowClause", "slidingWindowClause", "windowStartCondition", 
		"windowEndCondition", "windowVars", "countClause", "whereClause", "groupByClause", 
		"groupingSpecList", "groupingSpec", "orderByClause", "orderSpec", "returnClause", 
		"quantifiedExpr", "quantifiedVar", "switchExpr", "switchCaseClause", "switchCaseOperand", 
		"typeswitchExpr", "caseClause", "sequenceUnionType", "ifExpr", "tryCatchExpr", 
		"tryClause", "enclosedTryTargetExpression", "catchClause", "enclosedExpression", 
		"catchErrorList", "existUpdateExpr", "existReplaceExpr", "existValueExpr", 
		"existInsertExpr", "existDeleteExpr", "existRenameExpr", "orExpr", "andExpr", 
		"comparisonExpr", "stringConcatExpr", "rangeExpr", "additiveExpr", "multiplicativeExpr", 
		"unionExpr", "intersectExceptExpr", "instanceOfExpr", "treatExpr", "castableExpr", 
		"castExpr", "arrowExpr", "unaryExpr", "valueExpr", "generalComp", "valueComp", 
		"nodeComp", "validateExpr", "validationMode", "extensionExpr", "simpleMapExpr", 
		"pathExpr", "relativePathExpr", "stepExpr", "axisStep", "forwardStep", 
		"forwardAxis", "abbrevForwardStep", "reverseStep", "reverseAxis", "abbrevReverseStep", 
		"nodeTest", "nameTest", "wildcard", "postfixExpr", "argumentList", "predicateList", 
		"predicate", "lookup", "keySpecifier", "arrowFunctionSpecifier", "primaryExpr", 
		"literal", "numericLiteral", "varRef", "varName", "parenthesizedExpr", 
		"contextItemExpr", "orderedExpr", "unorderedExpr", "functionCall", "argument", 
		"nodeConstructor", "directConstructor", "dirElemConstructorOpenClose", 
		"dirElemConstructorSingleTag", "dirAttributeList", "dirAttributeValueApos", 
		"dirAttributeValueQuot", "dirAttributeValue", "dirAttributeContentQuot", 
		"dirAttributeContentApos", "dirElemContent", "commonContent", "computedConstructor", 
		"compMLJSONConstructor", "compMLJSONArrayConstructor", "compMLJSONObjectConstructor", 
		"compMLJSONNumberConstructor", "compMLJSONBooleanConstructor", "compMLJSONNullConstructor", 
		"compBinaryConstructor", "compDocConstructor", "compElemConstructor", 
		"enclosedContentExpr", "compAttrConstructor", "compNamespaceConstructor", 
		"prefix", "enclosedPrefixExpr", "enclosedURIExpr", "compTextConstructor", 
		"compCommentConstructor", "compPIConstructor", "functionItemExpr", "namedFunctionRef", 
		"inlineFunctionRef", "functionBody", "mapConstructor", "mapConstructorEntry", 
		"arrayConstructor", "squareArrayConstructor", "curlyArrayConstructor", 
		"stringConstructor", "stringConstructorContent", "charNoGrave", "charNoLBrace", 
		"charNoRBrack", "stringConstructorChars", "stringConstructorInterpolation", 
		"unaryLookup", "singleType", "typeDeclaration", "sequenceType", "itemType", 
		"atomicOrUnionType", "kindTest", "anyKindTest", "binaryNodeTest", "documentTest", 
		"textTest", "commentTest", "namespaceNodeTest", "piTest", "attributeTest", 
		"attributeNameOrWildcard", "schemaAttributeTest", "elementTest", "elementNameOrWildcard", 
		"schemaElementTest", "elementDeclaration", "attributeName", "elementName", 
		"simpleTypeName", "typeName", "functionTest", "anyFunctionTest", "typedFunctionTest", 
		"mapTest", "anyMapTest", "typedMapTest", "arrayTest", "anyArrayTest", 
		"typedArrayTest", "parenthesizedItemTest", "attributeDeclaration", "mlNodeTest", 
		"mlArrayNodeTest", "mlObjectNodeTest", "mlNumberNodeTest", "mlBooleanNodeTest", 
		"mlNullNodeTest", "eqName", "qName", "ncName", "functionName", "keyword", 
		"keywordNotOKForFunction", "keywordOKForFunction", "uriLiteral", "stringLiteralQuot", 
		"stringLiteralApos", "stringLiteral", "stringContentQuot", "stringContentApos", 
		"noQuotesNoBracesNoAmpNoLAng"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EscapeQuot", "EscapeApos", "DOUBLE_LBRACE", "DOUBLE_RBRACE", "IntegerLiteral", 
		"DecimalLiteral", "DoubleLiteral", "DFPropertyName", "PredefinedEntityRef", 
		"CharRef", "Quot", "Apos", "COMMENT", "XMLDECL", "PI", "CDATA", "PRAGMA", 
		"WS", "EQUAL", "NOT_EQUAL", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
		"LBRACE", "RBRACE", "STAR", "PLUS", "MINUS", "COMMA", "DOT", "DDOT", "COLON", 
		"COLON_EQ", "SEMICOLON", "SLASH", "DSLASH", "BACKSLASH", "VBAR", "LANGLE", 
		"RANGLE", "QUESTION", "AT", "DOLLAR", "MOD", "BANG", "HASH", "CARAT", 
		"ARROW", "GRAVE", "CONCATENATION", "TILDE", "KW_ALLOWING", "KW_ANCESTOR", 
		"KW_ANCESTOR_OR_SELF", "KW_AND", "KW_ARRAY", "KW_AS", "KW_ASCENDING", 
		"KW_AT", "KW_ATTRIBUTE", "KW_BASE_URI", "KW_BOUNDARY_SPACE", "KW_BINARY", 
		"KW_BY", "KW_CASE", "KW_CAST", "KW_CASTABLE", "KW_CATCH", "KW_CHILD", 
		"KW_COLLATION", "KW_COMMENT", "KW_CONSTRUCTION", "KW_CONTEXT", "KW_COPY_NS", 
		"KW_COUNT", "KW_DECLARE", "KW_DEFAULT", "KW_DESCENDANT", "KW_DESCENDANT_OR_SELF", 
		"KW_DESCENDING", "KW_DECIMAL_FORMAT", "KW_DIV", "KW_DOCUMENT", "KW_DOCUMENT_NODE", 
		"KW_ELEMENT", "KW_ELSE", "KW_EMPTY", "KW_EMPTY_SEQUENCE", "KW_ENCODING", 
		"KW_END", "KW_EQ", "KW_EVERY", "KW_EXCEPT", "KW_EXTERNAL", "KW_FOLLOWING", 
		"KW_FOLLOWING_SIBLING", "KW_FOR", "KW_FUNCTION", "KW_GE", "KW_GREATEST", 
		"KW_GROUP", "KW_GT", "KW_IDIV", "KW_IF", "KW_IMPORT", "KW_IN", "KW_INHERIT", 
		"KW_INSTANCE", "KW_INTERSECT", "KW_IS", "KW_ITEM", "KW_LAX", "KW_LE", 
		"KW_LEAST", "KW_LET", "KW_LT", "KW_MAP", "KW_MOD", "KW_MODULE", "KW_NAMESPACE", 
		"KW_NE", "KW_NEXT", "KW_NAMESPACE_NODE", "KW_NO_INHERIT", "KW_NO_PRESERVE", 
		"KW_NODE", "KW_OF", "KW_ONLY", "KW_OPTION", "KW_OR", "KW_ORDER", "KW_ORDERED", 
		"KW_ORDERING", "KW_PARENT", "KW_PRECEDING", "KW_PRECEDING_SIBLING", "KW_PRESERVE", 
		"KW_PREVIOUS", "KW_PI", "KW_RETURN", "KW_SATISFIES", "KW_SCHEMA", "KW_SCHEMA_ATTR", 
		"KW_SCHEMA_ELEM", "KW_SELF", "KW_SLIDING", "KW_SOME", "KW_STABLE", "KW_START", 
		"KW_STRICT", "KW_STRIP", "KW_SWITCH", "KW_TEXT", "KW_THEN", "KW_TO", "KW_TREAT", 
		"KW_TRY", "KW_TUMBLING", "KW_TYPE", "KW_TYPESWITCH", "KW_UNION", "KW_UNORDERED", 
		"KW_UPDATE", "KW_VALIDATE", "KW_VARIABLE", "KW_VERSION", "KW_WHEN", "KW_WHERE", 
		"KW_WINDOW", "KW_XQUERY", "KW_ARRAY_NODE", "KW_BOOLEAN_NODE", "KW_NULL_NODE", 
		"KW_NUMBER_NODE", "KW_OBJECT_NODE", "KW_REPLACE", "KW_WITH", "KW_VALUE", 
		"KW_INSERT", "KW_INTO", "KW_DELETE", "KW_RENAME", "URIQualifiedName", 
		"FullQName", "NCNameWithLocalWildcard", "NCNameWithPrefixWildcard", "NCName", 
		"XQDOC_COMMENT_START", "XQDOC_COMMENT_END", "XQDocComment", "XQComment", 
		"CHAR", "ENTER_STRING", "EXIT_INTERPOLATION", "ContentChar", "BASIC_CHAR", 
		"ENTER_INTERPOLATION", "EXIT_STRING", "EscapeQuot_QuotString", "DOUBLE_LBRACE_QuotString", 
		"DOUBLE_RBRACE_QuotString", "EscapeApos_AposString"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "XQueryParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModuleContext extends ParserRuleContext {
		public LibraryModuleContext libraryModule() {
			return getRuleContext(LibraryModuleContext.class,0);
		}
		public MainModuleContext mainModule() {
			return getRuleContext(MainModuleContext.class,0);
		}
		public List<XqDocCommentContext> xqDocComment() {
			return getRuleContexts(XqDocCommentContext.class);
		}
		public XqDocCommentContext xqDocComment(int i) {
			return getRuleContext(XqDocCommentContext.class,i);
		}
		public VersionDeclContext versionDecl() {
			return getRuleContext(VersionDeclContext.class,0);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(480);
				xqDocComment();
				}
				break;
			}
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(483);
				versionDecl();
				}
				break;
			}
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(486);
				xqDocComment();
				}
				break;
			}
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(489);
				libraryModule();
				}
				break;
			case 2:
				{
				setState(490);
				mainModule();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XqDocCommentContext extends ParserRuleContext {
		public TerminalNode XQDocComment() { return getToken(XQueryParser.XQDocComment, 0); }
		public XqDocCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xqDocComment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitXqDocComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqDocCommentContext xqDocComment() throws RecognitionException {
		XqDocCommentContext _localctx = new XqDocCommentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_xqDocComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(XQDocComment);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionDeclContext extends ParserRuleContext {
		public StringLiteralContext version;
		public StringLiteralContext encoding;
		public TerminalNode KW_XQUERY() { return getToken(XQueryParser.KW_XQUERY, 0); }
		public TerminalNode KW_VERSION() { return getToken(XQueryParser.KW_VERSION, 0); }
		public TerminalNode SEMICOLON() { return getToken(XQueryParser.SEMICOLON, 0); }
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public TerminalNode KW_ENCODING() { return getToken(XQueryParser.KW_ENCODING, 0); }
		public VersionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitVersionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionDeclContext versionDecl() throws RecognitionException {
		VersionDeclContext _localctx = new VersionDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_versionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(KW_XQUERY);
			setState(496);
			match(KW_VERSION);
			setState(497);
			((VersionDeclContext)_localctx).version = stringLiteral();
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ENCODING) {
				{
				setState(498);
				match(KW_ENCODING);
				setState(499);
				((VersionDeclContext)_localctx).encoding = stringLiteral();
				}
			}

			setState(502);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainModuleContext extends ParserRuleContext {
		public PrologContext prolog() {
			return getRuleContext(PrologContext.class,0);
		}
		public QueryBodyContext queryBody() {
			return getRuleContext(QueryBodyContext.class,0);
		}
		public MainModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainModule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitMainModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainModuleContext mainModule() throws RecognitionException {
		MainModuleContext _localctx = new MainModuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainModule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			prolog();
			setState(505);
			queryBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryBodyContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public QueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryBodyContext queryBody() throws RecognitionException {
		QueryBodyContext _localctx = new QueryBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_queryBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibraryModuleContext extends ParserRuleContext {
		public ModuleDeclContext moduleDecl() {
			return getRuleContext(ModuleDeclContext.class,0);
		}
		public PrologContext prolog() {
			return getRuleContext(PrologContext.class,0);
		}
		public LibraryModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryModule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitLibraryModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibraryModuleContext libraryModule() throws RecognitionException {
		LibraryModuleContext _localctx = new LibraryModuleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_libraryModule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			moduleDecl();
			setState(510);
			prolog();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleDeclContext extends ParserRuleContext {
		public StringLiteralContext uri;
		public TerminalNode KW_MODULE() { return getToken(XQueryParser.KW_MODULE, 0); }
		public TerminalNode KW_NAMESPACE() { return getToken(XQueryParser.KW_NAMESPACE, 0); }
		public NcNameContext ncName() {
			return getRuleContext(NcNameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(XQueryParser.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(XQueryParser.SEMICOLON, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public ModuleDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitModuleDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDeclContext moduleDecl() throws RecognitionException {
		ModuleDeclContext _localctx = new ModuleDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_moduleDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(KW_MODULE);
			setState(513);
			match(KW_NAMESPACE);
			setState(514);
			ncName();
			setState(515);
			match(EQUAL);
			setState(516);
			((ModuleDeclContext)_localctx).uri = stringLiteral();
			setState(517);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrologContext extends ParserRuleContext {
		public List<TerminalNode> SEMICOLON() { return getTokens(XQueryParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(XQueryParser.SEMICOLON, i);
		}
		public List<DefaultNamespaceDeclContext> defaultNamespaceDecl() {
			return getRuleContexts(DefaultNamespaceDeclContext.class);
		}
		public DefaultNamespaceDeclContext defaultNamespaceDecl(int i) {
			return getRuleContext(DefaultNamespaceDeclContext.class,i);
		}
		public List<SetterContext> setter() {
			return getRuleContexts(SetterContext.class);
		}
		public SetterContext setter(int i) {
			return getRuleContext(SetterContext.class,i);
		}
		public List<NamespaceDeclContext> namespaceDecl() {
			return getRuleContexts(NamespaceDeclContext.class);
		}
		public NamespaceDeclContext namespaceDecl(int i) {
			return getRuleContext(NamespaceDeclContext.class,i);
		}
		public List<SchemaImportContext> schemaImport() {
			return getRuleContexts(SchemaImportContext.class);
		}
		public SchemaImportContext schemaImport(int i) {
			return getRuleContext(SchemaImportContext.class,i);
		}
		public List<ModuleImportContext> moduleImport() {
			return getRuleContexts(ModuleImportContext.class);
		}
		public ModuleImportContext moduleImport(int i) {
			return getRuleContext(ModuleImportContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<ContextItemDeclContext> contextItemDecl() {
			return getRuleContexts(ContextItemDeclContext.class);
		}
		public ContextItemDeclContext contextItemDecl(int i) {
			return getRuleContext(ContextItemDeclContext.class,i);
		}
		public List<OptionDeclContext> optionDecl() {
			return getRuleContexts(OptionDeclContext.class);
		}
		public OptionDeclContext optionDecl(int i) {
			return getRuleContext(OptionDeclContext.class,i);
		}
		public List<XqDocCommentContext> xqDocComment() {
			return getRuleContexts(XqDocCommentContext.class);
		}
		public XqDocCommentContext xqDocComment(int i) {
			return getRuleContext(XqDocCommentContext.class,i);
		}
		public PrologContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prolog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitProlog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrologContext prolog() throws RecognitionException {
		PrologContext _localctx = new PrologContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_prolog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(524);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(519);
						defaultNamespaceDecl();
						}
						break;
					case 2:
						{
						setState(520);
						setter();
						}
						break;
					case 3:
						{
						setState(521);
						namespaceDecl();
						}
						break;
					case 4:
						{
						setState(522);
						schemaImport();
						}
						break;
					case 5:
						{
						setState(523);
						moduleImport();
						}
						break;
					}
					setState(526);
					match(SEMICOLON);
					}
					} 
				}
				setState(532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(534);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==XQDocComment) {
						{
						setState(533);
						xqDocComment();
						}
					}

					setState(540);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(536);
						varDecl();
						}
						break;
					case 2:
						{
						setState(537);
						functionDecl();
						}
						break;
					case 3:
						{
						setState(538);
						contextItemDecl();
						}
						break;
					case 4:
						{
						setState(539);
						optionDecl();
						}
						break;
					}
					setState(542);
					match(SEMICOLON);
					}
					} 
				}
				setState(548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultNamespaceDeclContext extends ParserRuleContext {
		public Token type;
		public StringLiteralContext uri;
		public TerminalNode KW_DECLARE() { return getToken(XQueryParser.KW_DECLARE, 0); }
		public TerminalNode KW_DEFAULT() { return getToken(XQueryParser.KW_DEFAULT, 0); }
		public TerminalNode KW_NAMESPACE() { return getToken(XQueryParser.KW_NAMESPACE, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode KW_ELEMENT() { return getToken(XQueryParser.KW_ELEMENT, 0); }
		public TerminalNode KW_FUNCTION() { return getToken(XQueryParser.KW_FUNCTION, 0); }
		public DefaultNamespaceDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultNamespaceDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitDefaultNamespaceDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultNamespaceDeclContext defaultNamespaceDecl() throws RecognitionException {
		DefaultNamespaceDeclContext _localctx = new DefaultNamespaceDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defaultNamespaceDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(KW_DECLARE);
			setState(550);
			match(KW_DEFAULT);
			setState(551);
			((DefaultNamespaceDeclContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==KW_ELEMENT || _la==KW_FUNCTION) ) {
				((DefaultNamespaceDeclContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(552);
			match(KW_NAMESPACE);
			setState(553);
			((DefaultNamespaceDeclContext)_localctx).uri = stringLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetterContext extends ParserRuleContext {
		public BoundarySpaceDeclContext boundarySpaceDecl() {
			return getRuleContext(BoundarySpaceDeclContext.class,0);
		}
		public DefaultCollationDeclContext defaultCollationDecl() {
			return getRuleContext(DefaultCollationDeclContext.class,0);
		}
		public BaseURIDeclContext baseURIDecl() {
			return getRuleContext(BaseURIDeclContext.class,0);
		}
		public ConstructionDeclContext constructionDecl() {
			return getRuleContext(ConstructionDeclContext.class,0);
		}
		public OrderingModeDeclContext orderingModeDecl() {
			return getRuleContext(OrderingModeDeclContext.class,0);
		}
		public EmptyOrderDeclContext emptyOrderDecl() {
			return getRuleContext(EmptyOrderDeclContext.class,0);
		}
		public CopyNamespacesDeclContext copyNamespacesDecl() {
			return getRuleContext(CopyNamespacesDeclContext.class,0);
		}
		public DecimalFormatDeclContext decimalFormatDecl() {
			return getRuleContext(DecimalFormatDeclContext.class,0);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitSetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_setter);
		try {
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				boundarySpaceDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				defaultCollationDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(557);
				baseURIDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(558);
				constructionDecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(559);
				orderingModeDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(560);
				emptyOrderDecl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(561);
				copyNamespacesDecl();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(562);
				decimalFormatDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoundarySpaceDeclContext extends ParserRuleContext {
		public Token type;
		public TerminalNode KW_DECLARE() { return getToken(XQueryParser.KW_DECLARE, 0); }
		public TerminalNode KW_BOUNDARY_SPACE() { return getToken(XQueryParser.KW_BOUNDARY_SPACE, 0); }
		public TerminalNode KW_PRESERVE() { return getToken(XQueryParser.KW_PRESERVE, 0); }
		public TerminalNode KW_STRIP() { return getToken(XQueryParser.KW_STRIP, 0); }
		public BoundarySpaceDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundarySpaceDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitBoundarySpaceDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundarySpaceDeclContext boundarySpaceDecl() throws RecognitionException {
		BoundarySpaceDeclContext _localctx = new BoundarySpaceDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boundarySpaceDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(KW_DECLARE);
			setState(566);
			match(KW_BOUNDARY_SPACE);
			setState(567);
			((BoundarySpaceDeclContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==KW_PRESERVE || _la==KW_STRIP) ) {
				((BoundarySpaceDeclContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultCollationDeclContext extends ParserRuleContext {
		public TerminalNode KW_DECLARE() { return getToken(XQueryParser.KW_DECLARE, 0); }
		public TerminalNode KW_DEFAULT() { return getToken(XQueryParser.KW_DEFAULT, 0); }
		public TerminalNode KW_COLLATION() { return getToken(XQueryParser.KW_COLLATION, 0); }
		public UriLiteralContext uriLiteral() {
			return getRuleContext(UriLiteralContext.class,0);
		}
		public DefaultCollationDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCollationDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitDefaultCollationDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultCollationDeclContext defaultCollationDecl() throws RecognitionException {
		DefaultCollationDeclContext _localctx = new DefaultCollationDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_defaultCollationDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(KW_DECLARE);
			setState(570);
			match(KW_DEFAULT);
			setState(571);
			match(KW_COLLATION);
			setState(572);
			uriLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseURIDeclContext extends ParserRuleContext {
		public TerminalNode KW_DECLARE() { return getToken(XQueryParser.KW_DECLARE, 0); }
		public TerminalNode KW_BASE_URI() { return getToken(XQueryParser.KW_BASE_URI, 0); }
		public UriLiteralContext uriLiteral() {
			return getRuleContext(UriLiteralContext.class,0);
		}
		public BaseURIDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseURIDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitBaseURIDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseURIDeclContext baseURIDecl() throws RecognitionException {
		BaseURIDeclContext _localctx = new BaseURIDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_baseURIDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(KW_DECLARE);
			setState(575);
			match(KW_BASE_URI);
			setState(576);
			uriLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructionDeclContext extends ParserRuleContext {
		public Token type;
		public TerminalNode KW_DECLARE() { return getToken(XQueryParser.KW_DECLARE, 0); }
		public TerminalNode KW_CONSTRUCTION() { return getToken(XQueryParser.KW_CONSTRUCTION, 0); }
		public TerminalNode KW_STRIP() { return getToken(XQueryParser.KW_STRIP, 0); }
		public TerminalNode KW_PRESERVE() { return getToken(XQueryParser.KW_PRESERVE, 0); }
		public ConstructionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructionDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitConstructionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructionDeclContext constructionDecl() throws RecognitionException {
		ConstructionDeclContext _localctx = new ConstructionDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constructionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(KW_DECLARE);
			setState(579);
			match(KW_CONSTRUCTION);
			setState(580);
			((ConstructionDeclContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==KW_PRESERVE || _la==KW_STRIP) ) {
				((ConstructionDeclContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderingModeDeclContext extends ParserRuleContext {
		public Token type;
		public TerminalNode KW_DECLARE() { return getToken(XQueryParser.KW_DECLARE, 0); }
		public TerminalNode KW_ORDERING() { return getToken(XQueryParser.KW_ORDERING, 0); }
		public TerminalNode KW_ORDERED() { return getToken(XQueryParser.KW_ORDERED, 0); }
		public TerminalNode KW_UNORDERED() { return getToken(XQueryParser.KW_UNORDERED, 0); }
		public OrderingModeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderingModeDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitOrderingModeDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderingModeDeclContext orderingModeDecl() throws RecognitionException {
		OrderingModeDeclContext _localctx = new OrderingModeDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_orderingModeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(KW_DECLARE);
			setState(583);
			match(KW_ORDERING);
			setState(584);
			((OrderingModeDeclContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==KW_ORDERED || _la==KW_UNORDERED) ) {
				((OrderingModeDeclContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyOrderDeclContext extends ParserRuleContext {
		public Token type;
		public TerminalNode KW_DECLARE() { return getToken(XQueryParser.KW_DECLARE, 0); }
		public TerminalNode KW_DEFAULT() { return getToken(XQueryParser.KW_DEFAULT, 0); }
		public TerminalNode KW_ORDER() { return getToken(XQueryParser.KW_ORDER, 0); }
		public TerminalNode KW_EMPTY() { return getToken(XQueryParser.KW_EMPTY, 0); }
		public TerminalNode KW_GREATEST() { return getToken(XQueryParser.KW_GREATEST, 0); }
		public TerminalNode KW_LEAST() { return getToken(XQueryParser.KW_LEAST, 0); }
		public EmptyOrderDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyOrderDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitEmptyOrderDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyOrderDeclContext emptyOrderDecl() throws RecognitionException {
		EmptyOrderDeclContext _localctx = new EmptyOrderDeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_emptyOrderDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(KW_DECLARE);
			setState(587);
			match(KW_DEFAULT);
			setState(588);
			match(KW_ORDER);
			setState(589);
			match(KW_EMPTY);
			setState(590);
			((EmptyOrderDeclContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==KW_GREATEST || _la==KW_LEAST) ) {
				((EmptyOrderDeclContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CopyNamespacesDeclContext extends ParserRuleContext {
		public TerminalNode KW_DECLARE() { return getToken(XQueryParser.KW_DECLARE, 0); }
		public TerminalNode KW_COPY_NS() { return getToken(XQueryParser.KW_COPY_NS, 0); }
		public PreserveModeContext preserveMode() {
			return getRuleContext(PreserveModeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(XQueryParser.COMMA, 0); }
		public InheritModeContext inheritMode() {
			return getRuleContext(InheritModeContext.class,0);
		}
		public CopyNamespacesDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copyNamespacesDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCopyNamespacesDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CopyNamespacesDeclContext copyNamespacesDecl() throws RecognitionException {
		CopyNamespacesDeclContext _localctx = new CopyNamespacesDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_copyNamespacesDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(KW_DECLARE);
			setState(593);
			match(KW_COPY_NS);
			setState(594);
			preserveMode();
			setState(595);
			match(COMMA);
			setState(596);
			inheritMode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreserveModeContext extends ParserRuleContext {
		public TerminalNode KW_PRESERVE() { return getToken(XQueryParser.KW_PRESERVE, 0); }
		public TerminalNode KW_NO_PRESERVE() { return getToken(XQueryParser.KW_NO_PRESERVE, 0); }
		public PreserveModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preserveMode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitPreserveMode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreserveModeContext preserveMode() throws RecognitionException {
		PreserveModeContext _localctx = new PreserveModeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_preserveMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_la = _input.LA(1);
			if ( !(_la==KW_NO_PRESERVE || _la==KW_PRESERVE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritModeContext extends ParserRuleContext {
		public TerminalNode KW_INHERIT() { return getToken(XQueryParser.KW_INHERIT, 0); }
		public TerminalNode KW_NO_INHERIT() { return getToken(XQueryParser.KW_NO_INHERIT, 0); }
		public InheritModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritMode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitInheritMode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritModeContext inheritMode() throws RecognitionException {
		InheritModeContext _localctx = new InheritModeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_inheritMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_la = _input.LA(1);
			if ( !(_la==KW_INHERIT || _la==KW_NO_INHERIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalFormatDeclContext extends ParserRuleContext {
		public TerminalNode KW_DECLARE() { return getToken(XQueryParser.KW_DECLARE, 0); }
		public List<TerminalNode> DFPropertyName() { return getTokens(XQueryParser.DFPropertyName); }
		public TerminalNode DFPropertyName(int i) {
			return getToken(XQueryParser.DFPropertyName, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(XQueryParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(XQueryParser.EQUAL, i);
		}
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public TerminalNode KW_DECIMAL_FORMAT() { return getToken(XQueryParser.KW_DECIMAL_FORMAT, 0); }
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public TerminalNode KW_DEFAULT() { return getToken(XQueryParser.KW_DEFAULT, 0); }
		public DecimalFormatDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalFormatDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitDecimalFormatDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalFormatDeclContext decimalFormatDecl() throws RecognitionException {
		DecimalFormatDeclContext _localctx = new DecimalFormatDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_decimalFormatDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(KW_DECLARE);
			setState(607);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_DECIMAL_FORMAT:
				{
				{
				setState(603);
				match(KW_DECIMAL_FORMAT);
				setState(604);
				eqName();
				}
				}
				break;
			case KW_DEFAULT:
				{
				{
				setState(605);
				match(KW_DEFAULT);
				setState(606);
				match(KW_DECIMAL_FORMAT);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DFPropertyName) {
				{
				{
				setState(609);
				match(DFPropertyName);
				setState(610);
				match(EQUAL);
				setState(611);
				stringLiteral();
				}
				}
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaImportContext extends ParserRuleContext {
		public UriLiteralContext nsURI;
		public UriLiteralContext uriLiteral;
		public List<UriLiteralContext> locations = new ArrayList<UriLiteralContext>();
		public TerminalNode KW_IMPORT() { return getToken(XQueryParser.KW_IMPORT, 0); }
		public TerminalNode KW_SCHEMA() { return getToken(XQueryParser.KW_SCHEMA, 0); }
		public List<UriLiteralContext> uriLiteral() {
			return getRuleContexts(UriLiteralContext.class);
		}
		public UriLiteralContext uriLiteral(int i) {
			return getRuleContext(UriLiteralContext.class,i);
		}
		public SchemaPrefixContext schemaPrefix() {
			return getRuleContext(SchemaPrefixContext.class,0);
		}
		public TerminalNode KW_AT() { return getToken(XQueryParser.KW_AT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public SchemaImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaImport; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitSchemaImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaImportContext schemaImport() throws RecognitionException {
		SchemaImportContext _localctx = new SchemaImportContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_schemaImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(KW_IMPORT);
			setState(618);
			match(KW_SCHEMA);
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DEFAULT || _la==KW_NAMESPACE) {
				{
				setState(619);
				schemaPrefix();
				}
			}

			setState(622);
			((SchemaImportContext)_localctx).nsURI = uriLiteral();
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AT) {
				{
				setState(623);
				match(KW_AT);
				setState(624);
				((SchemaImportContext)_localctx).uriLiteral = uriLiteral();
				((SchemaImportContext)_localctx).locations.add(((SchemaImportContext)_localctx).uriLiteral);
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(625);
					match(COMMA);
					setState(626);
					((SchemaImportContext)_localctx).uriLiteral = uriLiteral();
					((SchemaImportContext)_localctx).locations.add(((SchemaImportContext)_localctx).uriLiteral);
					}
					}
					setState(631);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaPrefixContext extends ParserRuleContext {
		public TerminalNode KW_NAMESPACE() { return getToken(XQueryParser.KW_NAMESPACE, 0); }
		public NcNameContext ncName() {
			return getRuleContext(NcNameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(XQueryParser.EQUAL, 0); }
		public TerminalNode KW_DEFAULT() { return getToken(XQueryParser.KW_DEFAULT, 0); }
		public TerminalNode KW_ELEMENT() { return getToken(XQueryParser.KW_ELEMENT, 0); }
		public SchemaPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaPrefix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitSchemaPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaPrefixContext schemaPrefix() throws RecognitionException {
		SchemaPrefixContext _localctx = new SchemaPrefixContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_schemaPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_NAMESPACE:
				{
				setState(634);
				match(KW_NAMESPACE);
				setState(635);
				ncName();
				setState(636);
				match(EQUAL);
				}
				break;
			case KW_DEFAULT:
				{
				setState(638);
				match(KW_DEFAULT);
				setState(639);
				match(KW_ELEMENT);
				setState(640);
				match(KW_NAMESPACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleImportContext extends ParserRuleContext {
		public UriLiteralContext nsURI;
		public UriLiteralContext uriLiteral;
		public List<UriLiteralContext> locations = new ArrayList<UriLiteralContext>();
		public TerminalNode KW_IMPORT() { return getToken(XQueryParser.KW_IMPORT, 0); }
		public TerminalNode KW_MODULE() { return getToken(XQueryParser.KW_MODULE, 0); }
		public List<UriLiteralContext> uriLiteral() {
			return getRuleContexts(UriLiteralContext.class);
		}
		public UriLiteralContext uriLiteral(int i) {
			return getRuleContext(UriLiteralContext.class,i);
		}
		public TerminalNode KW_NAMESPACE() { return getToken(XQueryParser.KW_NAMESPACE, 0); }
		public NcNameContext ncName() {
			return getRuleContext(NcNameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(XQueryParser.EQUAL, 0); }
		public TerminalNode KW_AT() { return getToken(XQueryParser.KW_AT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public ModuleImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleImport; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitModuleImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleImportContext moduleImport() throws RecognitionException {
		ModuleImportContext _localctx = new ModuleImportContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_moduleImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(KW_IMPORT);
			setState(644);
			match(KW_MODULE);
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_NAMESPACE) {
				{
				setState(645);
				match(KW_NAMESPACE);
				setState(646);
				ncName();
				setState(647);
				match(EQUAL);
				}
			}

			setState(651);
			((ModuleImportContext)_localctx).nsURI = uriLiteral();
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AT) {
				{
				setState(652);
				match(KW_AT);
				setState(653);
				((ModuleImportContext)_localctx).uriLiteral = uriLiteral();
				((ModuleImportContext)_localctx).locations.add(((ModuleImportContext)_localctx).uriLiteral);
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(654);
					match(COMMA);
					setState(655);
					((ModuleImportContext)_localctx).uriLiteral = uriLiteral();
					((ModuleImportContext)_localctx).locations.add(((ModuleImportContext)_localctx).uriLiteral);
					}
					}
					setState(660);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceDeclContext extends ParserRuleContext {
		public TerminalNode KW_DECLARE() { return getToken(XQueryParser.KW_DECLARE, 0); }
		public TerminalNode KW_NAMESPACE() { return getToken(XQueryParser.KW_NAMESPACE, 0); }
		public NcNameContext ncName() {
			return getRuleContext(NcNameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(XQueryParser.EQUAL, 0); }
		public UriLiteralContext uriLiteral() {
			return getRuleContext(UriLiteralContext.class,0);
		}
		public NamespaceDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitNamespaceDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceDeclContext namespaceDecl() throws RecognitionException {
		NamespaceDeclContext _localctx = new NamespaceDeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_namespaceDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(KW_DECLARE);
			setState(664);
			match(KW_NAMESPACE);
			setState(665);
			ncName();
			setState(666);
			match(EQUAL);
			setState(667);
			uriLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode KW_DECLARE() { return getToken(XQueryParser.KW_DECLARE, 0); }
		public TerminalNode KW_VARIABLE() { return getToken(XQueryParser.KW_VARIABLE, 0); }
		public TerminalNode DOLLAR() { return getToken(XQueryParser.DOLLAR, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public NcNameContext ncName() {
			return getRuleContext(NcNameContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode COLON_EQ() { return getToken(XQueryParser.COLON_EQ, 0); }
		public VarValueContext varValue() {
			return getRuleContext(VarValueContext.class,0);
		}
		public TerminalNode KW_EXTERNAL() { return getToken(XQueryParser.KW_EXTERNAL, 0); }
		public TerminalNode LBRACE() { return getToken(XQueryParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(XQueryParser.RBRACE, 0); }
		public VarDefaultValueContext varDefaultValue() {
			return getRuleContext(VarDefaultValueContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(KW_DECLARE);
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(670);
				annotations();
				}
				break;
			case 2:
				{
				setState(671);
				ncName();
				}
				break;
			}
			setState(674);
			match(KW_VARIABLE);
			setState(675);
			match(DOLLAR);
			setState(676);
			varName();
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(677);
				typeDeclaration();
				}
			}

			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				{
				setState(680);
				match(COLON_EQ);
				setState(681);
				varValue();
				}
				}
				break;
			case 2:
				{
				{
				setState(682);
				match(KW_EXTERNAL);
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON_EQ) {
					{
					setState(683);
					match(COLON_EQ);
					setState(684);
					varDefaultValue();
					}
				}

				}
				}
				break;
			case 3:
				{
				{
				setState(687);
				match(LBRACE);
				setState(688);
				varValue();
				setState(689);
				match(RBRACE);
				}
				}
				break;
			case 4:
				{
				{
				setState(691);
				match(KW_EXTERNAL);
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(692);
					match(LBRACE);
					setState(693);
					varDefaultValue();
					setState(694);
					match(RBRACE);
					}
				}

				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarValueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitVarValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarValueContext varValue() throws RecognitionException {
		VarValueContext _localctx = new VarValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_varValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefaultValueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefaultValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitVarDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefaultValueContext varDefaultValue() throws RecognitionException {
		VarDefaultValueContext _localctx = new VarDefaultValueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_varDefaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContextItemDeclContext extends ParserRuleContext {
		public ExprSingleContext value;
		public ExprSingleContext defaultValue;
		public TerminalNode KW_DECLARE() { return getToken(XQueryParser.KW_DECLARE, 0); }
		public TerminalNode KW_CONTEXT() { return getToken(XQueryParser.KW_CONTEXT, 0); }
		public TerminalNode KW_ITEM() { return getToken(XQueryParser.KW_ITEM, 0); }
		public TerminalNode KW_AS() { return getToken(XQueryParser.KW_AS, 0); }
		public ItemTypeContext itemType() {
			return getRuleContext(ItemTypeContext.class,0);
		}
		public TerminalNode COLON_EQ() { return getToken(XQueryParser.COLON_EQ, 0); }
		public TerminalNode KW_EXTERNAL() { return getToken(XQueryParser.KW_EXTERNAL, 0); }
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public ContextItemDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextItemDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitContextItemDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContextItemDeclContext contextItemDecl() throws RecognitionException {
		ContextItemDeclContext _localctx = new ContextItemDeclContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_contextItemDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(KW_DECLARE);
			setState(705);
			match(KW_CONTEXT);
			setState(706);
			match(KW_ITEM);
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(707);
				match(KW_AS);
				setState(708);
				itemType();
				}
			}

			setState(718);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON_EQ:
				{
				{
				setState(711);
				match(COLON_EQ);
				setState(712);
				((ContextItemDeclContext)_localctx).value = exprSingle();
				}
				}
				break;
			case KW_EXTERNAL:
				{
				{
				setState(713);
				match(KW_EXTERNAL);
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON_EQ) {
					{
					setState(714);
					match(COLON_EQ);
					setState(715);
					((ContextItemDeclContext)_localctx).defaultValue = exprSingle();
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclContext extends ParserRuleContext {
		public EqNameContext name;
		public TerminalNode KW_DECLARE() { return getToken(XQueryParser.KW_DECLARE, 0); }
		public TerminalNode KW_FUNCTION() { return getToken(XQueryParser.KW_FUNCTION, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public NcNameContext ncName() {
			return getRuleContext(NcNameContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode KW_EXTERNAL() { return getToken(XQueryParser.KW_EXTERNAL, 0); }
		public FunctionParamsContext functionParams() {
			return getRuleContext(FunctionParamsContext.class,0);
		}
		public FunctionReturnContext functionReturn() {
			return getRuleContext(FunctionReturnContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(KW_DECLARE);
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(721);
				annotations();
				}
				break;
			case 2:
				{
				setState(722);
				ncName();
				}
				break;
			}
			setState(725);
			match(KW_FUNCTION);
			setState(726);
			((FunctionDeclContext)_localctx).name = eqName();
			setState(727);
			match(LPAREN);
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOLLAR) {
				{
				setState(728);
				functionParams();
				}
			}

			setState(731);
			match(RPAREN);
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(732);
				functionReturn();
				}
			}

			setState(737);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(735);
				functionBody();
				}
				break;
			case KW_EXTERNAL:
				{
				setState(736);
				match(KW_EXTERNAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParamsContext extends ParserRuleContext {
		public List<FunctionParamContext> functionParam() {
			return getRuleContexts(FunctionParamContext.class);
		}
		public FunctionParamContext functionParam(int i) {
			return getRuleContext(FunctionParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public FunctionParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParams; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitFunctionParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParamsContext functionParams() throws RecognitionException {
		FunctionParamsContext _localctx = new FunctionParamsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_functionParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			functionParam();
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(740);
				match(COMMA);
				setState(741);
				functionParam();
				}
				}
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParamContext extends ParserRuleContext {
		public QNameContext name;
		public TypeDeclarationContext type;
		public TerminalNode DOLLAR() { return getToken(XQueryParser.DOLLAR, 0); }
		public QNameContext qName() {
			return getRuleContext(QNameContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public FunctionParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParam; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitFunctionParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParamContext functionParam() throws RecognitionException {
		FunctionParamContext _localctx = new FunctionParamContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_functionParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(DOLLAR);
			setState(748);
			((FunctionParamContext)_localctx).name = qName();
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(749);
				((FunctionParamContext)_localctx).type = typeDeclaration();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAnnotations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_annotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MOD) {
				{
				{
				setState(752);
				annotation();
				}
				}
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(XQueryParser.MOD, 0); }
		public QNameContext qName() {
			return getRuleContext(QNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public AnnotListContext annotList() {
			return getRuleContext(AnnotListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(MOD);
			setState(759);
			qName();
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(760);
				match(LPAREN);
				setState(761);
				annotList();
				setState(762);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotListContext extends ParserRuleContext {
		public List<AnnotationParamContext> annotationParam() {
			return getRuleContexts(AnnotationParamContext.class);
		}
		public AnnotationParamContext annotationParam(int i) {
			return getRuleContext(AnnotationParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public AnnotListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAnnotList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotListContext annotList() throws RecognitionException {
		AnnotListContext _localctx = new AnnotListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_annotList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			annotationParam();
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(767);
				match(COMMA);
				setState(768);
				annotationParam();
				}
				}
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationParamContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AnnotationParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationParam; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAnnotationParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationParamContext annotationParam() throws RecognitionException {
		AnnotationParamContext _localctx = new AnnotationParamContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_annotationParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionReturnContext extends ParserRuleContext {
		public TerminalNode KW_AS() { return getToken(XQueryParser.KW_AS, 0); }
		public SequenceTypeContext sequenceType() {
			return getRuleContext(SequenceTypeContext.class,0);
		}
		public FunctionReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitFunctionReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnContext functionReturn() throws RecognitionException {
		FunctionReturnContext _localctx = new FunctionReturnContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(KW_AS);
			setState(777);
			sequenceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionDeclContext extends ParserRuleContext {
		public QNameContext name;
		public StringLiteralContext value;
		public TerminalNode KW_DECLARE() { return getToken(XQueryParser.KW_DECLARE, 0); }
		public TerminalNode KW_OPTION() { return getToken(XQueryParser.KW_OPTION, 0); }
		public QNameContext qName() {
			return getRuleContext(QNameContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public OptionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitOptionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionDeclContext optionDecl() throws RecognitionException {
		OptionDeclContext _localctx = new OptionDeclContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_optionDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(KW_DECLARE);
			setState(780);
			match(KW_OPTION);
			setState(781);
			((OptionDeclContext)_localctx).name = qName();
			setState(782);
			((OptionDeclContext)_localctx).value = stringLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<ExprSingleContext> exprSingle() {
			return getRuleContexts(ExprSingleContext.class);
		}
		public ExprSingleContext exprSingle(int i) {
			return getRuleContext(ExprSingleContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			exprSingle();
			setState(789);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(785);
					match(COMMA);
					setState(786);
					exprSingle();
					}
					} 
				}
				setState(791);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprSingleContext extends ParserRuleContext {
		public FlworExprContext flworExpr() {
			return getRuleContext(FlworExprContext.class,0);
		}
		public QuantifiedExprContext quantifiedExpr() {
			return getRuleContext(QuantifiedExprContext.class,0);
		}
		public SwitchExprContext switchExpr() {
			return getRuleContext(SwitchExprContext.class,0);
		}
		public TypeswitchExprContext typeswitchExpr() {
			return getRuleContext(TypeswitchExprContext.class,0);
		}
		public ExistUpdateExprContext existUpdateExpr() {
			return getRuleContext(ExistUpdateExprContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public TryCatchExprContext tryCatchExpr() {
			return getRuleContext(TryCatchExprContext.class,0);
		}
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public ExprSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSingle; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitExprSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprSingleContext exprSingle() throws RecognitionException {
		ExprSingleContext _localctx = new ExprSingleContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exprSingle);
		try {
			setState(800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				flworExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
				quantifiedExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(794);
				switchExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(795);
				typeswitchExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(796);
				existUpdateExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(797);
				ifExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(798);
				tryCatchExpr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(799);
				orExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FlworExprContext extends ParserRuleContext {
		public InitialClauseContext initialClause() {
			return getRuleContext(InitialClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public List<IntermediateClauseContext> intermediateClause() {
			return getRuleContexts(IntermediateClauseContext.class);
		}
		public IntermediateClauseContext intermediateClause(int i) {
			return getRuleContext(IntermediateClauseContext.class,i);
		}
		public FlworExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flworExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitFlworExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlworExprContext flworExpr() throws RecognitionException {
		FlworExprContext _localctx = new FlworExprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_flworExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			initialClause();
			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (KW_COUNT - 76)) | (1L << (KW_FOR - 76)) | (1L << (KW_GROUP - 76)) | (1L << (KW_LET - 76)) | (1L << (KW_ORDER - 76)))) != 0) || _la==KW_STABLE || _la==KW_WHERE) {
				{
				{
				setState(803);
				intermediateClause();
				}
				}
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(809);
			returnClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitialClauseContext extends ParserRuleContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public InitialClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitInitialClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialClauseContext initialClause() throws RecognitionException {
		InitialClauseContext _localctx = new InitialClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_initialClause);
		try {
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(811);
				forClause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				letClause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(813);
				windowClause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntermediateClauseContext extends ParserRuleContext {
		public InitialClauseContext initialClause() {
			return getRuleContext(InitialClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public CountClauseContext countClause() {
			return getRuleContext(CountClauseContext.class,0);
		}
		public IntermediateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intermediateClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitIntermediateClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntermediateClauseContext intermediateClause() throws RecognitionException {
		IntermediateClauseContext _localctx = new IntermediateClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_intermediateClause);
		try {
			setState(821);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_FOR:
			case KW_LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				initialClause();
				}
				break;
			case KW_WHERE:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				whereClause();
				}
				break;
			case KW_GROUP:
				enterOuterAlt(_localctx, 3);
				{
				setState(818);
				groupByClause();
				}
				break;
			case KW_ORDER:
			case KW_STABLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(819);
				orderByClause();
				}
				break;
			case KW_COUNT:
				enterOuterAlt(_localctx, 5);
				{
				setState(820);
				countClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForClauseContext extends ParserRuleContext {
		public ForBindingContext forBinding;
		public List<ForBindingContext> vars = new ArrayList<ForBindingContext>();
		public TerminalNode KW_FOR() { return getToken(XQueryParser.KW_FOR, 0); }
		public List<ForBindingContext> forBinding() {
			return getRuleContexts(ForBindingContext.class);
		}
		public ForBindingContext forBinding(int i) {
			return getRuleContext(ForBindingContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(KW_FOR);
			setState(824);
			((ForClauseContext)_localctx).forBinding = forBinding();
			((ForClauseContext)_localctx).vars.add(((ForClauseContext)_localctx).forBinding);
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(825);
				match(COMMA);
				setState(826);
				((ForClauseContext)_localctx).forBinding = forBinding();
				((ForClauseContext)_localctx).vars.add(((ForClauseContext)_localctx).forBinding);
				}
				}
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForBindingContext extends ParserRuleContext {
		public VarNameContext name;
		public TypeDeclarationContext seq;
		public AllowingEmptyContext flag;
		public PositionalVarContext at;
		public ExprSingleContext ex;
		public TerminalNode DOLLAR() { return getToken(XQueryParser.DOLLAR, 0); }
		public TerminalNode KW_IN() { return getToken(XQueryParser.KW_IN, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public AllowingEmptyContext allowingEmpty() {
			return getRuleContext(AllowingEmptyContext.class,0);
		}
		public PositionalVarContext positionalVar() {
			return getRuleContext(PositionalVarContext.class,0);
		}
		public ForBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBinding; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitForBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBindingContext forBinding() throws RecognitionException {
		ForBindingContext _localctx = new ForBindingContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_forBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(DOLLAR);
			setState(833);
			((ForBindingContext)_localctx).name = varName();
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(834);
				((ForBindingContext)_localctx).seq = typeDeclaration();
				}
			}

			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ALLOWING) {
				{
				setState(837);
				((ForBindingContext)_localctx).flag = allowingEmpty();
				}
			}

			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AT) {
				{
				setState(840);
				((ForBindingContext)_localctx).at = positionalVar();
				}
			}

			setState(843);
			match(KW_IN);
			setState(844);
			((ForBindingContext)_localctx).ex = exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllowingEmptyContext extends ParserRuleContext {
		public TerminalNode KW_ALLOWING() { return getToken(XQueryParser.KW_ALLOWING, 0); }
		public TerminalNode KW_EMPTY() { return getToken(XQueryParser.KW_EMPTY, 0); }
		public AllowingEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allowingEmpty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAllowingEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllowingEmptyContext allowingEmpty() throws RecognitionException {
		AllowingEmptyContext _localctx = new AllowingEmptyContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_allowingEmpty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(KW_ALLOWING);
			setState(847);
			match(KW_EMPTY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PositionalVarContext extends ParserRuleContext {
		public VarNameContext pvar;
		public TerminalNode KW_AT() { return getToken(XQueryParser.KW_AT, 0); }
		public TerminalNode DOLLAR() { return getToken(XQueryParser.DOLLAR, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public PositionalVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionalVar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitPositionalVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionalVarContext positionalVar() throws RecognitionException {
		PositionalVarContext _localctx = new PositionalVarContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_positionalVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(KW_AT);
			setState(850);
			match(DOLLAR);
			setState(851);
			((PositionalVarContext)_localctx).pvar = varName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetClauseContext extends ParserRuleContext {
		public LetBindingContext letBinding;
		public List<LetBindingContext> vars = new ArrayList<LetBindingContext>();
		public TerminalNode KW_LET() { return getToken(XQueryParser.KW_LET, 0); }
		public List<LetBindingContext> letBinding() {
			return getRuleContexts(LetBindingContext.class);
		}
		public LetBindingContext letBinding(int i) {
			return getRuleContext(LetBindingContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(KW_LET);
			setState(854);
			((LetClauseContext)_localctx).letBinding = letBinding();
			((LetClauseContext)_localctx).vars.add(((LetClauseContext)_localctx).letBinding);
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(855);
				match(COMMA);
				setState(856);
				((LetClauseContext)_localctx).letBinding = letBinding();
				((LetClauseContext)_localctx).vars.add(((LetClauseContext)_localctx).letBinding);
				}
				}
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetBindingContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(XQueryParser.DOLLAR, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode COLON_EQ() { return getToken(XQueryParser.COLON_EQ, 0); }
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public LetBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letBinding; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitLetBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetBindingContext letBinding() throws RecognitionException {
		LetBindingContext _localctx = new LetBindingContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_letBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			match(DOLLAR);
			setState(863);
			varName();
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(864);
				typeDeclaration();
				}
			}

			setState(867);
			match(COLON_EQ);
			setState(868);
			exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode KW_FOR() { return getToken(XQueryParser.KW_FOR, 0); }
		public TumblingWindowClauseContext tumblingWindowClause() {
			return getRuleContext(TumblingWindowClauseContext.class,0);
		}
		public SlidingWindowClauseContext slidingWindowClause() {
			return getRuleContext(SlidingWindowClauseContext.class,0);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_windowClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(KW_FOR);
			setState(873);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_TUMBLING:
				{
				setState(871);
				tumblingWindowClause();
				}
				break;
			case KW_SLIDING:
				{
				setState(872);
				slidingWindowClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TumblingWindowClauseContext extends ParserRuleContext {
		public QNameContext name;
		public TypeDeclarationContext type;
		public TerminalNode KW_TUMBLING() { return getToken(XQueryParser.KW_TUMBLING, 0); }
		public TerminalNode KW_WINDOW() { return getToken(XQueryParser.KW_WINDOW, 0); }
		public TerminalNode DOLLAR() { return getToken(XQueryParser.DOLLAR, 0); }
		public TerminalNode KW_IN() { return getToken(XQueryParser.KW_IN, 0); }
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public WindowStartConditionContext windowStartCondition() {
			return getRuleContext(WindowStartConditionContext.class,0);
		}
		public QNameContext qName() {
			return getRuleContext(QNameContext.class,0);
		}
		public WindowEndConditionContext windowEndCondition() {
			return getRuleContext(WindowEndConditionContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TumblingWindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tumblingWindowClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitTumblingWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TumblingWindowClauseContext tumblingWindowClause() throws RecognitionException {
		TumblingWindowClauseContext _localctx = new TumblingWindowClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_tumblingWindowClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(KW_TUMBLING);
			setState(876);
			match(KW_WINDOW);
			setState(877);
			match(DOLLAR);
			setState(878);
			((TumblingWindowClauseContext)_localctx).name = qName();
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(879);
				((TumblingWindowClauseContext)_localctx).type = typeDeclaration();
				}
			}

			setState(882);
			match(KW_IN);
			setState(883);
			exprSingle();
			setState(884);
			windowStartCondition();
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_END || _la==KW_ONLY) {
				{
				setState(885);
				windowEndCondition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SlidingWindowClauseContext extends ParserRuleContext {
		public QNameContext name;
		public TypeDeclarationContext type;
		public TerminalNode KW_SLIDING() { return getToken(XQueryParser.KW_SLIDING, 0); }
		public TerminalNode KW_WINDOW() { return getToken(XQueryParser.KW_WINDOW, 0); }
		public TerminalNode DOLLAR() { return getToken(XQueryParser.DOLLAR, 0); }
		public TerminalNode KW_IN() { return getToken(XQueryParser.KW_IN, 0); }
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public WindowStartConditionContext windowStartCondition() {
			return getRuleContext(WindowStartConditionContext.class,0);
		}
		public WindowEndConditionContext windowEndCondition() {
			return getRuleContext(WindowEndConditionContext.class,0);
		}
		public QNameContext qName() {
			return getRuleContext(QNameContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public SlidingWindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slidingWindowClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitSlidingWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlidingWindowClauseContext slidingWindowClause() throws RecognitionException {
		SlidingWindowClauseContext _localctx = new SlidingWindowClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_slidingWindowClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(KW_SLIDING);
			setState(889);
			match(KW_WINDOW);
			setState(890);
			match(DOLLAR);
			setState(891);
			((SlidingWindowClauseContext)_localctx).name = qName();
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(892);
				((SlidingWindowClauseContext)_localctx).type = typeDeclaration();
				}
			}

			setState(895);
			match(KW_IN);
			setState(896);
			exprSingle();
			setState(897);
			windowStartCondition();
			setState(898);
			windowEndCondition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowStartConditionContext extends ParserRuleContext {
		public TerminalNode KW_START() { return getToken(XQueryParser.KW_START, 0); }
		public WindowVarsContext windowVars() {
			return getRuleContext(WindowVarsContext.class,0);
		}
		public TerminalNode KW_WHEN() { return getToken(XQueryParser.KW_WHEN, 0); }
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public WindowStartConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowStartCondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitWindowStartCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowStartConditionContext windowStartCondition() throws RecognitionException {
		WindowStartConditionContext _localctx = new WindowStartConditionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_windowStartCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			match(KW_START);
			setState(901);
			windowVars();
			setState(902);
			match(KW_WHEN);
			setState(903);
			exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowEndConditionContext extends ParserRuleContext {
		public TerminalNode KW_END() { return getToken(XQueryParser.KW_END, 0); }
		public WindowVarsContext windowVars() {
			return getRuleContext(WindowVarsContext.class,0);
		}
		public TerminalNode KW_WHEN() { return getToken(XQueryParser.KW_WHEN, 0); }
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public TerminalNode KW_ONLY() { return getToken(XQueryParser.KW_ONLY, 0); }
		public WindowEndConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowEndCondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitWindowEndCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowEndConditionContext windowEndCondition() throws RecognitionException {
		WindowEndConditionContext _localctx = new WindowEndConditionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_windowEndCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ONLY) {
				{
				setState(905);
				match(KW_ONLY);
				}
			}

			setState(908);
			match(KW_END);
			setState(909);
			windowVars();
			setState(910);
			match(KW_WHEN);
			setState(911);
			exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowVarsContext extends ParserRuleContext {
		public EqNameContext currentItem;
		public EqNameContext previousItem;
		public EqNameContext nextItem;
		public List<TerminalNode> DOLLAR() { return getTokens(XQueryParser.DOLLAR); }
		public TerminalNode DOLLAR(int i) {
			return getToken(XQueryParser.DOLLAR, i);
		}
		public PositionalVarContext positionalVar() {
			return getRuleContext(PositionalVarContext.class,0);
		}
		public TerminalNode KW_PREVIOUS() { return getToken(XQueryParser.KW_PREVIOUS, 0); }
		public TerminalNode KW_NEXT() { return getToken(XQueryParser.KW_NEXT, 0); }
		public List<EqNameContext> eqName() {
			return getRuleContexts(EqNameContext.class);
		}
		public EqNameContext eqName(int i) {
			return getRuleContext(EqNameContext.class,i);
		}
		public WindowVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowVars; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitWindowVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowVarsContext windowVars() throws RecognitionException {
		WindowVarsContext _localctx = new WindowVarsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_windowVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOLLAR) {
				{
				setState(913);
				match(DOLLAR);
				setState(914);
				((WindowVarsContext)_localctx).currentItem = eqName();
				}
			}

			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AT) {
				{
				setState(917);
				positionalVar();
				}
			}

			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PREVIOUS) {
				{
				setState(920);
				match(KW_PREVIOUS);
				setState(921);
				match(DOLLAR);
				setState(922);
				((WindowVarsContext)_localctx).previousItem = eqName();
				}
			}

			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_NEXT) {
				{
				setState(925);
				match(KW_NEXT);
				setState(926);
				match(DOLLAR);
				setState(927);
				((WindowVarsContext)_localctx).nextItem = eqName();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CountClauseContext extends ParserRuleContext {
		public TerminalNode KW_COUNT() { return getToken(XQueryParser.KW_COUNT, 0); }
		public TerminalNode DOLLAR() { return getToken(XQueryParser.DOLLAR, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public CountClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCountClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountClauseContext countClause() throws RecognitionException {
		CountClauseContext _localctx = new CountClauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_countClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(KW_COUNT);
			setState(931);
			match(DOLLAR);
			setState(932);
			varName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public ExprSingleContext whereExpr;
		public TerminalNode KW_WHERE() { return getToken(XQueryParser.KW_WHERE, 0); }
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			match(KW_WHERE);
			setState(935);
			((WhereClauseContext)_localctx).whereExpr = exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode KW_GROUP() { return getToken(XQueryParser.KW_GROUP, 0); }
		public TerminalNode KW_BY() { return getToken(XQueryParser.KW_BY, 0); }
		public GroupingSpecListContext groupingSpecList() {
			return getRuleContext(GroupingSpecListContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(KW_GROUP);
			setState(938);
			match(KW_BY);
			setState(939);
			groupingSpecList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSpecListContext extends ParserRuleContext {
		public GroupingSpecContext groupingSpec;
		public List<GroupingSpecContext> vars = new ArrayList<GroupingSpecContext>();
		public List<GroupingSpecContext> groupingSpec() {
			return getRuleContexts(GroupingSpecContext.class);
		}
		public GroupingSpecContext groupingSpec(int i) {
			return getRuleContext(GroupingSpecContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public GroupingSpecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSpecList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitGroupingSpecList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSpecListContext groupingSpecList() throws RecognitionException {
		GroupingSpecListContext _localctx = new GroupingSpecListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_groupingSpecList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			((GroupingSpecListContext)_localctx).groupingSpec = groupingSpec();
			((GroupingSpecListContext)_localctx).vars.add(((GroupingSpecListContext)_localctx).groupingSpec);
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(942);
				match(COMMA);
				setState(943);
				((GroupingSpecListContext)_localctx).groupingSpec = groupingSpec();
				((GroupingSpecListContext)_localctx).vars.add(((GroupingSpecListContext)_localctx).groupingSpec);
				}
				}
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSpecContext extends ParserRuleContext {
		public VarNameContext name;
		public TypeDeclarationContext type;
		public UriLiteralContext uri;
		public TerminalNode DOLLAR() { return getToken(XQueryParser.DOLLAR, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode COLON_EQ() { return getToken(XQueryParser.COLON_EQ, 0); }
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public TerminalNode KW_COLLATION() { return getToken(XQueryParser.KW_COLLATION, 0); }
		public UriLiteralContext uriLiteral() {
			return getRuleContext(UriLiteralContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public GroupingSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitGroupingSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSpecContext groupingSpec() throws RecognitionException {
		GroupingSpecContext _localctx = new GroupingSpecContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_groupingSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			match(DOLLAR);
			setState(950);
			((GroupingSpecContext)_localctx).name = varName();
			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON_EQ || _la==KW_AS) {
				{
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(951);
					((GroupingSpecContext)_localctx).type = typeDeclaration();
					}
				}

				setState(954);
				match(COLON_EQ);
				setState(955);
				exprSingle();
				}
			}

			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_COLLATION) {
				{
				setState(958);
				match(KW_COLLATION);
				setState(959);
				((GroupingSpecContext)_localctx).uri = uriLiteral();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public OrderSpecContext orderSpec;
		public List<OrderSpecContext> specs = new ArrayList<OrderSpecContext>();
		public TerminalNode KW_ORDER() { return getToken(XQueryParser.KW_ORDER, 0); }
		public TerminalNode KW_BY() { return getToken(XQueryParser.KW_BY, 0); }
		public List<OrderSpecContext> orderSpec() {
			return getRuleContexts(OrderSpecContext.class);
		}
		public OrderSpecContext orderSpec(int i) {
			return getRuleContext(OrderSpecContext.class,i);
		}
		public TerminalNode KW_STABLE() { return getToken(XQueryParser.KW_STABLE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_STABLE) {
				{
				setState(962);
				match(KW_STABLE);
				}
			}

			setState(965);
			match(KW_ORDER);
			setState(966);
			match(KW_BY);
			setState(967);
			((OrderByClauseContext)_localctx).orderSpec = orderSpec();
			((OrderByClauseContext)_localctx).specs.add(((OrderByClauseContext)_localctx).orderSpec);
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(968);
				match(COMMA);
				setState(969);
				((OrderByClauseContext)_localctx).orderSpec = orderSpec();
				((OrderByClauseContext)_localctx).specs.add(((OrderByClauseContext)_localctx).orderSpec);
				}
				}
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderSpecContext extends ParserRuleContext {
		public ExprSingleContext ex;
		public Token desc;
		public Token gr;
		public Token ls;
		public UriLiteralContext uril;
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public TerminalNode KW_ASCENDING() { return getToken(XQueryParser.KW_ASCENDING, 0); }
		public TerminalNode KW_EMPTY() { return getToken(XQueryParser.KW_EMPTY, 0); }
		public TerminalNode KW_COLLATION() { return getToken(XQueryParser.KW_COLLATION, 0); }
		public TerminalNode KW_DESCENDING() { return getToken(XQueryParser.KW_DESCENDING, 0); }
		public UriLiteralContext uriLiteral() {
			return getRuleContext(UriLiteralContext.class,0);
		}
		public TerminalNode KW_GREATEST() { return getToken(XQueryParser.KW_GREATEST, 0); }
		public TerminalNode KW_LEAST() { return getToken(XQueryParser.KW_LEAST, 0); }
		public OrderSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitOrderSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderSpecContext orderSpec() throws RecognitionException {
		OrderSpecContext _localctx = new OrderSpecContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_orderSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			((OrderSpecContext)_localctx).ex = exprSingle();
			setState(978);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ASCENDING:
				{
				setState(976);
				match(KW_ASCENDING);
				}
				break;
			case KW_DESCENDING:
				{
				setState(977);
				((OrderSpecContext)_localctx).desc = match(KW_DESCENDING);
				}
				break;
			case COMMA:
			case KW_COLLATION:
			case KW_COUNT:
			case KW_EMPTY:
			case KW_FOR:
			case KW_GROUP:
			case KW_LET:
			case KW_ORDER:
			case KW_RETURN:
			case KW_STABLE:
			case KW_WHERE:
				break;
			default:
				break;
			}
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_EMPTY) {
				{
				setState(980);
				match(KW_EMPTY);
				setState(983);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_GREATEST:
					{
					setState(981);
					((OrderSpecContext)_localctx).gr = match(KW_GREATEST);
					}
					break;
				case KW_LEAST:
					{
					setState(982);
					((OrderSpecContext)_localctx).ls = match(KW_LEAST);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(989);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_COLLATION) {
				{
				setState(987);
				match(KW_COLLATION);
				setState(988);
				((OrderSpecContext)_localctx).uril = uriLiteral();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnClauseContext extends ParserRuleContext {
		public TerminalNode KW_RETURN() { return getToken(XQueryParser.KW_RETURN, 0); }
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			match(KW_RETURN);
			setState(992);
			exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantifiedExprContext extends ParserRuleContext {
		public Token so;
		public Token ev;
		public QuantifiedVarContext quantifiedVar;
		public List<QuantifiedVarContext> vars = new ArrayList<QuantifiedVarContext>();
		public ExprSingleContext value;
		public TerminalNode KW_SATISFIES() { return getToken(XQueryParser.KW_SATISFIES, 0); }
		public List<QuantifiedVarContext> quantifiedVar() {
			return getRuleContexts(QuantifiedVarContext.class);
		}
		public QuantifiedVarContext quantifiedVar(int i) {
			return getRuleContext(QuantifiedVarContext.class,i);
		}
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public TerminalNode KW_SOME() { return getToken(XQueryParser.KW_SOME, 0); }
		public TerminalNode KW_EVERY() { return getToken(XQueryParser.KW_EVERY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public QuantifiedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifiedExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitQuantifiedExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifiedExprContext quantifiedExpr() throws RecognitionException {
		QuantifiedExprContext _localctx = new QuantifiedExprContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_quantifiedExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_SOME:
				{
				setState(994);
				((QuantifiedExprContext)_localctx).so = match(KW_SOME);
				}
				break;
			case KW_EVERY:
				{
				setState(995);
				((QuantifiedExprContext)_localctx).ev = match(KW_EVERY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(998);
			((QuantifiedExprContext)_localctx).quantifiedVar = quantifiedVar();
			((QuantifiedExprContext)_localctx).vars.add(((QuantifiedExprContext)_localctx).quantifiedVar);
			setState(1003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(999);
				match(COMMA);
				setState(1000);
				((QuantifiedExprContext)_localctx).quantifiedVar = quantifiedVar();
				((QuantifiedExprContext)_localctx).vars.add(((QuantifiedExprContext)_localctx).quantifiedVar);
				}
				}
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1006);
			match(KW_SATISFIES);
			setState(1007);
			((QuantifiedExprContext)_localctx).value = exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantifiedVarContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(XQueryParser.DOLLAR, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode KW_IN() { return getToken(XQueryParser.KW_IN, 0); }
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public QuantifiedVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifiedVar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitQuantifiedVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifiedVarContext quantifiedVar() throws RecognitionException {
		QuantifiedVarContext _localctx = new QuantifiedVarContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_quantifiedVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			match(DOLLAR);
			setState(1010);
			varName();
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(1011);
				typeDeclaration();
				}
			}

			setState(1014);
			match(KW_IN);
			setState(1015);
			exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchExprContext extends ParserRuleContext {
		public ExprContext cond;
		public SwitchCaseClauseContext switchCaseClause;
		public List<SwitchCaseClauseContext> cases = new ArrayList<SwitchCaseClauseContext>();
		public ExprSingleContext def;
		public TerminalNode KW_SWITCH() { return getToken(XQueryParser.KW_SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public TerminalNode KW_DEFAULT() { return getToken(XQueryParser.KW_DEFAULT, 0); }
		public TerminalNode KW_RETURN() { return getToken(XQueryParser.KW_RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public List<SwitchCaseClauseContext> switchCaseClause() {
			return getRuleContexts(SwitchCaseClauseContext.class);
		}
		public SwitchCaseClauseContext switchCaseClause(int i) {
			return getRuleContext(SwitchCaseClauseContext.class,i);
		}
		public SwitchExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitSwitchExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchExprContext switchExpr() throws RecognitionException {
		SwitchExprContext _localctx = new SwitchExprContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_switchExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(KW_SWITCH);
			setState(1018);
			match(LPAREN);
			setState(1019);
			((SwitchExprContext)_localctx).cond = expr();
			setState(1020);
			match(RPAREN);
			setState(1022); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1021);
				((SwitchExprContext)_localctx).switchCaseClause = switchCaseClause();
				((SwitchExprContext)_localctx).cases.add(((SwitchExprContext)_localctx).switchCaseClause);
				}
				}
				setState(1024); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KW_CASE );
			setState(1026);
			match(KW_DEFAULT);
			setState(1027);
			match(KW_RETURN);
			setState(1028);
			((SwitchExprContext)_localctx).def = exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchCaseClauseContext extends ParserRuleContext {
		public SwitchCaseOperandContext switchCaseOperand;
		public List<SwitchCaseOperandContext> cond = new ArrayList<SwitchCaseOperandContext>();
		public ExprSingleContext ret;
		public TerminalNode KW_RETURN() { return getToken(XQueryParser.KW_RETURN, 0); }
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public List<TerminalNode> KW_CASE() { return getTokens(XQueryParser.KW_CASE); }
		public TerminalNode KW_CASE(int i) {
			return getToken(XQueryParser.KW_CASE, i);
		}
		public List<SwitchCaseOperandContext> switchCaseOperand() {
			return getRuleContexts(SwitchCaseOperandContext.class);
		}
		public SwitchCaseOperandContext switchCaseOperand(int i) {
			return getRuleContext(SwitchCaseOperandContext.class,i);
		}
		public SwitchCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCaseClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitSwitchCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseClauseContext switchCaseClause() throws RecognitionException {
		SwitchCaseClauseContext _localctx = new SwitchCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_switchCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1030);
				match(KW_CASE);
				setState(1031);
				((SwitchCaseClauseContext)_localctx).switchCaseOperand = switchCaseOperand();
				((SwitchCaseClauseContext)_localctx).cond.add(((SwitchCaseClauseContext)_localctx).switchCaseOperand);
				}
				}
				setState(1034); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KW_CASE );
			setState(1036);
			match(KW_RETURN);
			setState(1037);
			((SwitchCaseClauseContext)_localctx).ret = exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchCaseOperandContext extends ParserRuleContext {
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public SwitchCaseOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCaseOperand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitSwitchCaseOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseOperandContext switchCaseOperand() throws RecognitionException {
		SwitchCaseOperandContext _localctx = new SwitchCaseOperandContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_switchCaseOperand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeswitchExprContext extends ParserRuleContext {
		public ExprContext cond;
		public CaseClauseContext caseClause;
		public List<CaseClauseContext> cses = new ArrayList<CaseClauseContext>();
		public VarNameContext var_ref;
		public ExprSingleContext def;
		public TerminalNode KW_TYPESWITCH() { return getToken(XQueryParser.KW_TYPESWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public TerminalNode KW_DEFAULT() { return getToken(XQueryParser.KW_DEFAULT, 0); }
		public TerminalNode KW_RETURN() { return getToken(XQueryParser.KW_RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public TerminalNode DOLLAR() { return getToken(XQueryParser.DOLLAR, 0); }
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TypeswitchExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeswitchExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitTypeswitchExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeswitchExprContext typeswitchExpr() throws RecognitionException {
		TypeswitchExprContext _localctx = new TypeswitchExprContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_typeswitchExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			match(KW_TYPESWITCH);
			setState(1042);
			match(LPAREN);
			setState(1043);
			((TypeswitchExprContext)_localctx).cond = expr();
			setState(1044);
			match(RPAREN);
			setState(1046); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1045);
				((TypeswitchExprContext)_localctx).caseClause = caseClause();
				((TypeswitchExprContext)_localctx).cses.add(((TypeswitchExprContext)_localctx).caseClause);
				}
				}
				setState(1048); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KW_CASE );
			setState(1050);
			match(KW_DEFAULT);
			setState(1053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOLLAR) {
				{
				setState(1051);
				match(DOLLAR);
				setState(1052);
				((TypeswitchExprContext)_localctx).var_ref = varName();
				}
			}

			setState(1055);
			match(KW_RETURN);
			setState(1056);
			((TypeswitchExprContext)_localctx).def = exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClauseContext extends ParserRuleContext {
		public VarNameContext var_ref;
		public SequenceUnionTypeContext union;
		public ExprSingleContext ret;
		public TerminalNode KW_CASE() { return getToken(XQueryParser.KW_CASE, 0); }
		public TerminalNode KW_RETURN() { return getToken(XQueryParser.KW_RETURN, 0); }
		public SequenceUnionTypeContext sequenceUnionType() {
			return getRuleContext(SequenceUnionTypeContext.class,0);
		}
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public TerminalNode DOLLAR() { return getToken(XQueryParser.DOLLAR, 0); }
		public TerminalNode KW_AS() { return getToken(XQueryParser.KW_AS, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(KW_CASE);
			setState(1063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOLLAR) {
				{
				setState(1059);
				match(DOLLAR);
				setState(1060);
				((CaseClauseContext)_localctx).var_ref = varName();
				setState(1061);
				match(KW_AS);
				}
			}

			setState(1065);
			((CaseClauseContext)_localctx).union = sequenceUnionType();
			setState(1066);
			match(KW_RETURN);
			setState(1067);
			((CaseClauseContext)_localctx).ret = exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceUnionTypeContext extends ParserRuleContext {
		public SequenceTypeContext sequenceType;
		public List<SequenceTypeContext> seq = new ArrayList<SequenceTypeContext>();
		public List<SequenceTypeContext> sequenceType() {
			return getRuleContexts(SequenceTypeContext.class);
		}
		public SequenceTypeContext sequenceType(int i) {
			return getRuleContext(SequenceTypeContext.class,i);
		}
		public List<TerminalNode> VBAR() { return getTokens(XQueryParser.VBAR); }
		public TerminalNode VBAR(int i) {
			return getToken(XQueryParser.VBAR, i);
		}
		public SequenceUnionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceUnionType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitSequenceUnionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceUnionTypeContext sequenceUnionType() throws RecognitionException {
		SequenceUnionTypeContext _localctx = new SequenceUnionTypeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_sequenceUnionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			((SequenceUnionTypeContext)_localctx).sequenceType = sequenceType();
			((SequenceUnionTypeContext)_localctx).seq.add(((SequenceUnionTypeContext)_localctx).sequenceType);
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VBAR) {
				{
				{
				setState(1070);
				match(VBAR);
				setState(1071);
				((SequenceUnionTypeContext)_localctx).sequenceType = sequenceType();
				((SequenceUnionTypeContext)_localctx).seq.add(((SequenceUnionTypeContext)_localctx).sequenceType);
				}
				}
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfExprContext extends ParserRuleContext {
		public ExprContext test_condition;
		public ExprSingleContext branch;
		public ExprSingleContext else_branch;
		public TerminalNode KW_IF() { return getToken(XQueryParser.KW_IF, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public TerminalNode KW_THEN() { return getToken(XQueryParser.KW_THEN, 0); }
		public TerminalNode KW_ELSE() { return getToken(XQueryParser.KW_ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ExprSingleContext> exprSingle() {
			return getRuleContexts(ExprSingleContext.class);
		}
		public ExprSingleContext exprSingle(int i) {
			return getRuleContext(ExprSingleContext.class,i);
		}
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_ifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			match(KW_IF);
			setState(1078);
			match(LPAREN);
			setState(1079);
			((IfExprContext)_localctx).test_condition = expr();
			setState(1080);
			match(RPAREN);
			setState(1081);
			match(KW_THEN);
			setState(1082);
			((IfExprContext)_localctx).branch = exprSingle();
			setState(1083);
			match(KW_ELSE);
			setState(1084);
			((IfExprContext)_localctx).else_branch = exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryCatchExprContext extends ParserRuleContext {
		public TryClauseContext tryClause() {
			return getRuleContext(TryClauseContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TryCatchExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitTryCatchExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchExprContext tryCatchExpr() throws RecognitionException {
		TryCatchExprContext _localctx = new TryCatchExprContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_tryCatchExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			tryClause();
			setState(1088); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1087);
					catchClause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1090); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryClauseContext extends ParserRuleContext {
		public TerminalNode KW_TRY() { return getToken(XQueryParser.KW_TRY, 0); }
		public EnclosedTryTargetExpressionContext enclosedTryTargetExpression() {
			return getRuleContext(EnclosedTryTargetExpressionContext.class,0);
		}
		public TryClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitTryClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryClauseContext tryClause() throws RecognitionException {
		TryClauseContext _localctx = new TryClauseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_tryClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			match(KW_TRY);
			setState(1093);
			enclosedTryTargetExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnclosedTryTargetExpressionContext extends ParserRuleContext {
		public EnclosedExpressionContext enclosedExpression() {
			return getRuleContext(EnclosedExpressionContext.class,0);
		}
		public EnclosedTryTargetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enclosedTryTargetExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitEnclosedTryTargetExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnclosedTryTargetExpressionContext enclosedTryTargetExpression() throws RecognitionException {
		EnclosedTryTargetExpressionContext _localctx = new EnclosedTryTargetExpressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_enclosedTryTargetExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			enclosedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode KW_CATCH() { return getToken(XQueryParser.KW_CATCH, 0); }
		public EnclosedExpressionContext enclosedExpression() {
			return getRuleContext(EnclosedExpressionContext.class,0);
		}
		public CatchErrorListContext catchErrorList() {
			return getRuleContext(CatchErrorListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode DOLLAR() { return getToken(XQueryParser.DOLLAR, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			match(KW_CATCH);
			setState(1104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DFPropertyName:
			case STAR:
			case KW_ALLOWING:
			case KW_ANCESTOR:
			case KW_ANCESTOR_OR_SELF:
			case KW_AND:
			case KW_ARRAY:
			case KW_AS:
			case KW_ASCENDING:
			case KW_AT:
			case KW_ATTRIBUTE:
			case KW_BASE_URI:
			case KW_BOUNDARY_SPACE:
			case KW_BINARY:
			case KW_BY:
			case KW_CASE:
			case KW_CAST:
			case KW_CASTABLE:
			case KW_CATCH:
			case KW_CHILD:
			case KW_COLLATION:
			case KW_COMMENT:
			case KW_CONSTRUCTION:
			case KW_CONTEXT:
			case KW_COPY_NS:
			case KW_COUNT:
			case KW_DECLARE:
			case KW_DEFAULT:
			case KW_DESCENDANT:
			case KW_DESCENDANT_OR_SELF:
			case KW_DESCENDING:
			case KW_DECIMAL_FORMAT:
			case KW_DIV:
			case KW_DOCUMENT:
			case KW_DOCUMENT_NODE:
			case KW_ELEMENT:
			case KW_ELSE:
			case KW_EMPTY:
			case KW_EMPTY_SEQUENCE:
			case KW_ENCODING:
			case KW_END:
			case KW_EQ:
			case KW_EVERY:
			case KW_EXCEPT:
			case KW_EXTERNAL:
			case KW_FOLLOWING:
			case KW_FOLLOWING_SIBLING:
			case KW_FOR:
			case KW_FUNCTION:
			case KW_GE:
			case KW_GREATEST:
			case KW_GROUP:
			case KW_GT:
			case KW_IDIV:
			case KW_IF:
			case KW_IMPORT:
			case KW_IN:
			case KW_INHERIT:
			case KW_INSTANCE:
			case KW_INTERSECT:
			case KW_IS:
			case KW_ITEM:
			case KW_LAX:
			case KW_LE:
			case KW_LEAST:
			case KW_LET:
			case KW_LT:
			case KW_MAP:
			case KW_MOD:
			case KW_MODULE:
			case KW_NAMESPACE:
			case KW_NE:
			case KW_NEXT:
			case KW_NAMESPACE_NODE:
			case KW_NO_INHERIT:
			case KW_NO_PRESERVE:
			case KW_NODE:
			case KW_OF:
			case KW_ONLY:
			case KW_OPTION:
			case KW_OR:
			case KW_ORDER:
			case KW_ORDERED:
			case KW_ORDERING:
			case KW_PARENT:
			case KW_PRECEDING:
			case KW_PRECEDING_SIBLING:
			case KW_PRESERVE:
			case KW_PI:
			case KW_RETURN:
			case KW_SATISFIES:
			case KW_SCHEMA:
			case KW_SCHEMA_ATTR:
			case KW_SCHEMA_ELEM:
			case KW_SELF:
			case KW_SLIDING:
			case KW_SOME:
			case KW_STABLE:
			case KW_START:
			case KW_STRICT:
			case KW_STRIP:
			case KW_SWITCH:
			case KW_TEXT:
			case KW_THEN:
			case KW_TO:
			case KW_TREAT:
			case KW_TRY:
			case KW_TUMBLING:
			case KW_TYPE:
			case KW_TYPESWITCH:
			case KW_UNION:
			case KW_UNORDERED:
			case KW_UPDATE:
			case KW_VALIDATE:
			case KW_VARIABLE:
			case KW_VERSION:
			case KW_WHEN:
			case KW_WHERE:
			case KW_WINDOW:
			case KW_XQUERY:
			case KW_ARRAY_NODE:
			case KW_BOOLEAN_NODE:
			case KW_NULL_NODE:
			case KW_NUMBER_NODE:
			case KW_OBJECT_NODE:
			case KW_REPLACE:
			case KW_WITH:
			case KW_VALUE:
			case KW_INSERT:
			case KW_INTO:
			case KW_DELETE:
			case KW_RENAME:
			case URIQualifiedName:
			case FullQName:
			case NCNameWithLocalWildcard:
			case NCNameWithPrefixWildcard:
			case NCName:
				{
				setState(1098);
				catchErrorList();
				}
				break;
			case LPAREN:
				{
				{
				setState(1099);
				match(LPAREN);
				setState(1100);
				match(DOLLAR);
				setState(1101);
				varName();
				setState(1102);
				match(RPAREN);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1106);
			enclosedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnclosedExpressionContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(XQueryParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(XQueryParser.RBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EnclosedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enclosedExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitEnclosedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnclosedExpressionContext enclosedExpression() throws RecognitionException {
		EnclosedExpressionContext _localctx = new EnclosedExpressionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_enclosedExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			match(LBRACE);
			setState(1110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (IntegerLiteral - 5)) | (1L << (DecimalLiteral - 5)) | (1L << (DoubleLiteral - 5)) | (1L << (DFPropertyName - 5)) | (1L << (Quot - 5)) | (1L << (Apos - 5)) | (1L << (COMMENT - 5)) | (1L << (PI - 5)) | (1L << (PRAGMA - 5)) | (1L << (LPAREN - 5)) | (1L << (LBRACKET - 5)) | (1L << (PLUS - 5)) | (1L << (MINUS - 5)) | (1L << (DOT - 5)) | (1L << (LANGLE - 5)) | (1L << (QUESTION - 5)) | (1L << (DOLLAR - 5)) | (1L << (MOD - 5)) | (1L << (KW_ALLOWING - 5)) | (1L << (KW_ANCESTOR - 5)) | (1L << (KW_ANCESTOR_OR_SELF - 5)) | (1L << (KW_AND - 5)) | (1L << (KW_ARRAY - 5)) | (1L << (KW_AS - 5)) | (1L << (KW_ASCENDING - 5)) | (1L << (KW_AT - 5)) | (1L << (KW_ATTRIBUTE - 5)) | (1L << (KW_BASE_URI - 5)) | (1L << (KW_BOUNDARY_SPACE - 5)) | (1L << (KW_BINARY - 5)) | (1L << (KW_BY - 5)) | (1L << (KW_CASE - 5)) | (1L << (KW_CAST - 5)) | (1L << (KW_CASTABLE - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (KW_CATCH - 69)) | (1L << (KW_CHILD - 69)) | (1L << (KW_COLLATION - 69)) | (1L << (KW_COMMENT - 69)) | (1L << (KW_CONSTRUCTION - 69)) | (1L << (KW_CONTEXT - 69)) | (1L << (KW_COPY_NS - 69)) | (1L << (KW_COUNT - 69)) | (1L << (KW_DECLARE - 69)) | (1L << (KW_DEFAULT - 69)) | (1L << (KW_DESCENDANT - 69)) | (1L << (KW_DESCENDANT_OR_SELF - 69)) | (1L << (KW_DESCENDING - 69)) | (1L << (KW_DECIMAL_FORMAT - 69)) | (1L << (KW_DIV - 69)) | (1L << (KW_DOCUMENT - 69)) | (1L << (KW_DOCUMENT_NODE - 69)) | (1L << (KW_ELEMENT - 69)) | (1L << (KW_ELSE - 69)) | (1L << (KW_EMPTY - 69)) | (1L << (KW_EMPTY_SEQUENCE - 69)) | (1L << (KW_ENCODING - 69)) | (1L << (KW_END - 69)) | (1L << (KW_EQ - 69)) | (1L << (KW_EVERY - 69)) | (1L << (KW_EXCEPT - 69)) | (1L << (KW_EXTERNAL - 69)) | (1L << (KW_FOLLOWING - 69)) | (1L << (KW_FOLLOWING_SIBLING - 69)) | (1L << (KW_FOR - 69)) | (1L << (KW_FUNCTION - 69)) | (1L << (KW_GE - 69)) | (1L << (KW_GREATEST - 69)) | (1L << (KW_GROUP - 69)) | (1L << (KW_GT - 69)) | (1L << (KW_IDIV - 69)) | (1L << (KW_IF - 69)) | (1L << (KW_IMPORT - 69)) | (1L << (KW_IN - 69)) | (1L << (KW_INHERIT - 69)) | (1L << (KW_INSTANCE - 69)) | (1L << (KW_INTERSECT - 69)) | (1L << (KW_IS - 69)) | (1L << (KW_ITEM - 69)) | (1L << (KW_LAX - 69)) | (1L << (KW_LE - 69)) | (1L << (KW_LEAST - 69)) | (1L << (KW_LET - 69)) | (1L << (KW_LT - 69)) | (1L << (KW_MAP - 69)) | (1L << (KW_MOD - 69)) | (1L << (KW_MODULE - 69)) | (1L << (KW_NAMESPACE - 69)) | (1L << (KW_NE - 69)) | (1L << (KW_NEXT - 69)) | (1L << (KW_NAMESPACE_NODE - 69)) | (1L << (KW_NO_INHERIT - 69)) | (1L << (KW_NO_PRESERVE - 69)) | (1L << (KW_NODE - 69)) | (1L << (KW_OF - 69)) | (1L << (KW_ONLY - 69)) | (1L << (KW_OPTION - 69)) | (1L << (KW_OR - 69)) | (1L << (KW_ORDER - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (KW_ORDERED - 133)) | (1L << (KW_ORDERING - 133)) | (1L << (KW_PARENT - 133)) | (1L << (KW_PRECEDING - 133)) | (1L << (KW_PRECEDING_SIBLING - 133)) | (1L << (KW_PRESERVE - 133)) | (1L << (KW_PI - 133)) | (1L << (KW_RETURN - 133)) | (1L << (KW_SATISFIES - 133)) | (1L << (KW_SCHEMA - 133)) | (1L << (KW_SCHEMA_ATTR - 133)) | (1L << (KW_SCHEMA_ELEM - 133)) | (1L << (KW_SELF - 133)) | (1L << (KW_SLIDING - 133)) | (1L << (KW_SOME - 133)) | (1L << (KW_STABLE - 133)) | (1L << (KW_START - 133)) | (1L << (KW_STRICT - 133)) | (1L << (KW_STRIP - 133)) | (1L << (KW_SWITCH - 133)) | (1L << (KW_TEXT - 133)) | (1L << (KW_THEN - 133)) | (1L << (KW_TO - 133)) | (1L << (KW_TREAT - 133)) | (1L << (KW_TRY - 133)) | (1L << (KW_TUMBLING - 133)) | (1L << (KW_TYPE - 133)) | (1L << (KW_TYPESWITCH - 133)) | (1L << (KW_UNION - 133)) | (1L << (KW_UNORDERED - 133)) | (1L << (KW_UPDATE - 133)) | (1L << (KW_VALIDATE - 133)) | (1L << (KW_VARIABLE - 133)) | (1L << (KW_VERSION - 133)) | (1L << (KW_WHEN - 133)) | (1L << (KW_WHERE - 133)) | (1L << (KW_WINDOW - 133)) | (1L << (KW_XQUERY - 133)) | (1L << (KW_ARRAY_NODE - 133)) | (1L << (KW_BOOLEAN_NODE - 133)) | (1L << (KW_NULL_NODE - 133)) | (1L << (KW_NUMBER_NODE - 133)) | (1L << (KW_OBJECT_NODE - 133)) | (1L << (KW_REPLACE - 133)) | (1L << (KW_WITH - 133)) | (1L << (KW_VALUE - 133)) | (1L << (KW_INSERT - 133)) | (1L << (KW_INTO - 133)) | (1L << (KW_DELETE - 133)) | (1L << (KW_RENAME - 133)) | (1L << (URIQualifiedName - 133)) | (1L << (FullQName - 133)) | (1L << (NCName - 133)) | (1L << (ENTER_STRING - 133)))) != 0)) {
				{
				setState(1109);
				expr();
				}
			}

			setState(1112);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchErrorListContext extends ParserRuleContext {
		public List<NameTestContext> nameTest() {
			return getRuleContexts(NameTestContext.class);
		}
		public NameTestContext nameTest(int i) {
			return getRuleContext(NameTestContext.class,i);
		}
		public List<TerminalNode> VBAR() { return getTokens(XQueryParser.VBAR); }
		public TerminalNode VBAR(int i) {
			return getToken(XQueryParser.VBAR, i);
		}
		public CatchErrorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchErrorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCatchErrorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchErrorListContext catchErrorList() throws RecognitionException {
		CatchErrorListContext _localctx = new CatchErrorListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_catchErrorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			nameTest();
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VBAR) {
				{
				{
				setState(1115);
				match(VBAR);
				setState(1116);
				nameTest();
				}
				}
				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistUpdateExprContext extends ParserRuleContext {
		public TerminalNode KW_UPDATE() { return getToken(XQueryParser.KW_UPDATE, 0); }
		public ExistReplaceExprContext existReplaceExpr() {
			return getRuleContext(ExistReplaceExprContext.class,0);
		}
		public ExistValueExprContext existValueExpr() {
			return getRuleContext(ExistValueExprContext.class,0);
		}
		public ExistInsertExprContext existInsertExpr() {
			return getRuleContext(ExistInsertExprContext.class,0);
		}
		public ExistDeleteExprContext existDeleteExpr() {
			return getRuleContext(ExistDeleteExprContext.class,0);
		}
		public ExistRenameExprContext existRenameExpr() {
			return getRuleContext(ExistRenameExprContext.class,0);
		}
		public ExistUpdateExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existUpdateExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitExistUpdateExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistUpdateExprContext existUpdateExpr() throws RecognitionException {
		ExistUpdateExprContext _localctx = new ExistUpdateExprContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_existUpdateExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			match(KW_UPDATE);
			setState(1128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_REPLACE:
				{
				setState(1123);
				existReplaceExpr();
				}
				break;
			case KW_VALUE:
				{
				setState(1124);
				existValueExpr();
				}
				break;
			case KW_INSERT:
				{
				setState(1125);
				existInsertExpr();
				}
				break;
			case KW_DELETE:
				{
				setState(1126);
				existDeleteExpr();
				}
				break;
			case KW_RENAME:
				{
				setState(1127);
				existRenameExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistReplaceExprContext extends ParserRuleContext {
		public TerminalNode KW_REPLACE() { return getToken(XQueryParser.KW_REPLACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode KW_WITH() { return getToken(XQueryParser.KW_WITH, 0); }
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public ExistReplaceExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existReplaceExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitExistReplaceExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistReplaceExprContext existReplaceExpr() throws RecognitionException {
		ExistReplaceExprContext _localctx = new ExistReplaceExprContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_existReplaceExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			match(KW_REPLACE);
			setState(1131);
			expr();
			setState(1132);
			match(KW_WITH);
			setState(1133);
			exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistValueExprContext extends ParserRuleContext {
		public TerminalNode KW_VALUE() { return getToken(XQueryParser.KW_VALUE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode KW_WITH() { return getToken(XQueryParser.KW_WITH, 0); }
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public ExistValueExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existValueExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitExistValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistValueExprContext existValueExpr() throws RecognitionException {
		ExistValueExprContext _localctx = new ExistValueExprContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_existValueExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			match(KW_VALUE);
			setState(1136);
			expr();
			setState(1137);
			match(KW_WITH);
			setState(1138);
			exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistInsertExprContext extends ParserRuleContext {
		public TerminalNode KW_INSERT() { return getToken(XQueryParser.KW_INSERT, 0); }
		public List<ExprSingleContext> exprSingle() {
			return getRuleContexts(ExprSingleContext.class);
		}
		public ExprSingleContext exprSingle(int i) {
			return getRuleContext(ExprSingleContext.class,i);
		}
		public TerminalNode KW_INTO() { return getToken(XQueryParser.KW_INTO, 0); }
		public TerminalNode KW_PRECEDING() { return getToken(XQueryParser.KW_PRECEDING, 0); }
		public TerminalNode KW_FOLLOWING() { return getToken(XQueryParser.KW_FOLLOWING, 0); }
		public ExistInsertExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existInsertExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitExistInsertExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistInsertExprContext existInsertExpr() throws RecognitionException {
		ExistInsertExprContext _localctx = new ExistInsertExprContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_existInsertExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
			match(KW_INSERT);
			setState(1141);
			exprSingle();
			setState(1142);
			_la = _input.LA(1);
			if ( !(_la==KW_FOLLOWING || _la==KW_PRECEDING || _la==KW_INTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1143);
			exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistDeleteExprContext extends ParserRuleContext {
		public TerminalNode KW_DELETE() { return getToken(XQueryParser.KW_DELETE, 0); }
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public ExistDeleteExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existDeleteExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitExistDeleteExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistDeleteExprContext existDeleteExpr() throws RecognitionException {
		ExistDeleteExprContext _localctx = new ExistDeleteExprContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_existDeleteExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			match(KW_DELETE);
			setState(1146);
			exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistRenameExprContext extends ParserRuleContext {
		public TerminalNode KW_RENAME() { return getToken(XQueryParser.KW_RENAME, 0); }
		public List<ExprSingleContext> exprSingle() {
			return getRuleContexts(ExprSingleContext.class);
		}
		public ExprSingleContext exprSingle(int i) {
			return getRuleContext(ExprSingleContext.class,i);
		}
		public TerminalNode KW_AS() { return getToken(XQueryParser.KW_AS, 0); }
		public ExistRenameExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existRenameExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitExistRenameExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistRenameExprContext existRenameExpr() throws RecognitionException {
		ExistRenameExprContext _localctx = new ExistRenameExprContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_existRenameExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			match(KW_RENAME);
			setState(1149);
			exprSingle();
			setState(1150);
			match(KW_AS);
			setState(1151);
			exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExprContext extends ParserRuleContext {
		public AndExprContext main_expr;
		public AndExprContext andExpr;
		public List<AndExprContext> rhs = new ArrayList<AndExprContext>();
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
		}
		public List<TerminalNode> KW_OR() { return getTokens(XQueryParser.KW_OR); }
		public TerminalNode KW_OR(int i) {
			return getToken(XQueryParser.KW_OR, i);
		}
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_orExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			((OrExprContext)_localctx).main_expr = andExpr();
			setState(1158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1154);
					match(KW_OR);
					setState(1155);
					((OrExprContext)_localctx).andExpr = andExpr();
					((OrExprContext)_localctx).rhs.add(((OrExprContext)_localctx).andExpr);
					}
					} 
				}
				setState(1160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExprContext extends ParserRuleContext {
		public ComparisonExprContext main_expr;
		public ComparisonExprContext comparisonExpr;
		public List<ComparisonExprContext> rhs = new ArrayList<ComparisonExprContext>();
		public List<ComparisonExprContext> comparisonExpr() {
			return getRuleContexts(ComparisonExprContext.class);
		}
		public ComparisonExprContext comparisonExpr(int i) {
			return getRuleContext(ComparisonExprContext.class,i);
		}
		public List<TerminalNode> KW_AND() { return getTokens(XQueryParser.KW_AND); }
		public TerminalNode KW_AND(int i) {
			return getToken(XQueryParser.KW_AND, i);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_andExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			((AndExprContext)_localctx).main_expr = comparisonExpr();
			setState(1166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1162);
					match(KW_AND);
					setState(1163);
					((AndExprContext)_localctx).comparisonExpr = comparisonExpr();
					((AndExprContext)_localctx).rhs.add(((AndExprContext)_localctx).comparisonExpr);
					}
					} 
				}
				setState(1168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonExprContext extends ParserRuleContext {
		public StringConcatExprContext main_expr;
		public StringConcatExprContext stringConcatExpr;
		public List<StringConcatExprContext> rhs = new ArrayList<StringConcatExprContext>();
		public List<StringConcatExprContext> stringConcatExpr() {
			return getRuleContexts(StringConcatExprContext.class);
		}
		public StringConcatExprContext stringConcatExpr(int i) {
			return getRuleContext(StringConcatExprContext.class,i);
		}
		public ValueCompContext valueComp() {
			return getRuleContext(ValueCompContext.class,0);
		}
		public GeneralCompContext generalComp() {
			return getRuleContext(GeneralCompContext.class,0);
		}
		public NodeCompContext nodeComp() {
			return getRuleContext(NodeCompContext.class,0);
		}
		public ComparisonExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitComparisonExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExprContext comparisonExpr() throws RecognitionException {
		ComparisonExprContext _localctx = new ComparisonExprContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_comparisonExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			((ComparisonExprContext)_localctx).main_expr = stringConcatExpr();
			setState(1177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(1173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(1170);
					valueComp();
					}
					break;
				case 2:
					{
					setState(1171);
					generalComp();
					}
					break;
				case 3:
					{
					setState(1172);
					nodeComp();
					}
					break;
				}
				setState(1175);
				((ComparisonExprContext)_localctx).stringConcatExpr = stringConcatExpr();
				((ComparisonExprContext)_localctx).rhs.add(((ComparisonExprContext)_localctx).stringConcatExpr);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringConcatExprContext extends ParserRuleContext {
		public RangeExprContext main_expr;
		public RangeExprContext rangeExpr;
		public List<RangeExprContext> rhs = new ArrayList<RangeExprContext>();
		public List<RangeExprContext> rangeExpr() {
			return getRuleContexts(RangeExprContext.class);
		}
		public RangeExprContext rangeExpr(int i) {
			return getRuleContext(RangeExprContext.class,i);
		}
		public List<TerminalNode> CONCATENATION() { return getTokens(XQueryParser.CONCATENATION); }
		public TerminalNode CONCATENATION(int i) {
			return getToken(XQueryParser.CONCATENATION, i);
		}
		public StringConcatExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConcatExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitStringConcatExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConcatExprContext stringConcatExpr() throws RecognitionException {
		StringConcatExprContext _localctx = new StringConcatExprContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_stringConcatExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			((StringConcatExprContext)_localctx).main_expr = rangeExpr();
			setState(1184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONCATENATION) {
				{
				{
				setState(1180);
				match(CONCATENATION);
				setState(1181);
				((StringConcatExprContext)_localctx).rangeExpr = rangeExpr();
				((StringConcatExprContext)_localctx).rhs.add(((StringConcatExprContext)_localctx).rangeExpr);
				}
				}
				setState(1186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeExprContext extends ParserRuleContext {
		public AdditiveExprContext main_expr;
		public AdditiveExprContext additiveExpr;
		public List<AdditiveExprContext> rhs = new ArrayList<AdditiveExprContext>();
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public TerminalNode KW_TO() { return getToken(XQueryParser.KW_TO, 0); }
		public RangeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitRangeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeExprContext rangeExpr() throws RecognitionException {
		RangeExprContext _localctx = new RangeExprContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_rangeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187);
			((RangeExprContext)_localctx).main_expr = additiveExpr();
			setState(1190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(1188);
				match(KW_TO);
				setState(1189);
				((RangeExprContext)_localctx).additiveExpr = additiveExpr();
				((RangeExprContext)_localctx).rhs.add(((RangeExprContext)_localctx).additiveExpr);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExprContext extends ParserRuleContext {
		public MultiplicativeExprContext main_expr;
		public Token PLUS;
		public List<Token> op = new ArrayList<Token>();
		public Token MINUS;
		public Token _tset1828;
		public MultiplicativeExprContext multiplicativeExpr;
		public List<MultiplicativeExprContext> rhs = new ArrayList<MultiplicativeExprContext>();
		public List<MultiplicativeExprContext> multiplicativeExpr() {
			return getRuleContexts(MultiplicativeExprContext.class);
		}
		public MultiplicativeExprContext multiplicativeExpr(int i) {
			return getRuleContext(MultiplicativeExprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(XQueryParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(XQueryParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(XQueryParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(XQueryParser.MINUS, i);
		}
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_additiveExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			((AdditiveExprContext)_localctx).main_expr = multiplicativeExpr();
			setState(1197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1193);
					((AdditiveExprContext)_localctx)._tset1828 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((AdditiveExprContext)_localctx)._tset1828 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					((AdditiveExprContext)_localctx).op.add(((AdditiveExprContext)_localctx)._tset1828);
					setState(1194);
					((AdditiveExprContext)_localctx).multiplicativeExpr = multiplicativeExpr();
					((AdditiveExprContext)_localctx).rhs.add(((AdditiveExprContext)_localctx).multiplicativeExpr);
					}
					} 
				}
				setState(1199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExprContext extends ParserRuleContext {
		public UnionExprContext main_expr;
		public Token STAR;
		public List<Token> op = new ArrayList<Token>();
		public Token KW_DIV;
		public Token KW_IDIV;
		public Token KW_MOD;
		public Token _tset1856;
		public UnionExprContext unionExpr;
		public List<UnionExprContext> rhs = new ArrayList<UnionExprContext>();
		public List<UnionExprContext> unionExpr() {
			return getRuleContexts(UnionExprContext.class);
		}
		public UnionExprContext unionExpr(int i) {
			return getRuleContext(UnionExprContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(XQueryParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(XQueryParser.STAR, i);
		}
		public List<TerminalNode> KW_DIV() { return getTokens(XQueryParser.KW_DIV); }
		public TerminalNode KW_DIV(int i) {
			return getToken(XQueryParser.KW_DIV, i);
		}
		public List<TerminalNode> KW_IDIV() { return getTokens(XQueryParser.KW_IDIV); }
		public TerminalNode KW_IDIV(int i) {
			return getToken(XQueryParser.KW_IDIV, i);
		}
		public List<TerminalNode> KW_MOD() { return getTokens(XQueryParser.KW_MOD); }
		public TerminalNode KW_MOD(int i) {
			return getToken(XQueryParser.KW_MOD, i);
		}
		public MultiplicativeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitMultiplicativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_multiplicativeExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			((MultiplicativeExprContext)_localctx).main_expr = unionExpr();
			setState(1205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1201);
					((MultiplicativeExprContext)_localctx)._tset1856 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==STAR || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (KW_DIV - 83)) | (1L << (KW_IDIV - 83)) | (1L << (KW_MOD - 83)))) != 0)) ) {
						((MultiplicativeExprContext)_localctx)._tset1856 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					((MultiplicativeExprContext)_localctx).op.add(((MultiplicativeExprContext)_localctx)._tset1856);
					setState(1202);
					((MultiplicativeExprContext)_localctx).unionExpr = unionExpr();
					((MultiplicativeExprContext)_localctx).rhs.add(((MultiplicativeExprContext)_localctx).unionExpr);
					}
					} 
				}
				setState(1207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionExprContext extends ParserRuleContext {
		public IntersectExceptExprContext main_expr;
		public IntersectExceptExprContext intersectExceptExpr;
		public List<IntersectExceptExprContext> rhs = new ArrayList<IntersectExceptExprContext>();
		public List<IntersectExceptExprContext> intersectExceptExpr() {
			return getRuleContexts(IntersectExceptExprContext.class);
		}
		public IntersectExceptExprContext intersectExceptExpr(int i) {
			return getRuleContext(IntersectExceptExprContext.class,i);
		}
		public List<TerminalNode> KW_UNION() { return getTokens(XQueryParser.KW_UNION); }
		public TerminalNode KW_UNION(int i) {
			return getToken(XQueryParser.KW_UNION, i);
		}
		public List<TerminalNode> VBAR() { return getTokens(XQueryParser.VBAR); }
		public TerminalNode VBAR(int i) {
			return getToken(XQueryParser.VBAR, i);
		}
		public UnionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitUnionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionExprContext unionExpr() throws RecognitionException {
		UnionExprContext _localctx = new UnionExprContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_unionExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			((UnionExprContext)_localctx).main_expr = intersectExceptExpr();
			setState(1213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1209);
					_la = _input.LA(1);
					if ( !(_la==VBAR || _la==KW_UNION) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1210);
					((UnionExprContext)_localctx).intersectExceptExpr = intersectExceptExpr();
					((UnionExprContext)_localctx).rhs.add(((UnionExprContext)_localctx).intersectExceptExpr);
					}
					} 
				}
				setState(1215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntersectExceptExprContext extends ParserRuleContext {
		public InstanceOfExprContext main_expr;
		public InstanceOfExprContext instanceOfExpr;
		public List<InstanceOfExprContext> rhs = new ArrayList<InstanceOfExprContext>();
		public List<InstanceOfExprContext> instanceOfExpr() {
			return getRuleContexts(InstanceOfExprContext.class);
		}
		public InstanceOfExprContext instanceOfExpr(int i) {
			return getRuleContext(InstanceOfExprContext.class,i);
		}
		public List<TerminalNode> KW_INTERSECT() { return getTokens(XQueryParser.KW_INTERSECT); }
		public TerminalNode KW_INTERSECT(int i) {
			return getToken(XQueryParser.KW_INTERSECT, i);
		}
		public List<TerminalNode> KW_EXCEPT() { return getTokens(XQueryParser.KW_EXCEPT); }
		public TerminalNode KW_EXCEPT(int i) {
			return getToken(XQueryParser.KW_EXCEPT, i);
		}
		public IntersectExceptExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersectExceptExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitIntersectExceptExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntersectExceptExprContext intersectExceptExpr() throws RecognitionException {
		IntersectExceptExprContext _localctx = new IntersectExceptExprContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_intersectExceptExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			((IntersectExceptExprContext)_localctx).main_expr = instanceOfExpr();
			setState(1221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1217);
					_la = _input.LA(1);
					if ( !(_la==KW_EXCEPT || _la==KW_INTERSECT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1218);
					((IntersectExceptExprContext)_localctx).instanceOfExpr = instanceOfExpr();
					((IntersectExceptExprContext)_localctx).rhs.add(((IntersectExceptExprContext)_localctx).instanceOfExpr);
					}
					} 
				}
				setState(1223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceOfExprContext extends ParserRuleContext {
		public TreatExprContext main_expr;
		public SequenceTypeContext seq;
		public TreatExprContext treatExpr() {
			return getRuleContext(TreatExprContext.class,0);
		}
		public TerminalNode KW_INSTANCE() { return getToken(XQueryParser.KW_INSTANCE, 0); }
		public TerminalNode KW_OF() { return getToken(XQueryParser.KW_OF, 0); }
		public SequenceTypeContext sequenceType() {
			return getRuleContext(SequenceTypeContext.class,0);
		}
		public InstanceOfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceOfExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitInstanceOfExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceOfExprContext instanceOfExpr() throws RecognitionException {
		InstanceOfExprContext _localctx = new InstanceOfExprContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_instanceOfExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			((InstanceOfExprContext)_localctx).main_expr = treatExpr();
			setState(1228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(1225);
				match(KW_INSTANCE);
				setState(1226);
				match(KW_OF);
				setState(1227);
				((InstanceOfExprContext)_localctx).seq = sequenceType();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TreatExprContext extends ParserRuleContext {
		public CastableExprContext main_expr;
		public SequenceTypeContext seq;
		public CastableExprContext castableExpr() {
			return getRuleContext(CastableExprContext.class,0);
		}
		public TerminalNode KW_TREAT() { return getToken(XQueryParser.KW_TREAT, 0); }
		public TerminalNode KW_AS() { return getToken(XQueryParser.KW_AS, 0); }
		public SequenceTypeContext sequenceType() {
			return getRuleContext(SequenceTypeContext.class,0);
		}
		public TreatExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treatExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitTreatExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TreatExprContext treatExpr() throws RecognitionException {
		TreatExprContext _localctx = new TreatExprContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_treatExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			((TreatExprContext)_localctx).main_expr = castableExpr();
			setState(1234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(1231);
				match(KW_TREAT);
				setState(1232);
				match(KW_AS);
				setState(1233);
				((TreatExprContext)_localctx).seq = sequenceType();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastableExprContext extends ParserRuleContext {
		public CastExprContext main_expr;
		public SingleTypeContext single;
		public CastExprContext castExpr() {
			return getRuleContext(CastExprContext.class,0);
		}
		public TerminalNode KW_CASTABLE() { return getToken(XQueryParser.KW_CASTABLE, 0); }
		public TerminalNode KW_AS() { return getToken(XQueryParser.KW_AS, 0); }
		public SingleTypeContext singleType() {
			return getRuleContext(SingleTypeContext.class,0);
		}
		public CastableExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castableExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCastableExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastableExprContext castableExpr() throws RecognitionException {
		CastableExprContext _localctx = new CastableExprContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_castableExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			((CastableExprContext)_localctx).main_expr = castExpr();
			setState(1240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(1237);
				match(KW_CASTABLE);
				setState(1238);
				match(KW_AS);
				setState(1239);
				((CastableExprContext)_localctx).single = singleType();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExprContext extends ParserRuleContext {
		public ArrowExprContext main_expr;
		public SingleTypeContext single;
		public ArrowExprContext arrowExpr() {
			return getRuleContext(ArrowExprContext.class,0);
		}
		public TerminalNode KW_CAST() { return getToken(XQueryParser.KW_CAST, 0); }
		public TerminalNode KW_AS() { return getToken(XQueryParser.KW_AS, 0); }
		public SingleTypeContext singleType() {
			return getRuleContext(SingleTypeContext.class,0);
		}
		public CastExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCastExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExprContext castExpr() throws RecognitionException {
		CastExprContext _localctx = new CastExprContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_castExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			((CastExprContext)_localctx).main_expr = arrowExpr();
			setState(1246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(1243);
				match(KW_CAST);
				setState(1244);
				match(KW_AS);
				setState(1245);
				((CastExprContext)_localctx).single = singleType();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrowExprContext extends ParserRuleContext {
		public UnaryExprContext main_expr;
		public FunctionCallContext functionCall;
		public List<FunctionCallContext> function_call_expr = new ArrayList<FunctionCallContext>();
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public List<TerminalNode> ARROW() { return getTokens(XQueryParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(XQueryParser.ARROW, i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public ArrowExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitArrowExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowExprContext arrowExpr() throws RecognitionException {
		ArrowExprContext _localctx = new ArrowExprContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_arrowExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			((ArrowExprContext)_localctx).main_expr = unaryExpr();
			setState(1253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1249);
					match(ARROW);
					setState(1250);
					((ArrowExprContext)_localctx).functionCall = functionCall();
					((ArrowExprContext)_localctx).function_call_expr.add(((ArrowExprContext)_localctx).functionCall);
					}
					} 
				}
				setState(1255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExprContext extends ParserRuleContext {
		public Token MINUS;
		public List<Token> op = new ArrayList<Token>();
		public Token PLUS;
		public Token _tset2039;
		public ValueExprContext main_expr;
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
		}
		public List<TerminalNode> MINUS() { return getTokens(XQueryParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(XQueryParser.MINUS, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(XQueryParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(XQueryParser.PLUS, i);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_unaryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(1256);
				((UnaryExprContext)_localctx)._tset2039 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((UnaryExprContext)_localctx)._tset2039 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((UnaryExprContext)_localctx).op.add(((UnaryExprContext)_localctx)._tset2039);
				}
				}
				setState(1261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1262);
			((UnaryExprContext)_localctx).main_expr = valueExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExprContext extends ParserRuleContext {
		public ValidateExprContext validateExpr() {
			return getRuleContext(ValidateExprContext.class,0);
		}
		public ExtensionExprContext extensionExpr() {
			return getRuleContext(ExtensionExprContext.class,0);
		}
		public SimpleMapExprContext simpleMapExpr() {
			return getRuleContext(SimpleMapExprContext.class,0);
		}
		public ValueExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExprContext valueExpr() throws RecognitionException {
		ValueExprContext _localctx = new ValueExprContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_valueExpr);
		try {
			setState(1267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1264);
				validateExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1265);
				extensionExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1266);
				simpleMapExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneralCompContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(XQueryParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(XQueryParser.NOT_EQUAL, 0); }
		public TerminalNode LANGLE() { return getToken(XQueryParser.LANGLE, 0); }
		public TerminalNode RANGLE() { return getToken(XQueryParser.RANGLE, 0); }
		public GeneralCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalComp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitGeneralComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralCompContext generalComp() throws RecognitionException {
		GeneralCompContext _localctx = new GeneralCompContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_generalComp);
		try {
			setState(1277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1269);
				match(EQUAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1270);
				match(NOT_EQUAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1271);
				match(LANGLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1272);
				match(LANGLE);
				setState(1273);
				match(EQUAL);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1274);
				match(RANGLE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1275);
				match(RANGLE);
				setState(1276);
				match(EQUAL);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueCompContext extends ParserRuleContext {
		public TerminalNode KW_EQ() { return getToken(XQueryParser.KW_EQ, 0); }
		public TerminalNode KW_NE() { return getToken(XQueryParser.KW_NE, 0); }
		public TerminalNode KW_LT() { return getToken(XQueryParser.KW_LT, 0); }
		public TerminalNode KW_LE() { return getToken(XQueryParser.KW_LE, 0); }
		public TerminalNode KW_GT() { return getToken(XQueryParser.KW_GT, 0); }
		public TerminalNode KW_GE() { return getToken(XQueryParser.KW_GE, 0); }
		public ValueCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueComp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitValueComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueCompContext valueComp() throws RecognitionException {
		ValueCompContext _localctx = new ValueCompContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_valueComp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			_la = _input.LA(1);
			if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (KW_EQ - 92)) | (1L << (KW_GE - 92)) | (1L << (KW_GT - 92)) | (1L << (KW_LE - 92)) | (1L << (KW_LT - 92)) | (1L << (KW_NE - 92)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodeCompContext extends ParserRuleContext {
		public TerminalNode KW_IS() { return getToken(XQueryParser.KW_IS, 0); }
		public List<TerminalNode> LANGLE() { return getTokens(XQueryParser.LANGLE); }
		public TerminalNode LANGLE(int i) {
			return getToken(XQueryParser.LANGLE, i);
		}
		public List<TerminalNode> RANGLE() { return getTokens(XQueryParser.RANGLE); }
		public TerminalNode RANGLE(int i) {
			return getToken(XQueryParser.RANGLE, i);
		}
		public NodeCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeComp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitNodeComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeCompContext nodeComp() throws RecognitionException {
		NodeCompContext _localctx = new NodeCompContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_nodeComp);
		try {
			setState(1286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_IS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1281);
				match(KW_IS);
				}
				break;
			case LANGLE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1282);
				match(LANGLE);
				setState(1283);
				match(LANGLE);
				}
				}
				break;
			case RANGLE:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1284);
				match(RANGLE);
				setState(1285);
				match(RANGLE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValidateExprContext extends ParserRuleContext {
		public TerminalNode KW_VALIDATE() { return getToken(XQueryParser.KW_VALIDATE, 0); }
		public EnclosedExpressionContext enclosedExpression() {
			return getRuleContext(EnclosedExpressionContext.class,0);
		}
		public ValidationModeContext validationMode() {
			return getRuleContext(ValidationModeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode KW_TYPE() { return getToken(XQueryParser.KW_TYPE, 0); }
		public TerminalNode KW_AS() { return getToken(XQueryParser.KW_AS, 0); }
		public ValidateExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validateExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitValidateExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidateExprContext validateExpr() throws RecognitionException {
		ValidateExprContext _localctx = new ValidateExprContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_validateExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			match(KW_VALIDATE);
			setState(1292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_LAX:
			case KW_STRICT:
				{
				setState(1289);
				validationMode();
				}
				break;
			case KW_AS:
			case KW_TYPE:
				{
				{
				setState(1290);
				_la = _input.LA(1);
				if ( !(_la==KW_AS || _la==KW_TYPE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1291);
				typeName();
				}
				}
				break;
			case LBRACE:
				break;
			default:
				break;
			}
			setState(1294);
			enclosedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValidationModeContext extends ParserRuleContext {
		public TerminalNode KW_LAX() { return getToken(XQueryParser.KW_LAX, 0); }
		public TerminalNode KW_STRICT() { return getToken(XQueryParser.KW_STRICT, 0); }
		public ValidationModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validationMode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitValidationMode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidationModeContext validationMode() throws RecognitionException {
		ValidationModeContext _localctx = new ValidationModeContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_validationMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			_la = _input.LA(1);
			if ( !(_la==KW_LAX || _la==KW_STRICT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionExprContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(XQueryParser.LBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(XQueryParser.RBRACE, 0); }
		public List<TerminalNode> PRAGMA() { return getTokens(XQueryParser.PRAGMA); }
		public TerminalNode PRAGMA(int i) {
			return getToken(XQueryParser.PRAGMA, i);
		}
		public ExtensionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitExtensionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionExprContext extensionExpr() throws RecognitionException {
		ExtensionExprContext _localctx = new ExtensionExprContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_extensionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1298);
				match(PRAGMA);
				}
				}
				setState(1301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PRAGMA );
			setState(1303);
			match(LBRACE);
			setState(1304);
			expr();
			setState(1305);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleMapExprContext extends ParserRuleContext {
		public PostfixExprContext main_expr;
		public PostfixExprContext postfixExpr;
		public List<PostfixExprContext> map_expr = new ArrayList<PostfixExprContext>();
		public List<PostfixExprContext> postfixExpr() {
			return getRuleContexts(PostfixExprContext.class);
		}
		public PostfixExprContext postfixExpr(int i) {
			return getRuleContext(PostfixExprContext.class,i);
		}
		public List<TerminalNode> BANG() { return getTokens(XQueryParser.BANG); }
		public TerminalNode BANG(int i) {
			return getToken(XQueryParser.BANG, i);
		}
		public SimpleMapExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleMapExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitSimpleMapExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleMapExprContext simpleMapExpr() throws RecognitionException {
		SimpleMapExprContext _localctx = new SimpleMapExprContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_simpleMapExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
			((SimpleMapExprContext)_localctx).main_expr = postfixExpr();
			setState(1312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1308);
					match(BANG);
					setState(1309);
					((SimpleMapExprContext)_localctx).postfixExpr = postfixExpr();
					((SimpleMapExprContext)_localctx).map_expr.add(((SimpleMapExprContext)_localctx).postfixExpr);
					}
					} 
				}
				setState(1314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathExprContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(XQueryParser.SLASH, 0); }
		public RelativePathExprContext relativePathExpr() {
			return getRuleContext(RelativePathExprContext.class,0);
		}
		public TerminalNode DSLASH() { return getToken(XQueryParser.DSLASH, 0); }
		public PathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitPathExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathExprContext pathExpr() throws RecognitionException {
		PathExprContext _localctx = new PathExprContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_pathExpr);
		int _la;
		try {
			setState(1322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SLASH:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1315);
				match(SLASH);
				setState(1317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (IntegerLiteral - 5)) | (1L << (DecimalLiteral - 5)) | (1L << (DoubleLiteral - 5)) | (1L << (DFPropertyName - 5)) | (1L << (Quot - 5)) | (1L << (Apos - 5)) | (1L << (COMMENT - 5)) | (1L << (PI - 5)) | (1L << (LPAREN - 5)) | (1L << (LBRACKET - 5)) | (1L << (STAR - 5)) | (1L << (DOT - 5)) | (1L << (DDOT - 5)) | (1L << (LANGLE - 5)) | (1L << (QUESTION - 5)) | (1L << (AT - 5)) | (1L << (DOLLAR - 5)) | (1L << (MOD - 5)) | (1L << (KW_ALLOWING - 5)) | (1L << (KW_ANCESTOR - 5)) | (1L << (KW_ANCESTOR_OR_SELF - 5)) | (1L << (KW_AND - 5)) | (1L << (KW_ARRAY - 5)) | (1L << (KW_AS - 5)) | (1L << (KW_ASCENDING - 5)) | (1L << (KW_AT - 5)) | (1L << (KW_ATTRIBUTE - 5)) | (1L << (KW_BASE_URI - 5)) | (1L << (KW_BOUNDARY_SPACE - 5)) | (1L << (KW_BINARY - 5)) | (1L << (KW_BY - 5)) | (1L << (KW_CASE - 5)) | (1L << (KW_CAST - 5)) | (1L << (KW_CASTABLE - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (KW_CATCH - 69)) | (1L << (KW_CHILD - 69)) | (1L << (KW_COLLATION - 69)) | (1L << (KW_COMMENT - 69)) | (1L << (KW_CONSTRUCTION - 69)) | (1L << (KW_CONTEXT - 69)) | (1L << (KW_COPY_NS - 69)) | (1L << (KW_COUNT - 69)) | (1L << (KW_DECLARE - 69)) | (1L << (KW_DEFAULT - 69)) | (1L << (KW_DESCENDANT - 69)) | (1L << (KW_DESCENDANT_OR_SELF - 69)) | (1L << (KW_DESCENDING - 69)) | (1L << (KW_DECIMAL_FORMAT - 69)) | (1L << (KW_DIV - 69)) | (1L << (KW_DOCUMENT - 69)) | (1L << (KW_DOCUMENT_NODE - 69)) | (1L << (KW_ELEMENT - 69)) | (1L << (KW_ELSE - 69)) | (1L << (KW_EMPTY - 69)) | (1L << (KW_EMPTY_SEQUENCE - 69)) | (1L << (KW_ENCODING - 69)) | (1L << (KW_END - 69)) | (1L << (KW_EQ - 69)) | (1L << (KW_EVERY - 69)) | (1L << (KW_EXCEPT - 69)) | (1L << (KW_EXTERNAL - 69)) | (1L << (KW_FOLLOWING - 69)) | (1L << (KW_FOLLOWING_SIBLING - 69)) | (1L << (KW_FOR - 69)) | (1L << (KW_FUNCTION - 69)) | (1L << (KW_GE - 69)) | (1L << (KW_GREATEST - 69)) | (1L << (KW_GROUP - 69)) | (1L << (KW_GT - 69)) | (1L << (KW_IDIV - 69)) | (1L << (KW_IF - 69)) | (1L << (KW_IMPORT - 69)) | (1L << (KW_IN - 69)) | (1L << (KW_INHERIT - 69)) | (1L << (KW_INSTANCE - 69)) | (1L << (KW_INTERSECT - 69)) | (1L << (KW_IS - 69)) | (1L << (KW_ITEM - 69)) | (1L << (KW_LAX - 69)) | (1L << (KW_LE - 69)) | (1L << (KW_LEAST - 69)) | (1L << (KW_LET - 69)) | (1L << (KW_LT - 69)) | (1L << (KW_MAP - 69)) | (1L << (KW_MOD - 69)) | (1L << (KW_MODULE - 69)) | (1L << (KW_NAMESPACE - 69)) | (1L << (KW_NE - 69)) | (1L << (KW_NEXT - 69)) | (1L << (KW_NAMESPACE_NODE - 69)) | (1L << (KW_NO_INHERIT - 69)) | (1L << (KW_NO_PRESERVE - 69)) | (1L << (KW_NODE - 69)) | (1L << (KW_OF - 69)) | (1L << (KW_ONLY - 69)) | (1L << (KW_OPTION - 69)) | (1L << (KW_OR - 69)) | (1L << (KW_ORDER - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (KW_ORDERED - 133)) | (1L << (KW_ORDERING - 133)) | (1L << (KW_PARENT - 133)) | (1L << (KW_PRECEDING - 133)) | (1L << (KW_PRECEDING_SIBLING - 133)) | (1L << (KW_PRESERVE - 133)) | (1L << (KW_PI - 133)) | (1L << (KW_RETURN - 133)) | (1L << (KW_SATISFIES - 133)) | (1L << (KW_SCHEMA - 133)) | (1L << (KW_SCHEMA_ATTR - 133)) | (1L << (KW_SCHEMA_ELEM - 133)) | (1L << (KW_SELF - 133)) | (1L << (KW_SLIDING - 133)) | (1L << (KW_SOME - 133)) | (1L << (KW_STABLE - 133)) | (1L << (KW_START - 133)) | (1L << (KW_STRICT - 133)) | (1L << (KW_STRIP - 133)) | (1L << (KW_SWITCH - 133)) | (1L << (KW_TEXT - 133)) | (1L << (KW_THEN - 133)) | (1L << (KW_TO - 133)) | (1L << (KW_TREAT - 133)) | (1L << (KW_TRY - 133)) | (1L << (KW_TUMBLING - 133)) | (1L << (KW_TYPE - 133)) | (1L << (KW_TYPESWITCH - 133)) | (1L << (KW_UNION - 133)) | (1L << (KW_UNORDERED - 133)) | (1L << (KW_UPDATE - 133)) | (1L << (KW_VALIDATE - 133)) | (1L << (KW_VARIABLE - 133)) | (1L << (KW_VERSION - 133)) | (1L << (KW_WHEN - 133)) | (1L << (KW_WHERE - 133)) | (1L << (KW_WINDOW - 133)) | (1L << (KW_XQUERY - 133)) | (1L << (KW_ARRAY_NODE - 133)) | (1L << (KW_BOOLEAN_NODE - 133)) | (1L << (KW_NULL_NODE - 133)) | (1L << (KW_NUMBER_NODE - 133)) | (1L << (KW_OBJECT_NODE - 133)) | (1L << (KW_REPLACE - 133)) | (1L << (KW_WITH - 133)) | (1L << (KW_VALUE - 133)) | (1L << (KW_INSERT - 133)) | (1L << (KW_INTO - 133)) | (1L << (KW_DELETE - 133)) | (1L << (KW_RENAME - 133)) | (1L << (URIQualifiedName - 133)) | (1L << (FullQName - 133)) | (1L << (NCNameWithLocalWildcard - 133)) | (1L << (NCNameWithPrefixWildcard - 133)) | (1L << (NCName - 133)) | (1L << (ENTER_STRING - 133)))) != 0)) {
					{
					setState(1316);
					relativePathExpr();
					}
				}

				}
				}
				break;
			case DSLASH:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1319);
				match(DSLASH);
				setState(1320);
				relativePathExpr();
				}
				}
				break;
			case IntegerLiteral:
			case DecimalLiteral:
			case DoubleLiteral:
			case DFPropertyName:
			case Quot:
			case Apos:
			case COMMENT:
			case PI:
			case LPAREN:
			case LBRACKET:
			case STAR:
			case DOT:
			case DDOT:
			case LANGLE:
			case QUESTION:
			case AT:
			case DOLLAR:
			case MOD:
			case KW_ALLOWING:
			case KW_ANCESTOR:
			case KW_ANCESTOR_OR_SELF:
			case KW_AND:
			case KW_ARRAY:
			case KW_AS:
			case KW_ASCENDING:
			case KW_AT:
			case KW_ATTRIBUTE:
			case KW_BASE_URI:
			case KW_BOUNDARY_SPACE:
			case KW_BINARY:
			case KW_BY:
			case KW_CASE:
			case KW_CAST:
			case KW_CASTABLE:
			case KW_CATCH:
			case KW_CHILD:
			case KW_COLLATION:
			case KW_COMMENT:
			case KW_CONSTRUCTION:
			case KW_CONTEXT:
			case KW_COPY_NS:
			case KW_COUNT:
			case KW_DECLARE:
			case KW_DEFAULT:
			case KW_DESCENDANT:
			case KW_DESCENDANT_OR_SELF:
			case KW_DESCENDING:
			case KW_DECIMAL_FORMAT:
			case KW_DIV:
			case KW_DOCUMENT:
			case KW_DOCUMENT_NODE:
			case KW_ELEMENT:
			case KW_ELSE:
			case KW_EMPTY:
			case KW_EMPTY_SEQUENCE:
			case KW_ENCODING:
			case KW_END:
			case KW_EQ:
			case KW_EVERY:
			case KW_EXCEPT:
			case KW_EXTERNAL:
			case KW_FOLLOWING:
			case KW_FOLLOWING_SIBLING:
			case KW_FOR:
			case KW_FUNCTION:
			case KW_GE:
			case KW_GREATEST:
			case KW_GROUP:
			case KW_GT:
			case KW_IDIV:
			case KW_IF:
			case KW_IMPORT:
			case KW_IN:
			case KW_INHERIT:
			case KW_INSTANCE:
			case KW_INTERSECT:
			case KW_IS:
			case KW_ITEM:
			case KW_LAX:
			case KW_LE:
			case KW_LEAST:
			case KW_LET:
			case KW_LT:
			case KW_MAP:
			case KW_MOD:
			case KW_MODULE:
			case KW_NAMESPACE:
			case KW_NE:
			case KW_NEXT:
			case KW_NAMESPACE_NODE:
			case KW_NO_INHERIT:
			case KW_NO_PRESERVE:
			case KW_NODE:
			case KW_OF:
			case KW_ONLY:
			case KW_OPTION:
			case KW_OR:
			case KW_ORDER:
			case KW_ORDERED:
			case KW_ORDERING:
			case KW_PARENT:
			case KW_PRECEDING:
			case KW_PRECEDING_SIBLING:
			case KW_PRESERVE:
			case KW_PI:
			case KW_RETURN:
			case KW_SATISFIES:
			case KW_SCHEMA:
			case KW_SCHEMA_ATTR:
			case KW_SCHEMA_ELEM:
			case KW_SELF:
			case KW_SLIDING:
			case KW_SOME:
			case KW_STABLE:
			case KW_START:
			case KW_STRICT:
			case KW_STRIP:
			case KW_SWITCH:
			case KW_TEXT:
			case KW_THEN:
			case KW_TO:
			case KW_TREAT:
			case KW_TRY:
			case KW_TUMBLING:
			case KW_TYPE:
			case KW_TYPESWITCH:
			case KW_UNION:
			case KW_UNORDERED:
			case KW_UPDATE:
			case KW_VALIDATE:
			case KW_VARIABLE:
			case KW_VERSION:
			case KW_WHEN:
			case KW_WHERE:
			case KW_WINDOW:
			case KW_XQUERY:
			case KW_ARRAY_NODE:
			case KW_BOOLEAN_NODE:
			case KW_NULL_NODE:
			case KW_NUMBER_NODE:
			case KW_OBJECT_NODE:
			case KW_REPLACE:
			case KW_WITH:
			case KW_VALUE:
			case KW_INSERT:
			case KW_INTO:
			case KW_DELETE:
			case KW_RENAME:
			case URIQualifiedName:
			case FullQName:
			case NCNameWithLocalWildcard:
			case NCNameWithPrefixWildcard:
			case NCName:
			case ENTER_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1321);
				relativePathExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelativePathExprContext extends ParserRuleContext {
		public Token sep;
		public List<StepExprContext> stepExpr() {
			return getRuleContexts(StepExprContext.class);
		}
		public StepExprContext stepExpr(int i) {
			return getRuleContext(StepExprContext.class,i);
		}
		public List<TerminalNode> SLASH() { return getTokens(XQueryParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(XQueryParser.SLASH, i);
		}
		public List<TerminalNode> DSLASH() { return getTokens(XQueryParser.DSLASH); }
		public TerminalNode DSLASH(int i) {
			return getToken(XQueryParser.DSLASH, i);
		}
		public RelativePathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativePathExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitRelativePathExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativePathExprContext relativePathExpr() throws RecognitionException {
		RelativePathExprContext _localctx = new RelativePathExprContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_relativePathExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			stepExpr();
			setState(1329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH || _la==DSLASH) {
				{
				{
				setState(1325);
				((RelativePathExprContext)_localctx).sep = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SLASH || _la==DSLASH) ) {
					((RelativePathExprContext)_localctx).sep = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1326);
				stepExpr();
				}
				}
				setState(1331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StepExprContext extends ParserRuleContext {
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public AxisStepContext axisStep() {
			return getRuleContext(AxisStepContext.class,0);
		}
		public StepExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitStepExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepExprContext stepExpr() throws RecognitionException {
		StepExprContext _localctx = new StepExprContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_stepExpr);
		try {
			setState(1334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1332);
				postfixExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1333);
				axisStep();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AxisStepContext extends ParserRuleContext {
		public PredicateListContext predicateList() {
			return getRuleContext(PredicateListContext.class,0);
		}
		public ReverseStepContext reverseStep() {
			return getRuleContext(ReverseStepContext.class,0);
		}
		public ForwardStepContext forwardStep() {
			return getRuleContext(ForwardStepContext.class,0);
		}
		public AxisStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axisStep; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAxisStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AxisStepContext axisStep() throws RecognitionException {
		AxisStepContext _localctx = new AxisStepContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_axisStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1336);
				reverseStep();
				}
				break;
			case 2:
				{
				setState(1337);
				forwardStep();
				}
				break;
			}
			setState(1340);
			predicateList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForwardStepContext extends ParserRuleContext {
		public ForwardAxisContext forwardAxis() {
			return getRuleContext(ForwardAxisContext.class,0);
		}
		public NodeTestContext nodeTest() {
			return getRuleContext(NodeTestContext.class,0);
		}
		public AbbrevForwardStepContext abbrevForwardStep() {
			return getRuleContext(AbbrevForwardStepContext.class,0);
		}
		public ForwardStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forwardStep; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitForwardStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForwardStepContext forwardStep() throws RecognitionException {
		ForwardStepContext _localctx = new ForwardStepContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_forwardStep);
		try {
			setState(1346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1342);
				forwardAxis();
				setState(1343);
				nodeTest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1345);
				abbrevForwardStep();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForwardAxisContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(XQueryParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(XQueryParser.COLON, i);
		}
		public TerminalNode KW_CHILD() { return getToken(XQueryParser.KW_CHILD, 0); }
		public TerminalNode KW_DESCENDANT() { return getToken(XQueryParser.KW_DESCENDANT, 0); }
		public TerminalNode KW_ATTRIBUTE() { return getToken(XQueryParser.KW_ATTRIBUTE, 0); }
		public TerminalNode KW_SELF() { return getToken(XQueryParser.KW_SELF, 0); }
		public TerminalNode KW_DESCENDANT_OR_SELF() { return getToken(XQueryParser.KW_DESCENDANT_OR_SELF, 0); }
		public TerminalNode KW_FOLLOWING_SIBLING() { return getToken(XQueryParser.KW_FOLLOWING_SIBLING, 0); }
		public TerminalNode KW_FOLLOWING() { return getToken(XQueryParser.KW_FOLLOWING, 0); }
		public ForwardAxisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forwardAxis; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitForwardAxis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForwardAxisContext forwardAxis() throws RecognitionException {
		ForwardAxisContext _localctx = new ForwardAxisContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_forwardAxis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (KW_ATTRIBUTE - 61)) | (1L << (KW_CHILD - 61)) | (1L << (KW_DESCENDANT - 61)) | (1L << (KW_DESCENDANT_OR_SELF - 61)) | (1L << (KW_FOLLOWING - 61)) | (1L << (KW_FOLLOWING_SIBLING - 61)))) != 0) || _la==KW_SELF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1349);
			match(COLON);
			setState(1350);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbbrevForwardStepContext extends ParserRuleContext {
		public NodeTestContext nodeTest() {
			return getRuleContext(NodeTestContext.class,0);
		}
		public TerminalNode AT() { return getToken(XQueryParser.AT, 0); }
		public AbbrevForwardStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abbrevForwardStep; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAbbrevForwardStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbbrevForwardStepContext abbrevForwardStep() throws RecognitionException {
		AbbrevForwardStepContext _localctx = new AbbrevForwardStepContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_abbrevForwardStep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1352);
				match(AT);
				}
			}

			setState(1355);
			nodeTest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReverseStepContext extends ParserRuleContext {
		public ReverseAxisContext reverseAxis() {
			return getRuleContext(ReverseAxisContext.class,0);
		}
		public NodeTestContext nodeTest() {
			return getRuleContext(NodeTestContext.class,0);
		}
		public AbbrevReverseStepContext abbrevReverseStep() {
			return getRuleContext(AbbrevReverseStepContext.class,0);
		}
		public ReverseStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reverseStep; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitReverseStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReverseStepContext reverseStep() throws RecognitionException {
		ReverseStepContext _localctx = new ReverseStepContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_reverseStep);
		try {
			setState(1361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ANCESTOR:
			case KW_ANCESTOR_OR_SELF:
			case KW_PARENT:
			case KW_PRECEDING:
			case KW_PRECEDING_SIBLING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1357);
				reverseAxis();
				setState(1358);
				nodeTest();
				}
				break;
			case DDOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1360);
				abbrevReverseStep();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReverseAxisContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(XQueryParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(XQueryParser.COLON, i);
		}
		public TerminalNode KW_PARENT() { return getToken(XQueryParser.KW_PARENT, 0); }
		public TerminalNode KW_ANCESTOR() { return getToken(XQueryParser.KW_ANCESTOR, 0); }
		public TerminalNode KW_PRECEDING_SIBLING() { return getToken(XQueryParser.KW_PRECEDING_SIBLING, 0); }
		public TerminalNode KW_PRECEDING() { return getToken(XQueryParser.KW_PRECEDING, 0); }
		public TerminalNode KW_ANCESTOR_OR_SELF() { return getToken(XQueryParser.KW_ANCESTOR_OR_SELF, 0); }
		public ReverseAxisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reverseAxis; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitReverseAxis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReverseAxisContext reverseAxis() throws RecognitionException {
		ReverseAxisContext _localctx = new ReverseAxisContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_reverseAxis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			_la = _input.LA(1);
			if ( !(_la==KW_ANCESTOR || _la==KW_ANCESTOR_OR_SELF || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (KW_PARENT - 135)) | (1L << (KW_PRECEDING - 135)) | (1L << (KW_PRECEDING_SIBLING - 135)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1364);
			match(COLON);
			setState(1365);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbbrevReverseStepContext extends ParserRuleContext {
		public TerminalNode DDOT() { return getToken(XQueryParser.DDOT, 0); }
		public AbbrevReverseStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abbrevReverseStep; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAbbrevReverseStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbbrevReverseStepContext abbrevReverseStep() throws RecognitionException {
		AbbrevReverseStepContext _localctx = new AbbrevReverseStepContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_abbrevReverseStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			match(DDOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodeTestContext extends ParserRuleContext {
		public NameTestContext nameTest() {
			return getRuleContext(NameTestContext.class,0);
		}
		public KindTestContext kindTest() {
			return getRuleContext(KindTestContext.class,0);
		}
		public NodeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitNodeTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeTestContext nodeTest() throws RecognitionException {
		NodeTestContext _localctx = new NodeTestContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_nodeTest);
		try {
			setState(1371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1369);
				nameTest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1370);
				kindTest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameTestContext extends ParserRuleContext {
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public NameTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitNameTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameTestContext nameTest() throws RecognitionException {
		NameTestContext _localctx = new NameTestContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_nameTest);
		try {
			setState(1375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DFPropertyName:
			case KW_ALLOWING:
			case KW_ANCESTOR:
			case KW_ANCESTOR_OR_SELF:
			case KW_AND:
			case KW_ARRAY:
			case KW_AS:
			case KW_ASCENDING:
			case KW_AT:
			case KW_ATTRIBUTE:
			case KW_BASE_URI:
			case KW_BOUNDARY_SPACE:
			case KW_BINARY:
			case KW_BY:
			case KW_CASE:
			case KW_CAST:
			case KW_CASTABLE:
			case KW_CATCH:
			case KW_CHILD:
			case KW_COLLATION:
			case KW_COMMENT:
			case KW_CONSTRUCTION:
			case KW_CONTEXT:
			case KW_COPY_NS:
			case KW_COUNT:
			case KW_DECLARE:
			case KW_DEFAULT:
			case KW_DESCENDANT:
			case KW_DESCENDANT_OR_SELF:
			case KW_DESCENDING:
			case KW_DECIMAL_FORMAT:
			case KW_DIV:
			case KW_DOCUMENT:
			case KW_DOCUMENT_NODE:
			case KW_ELEMENT:
			case KW_ELSE:
			case KW_EMPTY:
			case KW_EMPTY_SEQUENCE:
			case KW_ENCODING:
			case KW_END:
			case KW_EQ:
			case KW_EVERY:
			case KW_EXCEPT:
			case KW_EXTERNAL:
			case KW_FOLLOWING:
			case KW_FOLLOWING_SIBLING:
			case KW_FOR:
			case KW_FUNCTION:
			case KW_GE:
			case KW_GREATEST:
			case KW_GROUP:
			case KW_GT:
			case KW_IDIV:
			case KW_IF:
			case KW_IMPORT:
			case KW_IN:
			case KW_INHERIT:
			case KW_INSTANCE:
			case KW_INTERSECT:
			case KW_IS:
			case KW_ITEM:
			case KW_LAX:
			case KW_LE:
			case KW_LEAST:
			case KW_LET:
			case KW_LT:
			case KW_MAP:
			case KW_MOD:
			case KW_MODULE:
			case KW_NAMESPACE:
			case KW_NE:
			case KW_NEXT:
			case KW_NAMESPACE_NODE:
			case KW_NO_INHERIT:
			case KW_NO_PRESERVE:
			case KW_NODE:
			case KW_OF:
			case KW_ONLY:
			case KW_OPTION:
			case KW_OR:
			case KW_ORDER:
			case KW_ORDERED:
			case KW_ORDERING:
			case KW_PARENT:
			case KW_PRECEDING:
			case KW_PRECEDING_SIBLING:
			case KW_PRESERVE:
			case KW_PI:
			case KW_RETURN:
			case KW_SATISFIES:
			case KW_SCHEMA:
			case KW_SCHEMA_ATTR:
			case KW_SCHEMA_ELEM:
			case KW_SELF:
			case KW_SLIDING:
			case KW_SOME:
			case KW_STABLE:
			case KW_START:
			case KW_STRICT:
			case KW_STRIP:
			case KW_SWITCH:
			case KW_TEXT:
			case KW_THEN:
			case KW_TO:
			case KW_TREAT:
			case KW_TRY:
			case KW_TUMBLING:
			case KW_TYPE:
			case KW_TYPESWITCH:
			case KW_UNION:
			case KW_UNORDERED:
			case KW_UPDATE:
			case KW_VALIDATE:
			case KW_VARIABLE:
			case KW_VERSION:
			case KW_WHEN:
			case KW_WHERE:
			case KW_WINDOW:
			case KW_XQUERY:
			case KW_ARRAY_NODE:
			case KW_BOOLEAN_NODE:
			case KW_NULL_NODE:
			case KW_NUMBER_NODE:
			case KW_OBJECT_NODE:
			case KW_REPLACE:
			case KW_WITH:
			case KW_VALUE:
			case KW_INSERT:
			case KW_INTO:
			case KW_DELETE:
			case KW_RENAME:
			case URIQualifiedName:
			case FullQName:
			case NCName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1373);
				eqName();
				}
				break;
			case STAR:
			case NCNameWithLocalWildcard:
			case NCNameWithPrefixWildcard:
				enterOuterAlt(_localctx, 2);
				{
				setState(1374);
				wildcard();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardContext extends ParserRuleContext {
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
	 
		public WildcardContext() { }
		public void copyFrom(WildcardContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AllNamesContext extends WildcardContext {
		public TerminalNode STAR() { return getToken(XQueryParser.STAR, 0); }
		public AllNamesContext(WildcardContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAllNames(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AllWithLocalContext extends WildcardContext {
		public TerminalNode NCNameWithPrefixWildcard() { return getToken(XQueryParser.NCNameWithPrefixWildcard, 0); }
		public AllWithLocalContext(WildcardContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAllWithLocal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AllWithNSContext extends WildcardContext {
		public TerminalNode NCNameWithLocalWildcard() { return getToken(XQueryParser.NCNameWithLocalWildcard, 0); }
		public AllWithNSContext(WildcardContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAllWithNS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_wildcard);
		try {
			setState(1380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				_localctx = new AllNamesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1377);
				match(STAR);
				}
				break;
			case NCNameWithLocalWildcard:
				_localctx = new AllWithNSContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1378);
				match(NCNameWithLocalWildcard);
				}
				break;
			case NCNameWithPrefixWildcard:
				_localctx = new AllWithLocalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1379);
				match(NCNameWithPrefixWildcard);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExprContext extends ParserRuleContext {
		public PrimaryExprContext main_expr;
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<ArgumentListContext> argumentList() {
			return getRuleContexts(ArgumentListContext.class);
		}
		public ArgumentListContext argumentList(int i) {
			return getRuleContext(ArgumentListContext.class,i);
		}
		public List<LookupContext> lookup() {
			return getRuleContexts(LookupContext.class);
		}
		public LookupContext lookup(int i) {
			return getRuleContext(LookupContext.class,i);
		}
		public PostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitPostfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_postfixExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1382);
			((PostfixExprContext)_localctx).main_expr = primaryExpr();
			setState(1388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1386);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LBRACKET:
						{
						setState(1383);
						predicate();
						}
						break;
					case LPAREN:
						{
						setState(1384);
						argumentList();
						}
						break;
					case QUESTION:
						{
						setState(1385);
						lookup();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentContext argument;
		public List<ArgumentContext> args = new ArrayList<ArgumentContext>();
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			match(LPAREN);
			setState(1398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (IntegerLiteral - 5)) | (1L << (DecimalLiteral - 5)) | (1L << (DoubleLiteral - 5)) | (1L << (DFPropertyName - 5)) | (1L << (Quot - 5)) | (1L << (Apos - 5)) | (1L << (COMMENT - 5)) | (1L << (PI - 5)) | (1L << (PRAGMA - 5)) | (1L << (LPAREN - 5)) | (1L << (LBRACKET - 5)) | (1L << (PLUS - 5)) | (1L << (MINUS - 5)) | (1L << (DOT - 5)) | (1L << (LANGLE - 5)) | (1L << (QUESTION - 5)) | (1L << (DOLLAR - 5)) | (1L << (MOD - 5)) | (1L << (KW_ALLOWING - 5)) | (1L << (KW_ANCESTOR - 5)) | (1L << (KW_ANCESTOR_OR_SELF - 5)) | (1L << (KW_AND - 5)) | (1L << (KW_ARRAY - 5)) | (1L << (KW_AS - 5)) | (1L << (KW_ASCENDING - 5)) | (1L << (KW_AT - 5)) | (1L << (KW_ATTRIBUTE - 5)) | (1L << (KW_BASE_URI - 5)) | (1L << (KW_BOUNDARY_SPACE - 5)) | (1L << (KW_BINARY - 5)) | (1L << (KW_BY - 5)) | (1L << (KW_CASE - 5)) | (1L << (KW_CAST - 5)) | (1L << (KW_CASTABLE - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (KW_CATCH - 69)) | (1L << (KW_CHILD - 69)) | (1L << (KW_COLLATION - 69)) | (1L << (KW_COMMENT - 69)) | (1L << (KW_CONSTRUCTION - 69)) | (1L << (KW_CONTEXT - 69)) | (1L << (KW_COPY_NS - 69)) | (1L << (KW_COUNT - 69)) | (1L << (KW_DECLARE - 69)) | (1L << (KW_DEFAULT - 69)) | (1L << (KW_DESCENDANT - 69)) | (1L << (KW_DESCENDANT_OR_SELF - 69)) | (1L << (KW_DESCENDING - 69)) | (1L << (KW_DECIMAL_FORMAT - 69)) | (1L << (KW_DIV - 69)) | (1L << (KW_DOCUMENT - 69)) | (1L << (KW_DOCUMENT_NODE - 69)) | (1L << (KW_ELEMENT - 69)) | (1L << (KW_ELSE - 69)) | (1L << (KW_EMPTY - 69)) | (1L << (KW_EMPTY_SEQUENCE - 69)) | (1L << (KW_ENCODING - 69)) | (1L << (KW_END - 69)) | (1L << (KW_EQ - 69)) | (1L << (KW_EVERY - 69)) | (1L << (KW_EXCEPT - 69)) | (1L << (KW_EXTERNAL - 69)) | (1L << (KW_FOLLOWING - 69)) | (1L << (KW_FOLLOWING_SIBLING - 69)) | (1L << (KW_FOR - 69)) | (1L << (KW_FUNCTION - 69)) | (1L << (KW_GE - 69)) | (1L << (KW_GREATEST - 69)) | (1L << (KW_GROUP - 69)) | (1L << (KW_GT - 69)) | (1L << (KW_IDIV - 69)) | (1L << (KW_IF - 69)) | (1L << (KW_IMPORT - 69)) | (1L << (KW_IN - 69)) | (1L << (KW_INHERIT - 69)) | (1L << (KW_INSTANCE - 69)) | (1L << (KW_INTERSECT - 69)) | (1L << (KW_IS - 69)) | (1L << (KW_ITEM - 69)) | (1L << (KW_LAX - 69)) | (1L << (KW_LE - 69)) | (1L << (KW_LEAST - 69)) | (1L << (KW_LET - 69)) | (1L << (KW_LT - 69)) | (1L << (KW_MAP - 69)) | (1L << (KW_MOD - 69)) | (1L << (KW_MODULE - 69)) | (1L << (KW_NAMESPACE - 69)) | (1L << (KW_NE - 69)) | (1L << (KW_NEXT - 69)) | (1L << (KW_NAMESPACE_NODE - 69)) | (1L << (KW_NO_INHERIT - 69)) | (1L << (KW_NO_PRESERVE - 69)) | (1L << (KW_NODE - 69)) | (1L << (KW_OF - 69)) | (1L << (KW_ONLY - 69)) | (1L << (KW_OPTION - 69)) | (1L << (KW_OR - 69)) | (1L << (KW_ORDER - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (KW_ORDERED - 133)) | (1L << (KW_ORDERING - 133)) | (1L << (KW_PARENT - 133)) | (1L << (KW_PRECEDING - 133)) | (1L << (KW_PRECEDING_SIBLING - 133)) | (1L << (KW_PRESERVE - 133)) | (1L << (KW_PI - 133)) | (1L << (KW_RETURN - 133)) | (1L << (KW_SATISFIES - 133)) | (1L << (KW_SCHEMA - 133)) | (1L << (KW_SCHEMA_ATTR - 133)) | (1L << (KW_SCHEMA_ELEM - 133)) | (1L << (KW_SELF - 133)) | (1L << (KW_SLIDING - 133)) | (1L << (KW_SOME - 133)) | (1L << (KW_STABLE - 133)) | (1L << (KW_START - 133)) | (1L << (KW_STRICT - 133)) | (1L << (KW_STRIP - 133)) | (1L << (KW_SWITCH - 133)) | (1L << (KW_TEXT - 133)) | (1L << (KW_THEN - 133)) | (1L << (KW_TO - 133)) | (1L << (KW_TREAT - 133)) | (1L << (KW_TRY - 133)) | (1L << (KW_TUMBLING - 133)) | (1L << (KW_TYPE - 133)) | (1L << (KW_TYPESWITCH - 133)) | (1L << (KW_UNION - 133)) | (1L << (KW_UNORDERED - 133)) | (1L << (KW_UPDATE - 133)) | (1L << (KW_VALIDATE - 133)) | (1L << (KW_VARIABLE - 133)) | (1L << (KW_VERSION - 133)) | (1L << (KW_WHEN - 133)) | (1L << (KW_WHERE - 133)) | (1L << (KW_WINDOW - 133)) | (1L << (KW_XQUERY - 133)) | (1L << (KW_ARRAY_NODE - 133)) | (1L << (KW_BOOLEAN_NODE - 133)) | (1L << (KW_NULL_NODE - 133)) | (1L << (KW_NUMBER_NODE - 133)) | (1L << (KW_OBJECT_NODE - 133)) | (1L << (KW_REPLACE - 133)) | (1L << (KW_WITH - 133)) | (1L << (KW_VALUE - 133)) | (1L << (KW_INSERT - 133)) | (1L << (KW_INTO - 133)) | (1L << (KW_DELETE - 133)) | (1L << (KW_RENAME - 133)) | (1L << (URIQualifiedName - 133)) | (1L << (FullQName - 133)) | (1L << (NCName - 133)) | (1L << (ENTER_STRING - 133)))) != 0)) {
				{
				{
				setState(1392);
				((ArgumentListContext)_localctx).argument = argument();
				((ArgumentListContext)_localctx).args.add(((ArgumentListContext)_localctx).argument);
				setState(1394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1393);
					match(COMMA);
					}
				}

				}
				}
				setState(1400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1401);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateListContext extends ParserRuleContext {
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public PredicateListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitPredicateList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateListContext predicateList() throws RecognitionException {
		PredicateListContext _localctx = new PredicateListContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_predicateList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(1403);
				predicate();
				}
				}
				setState(1408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(XQueryParser.LBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(XQueryParser.RBRACKET, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			match(LBRACKET);
			setState(1410);
			expr();
			setState(1411);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LookupContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(XQueryParser.QUESTION, 0); }
		public KeySpecifierContext keySpecifier() {
			return getRuleContext(KeySpecifierContext.class,0);
		}
		public LookupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lookup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitLookup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LookupContext lookup() throws RecognitionException {
		LookupContext _localctx = new LookupContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_lookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			match(QUESTION);
			setState(1414);
			keySpecifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeySpecifierContext extends ParserRuleContext {
		public NcNameContext ncName() {
			return getRuleContext(NcNameContext.class,0);
		}
		public TerminalNode IntegerLiteral() { return getToken(XQueryParser.IntegerLiteral, 0); }
		public ParenthesizedExprContext parenthesizedExpr() {
			return getRuleContext(ParenthesizedExprContext.class,0);
		}
		public TerminalNode STAR() { return getToken(XQueryParser.STAR, 0); }
		public KeySpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keySpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitKeySpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeySpecifierContext keySpecifier() throws RecognitionException {
		KeySpecifierContext _localctx = new KeySpecifierContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_keySpecifier);
		try {
			setState(1420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DFPropertyName:
			case KW_ALLOWING:
			case KW_ANCESTOR:
			case KW_ANCESTOR_OR_SELF:
			case KW_AND:
			case KW_ARRAY:
			case KW_AS:
			case KW_ASCENDING:
			case KW_AT:
			case KW_ATTRIBUTE:
			case KW_BASE_URI:
			case KW_BOUNDARY_SPACE:
			case KW_BINARY:
			case KW_BY:
			case KW_CASE:
			case KW_CAST:
			case KW_CASTABLE:
			case KW_CATCH:
			case KW_CHILD:
			case KW_COLLATION:
			case KW_COMMENT:
			case KW_CONSTRUCTION:
			case KW_CONTEXT:
			case KW_COPY_NS:
			case KW_COUNT:
			case KW_DECLARE:
			case KW_DEFAULT:
			case KW_DESCENDANT:
			case KW_DESCENDANT_OR_SELF:
			case KW_DESCENDING:
			case KW_DECIMAL_FORMAT:
			case KW_DIV:
			case KW_DOCUMENT:
			case KW_DOCUMENT_NODE:
			case KW_ELEMENT:
			case KW_ELSE:
			case KW_EMPTY:
			case KW_EMPTY_SEQUENCE:
			case KW_ENCODING:
			case KW_END:
			case KW_EQ:
			case KW_EVERY:
			case KW_EXCEPT:
			case KW_EXTERNAL:
			case KW_FOLLOWING:
			case KW_FOLLOWING_SIBLING:
			case KW_FOR:
			case KW_FUNCTION:
			case KW_GE:
			case KW_GREATEST:
			case KW_GROUP:
			case KW_GT:
			case KW_IDIV:
			case KW_IF:
			case KW_IMPORT:
			case KW_IN:
			case KW_INHERIT:
			case KW_INSTANCE:
			case KW_INTERSECT:
			case KW_IS:
			case KW_ITEM:
			case KW_LAX:
			case KW_LE:
			case KW_LEAST:
			case KW_LET:
			case KW_LT:
			case KW_MAP:
			case KW_MOD:
			case KW_MODULE:
			case KW_NAMESPACE:
			case KW_NE:
			case KW_NEXT:
			case KW_NAMESPACE_NODE:
			case KW_NO_INHERIT:
			case KW_NO_PRESERVE:
			case KW_NODE:
			case KW_OF:
			case KW_ONLY:
			case KW_OPTION:
			case KW_OR:
			case KW_ORDER:
			case KW_ORDERED:
			case KW_ORDERING:
			case KW_PARENT:
			case KW_PRECEDING:
			case KW_PRECEDING_SIBLING:
			case KW_PRESERVE:
			case KW_PI:
			case KW_RETURN:
			case KW_SATISFIES:
			case KW_SCHEMA:
			case KW_SCHEMA_ATTR:
			case KW_SCHEMA_ELEM:
			case KW_SELF:
			case KW_SLIDING:
			case KW_SOME:
			case KW_STABLE:
			case KW_START:
			case KW_STRICT:
			case KW_STRIP:
			case KW_SWITCH:
			case KW_TEXT:
			case KW_THEN:
			case KW_TO:
			case KW_TREAT:
			case KW_TRY:
			case KW_TUMBLING:
			case KW_TYPE:
			case KW_TYPESWITCH:
			case KW_UNION:
			case KW_UNORDERED:
			case KW_UPDATE:
			case KW_VALIDATE:
			case KW_VARIABLE:
			case KW_VERSION:
			case KW_WHEN:
			case KW_WHERE:
			case KW_WINDOW:
			case KW_XQUERY:
			case KW_ARRAY_NODE:
			case KW_BOOLEAN_NODE:
			case KW_NULL_NODE:
			case KW_NUMBER_NODE:
			case KW_OBJECT_NODE:
			case KW_REPLACE:
			case KW_WITH:
			case KW_VALUE:
			case KW_INSERT:
			case KW_INTO:
			case KW_DELETE:
			case KW_RENAME:
			case NCName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1416);
				ncName();
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1417);
				match(IntegerLiteral);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1418);
				parenthesizedExpr();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1419);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrowFunctionSpecifierContext extends ParserRuleContext {
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public VarRefContext varRef() {
			return getRuleContext(VarRefContext.class,0);
		}
		public ParenthesizedExprContext parenthesizedExpr() {
			return getRuleContext(ParenthesizedExprContext.class,0);
		}
		public ArrowFunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunctionSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitArrowFunctionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionSpecifierContext arrowFunctionSpecifier() throws RecognitionException {
		ArrowFunctionSpecifierContext _localctx = new ArrowFunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_arrowFunctionSpecifier);
		try {
			setState(1425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DFPropertyName:
			case KW_ALLOWING:
			case KW_ANCESTOR:
			case KW_ANCESTOR_OR_SELF:
			case KW_AND:
			case KW_ARRAY:
			case KW_AS:
			case KW_ASCENDING:
			case KW_AT:
			case KW_ATTRIBUTE:
			case KW_BASE_URI:
			case KW_BOUNDARY_SPACE:
			case KW_BINARY:
			case KW_BY:
			case KW_CASE:
			case KW_CAST:
			case KW_CASTABLE:
			case KW_CATCH:
			case KW_CHILD:
			case KW_COLLATION:
			case KW_COMMENT:
			case KW_CONSTRUCTION:
			case KW_CONTEXT:
			case KW_COPY_NS:
			case KW_COUNT:
			case KW_DECLARE:
			case KW_DEFAULT:
			case KW_DESCENDANT:
			case KW_DESCENDANT_OR_SELF:
			case KW_DESCENDING:
			case KW_DECIMAL_FORMAT:
			case KW_DIV:
			case KW_DOCUMENT:
			case KW_DOCUMENT_NODE:
			case KW_ELEMENT:
			case KW_ELSE:
			case KW_EMPTY:
			case KW_EMPTY_SEQUENCE:
			case KW_ENCODING:
			case KW_END:
			case KW_EQ:
			case KW_EVERY:
			case KW_EXCEPT:
			case KW_EXTERNAL:
			case KW_FOLLOWING:
			case KW_FOLLOWING_SIBLING:
			case KW_FOR:
			case KW_FUNCTION:
			case KW_GE:
			case KW_GREATEST:
			case KW_GROUP:
			case KW_GT:
			case KW_IDIV:
			case KW_IF:
			case KW_IMPORT:
			case KW_IN:
			case KW_INHERIT:
			case KW_INSTANCE:
			case KW_INTERSECT:
			case KW_IS:
			case KW_ITEM:
			case KW_LAX:
			case KW_LE:
			case KW_LEAST:
			case KW_LET:
			case KW_LT:
			case KW_MAP:
			case KW_MOD:
			case KW_MODULE:
			case KW_NAMESPACE:
			case KW_NE:
			case KW_NEXT:
			case KW_NAMESPACE_NODE:
			case KW_NO_INHERIT:
			case KW_NO_PRESERVE:
			case KW_NODE:
			case KW_OF:
			case KW_ONLY:
			case KW_OPTION:
			case KW_OR:
			case KW_ORDER:
			case KW_ORDERED:
			case KW_ORDERING:
			case KW_PARENT:
			case KW_PRECEDING:
			case KW_PRECEDING_SIBLING:
			case KW_PRESERVE:
			case KW_PI:
			case KW_RETURN:
			case KW_SATISFIES:
			case KW_SCHEMA:
			case KW_SCHEMA_ATTR:
			case KW_SCHEMA_ELEM:
			case KW_SELF:
			case KW_SLIDING:
			case KW_SOME:
			case KW_STABLE:
			case KW_START:
			case KW_STRICT:
			case KW_STRIP:
			case KW_SWITCH:
			case KW_TEXT:
			case KW_THEN:
			case KW_TO:
			case KW_TREAT:
			case KW_TRY:
			case KW_TUMBLING:
			case KW_TYPE:
			case KW_TYPESWITCH:
			case KW_UNION:
			case KW_UNORDERED:
			case KW_UPDATE:
			case KW_VALIDATE:
			case KW_VARIABLE:
			case KW_VERSION:
			case KW_WHEN:
			case KW_WHERE:
			case KW_WINDOW:
			case KW_XQUERY:
			case KW_ARRAY_NODE:
			case KW_BOOLEAN_NODE:
			case KW_NULL_NODE:
			case KW_NUMBER_NODE:
			case KW_OBJECT_NODE:
			case KW_REPLACE:
			case KW_WITH:
			case KW_VALUE:
			case KW_INSERT:
			case KW_INTO:
			case KW_DELETE:
			case KW_RENAME:
			case URIQualifiedName:
			case FullQName:
			case NCName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1422);
				eqName();
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1423);
				varRef();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1424);
				parenthesizedExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExprContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VarRefContext varRef() {
			return getRuleContext(VarRefContext.class,0);
		}
		public ParenthesizedExprContext parenthesizedExpr() {
			return getRuleContext(ParenthesizedExprContext.class,0);
		}
		public ContextItemExprContext contextItemExpr() {
			return getRuleContext(ContextItemExprContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public OrderedExprContext orderedExpr() {
			return getRuleContext(OrderedExprContext.class,0);
		}
		public UnorderedExprContext unorderedExpr() {
			return getRuleContext(UnorderedExprContext.class,0);
		}
		public NodeConstructorContext nodeConstructor() {
			return getRuleContext(NodeConstructorContext.class,0);
		}
		public FunctionItemExprContext functionItemExpr() {
			return getRuleContext(FunctionItemExprContext.class,0);
		}
		public MapConstructorContext mapConstructor() {
			return getRuleContext(MapConstructorContext.class,0);
		}
		public ArrayConstructorContext arrayConstructor() {
			return getRuleContext(ArrayConstructorContext.class,0);
		}
		public StringConstructorContext stringConstructor() {
			return getRuleContext(StringConstructorContext.class,0);
		}
		public UnaryLookupContext unaryLookup() {
			return getRuleContext(UnaryLookupContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_primaryExpr);
		try {
			setState(1440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1427);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1428);
				varRef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1429);
				parenthesizedExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1430);
				contextItemExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1431);
				functionCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1432);
				orderedExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1433);
				unorderedExpr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1434);
				nodeConstructor();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1435);
				functionItemExpr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1436);
				mapConstructor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1437);
				arrayConstructor();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1438);
				stringConstructor();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1439);
				unaryLookup();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_literal);
		try {
			setState(1444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case DecimalLiteral:
			case DoubleLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1442);
				numericLiteral();
				}
				break;
			case Quot:
			case Apos:
				enterOuterAlt(_localctx, 2);
				{
				setState(1443);
				stringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(XQueryParser.IntegerLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(XQueryParser.DecimalLiteral, 0); }
		public TerminalNode DoubleLiteral() { return getToken(XQueryParser.DoubleLiteral, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << DecimalLiteral) | (1L << DoubleLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarRefContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(XQueryParser.DOLLAR, 0); }
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public VarRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varRef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitVarRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarRefContext varRef() throws RecognitionException {
		VarRefContext _localctx = new VarRefContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_varRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1448);
			match(DOLLAR);
			setState(1449);
			eqName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarNameContext extends ParserRuleContext {
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitVarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			eqName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesizedExprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesizedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitParenthesizedExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesizedExprContext parenthesizedExpr() throws RecognitionException {
		ParenthesizedExprContext _localctx = new ParenthesizedExprContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_parenthesizedExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
			match(LPAREN);
			setState(1455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (IntegerLiteral - 5)) | (1L << (DecimalLiteral - 5)) | (1L << (DoubleLiteral - 5)) | (1L << (DFPropertyName - 5)) | (1L << (Quot - 5)) | (1L << (Apos - 5)) | (1L << (COMMENT - 5)) | (1L << (PI - 5)) | (1L << (PRAGMA - 5)) | (1L << (LPAREN - 5)) | (1L << (LBRACKET - 5)) | (1L << (PLUS - 5)) | (1L << (MINUS - 5)) | (1L << (DOT - 5)) | (1L << (LANGLE - 5)) | (1L << (QUESTION - 5)) | (1L << (DOLLAR - 5)) | (1L << (MOD - 5)) | (1L << (KW_ALLOWING - 5)) | (1L << (KW_ANCESTOR - 5)) | (1L << (KW_ANCESTOR_OR_SELF - 5)) | (1L << (KW_AND - 5)) | (1L << (KW_ARRAY - 5)) | (1L << (KW_AS - 5)) | (1L << (KW_ASCENDING - 5)) | (1L << (KW_AT - 5)) | (1L << (KW_ATTRIBUTE - 5)) | (1L << (KW_BASE_URI - 5)) | (1L << (KW_BOUNDARY_SPACE - 5)) | (1L << (KW_BINARY - 5)) | (1L << (KW_BY - 5)) | (1L << (KW_CASE - 5)) | (1L << (KW_CAST - 5)) | (1L << (KW_CASTABLE - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (KW_CATCH - 69)) | (1L << (KW_CHILD - 69)) | (1L << (KW_COLLATION - 69)) | (1L << (KW_COMMENT - 69)) | (1L << (KW_CONSTRUCTION - 69)) | (1L << (KW_CONTEXT - 69)) | (1L << (KW_COPY_NS - 69)) | (1L << (KW_COUNT - 69)) | (1L << (KW_DECLARE - 69)) | (1L << (KW_DEFAULT - 69)) | (1L << (KW_DESCENDANT - 69)) | (1L << (KW_DESCENDANT_OR_SELF - 69)) | (1L << (KW_DESCENDING - 69)) | (1L << (KW_DECIMAL_FORMAT - 69)) | (1L << (KW_DIV - 69)) | (1L << (KW_DOCUMENT - 69)) | (1L << (KW_DOCUMENT_NODE - 69)) | (1L << (KW_ELEMENT - 69)) | (1L << (KW_ELSE - 69)) | (1L << (KW_EMPTY - 69)) | (1L << (KW_EMPTY_SEQUENCE - 69)) | (1L << (KW_ENCODING - 69)) | (1L << (KW_END - 69)) | (1L << (KW_EQ - 69)) | (1L << (KW_EVERY - 69)) | (1L << (KW_EXCEPT - 69)) | (1L << (KW_EXTERNAL - 69)) | (1L << (KW_FOLLOWING - 69)) | (1L << (KW_FOLLOWING_SIBLING - 69)) | (1L << (KW_FOR - 69)) | (1L << (KW_FUNCTION - 69)) | (1L << (KW_GE - 69)) | (1L << (KW_GREATEST - 69)) | (1L << (KW_GROUP - 69)) | (1L << (KW_GT - 69)) | (1L << (KW_IDIV - 69)) | (1L << (KW_IF - 69)) | (1L << (KW_IMPORT - 69)) | (1L << (KW_IN - 69)) | (1L << (KW_INHERIT - 69)) | (1L << (KW_INSTANCE - 69)) | (1L << (KW_INTERSECT - 69)) | (1L << (KW_IS - 69)) | (1L << (KW_ITEM - 69)) | (1L << (KW_LAX - 69)) | (1L << (KW_LE - 69)) | (1L << (KW_LEAST - 69)) | (1L << (KW_LET - 69)) | (1L << (KW_LT - 69)) | (1L << (KW_MAP - 69)) | (1L << (KW_MOD - 69)) | (1L << (KW_MODULE - 69)) | (1L << (KW_NAMESPACE - 69)) | (1L << (KW_NE - 69)) | (1L << (KW_NEXT - 69)) | (1L << (KW_NAMESPACE_NODE - 69)) | (1L << (KW_NO_INHERIT - 69)) | (1L << (KW_NO_PRESERVE - 69)) | (1L << (KW_NODE - 69)) | (1L << (KW_OF - 69)) | (1L << (KW_ONLY - 69)) | (1L << (KW_OPTION - 69)) | (1L << (KW_OR - 69)) | (1L << (KW_ORDER - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (KW_ORDERED - 133)) | (1L << (KW_ORDERING - 133)) | (1L << (KW_PARENT - 133)) | (1L << (KW_PRECEDING - 133)) | (1L << (KW_PRECEDING_SIBLING - 133)) | (1L << (KW_PRESERVE - 133)) | (1L << (KW_PI - 133)) | (1L << (KW_RETURN - 133)) | (1L << (KW_SATISFIES - 133)) | (1L << (KW_SCHEMA - 133)) | (1L << (KW_SCHEMA_ATTR - 133)) | (1L << (KW_SCHEMA_ELEM - 133)) | (1L << (KW_SELF - 133)) | (1L << (KW_SLIDING - 133)) | (1L << (KW_SOME - 133)) | (1L << (KW_STABLE - 133)) | (1L << (KW_START - 133)) | (1L << (KW_STRICT - 133)) | (1L << (KW_STRIP - 133)) | (1L << (KW_SWITCH - 133)) | (1L << (KW_TEXT - 133)) | (1L << (KW_THEN - 133)) | (1L << (KW_TO - 133)) | (1L << (KW_TREAT - 133)) | (1L << (KW_TRY - 133)) | (1L << (KW_TUMBLING - 133)) | (1L << (KW_TYPE - 133)) | (1L << (KW_TYPESWITCH - 133)) | (1L << (KW_UNION - 133)) | (1L << (KW_UNORDERED - 133)) | (1L << (KW_UPDATE - 133)) | (1L << (KW_VALIDATE - 133)) | (1L << (KW_VARIABLE - 133)) | (1L << (KW_VERSION - 133)) | (1L << (KW_WHEN - 133)) | (1L << (KW_WHERE - 133)) | (1L << (KW_WINDOW - 133)) | (1L << (KW_XQUERY - 133)) | (1L << (KW_ARRAY_NODE - 133)) | (1L << (KW_BOOLEAN_NODE - 133)) | (1L << (KW_NULL_NODE - 133)) | (1L << (KW_NUMBER_NODE - 133)) | (1L << (KW_OBJECT_NODE - 133)) | (1L << (KW_REPLACE - 133)) | (1L << (KW_WITH - 133)) | (1L << (KW_VALUE - 133)) | (1L << (KW_INSERT - 133)) | (1L << (KW_INTO - 133)) | (1L << (KW_DELETE - 133)) | (1L << (KW_RENAME - 133)) | (1L << (URIQualifiedName - 133)) | (1L << (FullQName - 133)) | (1L << (NCName - 133)) | (1L << (ENTER_STRING - 133)))) != 0)) {
				{
				setState(1454);
				expr();
				}
			}

			setState(1457);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContextItemExprContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(XQueryParser.DOT, 0); }
		public ContextItemExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextItemExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitContextItemExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContextItemExprContext contextItemExpr() throws RecognitionException {
		ContextItemExprContext _localctx = new ContextItemExprContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_contextItemExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedExprContext extends ParserRuleContext {
		public TerminalNode KW_ORDERED() { return getToken(XQueryParser.KW_ORDERED, 0); }
		public EnclosedExpressionContext enclosedExpression() {
			return getRuleContext(EnclosedExpressionContext.class,0);
		}
		public OrderedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitOrderedExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedExprContext orderedExpr() throws RecognitionException {
		OrderedExprContext _localctx = new OrderedExprContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_orderedExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
			match(KW_ORDERED);
			setState(1462);
			enclosedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnorderedExprContext extends ParserRuleContext {
		public TerminalNode KW_UNORDERED() { return getToken(XQueryParser.KW_UNORDERED, 0); }
		public EnclosedExpressionContext enclosedExpression() {
			return getRuleContext(EnclosedExpressionContext.class,0);
		}
		public UnorderedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unorderedExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitUnorderedExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnorderedExprContext unorderedExpr() throws RecognitionException {
		UnorderedExprContext _localctx = new UnorderedExprContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_unorderedExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			match(KW_UNORDERED);
			setState(1465);
			enclosedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public EqNameContext fn_name;
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1467);
			((FunctionCallContext)_localctx).fn_name = eqName();
			setState(1468);
			argumentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(XQueryParser.QUESTION, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_argument);
		try {
			setState(1472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1470);
				exprSingle();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1471);
				match(QUESTION);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodeConstructorContext extends ParserRuleContext {
		public DirectConstructorContext directConstructor() {
			return getRuleContext(DirectConstructorContext.class,0);
		}
		public ComputedConstructorContext computedConstructor() {
			return getRuleContext(ComputedConstructorContext.class,0);
		}
		public NodeConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitNodeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeConstructorContext nodeConstructor() throws RecognitionException {
		NodeConstructorContext _localctx = new NodeConstructorContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_nodeConstructor);
		try {
			setState(1476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
			case PI:
			case LANGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1474);
				directConstructor();
				}
				break;
			case KW_ATTRIBUTE:
			case KW_BINARY:
			case KW_COMMENT:
			case KW_DOCUMENT:
			case KW_ELEMENT:
			case KW_NAMESPACE:
			case KW_PI:
			case KW_TEXT:
			case KW_ARRAY_NODE:
			case KW_BOOLEAN_NODE:
			case KW_NULL_NODE:
			case KW_NUMBER_NODE:
			case KW_OBJECT_NODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1475);
				computedConstructor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectConstructorContext extends ParserRuleContext {
		public DirElemConstructorOpenCloseContext dirElemConstructorOpenClose() {
			return getRuleContext(DirElemConstructorOpenCloseContext.class,0);
		}
		public DirElemConstructorSingleTagContext dirElemConstructorSingleTag() {
			return getRuleContext(DirElemConstructorSingleTagContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(XQueryParser.COMMENT, 0); }
		public TerminalNode PI() { return getToken(XQueryParser.PI, 0); }
		public DirectConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitDirectConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectConstructorContext directConstructor() throws RecognitionException {
		DirectConstructorContext _localctx = new DirectConstructorContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_directConstructor);
		int _la;
		try {
			setState(1481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1478);
				dirElemConstructorOpenClose();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1479);
				dirElemConstructorSingleTag();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1480);
				_la = _input.LA(1);
				if ( !(_la==COMMENT || _la==PI) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirElemConstructorOpenCloseContext extends ParserRuleContext {
		public QNameContext openName;
		public Token endOpen;
		public Token startClose;
		public Token slashClose;
		public QNameContext closeName;
		public List<TerminalNode> LANGLE() { return getTokens(XQueryParser.LANGLE); }
		public TerminalNode LANGLE(int i) {
			return getToken(XQueryParser.LANGLE, i);
		}
		public DirAttributeListContext dirAttributeList() {
			return getRuleContext(DirAttributeListContext.class,0);
		}
		public List<TerminalNode> RANGLE() { return getTokens(XQueryParser.RANGLE); }
		public TerminalNode RANGLE(int i) {
			return getToken(XQueryParser.RANGLE, i);
		}
		public List<QNameContext> qName() {
			return getRuleContexts(QNameContext.class);
		}
		public QNameContext qName(int i) {
			return getRuleContext(QNameContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(XQueryParser.SLASH, 0); }
		public List<DirElemContentContext> dirElemContent() {
			return getRuleContexts(DirElemContentContext.class);
		}
		public DirElemContentContext dirElemContent(int i) {
			return getRuleContext(DirElemContentContext.class,i);
		}
		public DirElemConstructorOpenCloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dirElemConstructorOpenClose; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitDirElemConstructorOpenClose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirElemConstructorOpenCloseContext dirElemConstructorOpenClose() throws RecognitionException {
		DirElemConstructorOpenCloseContext _localctx = new DirElemConstructorOpenCloseContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_dirElemConstructorOpenClose);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1483);
			match(LANGLE);
			setState(1484);
			((DirElemConstructorOpenCloseContext)_localctx).openName = qName();
			setState(1485);
			dirAttributeList();
			setState(1486);
			((DirElemConstructorOpenCloseContext)_localctx).endOpen = match(RANGLE);
			setState(1490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1487);
					dirElemContent();
					}
					} 
				}
				setState(1492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			setState(1493);
			((DirElemConstructorOpenCloseContext)_localctx).startClose = match(LANGLE);
			setState(1494);
			((DirElemConstructorOpenCloseContext)_localctx).slashClose = match(SLASH);
			setState(1495);
			((DirElemConstructorOpenCloseContext)_localctx).closeName = qName();
			setState(1496);
			match(RANGLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirElemConstructorSingleTagContext extends ParserRuleContext {
		public QNameContext openName;
		public Token slashClose;
		public TerminalNode LANGLE() { return getToken(XQueryParser.LANGLE, 0); }
		public DirAttributeListContext dirAttributeList() {
			return getRuleContext(DirAttributeListContext.class,0);
		}
		public TerminalNode RANGLE() { return getToken(XQueryParser.RANGLE, 0); }
		public QNameContext qName() {
			return getRuleContext(QNameContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(XQueryParser.SLASH, 0); }
		public DirElemConstructorSingleTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dirElemConstructorSingleTag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitDirElemConstructorSingleTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirElemConstructorSingleTagContext dirElemConstructorSingleTag() throws RecognitionException {
		DirElemConstructorSingleTagContext _localctx = new DirElemConstructorSingleTagContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_dirElemConstructorSingleTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			match(LANGLE);
			setState(1499);
			((DirElemConstructorSingleTagContext)_localctx).openName = qName();
			setState(1500);
			dirAttributeList();
			setState(1501);
			((DirElemConstructorSingleTagContext)_localctx).slashClose = match(SLASH);
			setState(1502);
			match(RANGLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirAttributeListContext extends ParserRuleContext {
		public List<QNameContext> qName() {
			return getRuleContexts(QNameContext.class);
		}
		public QNameContext qName(int i) {
			return getRuleContext(QNameContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(XQueryParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(XQueryParser.EQUAL, i);
		}
		public List<DirAttributeValueContext> dirAttributeValue() {
			return getRuleContexts(DirAttributeValueContext.class);
		}
		public DirAttributeValueContext dirAttributeValue(int i) {
			return getRuleContext(DirAttributeValueContext.class,i);
		}
		public DirAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dirAttributeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitDirAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirAttributeListContext dirAttributeList() throws RecognitionException {
		DirAttributeListContext _localctx = new DirAttributeListContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_dirAttributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DFPropertyName) | (1L << KW_ALLOWING) | (1L << KW_ANCESTOR) | (1L << KW_ANCESTOR_OR_SELF) | (1L << KW_AND) | (1L << KW_ARRAY) | (1L << KW_AS) | (1L << KW_ASCENDING) | (1L << KW_AT) | (1L << KW_ATTRIBUTE) | (1L << KW_BASE_URI) | (1L << KW_BOUNDARY_SPACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_BINARY - 64)) | (1L << (KW_BY - 64)) | (1L << (KW_CASE - 64)) | (1L << (KW_CAST - 64)) | (1L << (KW_CASTABLE - 64)) | (1L << (KW_CATCH - 64)) | (1L << (KW_CHILD - 64)) | (1L << (KW_COLLATION - 64)) | (1L << (KW_COMMENT - 64)) | (1L << (KW_CONSTRUCTION - 64)) | (1L << (KW_CONTEXT - 64)) | (1L << (KW_COPY_NS - 64)) | (1L << (KW_COUNT - 64)) | (1L << (KW_DECLARE - 64)) | (1L << (KW_DEFAULT - 64)) | (1L << (KW_DESCENDANT - 64)) | (1L << (KW_DESCENDANT_OR_SELF - 64)) | (1L << (KW_DESCENDING - 64)) | (1L << (KW_DECIMAL_FORMAT - 64)) | (1L << (KW_DIV - 64)) | (1L << (KW_DOCUMENT - 64)) | (1L << (KW_DOCUMENT_NODE - 64)) | (1L << (KW_ELEMENT - 64)) | (1L << (KW_ELSE - 64)) | (1L << (KW_EMPTY - 64)) | (1L << (KW_EMPTY_SEQUENCE - 64)) | (1L << (KW_ENCODING - 64)) | (1L << (KW_END - 64)) | (1L << (KW_EQ - 64)) | (1L << (KW_EVERY - 64)) | (1L << (KW_EXCEPT - 64)) | (1L << (KW_EXTERNAL - 64)) | (1L << (KW_FOLLOWING - 64)) | (1L << (KW_FOLLOWING_SIBLING - 64)) | (1L << (KW_FOR - 64)) | (1L << (KW_FUNCTION - 64)) | (1L << (KW_GE - 64)) | (1L << (KW_GREATEST - 64)) | (1L << (KW_GROUP - 64)) | (1L << (KW_GT - 64)) | (1L << (KW_IDIV - 64)) | (1L << (KW_IF - 64)) | (1L << (KW_IMPORT - 64)) | (1L << (KW_IN - 64)) | (1L << (KW_INHERIT - 64)) | (1L << (KW_INSTANCE - 64)) | (1L << (KW_INTERSECT - 64)) | (1L << (KW_IS - 64)) | (1L << (KW_ITEM - 64)) | (1L << (KW_LAX - 64)) | (1L << (KW_LE - 64)) | (1L << (KW_LEAST - 64)) | (1L << (KW_LET - 64)) | (1L << (KW_LT - 64)) | (1L << (KW_MAP - 64)) | (1L << (KW_MOD - 64)) | (1L << (KW_MODULE - 64)) | (1L << (KW_NAMESPACE - 64)) | (1L << (KW_NE - 64)) | (1L << (KW_NEXT - 64)) | (1L << (KW_NAMESPACE_NODE - 64)) | (1L << (KW_NO_INHERIT - 64)) | (1L << (KW_NO_PRESERVE - 64)) | (1L << (KW_NODE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (KW_OF - 128)) | (1L << (KW_ONLY - 128)) | (1L << (KW_OPTION - 128)) | (1L << (KW_OR - 128)) | (1L << (KW_ORDER - 128)) | (1L << (KW_ORDERED - 128)) | (1L << (KW_ORDERING - 128)) | (1L << (KW_PARENT - 128)) | (1L << (KW_PRECEDING - 128)) | (1L << (KW_PRECEDING_SIBLING - 128)) | (1L << (KW_PRESERVE - 128)) | (1L << (KW_PI - 128)) | (1L << (KW_RETURN - 128)) | (1L << (KW_SATISFIES - 128)) | (1L << (KW_SCHEMA - 128)) | (1L << (KW_SCHEMA_ATTR - 128)) | (1L << (KW_SCHEMA_ELEM - 128)) | (1L << (KW_SELF - 128)) | (1L << (KW_SLIDING - 128)) | (1L << (KW_SOME - 128)) | (1L << (KW_STABLE - 128)) | (1L << (KW_START - 128)) | (1L << (KW_STRICT - 128)) | (1L << (KW_STRIP - 128)) | (1L << (KW_SWITCH - 128)) | (1L << (KW_TEXT - 128)) | (1L << (KW_THEN - 128)) | (1L << (KW_TO - 128)) | (1L << (KW_TREAT - 128)) | (1L << (KW_TRY - 128)) | (1L << (KW_TUMBLING - 128)) | (1L << (KW_TYPE - 128)) | (1L << (KW_TYPESWITCH - 128)) | (1L << (KW_UNION - 128)) | (1L << (KW_UNORDERED - 128)) | (1L << (KW_UPDATE - 128)) | (1L << (KW_VALIDATE - 128)) | (1L << (KW_VARIABLE - 128)) | (1L << (KW_VERSION - 128)) | (1L << (KW_WHEN - 128)) | (1L << (KW_WHERE - 128)) | (1L << (KW_WINDOW - 128)) | (1L << (KW_XQUERY - 128)) | (1L << (KW_ARRAY_NODE - 128)) | (1L << (KW_BOOLEAN_NODE - 128)) | (1L << (KW_NULL_NODE - 128)) | (1L << (KW_NUMBER_NODE - 128)) | (1L << (KW_OBJECT_NODE - 128)) | (1L << (KW_REPLACE - 128)) | (1L << (KW_WITH - 128)) | (1L << (KW_VALUE - 128)) | (1L << (KW_INSERT - 128)) | (1L << (KW_INTO - 128)) | (1L << (KW_DELETE - 128)) | (1L << (KW_RENAME - 128)) | (1L << (FullQName - 128)) | (1L << (NCName - 128)))) != 0)) {
				{
				{
				setState(1504);
				qName();
				setState(1505);
				match(EQUAL);
				setState(1506);
				dirAttributeValue();
				}
				}
				setState(1512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirAttributeValueAposContext extends ParserRuleContext {
		public List<TerminalNode> Quot() { return getTokens(XQueryParser.Quot); }
		public TerminalNode Quot(int i) {
			return getToken(XQueryParser.Quot, i);
		}
		public List<TerminalNode> PredefinedEntityRef() { return getTokens(XQueryParser.PredefinedEntityRef); }
		public TerminalNode PredefinedEntityRef(int i) {
			return getToken(XQueryParser.PredefinedEntityRef, i);
		}
		public List<TerminalNode> CharRef() { return getTokens(XQueryParser.CharRef); }
		public TerminalNode CharRef(int i) {
			return getToken(XQueryParser.CharRef, i);
		}
		public List<TerminalNode> EscapeQuot() { return getTokens(XQueryParser.EscapeQuot); }
		public TerminalNode EscapeQuot(int i) {
			return getToken(XQueryParser.EscapeQuot, i);
		}
		public List<DirAttributeContentQuotContext> dirAttributeContentQuot() {
			return getRuleContexts(DirAttributeContentQuotContext.class);
		}
		public DirAttributeContentQuotContext dirAttributeContentQuot(int i) {
			return getRuleContext(DirAttributeContentQuotContext.class,i);
		}
		public DirAttributeValueAposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dirAttributeValueApos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitDirAttributeValueApos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirAttributeValueAposContext dirAttributeValueApos() throws RecognitionException {
		DirAttributeValueAposContext _localctx = new DirAttributeValueAposContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_dirAttributeValueApos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1513);
			match(Quot);
			setState(1520);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1518);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PredefinedEntityRef:
						{
						setState(1514);
						match(PredefinedEntityRef);
						}
						break;
					case CharRef:
						{
						setState(1515);
						match(CharRef);
						}
						break;
					case EscapeQuot:
						{
						setState(1516);
						match(EscapeQuot);
						}
						break;
					case DOUBLE_LBRACE:
					case DOUBLE_RBRACE:
					case Quot:
					case LBRACE:
					case ContentChar:
						{
						setState(1517);
						dirAttributeContentQuot();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			setState(1523);
			match(Quot);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirAttributeValueQuotContext extends ParserRuleContext {
		public List<TerminalNode> Apos() { return getTokens(XQueryParser.Apos); }
		public TerminalNode Apos(int i) {
			return getToken(XQueryParser.Apos, i);
		}
		public List<TerminalNode> PredefinedEntityRef() { return getTokens(XQueryParser.PredefinedEntityRef); }
		public TerminalNode PredefinedEntityRef(int i) {
			return getToken(XQueryParser.PredefinedEntityRef, i);
		}
		public List<TerminalNode> CharRef() { return getTokens(XQueryParser.CharRef); }
		public TerminalNode CharRef(int i) {
			return getToken(XQueryParser.CharRef, i);
		}
		public List<TerminalNode> EscapeApos() { return getTokens(XQueryParser.EscapeApos); }
		public TerminalNode EscapeApos(int i) {
			return getToken(XQueryParser.EscapeApos, i);
		}
		public List<DirAttributeContentAposContext> dirAttributeContentApos() {
			return getRuleContexts(DirAttributeContentAposContext.class);
		}
		public DirAttributeContentAposContext dirAttributeContentApos(int i) {
			return getRuleContext(DirAttributeContentAposContext.class,i);
		}
		public DirAttributeValueQuotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dirAttributeValueQuot; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitDirAttributeValueQuot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirAttributeValueQuotContext dirAttributeValueQuot() throws RecognitionException {
		DirAttributeValueQuotContext _localctx = new DirAttributeValueQuotContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_dirAttributeValueQuot);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			match(Apos);
			setState(1532);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1530);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PredefinedEntityRef:
						{
						setState(1526);
						match(PredefinedEntityRef);
						}
						break;
					case CharRef:
						{
						setState(1527);
						match(CharRef);
						}
						break;
					case EscapeApos:
						{
						setState(1528);
						match(EscapeApos);
						}
						break;
					case DOUBLE_LBRACE:
					case DOUBLE_RBRACE:
					case Apos:
					case LBRACE:
					case ContentChar:
						{
						setState(1529);
						dirAttributeContentApos();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			}
			setState(1535);
			match(Apos);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirAttributeValueContext extends ParserRuleContext {
		public DirAttributeValueAposContext dirAttributeValueApos() {
			return getRuleContext(DirAttributeValueAposContext.class,0);
		}
		public DirAttributeValueQuotContext dirAttributeValueQuot() {
			return getRuleContext(DirAttributeValueQuotContext.class,0);
		}
		public DirAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dirAttributeValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitDirAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirAttributeValueContext dirAttributeValue() throws RecognitionException {
		DirAttributeValueContext _localctx = new DirAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_dirAttributeValue);
		try {
			setState(1539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Quot:
				enterOuterAlt(_localctx, 1);
				{
				setState(1537);
				dirAttributeValueApos();
				}
				break;
			case Apos:
				enterOuterAlt(_localctx, 2);
				{
				setState(1538);
				dirAttributeValueQuot();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirAttributeContentQuotContext extends ParserRuleContext {
		public List<TerminalNode> ContentChar() { return getTokens(XQueryParser.ContentChar); }
		public TerminalNode ContentChar(int i) {
			return getToken(XQueryParser.ContentChar, i);
		}
		public TerminalNode DOUBLE_LBRACE() { return getToken(XQueryParser.DOUBLE_LBRACE, 0); }
		public TerminalNode DOUBLE_RBRACE() { return getToken(XQueryParser.DOUBLE_RBRACE, 0); }
		public DirAttributeValueAposContext dirAttributeValueApos() {
			return getRuleContext(DirAttributeValueAposContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(XQueryParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(XQueryParser.RBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DirAttributeContentQuotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dirAttributeContentQuot; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitDirAttributeContentQuot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirAttributeContentQuotContext dirAttributeContentQuot() throws RecognitionException {
		DirAttributeContentQuotContext _localctx = new DirAttributeContentQuotContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_dirAttributeContentQuot);
		int _la;
		try {
			int _alt;
			setState(1554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ContentChar:
				enterOuterAlt(_localctx, 1);
				{
				setState(1542); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1541);
						match(ContentChar);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1544); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case DOUBLE_LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1546);
				match(DOUBLE_LBRACE);
				}
				break;
			case DOUBLE_RBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1547);
				match(DOUBLE_RBRACE);
				}
				break;
			case Quot:
				enterOuterAlt(_localctx, 4);
				{
				setState(1548);
				dirAttributeValueApos();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1549);
				match(LBRACE);
				setState(1551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (IntegerLiteral - 5)) | (1L << (DecimalLiteral - 5)) | (1L << (DoubleLiteral - 5)) | (1L << (DFPropertyName - 5)) | (1L << (Quot - 5)) | (1L << (Apos - 5)) | (1L << (COMMENT - 5)) | (1L << (PI - 5)) | (1L << (PRAGMA - 5)) | (1L << (LPAREN - 5)) | (1L << (LBRACKET - 5)) | (1L << (PLUS - 5)) | (1L << (MINUS - 5)) | (1L << (DOT - 5)) | (1L << (LANGLE - 5)) | (1L << (QUESTION - 5)) | (1L << (DOLLAR - 5)) | (1L << (MOD - 5)) | (1L << (KW_ALLOWING - 5)) | (1L << (KW_ANCESTOR - 5)) | (1L << (KW_ANCESTOR_OR_SELF - 5)) | (1L << (KW_AND - 5)) | (1L << (KW_ARRAY - 5)) | (1L << (KW_AS - 5)) | (1L << (KW_ASCENDING - 5)) | (1L << (KW_AT - 5)) | (1L << (KW_ATTRIBUTE - 5)) | (1L << (KW_BASE_URI - 5)) | (1L << (KW_BOUNDARY_SPACE - 5)) | (1L << (KW_BINARY - 5)) | (1L << (KW_BY - 5)) | (1L << (KW_CASE - 5)) | (1L << (KW_CAST - 5)) | (1L << (KW_CASTABLE - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (KW_CATCH - 69)) | (1L << (KW_CHILD - 69)) | (1L << (KW_COLLATION - 69)) | (1L << (KW_COMMENT - 69)) | (1L << (KW_CONSTRUCTION - 69)) | (1L << (KW_CONTEXT - 69)) | (1L << (KW_COPY_NS - 69)) | (1L << (KW_COUNT - 69)) | (1L << (KW_DECLARE - 69)) | (1L << (KW_DEFAULT - 69)) | (1L << (KW_DESCENDANT - 69)) | (1L << (KW_DESCENDANT_OR_SELF - 69)) | (1L << (KW_DESCENDING - 69)) | (1L << (KW_DECIMAL_FORMAT - 69)) | (1L << (KW_DIV - 69)) | (1L << (KW_DOCUMENT - 69)) | (1L << (KW_DOCUMENT_NODE - 69)) | (1L << (KW_ELEMENT - 69)) | (1L << (KW_ELSE - 69)) | (1L << (KW_EMPTY - 69)) | (1L << (KW_EMPTY_SEQUENCE - 69)) | (1L << (KW_ENCODING - 69)) | (1L << (KW_END - 69)) | (1L << (KW_EQ - 69)) | (1L << (KW_EVERY - 69)) | (1L << (KW_EXCEPT - 69)) | (1L << (KW_EXTERNAL - 69)) | (1L << (KW_FOLLOWING - 69)) | (1L << (KW_FOLLOWING_SIBLING - 69)) | (1L << (KW_FOR - 69)) | (1L << (KW_FUNCTION - 69)) | (1L << (KW_GE - 69)) | (1L << (KW_GREATEST - 69)) | (1L << (KW_GROUP - 69)) | (1L << (KW_GT - 69)) | (1L << (KW_IDIV - 69)) | (1L << (KW_IF - 69)) | (1L << (KW_IMPORT - 69)) | (1L << (KW_IN - 69)) | (1L << (KW_INHERIT - 69)) | (1L << (KW_INSTANCE - 69)) | (1L << (KW_INTERSECT - 69)) | (1L << (KW_IS - 69)) | (1L << (KW_ITEM - 69)) | (1L << (KW_LAX - 69)) | (1L << (KW_LE - 69)) | (1L << (KW_LEAST - 69)) | (1L << (KW_LET - 69)) | (1L << (KW_LT - 69)) | (1L << (KW_MAP - 69)) | (1L << (KW_MOD - 69)) | (1L << (KW_MODULE - 69)) | (1L << (KW_NAMESPACE - 69)) | (1L << (KW_NE - 69)) | (1L << (KW_NEXT - 69)) | (1L << (KW_NAMESPACE_NODE - 69)) | (1L << (KW_NO_INHERIT - 69)) | (1L << (KW_NO_PRESERVE - 69)) | (1L << (KW_NODE - 69)) | (1L << (KW_OF - 69)) | (1L << (KW_ONLY - 69)) | (1L << (KW_OPTION - 69)) | (1L << (KW_OR - 69)) | (1L << (KW_ORDER - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (KW_ORDERED - 133)) | (1L << (KW_ORDERING - 133)) | (1L << (KW_PARENT - 133)) | (1L << (KW_PRECEDING - 133)) | (1L << (KW_PRECEDING_SIBLING - 133)) | (1L << (KW_PRESERVE - 133)) | (1L << (KW_PI - 133)) | (1L << (KW_RETURN - 133)) | (1L << (KW_SATISFIES - 133)) | (1L << (KW_SCHEMA - 133)) | (1L << (KW_SCHEMA_ATTR - 133)) | (1L << (KW_SCHEMA_ELEM - 133)) | (1L << (KW_SELF - 133)) | (1L << (KW_SLIDING - 133)) | (1L << (KW_SOME - 133)) | (1L << (KW_STABLE - 133)) | (1L << (KW_START - 133)) | (1L << (KW_STRICT - 133)) | (1L << (KW_STRIP - 133)) | (1L << (KW_SWITCH - 133)) | (1L << (KW_TEXT - 133)) | (1L << (KW_THEN - 133)) | (1L << (KW_TO - 133)) | (1L << (KW_TREAT - 133)) | (1L << (KW_TRY - 133)) | (1L << (KW_TUMBLING - 133)) | (1L << (KW_TYPE - 133)) | (1L << (KW_TYPESWITCH - 133)) | (1L << (KW_UNION - 133)) | (1L << (KW_UNORDERED - 133)) | (1L << (KW_UPDATE - 133)) | (1L << (KW_VALIDATE - 133)) | (1L << (KW_VARIABLE - 133)) | (1L << (KW_VERSION - 133)) | (1L << (KW_WHEN - 133)) | (1L << (KW_WHERE - 133)) | (1L << (KW_WINDOW - 133)) | (1L << (KW_XQUERY - 133)) | (1L << (KW_ARRAY_NODE - 133)) | (1L << (KW_BOOLEAN_NODE - 133)) | (1L << (KW_NULL_NODE - 133)) | (1L << (KW_NUMBER_NODE - 133)) | (1L << (KW_OBJECT_NODE - 133)) | (1L << (KW_REPLACE - 133)) | (1L << (KW_WITH - 133)) | (1L << (KW_VALUE - 133)) | (1L << (KW_INSERT - 133)) | (1L << (KW_INTO - 133)) | (1L << (KW_DELETE - 133)) | (1L << (KW_RENAME - 133)) | (1L << (URIQualifiedName - 133)) | (1L << (FullQName - 133)) | (1L << (NCName - 133)) | (1L << (ENTER_STRING - 133)))) != 0)) {
					{
					setState(1550);
					expr();
					}
				}

				setState(1553);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirAttributeContentAposContext extends ParserRuleContext {
		public List<TerminalNode> ContentChar() { return getTokens(XQueryParser.ContentChar); }
		public TerminalNode ContentChar(int i) {
			return getToken(XQueryParser.ContentChar, i);
		}
		public TerminalNode DOUBLE_LBRACE() { return getToken(XQueryParser.DOUBLE_LBRACE, 0); }
		public TerminalNode DOUBLE_RBRACE() { return getToken(XQueryParser.DOUBLE_RBRACE, 0); }
		public DirAttributeValueQuotContext dirAttributeValueQuot() {
			return getRuleContext(DirAttributeValueQuotContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(XQueryParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(XQueryParser.RBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DirAttributeContentAposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dirAttributeContentApos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitDirAttributeContentApos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirAttributeContentAposContext dirAttributeContentApos() throws RecognitionException {
		DirAttributeContentAposContext _localctx = new DirAttributeContentAposContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_dirAttributeContentApos);
		int _la;
		try {
			int _alt;
			setState(1569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ContentChar:
				enterOuterAlt(_localctx, 1);
				{
				setState(1557); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1556);
						match(ContentChar);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1559); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case DOUBLE_LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1561);
				match(DOUBLE_LBRACE);
				}
				break;
			case DOUBLE_RBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1562);
				match(DOUBLE_RBRACE);
				}
				break;
			case Apos:
				enterOuterAlt(_localctx, 4);
				{
				setState(1563);
				dirAttributeValueQuot();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1564);
				match(LBRACE);
				setState(1566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (IntegerLiteral - 5)) | (1L << (DecimalLiteral - 5)) | (1L << (DoubleLiteral - 5)) | (1L << (DFPropertyName - 5)) | (1L << (Quot - 5)) | (1L << (Apos - 5)) | (1L << (COMMENT - 5)) | (1L << (PI - 5)) | (1L << (PRAGMA - 5)) | (1L << (LPAREN - 5)) | (1L << (LBRACKET - 5)) | (1L << (PLUS - 5)) | (1L << (MINUS - 5)) | (1L << (DOT - 5)) | (1L << (LANGLE - 5)) | (1L << (QUESTION - 5)) | (1L << (DOLLAR - 5)) | (1L << (MOD - 5)) | (1L << (KW_ALLOWING - 5)) | (1L << (KW_ANCESTOR - 5)) | (1L << (KW_ANCESTOR_OR_SELF - 5)) | (1L << (KW_AND - 5)) | (1L << (KW_ARRAY - 5)) | (1L << (KW_AS - 5)) | (1L << (KW_ASCENDING - 5)) | (1L << (KW_AT - 5)) | (1L << (KW_ATTRIBUTE - 5)) | (1L << (KW_BASE_URI - 5)) | (1L << (KW_BOUNDARY_SPACE - 5)) | (1L << (KW_BINARY - 5)) | (1L << (KW_BY - 5)) | (1L << (KW_CASE - 5)) | (1L << (KW_CAST - 5)) | (1L << (KW_CASTABLE - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (KW_CATCH - 69)) | (1L << (KW_CHILD - 69)) | (1L << (KW_COLLATION - 69)) | (1L << (KW_COMMENT - 69)) | (1L << (KW_CONSTRUCTION - 69)) | (1L << (KW_CONTEXT - 69)) | (1L << (KW_COPY_NS - 69)) | (1L << (KW_COUNT - 69)) | (1L << (KW_DECLARE - 69)) | (1L << (KW_DEFAULT - 69)) | (1L << (KW_DESCENDANT - 69)) | (1L << (KW_DESCENDANT_OR_SELF - 69)) | (1L << (KW_DESCENDING - 69)) | (1L << (KW_DECIMAL_FORMAT - 69)) | (1L << (KW_DIV - 69)) | (1L << (KW_DOCUMENT - 69)) | (1L << (KW_DOCUMENT_NODE - 69)) | (1L << (KW_ELEMENT - 69)) | (1L << (KW_ELSE - 69)) | (1L << (KW_EMPTY - 69)) | (1L << (KW_EMPTY_SEQUENCE - 69)) | (1L << (KW_ENCODING - 69)) | (1L << (KW_END - 69)) | (1L << (KW_EQ - 69)) | (1L << (KW_EVERY - 69)) | (1L << (KW_EXCEPT - 69)) | (1L << (KW_EXTERNAL - 69)) | (1L << (KW_FOLLOWING - 69)) | (1L << (KW_FOLLOWING_SIBLING - 69)) | (1L << (KW_FOR - 69)) | (1L << (KW_FUNCTION - 69)) | (1L << (KW_GE - 69)) | (1L << (KW_GREATEST - 69)) | (1L << (KW_GROUP - 69)) | (1L << (KW_GT - 69)) | (1L << (KW_IDIV - 69)) | (1L << (KW_IF - 69)) | (1L << (KW_IMPORT - 69)) | (1L << (KW_IN - 69)) | (1L << (KW_INHERIT - 69)) | (1L << (KW_INSTANCE - 69)) | (1L << (KW_INTERSECT - 69)) | (1L << (KW_IS - 69)) | (1L << (KW_ITEM - 69)) | (1L << (KW_LAX - 69)) | (1L << (KW_LE - 69)) | (1L << (KW_LEAST - 69)) | (1L << (KW_LET - 69)) | (1L << (KW_LT - 69)) | (1L << (KW_MAP - 69)) | (1L << (KW_MOD - 69)) | (1L << (KW_MODULE - 69)) | (1L << (KW_NAMESPACE - 69)) | (1L << (KW_NE - 69)) | (1L << (KW_NEXT - 69)) | (1L << (KW_NAMESPACE_NODE - 69)) | (1L << (KW_NO_INHERIT - 69)) | (1L << (KW_NO_PRESERVE - 69)) | (1L << (KW_NODE - 69)) | (1L << (KW_OF - 69)) | (1L << (KW_ONLY - 69)) | (1L << (KW_OPTION - 69)) | (1L << (KW_OR - 69)) | (1L << (KW_ORDER - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (KW_ORDERED - 133)) | (1L << (KW_ORDERING - 133)) | (1L << (KW_PARENT - 133)) | (1L << (KW_PRECEDING - 133)) | (1L << (KW_PRECEDING_SIBLING - 133)) | (1L << (KW_PRESERVE - 133)) | (1L << (KW_PI - 133)) | (1L << (KW_RETURN - 133)) | (1L << (KW_SATISFIES - 133)) | (1L << (KW_SCHEMA - 133)) | (1L << (KW_SCHEMA_ATTR - 133)) | (1L << (KW_SCHEMA_ELEM - 133)) | (1L << (KW_SELF - 133)) | (1L << (KW_SLIDING - 133)) | (1L << (KW_SOME - 133)) | (1L << (KW_STABLE - 133)) | (1L << (KW_START - 133)) | (1L << (KW_STRICT - 133)) | (1L << (KW_STRIP - 133)) | (1L << (KW_SWITCH - 133)) | (1L << (KW_TEXT - 133)) | (1L << (KW_THEN - 133)) | (1L << (KW_TO - 133)) | (1L << (KW_TREAT - 133)) | (1L << (KW_TRY - 133)) | (1L << (KW_TUMBLING - 133)) | (1L << (KW_TYPE - 133)) | (1L << (KW_TYPESWITCH - 133)) | (1L << (KW_UNION - 133)) | (1L << (KW_UNORDERED - 133)) | (1L << (KW_UPDATE - 133)) | (1L << (KW_VALIDATE - 133)) | (1L << (KW_VARIABLE - 133)) | (1L << (KW_VERSION - 133)) | (1L << (KW_WHEN - 133)) | (1L << (KW_WHERE - 133)) | (1L << (KW_WINDOW - 133)) | (1L << (KW_XQUERY - 133)) | (1L << (KW_ARRAY_NODE - 133)) | (1L << (KW_BOOLEAN_NODE - 133)) | (1L << (KW_NULL_NODE - 133)) | (1L << (KW_NUMBER_NODE - 133)) | (1L << (KW_OBJECT_NODE - 133)) | (1L << (KW_REPLACE - 133)) | (1L << (KW_WITH - 133)) | (1L << (KW_VALUE - 133)) | (1L << (KW_INSERT - 133)) | (1L << (KW_INTO - 133)) | (1L << (KW_DELETE - 133)) | (1L << (KW_RENAME - 133)) | (1L << (URIQualifiedName - 133)) | (1L << (FullQName - 133)) | (1L << (NCName - 133)) | (1L << (ENTER_STRING - 133)))) != 0)) {
					{
					setState(1565);
					expr();
					}
				}

				setState(1568);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirElemContentContext extends ParserRuleContext {
		public DirectConstructorContext directConstructor() {
			return getRuleContext(DirectConstructorContext.class,0);
		}
		public CommonContentContext commonContent() {
			return getRuleContext(CommonContentContext.class,0);
		}
		public TerminalNode CDATA() { return getToken(XQueryParser.CDATA, 0); }
		public TerminalNode Quot() { return getToken(XQueryParser.Quot, 0); }
		public TerminalNode Apos() { return getToken(XQueryParser.Apos, 0); }
		public NoQuotesNoBracesNoAmpNoLAngContext noQuotesNoBracesNoAmpNoLAng() {
			return getRuleContext(NoQuotesNoBracesNoAmpNoLAngContext.class,0);
		}
		public DirElemContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dirElemContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitDirElemContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirElemContentContext dirElemContent() throws RecognitionException {
		DirElemContentContext _localctx = new DirElemContentContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_dirElemContent);
		try {
			setState(1577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1571);
				directConstructor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1572);
				commonContent();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1573);
				match(CDATA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1574);
				match(Quot);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1575);
				match(Apos);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1576);
				noQuotesNoBracesNoAmpNoLAng();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommonContentContext extends ParserRuleContext {
		public TerminalNode PredefinedEntityRef() { return getToken(XQueryParser.PredefinedEntityRef, 0); }
		public TerminalNode CharRef() { return getToken(XQueryParser.CharRef, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(XQueryParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(XQueryParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(XQueryParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(XQueryParser.RBRACE, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CommonContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCommonContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonContentContext commonContent() throws RecognitionException {
		CommonContentContext _localctx = new CommonContentContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_commonContent);
		int _la;
		try {
			setState(1588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1579);
				_la = _input.LA(1);
				if ( !(_la==PredefinedEntityRef || _la==CharRef) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1580);
				match(LBRACE);
				setState(1581);
				match(LBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1582);
				match(RBRACE);
				setState(1583);
				match(RBRACE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1584);
				match(LBRACE);
				setState(1585);
				expr();
				setState(1586);
				match(RBRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComputedConstructorContext extends ParserRuleContext {
		public CompDocConstructorContext compDocConstructor() {
			return getRuleContext(CompDocConstructorContext.class,0);
		}
		public CompElemConstructorContext compElemConstructor() {
			return getRuleContext(CompElemConstructorContext.class,0);
		}
		public CompAttrConstructorContext compAttrConstructor() {
			return getRuleContext(CompAttrConstructorContext.class,0);
		}
		public CompNamespaceConstructorContext compNamespaceConstructor() {
			return getRuleContext(CompNamespaceConstructorContext.class,0);
		}
		public CompTextConstructorContext compTextConstructor() {
			return getRuleContext(CompTextConstructorContext.class,0);
		}
		public CompCommentConstructorContext compCommentConstructor() {
			return getRuleContext(CompCommentConstructorContext.class,0);
		}
		public CompPIConstructorContext compPIConstructor() {
			return getRuleContext(CompPIConstructorContext.class,0);
		}
		public CompMLJSONConstructorContext compMLJSONConstructor() {
			return getRuleContext(CompMLJSONConstructorContext.class,0);
		}
		public ComputedConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computedConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitComputedConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputedConstructorContext computedConstructor() throws RecognitionException {
		ComputedConstructorContext _localctx = new ComputedConstructorContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_computedConstructor);
		try {
			setState(1598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_DOCUMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1590);
				compDocConstructor();
				}
				break;
			case KW_ELEMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1591);
				compElemConstructor();
				}
				break;
			case KW_ATTRIBUTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1592);
				compAttrConstructor();
				}
				break;
			case KW_NAMESPACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1593);
				compNamespaceConstructor();
				}
				break;
			case KW_TEXT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1594);
				compTextConstructor();
				}
				break;
			case KW_COMMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1595);
				compCommentConstructor();
				}
				break;
			case KW_PI:
				enterOuterAlt(_localctx, 7);
				{
				setState(1596);
				compPIConstructor();
				}
				break;
			case KW_BINARY:
			case KW_ARRAY_NODE:
			case KW_BOOLEAN_NODE:
			case KW_NULL_NODE:
			case KW_NUMBER_NODE:
			case KW_OBJECT_NODE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1597);
				compMLJSONConstructor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompMLJSONConstructorContext extends ParserRuleContext {
		public CompMLJSONArrayConstructorContext compMLJSONArrayConstructor() {
			return getRuleContext(CompMLJSONArrayConstructorContext.class,0);
		}
		public CompMLJSONObjectConstructorContext compMLJSONObjectConstructor() {
			return getRuleContext(CompMLJSONObjectConstructorContext.class,0);
		}
		public CompMLJSONNumberConstructorContext compMLJSONNumberConstructor() {
			return getRuleContext(CompMLJSONNumberConstructorContext.class,0);
		}
		public CompMLJSONBooleanConstructorContext compMLJSONBooleanConstructor() {
			return getRuleContext(CompMLJSONBooleanConstructorContext.class,0);
		}
		public CompMLJSONNullConstructorContext compMLJSONNullConstructor() {
			return getRuleContext(CompMLJSONNullConstructorContext.class,0);
		}
		public CompBinaryConstructorContext compBinaryConstructor() {
			return getRuleContext(CompBinaryConstructorContext.class,0);
		}
		public CompMLJSONConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compMLJSONConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCompMLJSONConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompMLJSONConstructorContext compMLJSONConstructor() throws RecognitionException {
		CompMLJSONConstructorContext _localctx = new CompMLJSONConstructorContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_compMLJSONConstructor);
		try {
			setState(1606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ARRAY_NODE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1600);
				compMLJSONArrayConstructor();
				}
				break;
			case KW_OBJECT_NODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1601);
				compMLJSONObjectConstructor();
				}
				break;
			case KW_NUMBER_NODE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1602);
				compMLJSONNumberConstructor();
				}
				break;
			case KW_BOOLEAN_NODE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1603);
				compMLJSONBooleanConstructor();
				}
				break;
			case KW_NULL_NODE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1604);
				compMLJSONNullConstructor();
				}
				break;
			case KW_BINARY:
				enterOuterAlt(_localctx, 6);
				{
				setState(1605);
				compBinaryConstructor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompMLJSONArrayConstructorContext extends ParserRuleContext {
		public TerminalNode KW_ARRAY_NODE() { return getToken(XQueryParser.KW_ARRAY_NODE, 0); }
		public EnclosedContentExprContext enclosedContentExpr() {
			return getRuleContext(EnclosedContentExprContext.class,0);
		}
		public CompMLJSONArrayConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compMLJSONArrayConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCompMLJSONArrayConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompMLJSONArrayConstructorContext compMLJSONArrayConstructor() throws RecognitionException {
		CompMLJSONArrayConstructorContext _localctx = new CompMLJSONArrayConstructorContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_compMLJSONArrayConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			match(KW_ARRAY_NODE);
			setState(1609);
			enclosedContentExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompMLJSONObjectConstructorContext extends ParserRuleContext {
		public TerminalNode KW_OBJECT_NODE() { return getToken(XQueryParser.KW_OBJECT_NODE, 0); }
		public TerminalNode LBRACE() { return getToken(XQueryParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(XQueryParser.RBRACE, 0); }
		public List<ExprSingleContext> exprSingle() {
			return getRuleContexts(ExprSingleContext.class);
		}
		public ExprSingleContext exprSingle(int i) {
			return getRuleContext(ExprSingleContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(XQueryParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(XQueryParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public CompMLJSONObjectConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compMLJSONObjectConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCompMLJSONObjectConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompMLJSONObjectConstructorContext compMLJSONObjectConstructor() throws RecognitionException {
		CompMLJSONObjectConstructorContext _localctx = new CompMLJSONObjectConstructorContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_compMLJSONObjectConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611);
			match(KW_OBJECT_NODE);
			setState(1612);
			match(LBRACE);
			setState(1626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (IntegerLiteral - 5)) | (1L << (DecimalLiteral - 5)) | (1L << (DoubleLiteral - 5)) | (1L << (DFPropertyName - 5)) | (1L << (Quot - 5)) | (1L << (Apos - 5)) | (1L << (COMMENT - 5)) | (1L << (PI - 5)) | (1L << (PRAGMA - 5)) | (1L << (LPAREN - 5)) | (1L << (LBRACKET - 5)) | (1L << (PLUS - 5)) | (1L << (MINUS - 5)) | (1L << (DOT - 5)) | (1L << (LANGLE - 5)) | (1L << (QUESTION - 5)) | (1L << (DOLLAR - 5)) | (1L << (MOD - 5)) | (1L << (KW_ALLOWING - 5)) | (1L << (KW_ANCESTOR - 5)) | (1L << (KW_ANCESTOR_OR_SELF - 5)) | (1L << (KW_AND - 5)) | (1L << (KW_ARRAY - 5)) | (1L << (KW_AS - 5)) | (1L << (KW_ASCENDING - 5)) | (1L << (KW_AT - 5)) | (1L << (KW_ATTRIBUTE - 5)) | (1L << (KW_BASE_URI - 5)) | (1L << (KW_BOUNDARY_SPACE - 5)) | (1L << (KW_BINARY - 5)) | (1L << (KW_BY - 5)) | (1L << (KW_CASE - 5)) | (1L << (KW_CAST - 5)) | (1L << (KW_CASTABLE - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (KW_CATCH - 69)) | (1L << (KW_CHILD - 69)) | (1L << (KW_COLLATION - 69)) | (1L << (KW_COMMENT - 69)) | (1L << (KW_CONSTRUCTION - 69)) | (1L << (KW_CONTEXT - 69)) | (1L << (KW_COPY_NS - 69)) | (1L << (KW_COUNT - 69)) | (1L << (KW_DECLARE - 69)) | (1L << (KW_DEFAULT - 69)) | (1L << (KW_DESCENDANT - 69)) | (1L << (KW_DESCENDANT_OR_SELF - 69)) | (1L << (KW_DESCENDING - 69)) | (1L << (KW_DECIMAL_FORMAT - 69)) | (1L << (KW_DIV - 69)) | (1L << (KW_DOCUMENT - 69)) | (1L << (KW_DOCUMENT_NODE - 69)) | (1L << (KW_ELEMENT - 69)) | (1L << (KW_ELSE - 69)) | (1L << (KW_EMPTY - 69)) | (1L << (KW_EMPTY_SEQUENCE - 69)) | (1L << (KW_ENCODING - 69)) | (1L << (KW_END - 69)) | (1L << (KW_EQ - 69)) | (1L << (KW_EVERY - 69)) | (1L << (KW_EXCEPT - 69)) | (1L << (KW_EXTERNAL - 69)) | (1L << (KW_FOLLOWING - 69)) | (1L << (KW_FOLLOWING_SIBLING - 69)) | (1L << (KW_FOR - 69)) | (1L << (KW_FUNCTION - 69)) | (1L << (KW_GE - 69)) | (1L << (KW_GREATEST - 69)) | (1L << (KW_GROUP - 69)) | (1L << (KW_GT - 69)) | (1L << (KW_IDIV - 69)) | (1L << (KW_IF - 69)) | (1L << (KW_IMPORT - 69)) | (1L << (KW_IN - 69)) | (1L << (KW_INHERIT - 69)) | (1L << (KW_INSTANCE - 69)) | (1L << (KW_INTERSECT - 69)) | (1L << (KW_IS - 69)) | (1L << (KW_ITEM - 69)) | (1L << (KW_LAX - 69)) | (1L << (KW_LE - 69)) | (1L << (KW_LEAST - 69)) | (1L << (KW_LET - 69)) | (1L << (KW_LT - 69)) | (1L << (KW_MAP - 69)) | (1L << (KW_MOD - 69)) | (1L << (KW_MODULE - 69)) | (1L << (KW_NAMESPACE - 69)) | (1L << (KW_NE - 69)) | (1L << (KW_NEXT - 69)) | (1L << (KW_NAMESPACE_NODE - 69)) | (1L << (KW_NO_INHERIT - 69)) | (1L << (KW_NO_PRESERVE - 69)) | (1L << (KW_NODE - 69)) | (1L << (KW_OF - 69)) | (1L << (KW_ONLY - 69)) | (1L << (KW_OPTION - 69)) | (1L << (KW_OR - 69)) | (1L << (KW_ORDER - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (KW_ORDERED - 133)) | (1L << (KW_ORDERING - 133)) | (1L << (KW_PARENT - 133)) | (1L << (KW_PRECEDING - 133)) | (1L << (KW_PRECEDING_SIBLING - 133)) | (1L << (KW_PRESERVE - 133)) | (1L << (KW_PI - 133)) | (1L << (KW_RETURN - 133)) | (1L << (KW_SATISFIES - 133)) | (1L << (KW_SCHEMA - 133)) | (1L << (KW_SCHEMA_ATTR - 133)) | (1L << (KW_SCHEMA_ELEM - 133)) | (1L << (KW_SELF - 133)) | (1L << (KW_SLIDING - 133)) | (1L << (KW_SOME - 133)) | (1L << (KW_STABLE - 133)) | (1L << (KW_START - 133)) | (1L << (KW_STRICT - 133)) | (1L << (KW_STRIP - 133)) | (1L << (KW_SWITCH - 133)) | (1L << (KW_TEXT - 133)) | (1L << (KW_THEN - 133)) | (1L << (KW_TO - 133)) | (1L << (KW_TREAT - 133)) | (1L << (KW_TRY - 133)) | (1L << (KW_TUMBLING - 133)) | (1L << (KW_TYPE - 133)) | (1L << (KW_TYPESWITCH - 133)) | (1L << (KW_UNION - 133)) | (1L << (KW_UNORDERED - 133)) | (1L << (KW_UPDATE - 133)) | (1L << (KW_VALIDATE - 133)) | (1L << (KW_VARIABLE - 133)) | (1L << (KW_VERSION - 133)) | (1L << (KW_WHEN - 133)) | (1L << (KW_WHERE - 133)) | (1L << (KW_WINDOW - 133)) | (1L << (KW_XQUERY - 133)) | (1L << (KW_ARRAY_NODE - 133)) | (1L << (KW_BOOLEAN_NODE - 133)) | (1L << (KW_NULL_NODE - 133)) | (1L << (KW_NUMBER_NODE - 133)) | (1L << (KW_OBJECT_NODE - 133)) | (1L << (KW_REPLACE - 133)) | (1L << (KW_WITH - 133)) | (1L << (KW_VALUE - 133)) | (1L << (KW_INSERT - 133)) | (1L << (KW_INTO - 133)) | (1L << (KW_DELETE - 133)) | (1L << (KW_RENAME - 133)) | (1L << (URIQualifiedName - 133)) | (1L << (FullQName - 133)) | (1L << (NCName - 133)) | (1L << (ENTER_STRING - 133)))) != 0)) {
				{
				setState(1613);
				exprSingle();
				setState(1614);
				match(COLON);
				setState(1615);
				exprSingle();
				setState(1623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1616);
					match(COMMA);
					setState(1617);
					exprSingle();
					setState(1618);
					match(COLON);
					setState(1619);
					exprSingle();
					}
					}
					setState(1625);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1628);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompMLJSONNumberConstructorContext extends ParserRuleContext {
		public TerminalNode KW_NUMBER_NODE() { return getToken(XQueryParser.KW_NUMBER_NODE, 0); }
		public EnclosedContentExprContext enclosedContentExpr() {
			return getRuleContext(EnclosedContentExprContext.class,0);
		}
		public CompMLJSONNumberConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compMLJSONNumberConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCompMLJSONNumberConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompMLJSONNumberConstructorContext compMLJSONNumberConstructor() throws RecognitionException {
		CompMLJSONNumberConstructorContext _localctx = new CompMLJSONNumberConstructorContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_compMLJSONNumberConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			match(KW_NUMBER_NODE);
			setState(1631);
			enclosedContentExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompMLJSONBooleanConstructorContext extends ParserRuleContext {
		public TerminalNode KW_BOOLEAN_NODE() { return getToken(XQueryParser.KW_BOOLEAN_NODE, 0); }
		public TerminalNode LBRACE() { return getToken(XQueryParser.LBRACE, 0); }
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(XQueryParser.RBRACE, 0); }
		public CompMLJSONBooleanConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compMLJSONBooleanConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCompMLJSONBooleanConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompMLJSONBooleanConstructorContext compMLJSONBooleanConstructor() throws RecognitionException {
		CompMLJSONBooleanConstructorContext _localctx = new CompMLJSONBooleanConstructorContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_compMLJSONBooleanConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			match(KW_BOOLEAN_NODE);
			setState(1634);
			match(LBRACE);
			setState(1635);
			exprSingle();
			setState(1636);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompMLJSONNullConstructorContext extends ParserRuleContext {
		public TerminalNode KW_NULL_NODE() { return getToken(XQueryParser.KW_NULL_NODE, 0); }
		public TerminalNode LBRACE() { return getToken(XQueryParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(XQueryParser.RBRACE, 0); }
		public CompMLJSONNullConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compMLJSONNullConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCompMLJSONNullConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompMLJSONNullConstructorContext compMLJSONNullConstructor() throws RecognitionException {
		CompMLJSONNullConstructorContext _localctx = new CompMLJSONNullConstructorContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_compMLJSONNullConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1638);
			match(KW_NULL_NODE);
			setState(1639);
			match(LBRACE);
			setState(1640);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompBinaryConstructorContext extends ParserRuleContext {
		public TerminalNode KW_BINARY() { return getToken(XQueryParser.KW_BINARY, 0); }
		public EnclosedContentExprContext enclosedContentExpr() {
			return getRuleContext(EnclosedContentExprContext.class,0);
		}
		public CompBinaryConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compBinaryConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCompBinaryConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompBinaryConstructorContext compBinaryConstructor() throws RecognitionException {
		CompBinaryConstructorContext _localctx = new CompBinaryConstructorContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_compBinaryConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			match(KW_BINARY);
			setState(1643);
			enclosedContentExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompDocConstructorContext extends ParserRuleContext {
		public TerminalNode KW_DOCUMENT() { return getToken(XQueryParser.KW_DOCUMENT, 0); }
		public EnclosedExpressionContext enclosedExpression() {
			return getRuleContext(EnclosedExpressionContext.class,0);
		}
		public CompDocConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compDocConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCompDocConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompDocConstructorContext compDocConstructor() throws RecognitionException {
		CompDocConstructorContext _localctx = new CompDocConstructorContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_compDocConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1645);
			match(KW_DOCUMENT);
			setState(1646);
			enclosedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompElemConstructorContext extends ParserRuleContext {
		public TerminalNode KW_ELEMENT() { return getToken(XQueryParser.KW_ELEMENT, 0); }
		public EnclosedContentExprContext enclosedContentExpr() {
			return getRuleContext(EnclosedContentExprContext.class,0);
		}
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(XQueryParser.LBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(XQueryParser.RBRACE, 0); }
		public CompElemConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compElemConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCompElemConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompElemConstructorContext compElemConstructor() throws RecognitionException {
		CompElemConstructorContext _localctx = new CompElemConstructorContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_compElemConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1648);
			match(KW_ELEMENT);
			setState(1654);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DFPropertyName:
			case KW_ALLOWING:
			case KW_ANCESTOR:
			case KW_ANCESTOR_OR_SELF:
			case KW_AND:
			case KW_ARRAY:
			case KW_AS:
			case KW_ASCENDING:
			case KW_AT:
			case KW_ATTRIBUTE:
			case KW_BASE_URI:
			case KW_BOUNDARY_SPACE:
			case KW_BINARY:
			case KW_BY:
			case KW_CASE:
			case KW_CAST:
			case KW_CASTABLE:
			case KW_CATCH:
			case KW_CHILD:
			case KW_COLLATION:
			case KW_COMMENT:
			case KW_CONSTRUCTION:
			case KW_CONTEXT:
			case KW_COPY_NS:
			case KW_COUNT:
			case KW_DECLARE:
			case KW_DEFAULT:
			case KW_DESCENDANT:
			case KW_DESCENDANT_OR_SELF:
			case KW_DESCENDING:
			case KW_DECIMAL_FORMAT:
			case KW_DIV:
			case KW_DOCUMENT:
			case KW_DOCUMENT_NODE:
			case KW_ELEMENT:
			case KW_ELSE:
			case KW_EMPTY:
			case KW_EMPTY_SEQUENCE:
			case KW_ENCODING:
			case KW_END:
			case KW_EQ:
			case KW_EVERY:
			case KW_EXCEPT:
			case KW_EXTERNAL:
			case KW_FOLLOWING:
			case KW_FOLLOWING_SIBLING:
			case KW_FOR:
			case KW_FUNCTION:
			case KW_GE:
			case KW_GREATEST:
			case KW_GROUP:
			case KW_GT:
			case KW_IDIV:
			case KW_IF:
			case KW_IMPORT:
			case KW_IN:
			case KW_INHERIT:
			case KW_INSTANCE:
			case KW_INTERSECT:
			case KW_IS:
			case KW_ITEM:
			case KW_LAX:
			case KW_LE:
			case KW_LEAST:
			case KW_LET:
			case KW_LT:
			case KW_MAP:
			case KW_MOD:
			case KW_MODULE:
			case KW_NAMESPACE:
			case KW_NE:
			case KW_NEXT:
			case KW_NAMESPACE_NODE:
			case KW_NO_INHERIT:
			case KW_NO_PRESERVE:
			case KW_NODE:
			case KW_OF:
			case KW_ONLY:
			case KW_OPTION:
			case KW_OR:
			case KW_ORDER:
			case KW_ORDERED:
			case KW_ORDERING:
			case KW_PARENT:
			case KW_PRECEDING:
			case KW_PRECEDING_SIBLING:
			case KW_PRESERVE:
			case KW_PI:
			case KW_RETURN:
			case KW_SATISFIES:
			case KW_SCHEMA:
			case KW_SCHEMA_ATTR:
			case KW_SCHEMA_ELEM:
			case KW_SELF:
			case KW_SLIDING:
			case KW_SOME:
			case KW_STABLE:
			case KW_START:
			case KW_STRICT:
			case KW_STRIP:
			case KW_SWITCH:
			case KW_TEXT:
			case KW_THEN:
			case KW_TO:
			case KW_TREAT:
			case KW_TRY:
			case KW_TUMBLING:
			case KW_TYPE:
			case KW_TYPESWITCH:
			case KW_UNION:
			case KW_UNORDERED:
			case KW_UPDATE:
			case KW_VALIDATE:
			case KW_VARIABLE:
			case KW_VERSION:
			case KW_WHEN:
			case KW_WHERE:
			case KW_WINDOW:
			case KW_XQUERY:
			case KW_ARRAY_NODE:
			case KW_BOOLEAN_NODE:
			case KW_NULL_NODE:
			case KW_NUMBER_NODE:
			case KW_OBJECT_NODE:
			case KW_REPLACE:
			case KW_WITH:
			case KW_VALUE:
			case KW_INSERT:
			case KW_INTO:
			case KW_DELETE:
			case KW_RENAME:
			case URIQualifiedName:
			case FullQName:
			case NCName:
				{
				setState(1649);
				eqName();
				}
				break;
			case LBRACE:
				{
				{
				setState(1650);
				match(LBRACE);
				setState(1651);
				expr();
				setState(1652);
				match(RBRACE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1656);
			enclosedContentExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnclosedContentExprContext extends ParserRuleContext {
		public EnclosedExpressionContext enclosedExpression() {
			return getRuleContext(EnclosedExpressionContext.class,0);
		}
		public EnclosedContentExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enclosedContentExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitEnclosedContentExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnclosedContentExprContext enclosedContentExpr() throws RecognitionException {
		EnclosedContentExprContext _localctx = new EnclosedContentExprContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_enclosedContentExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1658);
			enclosedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompAttrConstructorContext extends ParserRuleContext {
		public TerminalNode KW_ATTRIBUTE() { return getToken(XQueryParser.KW_ATTRIBUTE, 0); }
		public EnclosedExpressionContext enclosedExpression() {
			return getRuleContext(EnclosedExpressionContext.class,0);
		}
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(XQueryParser.LBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(XQueryParser.RBRACE, 0); }
		public CompAttrConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compAttrConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCompAttrConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompAttrConstructorContext compAttrConstructor() throws RecognitionException {
		CompAttrConstructorContext _localctx = new CompAttrConstructorContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_compAttrConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1660);
			match(KW_ATTRIBUTE);
			setState(1666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DFPropertyName:
			case KW_ALLOWING:
			case KW_ANCESTOR:
			case KW_ANCESTOR_OR_SELF:
			case KW_AND:
			case KW_ARRAY:
			case KW_AS:
			case KW_ASCENDING:
			case KW_AT:
			case KW_ATTRIBUTE:
			case KW_BASE_URI:
			case KW_BOUNDARY_SPACE:
			case KW_BINARY:
			case KW_BY:
			case KW_CASE:
			case KW_CAST:
			case KW_CASTABLE:
			case KW_CATCH:
			case KW_CHILD:
			case KW_COLLATION:
			case KW_COMMENT:
			case KW_CONSTRUCTION:
			case KW_CONTEXT:
			case KW_COPY_NS:
			case KW_COUNT:
			case KW_DECLARE:
			case KW_DEFAULT:
			case KW_DESCENDANT:
			case KW_DESCENDANT_OR_SELF:
			case KW_DESCENDING:
			case KW_DECIMAL_FORMAT:
			case KW_DIV:
			case KW_DOCUMENT:
			case KW_DOCUMENT_NODE:
			case KW_ELEMENT:
			case KW_ELSE:
			case KW_EMPTY:
			case KW_EMPTY_SEQUENCE:
			case KW_ENCODING:
			case KW_END:
			case KW_EQ:
			case KW_EVERY:
			case KW_EXCEPT:
			case KW_EXTERNAL:
			case KW_FOLLOWING:
			case KW_FOLLOWING_SIBLING:
			case KW_FOR:
			case KW_FUNCTION:
			case KW_GE:
			case KW_GREATEST:
			case KW_GROUP:
			case KW_GT:
			case KW_IDIV:
			case KW_IF:
			case KW_IMPORT:
			case KW_IN:
			case KW_INHERIT:
			case KW_INSTANCE:
			case KW_INTERSECT:
			case KW_IS:
			case KW_ITEM:
			case KW_LAX:
			case KW_LE:
			case KW_LEAST:
			case KW_LET:
			case KW_LT:
			case KW_MAP:
			case KW_MOD:
			case KW_MODULE:
			case KW_NAMESPACE:
			case KW_NE:
			case KW_NEXT:
			case KW_NAMESPACE_NODE:
			case KW_NO_INHERIT:
			case KW_NO_PRESERVE:
			case KW_NODE:
			case KW_OF:
			case KW_ONLY:
			case KW_OPTION:
			case KW_OR:
			case KW_ORDER:
			case KW_ORDERED:
			case KW_ORDERING:
			case KW_PARENT:
			case KW_PRECEDING:
			case KW_PRECEDING_SIBLING:
			case KW_PRESERVE:
			case KW_PI:
			case KW_RETURN:
			case KW_SATISFIES:
			case KW_SCHEMA:
			case KW_SCHEMA_ATTR:
			case KW_SCHEMA_ELEM:
			case KW_SELF:
			case KW_SLIDING:
			case KW_SOME:
			case KW_STABLE:
			case KW_START:
			case KW_STRICT:
			case KW_STRIP:
			case KW_SWITCH:
			case KW_TEXT:
			case KW_THEN:
			case KW_TO:
			case KW_TREAT:
			case KW_TRY:
			case KW_TUMBLING:
			case KW_TYPE:
			case KW_TYPESWITCH:
			case KW_UNION:
			case KW_UNORDERED:
			case KW_UPDATE:
			case KW_VALIDATE:
			case KW_VARIABLE:
			case KW_VERSION:
			case KW_WHEN:
			case KW_WHERE:
			case KW_WINDOW:
			case KW_XQUERY:
			case KW_ARRAY_NODE:
			case KW_BOOLEAN_NODE:
			case KW_NULL_NODE:
			case KW_NUMBER_NODE:
			case KW_OBJECT_NODE:
			case KW_REPLACE:
			case KW_WITH:
			case KW_VALUE:
			case KW_INSERT:
			case KW_INTO:
			case KW_DELETE:
			case KW_RENAME:
			case URIQualifiedName:
			case FullQName:
			case NCName:
				{
				setState(1661);
				eqName();
				}
				break;
			case LBRACE:
				{
				{
				setState(1662);
				match(LBRACE);
				setState(1663);
				expr();
				setState(1664);
				match(RBRACE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1668);
			enclosedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompNamespaceConstructorContext extends ParserRuleContext {
		public TerminalNode KW_NAMESPACE() { return getToken(XQueryParser.KW_NAMESPACE, 0); }
		public EnclosedURIExprContext enclosedURIExpr() {
			return getRuleContext(EnclosedURIExprContext.class,0);
		}
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public EnclosedPrefixExprContext enclosedPrefixExpr() {
			return getRuleContext(EnclosedPrefixExprContext.class,0);
		}
		public CompNamespaceConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compNamespaceConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCompNamespaceConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompNamespaceConstructorContext compNamespaceConstructor() throws RecognitionException {
		CompNamespaceConstructorContext _localctx = new CompNamespaceConstructorContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_compNamespaceConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			match(KW_NAMESPACE);
			setState(1673);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DFPropertyName:
			case KW_ALLOWING:
			case KW_ANCESTOR:
			case KW_ANCESTOR_OR_SELF:
			case KW_AND:
			case KW_ARRAY:
			case KW_AS:
			case KW_ASCENDING:
			case KW_AT:
			case KW_ATTRIBUTE:
			case KW_BASE_URI:
			case KW_BOUNDARY_SPACE:
			case KW_BINARY:
			case KW_BY:
			case KW_CASE:
			case KW_CAST:
			case KW_CASTABLE:
			case KW_CATCH:
			case KW_CHILD:
			case KW_COLLATION:
			case KW_COMMENT:
			case KW_CONSTRUCTION:
			case KW_CONTEXT:
			case KW_COPY_NS:
			case KW_COUNT:
			case KW_DECLARE:
			case KW_DEFAULT:
			case KW_DESCENDANT:
			case KW_DESCENDANT_OR_SELF:
			case KW_DESCENDING:
			case KW_DECIMAL_FORMAT:
			case KW_DIV:
			case KW_DOCUMENT:
			case KW_DOCUMENT_NODE:
			case KW_ELEMENT:
			case KW_ELSE:
			case KW_EMPTY:
			case KW_EMPTY_SEQUENCE:
			case KW_ENCODING:
			case KW_END:
			case KW_EQ:
			case KW_EVERY:
			case KW_EXCEPT:
			case KW_EXTERNAL:
			case KW_FOLLOWING:
			case KW_FOLLOWING_SIBLING:
			case KW_FOR:
			case KW_FUNCTION:
			case KW_GE:
			case KW_GREATEST:
			case KW_GROUP:
			case KW_GT:
			case KW_IDIV:
			case KW_IF:
			case KW_IMPORT:
			case KW_IN:
			case KW_INHERIT:
			case KW_INSTANCE:
			case KW_INTERSECT:
			case KW_IS:
			case KW_ITEM:
			case KW_LAX:
			case KW_LE:
			case KW_LEAST:
			case KW_LET:
			case KW_LT:
			case KW_MAP:
			case KW_MOD:
			case KW_MODULE:
			case KW_NAMESPACE:
			case KW_NE:
			case KW_NEXT:
			case KW_NAMESPACE_NODE:
			case KW_NO_INHERIT:
			case KW_NO_PRESERVE:
			case KW_NODE:
			case KW_OF:
			case KW_ONLY:
			case KW_OPTION:
			case KW_OR:
			case KW_ORDER:
			case KW_ORDERED:
			case KW_ORDERING:
			case KW_PARENT:
			case KW_PRECEDING:
			case KW_PRECEDING_SIBLING:
			case KW_PRESERVE:
			case KW_PI:
			case KW_RETURN:
			case KW_SATISFIES:
			case KW_SCHEMA:
			case KW_SCHEMA_ATTR:
			case KW_SCHEMA_ELEM:
			case KW_SELF:
			case KW_SLIDING:
			case KW_SOME:
			case KW_STABLE:
			case KW_START:
			case KW_STRICT:
			case KW_STRIP:
			case KW_SWITCH:
			case KW_TEXT:
			case KW_THEN:
			case KW_TO:
			case KW_TREAT:
			case KW_TRY:
			case KW_TUMBLING:
			case KW_TYPE:
			case KW_TYPESWITCH:
			case KW_UNION:
			case KW_UNORDERED:
			case KW_UPDATE:
			case KW_VALIDATE:
			case KW_VARIABLE:
			case KW_VERSION:
			case KW_WHEN:
			case KW_WHERE:
			case KW_WINDOW:
			case KW_XQUERY:
			case KW_ARRAY_NODE:
			case KW_BOOLEAN_NODE:
			case KW_NULL_NODE:
			case KW_NUMBER_NODE:
			case KW_OBJECT_NODE:
			case KW_REPLACE:
			case KW_WITH:
			case KW_VALUE:
			case KW_INSERT:
			case KW_INTO:
			case KW_DELETE:
			case KW_RENAME:
			case NCName:
				{
				setState(1671);
				prefix();
				}
				break;
			case LBRACE:
				{
				setState(1672);
				enclosedPrefixExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1675);
			enclosedURIExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixContext extends ParserRuleContext {
		public NcNameContext ncName() {
			return getRuleContext(NcNameContext.class,0);
		}
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
			ncName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnclosedPrefixExprContext extends ParserRuleContext {
		public EnclosedExpressionContext enclosedExpression() {
			return getRuleContext(EnclosedExpressionContext.class,0);
		}
		public EnclosedPrefixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enclosedPrefixExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitEnclosedPrefixExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnclosedPrefixExprContext enclosedPrefixExpr() throws RecognitionException {
		EnclosedPrefixExprContext _localctx = new EnclosedPrefixExprContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_enclosedPrefixExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			enclosedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnclosedURIExprContext extends ParserRuleContext {
		public EnclosedExpressionContext enclosedExpression() {
			return getRuleContext(EnclosedExpressionContext.class,0);
		}
		public EnclosedURIExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enclosedURIExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitEnclosedURIExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnclosedURIExprContext enclosedURIExpr() throws RecognitionException {
		EnclosedURIExprContext _localctx = new EnclosedURIExprContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_enclosedURIExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1681);
			enclosedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompTextConstructorContext extends ParserRuleContext {
		public TerminalNode KW_TEXT() { return getToken(XQueryParser.KW_TEXT, 0); }
		public EnclosedExpressionContext enclosedExpression() {
			return getRuleContext(EnclosedExpressionContext.class,0);
		}
		public CompTextConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compTextConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCompTextConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompTextConstructorContext compTextConstructor() throws RecognitionException {
		CompTextConstructorContext _localctx = new CompTextConstructorContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_compTextConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			match(KW_TEXT);
			setState(1684);
			enclosedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompCommentConstructorContext extends ParserRuleContext {
		public TerminalNode KW_COMMENT() { return getToken(XQueryParser.KW_COMMENT, 0); }
		public EnclosedExpressionContext enclosedExpression() {
			return getRuleContext(EnclosedExpressionContext.class,0);
		}
		public CompCommentConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compCommentConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCompCommentConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompCommentConstructorContext compCommentConstructor() throws RecognitionException {
		CompCommentConstructorContext _localctx = new CompCommentConstructorContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_compCommentConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1686);
			match(KW_COMMENT);
			setState(1687);
			enclosedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompPIConstructorContext extends ParserRuleContext {
		public TerminalNode KW_PI() { return getToken(XQueryParser.KW_PI, 0); }
		public EnclosedExpressionContext enclosedExpression() {
			return getRuleContext(EnclosedExpressionContext.class,0);
		}
		public NcNameContext ncName() {
			return getRuleContext(NcNameContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(XQueryParser.LBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(XQueryParser.RBRACE, 0); }
		public CompPIConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compPIConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCompPIConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompPIConstructorContext compPIConstructor() throws RecognitionException {
		CompPIConstructorContext _localctx = new CompPIConstructorContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_compPIConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
			match(KW_PI);
			setState(1695);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DFPropertyName:
			case KW_ALLOWING:
			case KW_ANCESTOR:
			case KW_ANCESTOR_OR_SELF:
			case KW_AND:
			case KW_ARRAY:
			case KW_AS:
			case KW_ASCENDING:
			case KW_AT:
			case KW_ATTRIBUTE:
			case KW_BASE_URI:
			case KW_BOUNDARY_SPACE:
			case KW_BINARY:
			case KW_BY:
			case KW_CASE:
			case KW_CAST:
			case KW_CASTABLE:
			case KW_CATCH:
			case KW_CHILD:
			case KW_COLLATION:
			case KW_COMMENT:
			case KW_CONSTRUCTION:
			case KW_CONTEXT:
			case KW_COPY_NS:
			case KW_COUNT:
			case KW_DECLARE:
			case KW_DEFAULT:
			case KW_DESCENDANT:
			case KW_DESCENDANT_OR_SELF:
			case KW_DESCENDING:
			case KW_DECIMAL_FORMAT:
			case KW_DIV:
			case KW_DOCUMENT:
			case KW_DOCUMENT_NODE:
			case KW_ELEMENT:
			case KW_ELSE:
			case KW_EMPTY:
			case KW_EMPTY_SEQUENCE:
			case KW_ENCODING:
			case KW_END:
			case KW_EQ:
			case KW_EVERY:
			case KW_EXCEPT:
			case KW_EXTERNAL:
			case KW_FOLLOWING:
			case KW_FOLLOWING_SIBLING:
			case KW_FOR:
			case KW_FUNCTION:
			case KW_GE:
			case KW_GREATEST:
			case KW_GROUP:
			case KW_GT:
			case KW_IDIV:
			case KW_IF:
			case KW_IMPORT:
			case KW_IN:
			case KW_INHERIT:
			case KW_INSTANCE:
			case KW_INTERSECT:
			case KW_IS:
			case KW_ITEM:
			case KW_LAX:
			case KW_LE:
			case KW_LEAST:
			case KW_LET:
			case KW_LT:
			case KW_MAP:
			case KW_MOD:
			case KW_MODULE:
			case KW_NAMESPACE:
			case KW_NE:
			case KW_NEXT:
			case KW_NAMESPACE_NODE:
			case KW_NO_INHERIT:
			case KW_NO_PRESERVE:
			case KW_NODE:
			case KW_OF:
			case KW_ONLY:
			case KW_OPTION:
			case KW_OR:
			case KW_ORDER:
			case KW_ORDERED:
			case KW_ORDERING:
			case KW_PARENT:
			case KW_PRECEDING:
			case KW_PRECEDING_SIBLING:
			case KW_PRESERVE:
			case KW_PI:
			case KW_RETURN:
			case KW_SATISFIES:
			case KW_SCHEMA:
			case KW_SCHEMA_ATTR:
			case KW_SCHEMA_ELEM:
			case KW_SELF:
			case KW_SLIDING:
			case KW_SOME:
			case KW_STABLE:
			case KW_START:
			case KW_STRICT:
			case KW_STRIP:
			case KW_SWITCH:
			case KW_TEXT:
			case KW_THEN:
			case KW_TO:
			case KW_TREAT:
			case KW_TRY:
			case KW_TUMBLING:
			case KW_TYPE:
			case KW_TYPESWITCH:
			case KW_UNION:
			case KW_UNORDERED:
			case KW_UPDATE:
			case KW_VALIDATE:
			case KW_VARIABLE:
			case KW_VERSION:
			case KW_WHEN:
			case KW_WHERE:
			case KW_WINDOW:
			case KW_XQUERY:
			case KW_ARRAY_NODE:
			case KW_BOOLEAN_NODE:
			case KW_NULL_NODE:
			case KW_NUMBER_NODE:
			case KW_OBJECT_NODE:
			case KW_REPLACE:
			case KW_WITH:
			case KW_VALUE:
			case KW_INSERT:
			case KW_INTO:
			case KW_DELETE:
			case KW_RENAME:
			case NCName:
				{
				setState(1690);
				ncName();
				}
				break;
			case LBRACE:
				{
				{
				setState(1691);
				match(LBRACE);
				setState(1692);
				expr();
				setState(1693);
				match(RBRACE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1697);
			enclosedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionItemExprContext extends ParserRuleContext {
		public NamedFunctionRefContext namedFunctionRef() {
			return getRuleContext(NamedFunctionRefContext.class,0);
		}
		public InlineFunctionRefContext inlineFunctionRef() {
			return getRuleContext(InlineFunctionRefContext.class,0);
		}
		public FunctionItemExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionItemExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitFunctionItemExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionItemExprContext functionItemExpr() throws RecognitionException {
		FunctionItemExprContext _localctx = new FunctionItemExprContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_functionItemExpr);
		try {
			setState(1701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1699);
				namedFunctionRef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1700);
				inlineFunctionRef();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedFunctionRefContext extends ParserRuleContext {
		public EqNameContext fn_name;
		public Token arity;
		public TerminalNode HASH() { return getToken(XQueryParser.HASH, 0); }
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public TerminalNode IntegerLiteral() { return getToken(XQueryParser.IntegerLiteral, 0); }
		public NamedFunctionRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedFunctionRef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitNamedFunctionRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedFunctionRefContext namedFunctionRef() throws RecognitionException {
		NamedFunctionRefContext _localctx = new NamedFunctionRefContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_namedFunctionRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703);
			((NamedFunctionRefContext)_localctx).fn_name = eqName();
			setState(1704);
			match(HASH);
			setState(1705);
			((NamedFunctionRefContext)_localctx).arity = match(IntegerLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineFunctionRefContext extends ParserRuleContext {
		public SequenceTypeContext return_type;
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode KW_FUNCTION() { return getToken(XQueryParser.KW_FUNCTION, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionParamsContext functionParams() {
			return getRuleContext(FunctionParamsContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(XQueryParser.KW_AS, 0); }
		public SequenceTypeContext sequenceType() {
			return getRuleContext(SequenceTypeContext.class,0);
		}
		public InlineFunctionRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineFunctionRef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitInlineFunctionRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineFunctionRefContext inlineFunctionRef() throws RecognitionException {
		InlineFunctionRefContext _localctx = new InlineFunctionRefContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_inlineFunctionRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
			annotations();
			setState(1708);
			match(KW_FUNCTION);
			setState(1709);
			match(LPAREN);
			setState(1711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOLLAR) {
				{
				setState(1710);
				functionParams();
				}
			}

			setState(1713);
			match(RPAREN);
			setState(1716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(1714);
				match(KW_AS);
				setState(1715);
				((InlineFunctionRefContext)_localctx).return_type = sequenceType();
				}
			}

			setState(1718);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public EnclosedExpressionContext enclosedExpression() {
			return getRuleContext(EnclosedExpressionContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1720);
			enclosedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapConstructorContext extends ParserRuleContext {
		public TerminalNode KW_MAP() { return getToken(XQueryParser.KW_MAP, 0); }
		public TerminalNode LBRACE() { return getToken(XQueryParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(XQueryParser.RBRACE, 0); }
		public List<MapConstructorEntryContext> mapConstructorEntry() {
			return getRuleContexts(MapConstructorEntryContext.class);
		}
		public MapConstructorEntryContext mapConstructorEntry(int i) {
			return getRuleContext(MapConstructorEntryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public MapConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitMapConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapConstructorContext mapConstructor() throws RecognitionException {
		MapConstructorContext _localctx = new MapConstructorContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_mapConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			match(KW_MAP);
			setState(1723);
			match(LBRACE);
			setState(1732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (IntegerLiteral - 5)) | (1L << (DecimalLiteral - 5)) | (1L << (DoubleLiteral - 5)) | (1L << (DFPropertyName - 5)) | (1L << (Quot - 5)) | (1L << (Apos - 5)) | (1L << (COMMENT - 5)) | (1L << (PI - 5)) | (1L << (PRAGMA - 5)) | (1L << (LPAREN - 5)) | (1L << (LBRACKET - 5)) | (1L << (PLUS - 5)) | (1L << (MINUS - 5)) | (1L << (DOT - 5)) | (1L << (LANGLE - 5)) | (1L << (QUESTION - 5)) | (1L << (DOLLAR - 5)) | (1L << (MOD - 5)) | (1L << (KW_ALLOWING - 5)) | (1L << (KW_ANCESTOR - 5)) | (1L << (KW_ANCESTOR_OR_SELF - 5)) | (1L << (KW_AND - 5)) | (1L << (KW_ARRAY - 5)) | (1L << (KW_AS - 5)) | (1L << (KW_ASCENDING - 5)) | (1L << (KW_AT - 5)) | (1L << (KW_ATTRIBUTE - 5)) | (1L << (KW_BASE_URI - 5)) | (1L << (KW_BOUNDARY_SPACE - 5)) | (1L << (KW_BINARY - 5)) | (1L << (KW_BY - 5)) | (1L << (KW_CASE - 5)) | (1L << (KW_CAST - 5)) | (1L << (KW_CASTABLE - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (KW_CATCH - 69)) | (1L << (KW_CHILD - 69)) | (1L << (KW_COLLATION - 69)) | (1L << (KW_COMMENT - 69)) | (1L << (KW_CONSTRUCTION - 69)) | (1L << (KW_CONTEXT - 69)) | (1L << (KW_COPY_NS - 69)) | (1L << (KW_COUNT - 69)) | (1L << (KW_DECLARE - 69)) | (1L << (KW_DEFAULT - 69)) | (1L << (KW_DESCENDANT - 69)) | (1L << (KW_DESCENDANT_OR_SELF - 69)) | (1L << (KW_DESCENDING - 69)) | (1L << (KW_DECIMAL_FORMAT - 69)) | (1L << (KW_DIV - 69)) | (1L << (KW_DOCUMENT - 69)) | (1L << (KW_DOCUMENT_NODE - 69)) | (1L << (KW_ELEMENT - 69)) | (1L << (KW_ELSE - 69)) | (1L << (KW_EMPTY - 69)) | (1L << (KW_EMPTY_SEQUENCE - 69)) | (1L << (KW_ENCODING - 69)) | (1L << (KW_END - 69)) | (1L << (KW_EQ - 69)) | (1L << (KW_EVERY - 69)) | (1L << (KW_EXCEPT - 69)) | (1L << (KW_EXTERNAL - 69)) | (1L << (KW_FOLLOWING - 69)) | (1L << (KW_FOLLOWING_SIBLING - 69)) | (1L << (KW_FOR - 69)) | (1L << (KW_FUNCTION - 69)) | (1L << (KW_GE - 69)) | (1L << (KW_GREATEST - 69)) | (1L << (KW_GROUP - 69)) | (1L << (KW_GT - 69)) | (1L << (KW_IDIV - 69)) | (1L << (KW_IF - 69)) | (1L << (KW_IMPORT - 69)) | (1L << (KW_IN - 69)) | (1L << (KW_INHERIT - 69)) | (1L << (KW_INSTANCE - 69)) | (1L << (KW_INTERSECT - 69)) | (1L << (KW_IS - 69)) | (1L << (KW_ITEM - 69)) | (1L << (KW_LAX - 69)) | (1L << (KW_LE - 69)) | (1L << (KW_LEAST - 69)) | (1L << (KW_LET - 69)) | (1L << (KW_LT - 69)) | (1L << (KW_MAP - 69)) | (1L << (KW_MOD - 69)) | (1L << (KW_MODULE - 69)) | (1L << (KW_NAMESPACE - 69)) | (1L << (KW_NE - 69)) | (1L << (KW_NEXT - 69)) | (1L << (KW_NAMESPACE_NODE - 69)) | (1L << (KW_NO_INHERIT - 69)) | (1L << (KW_NO_PRESERVE - 69)) | (1L << (KW_NODE - 69)) | (1L << (KW_OF - 69)) | (1L << (KW_ONLY - 69)) | (1L << (KW_OPTION - 69)) | (1L << (KW_OR - 69)) | (1L << (KW_ORDER - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (KW_ORDERED - 133)) | (1L << (KW_ORDERING - 133)) | (1L << (KW_PARENT - 133)) | (1L << (KW_PRECEDING - 133)) | (1L << (KW_PRECEDING_SIBLING - 133)) | (1L << (KW_PRESERVE - 133)) | (1L << (KW_PI - 133)) | (1L << (KW_RETURN - 133)) | (1L << (KW_SATISFIES - 133)) | (1L << (KW_SCHEMA - 133)) | (1L << (KW_SCHEMA_ATTR - 133)) | (1L << (KW_SCHEMA_ELEM - 133)) | (1L << (KW_SELF - 133)) | (1L << (KW_SLIDING - 133)) | (1L << (KW_SOME - 133)) | (1L << (KW_STABLE - 133)) | (1L << (KW_START - 133)) | (1L << (KW_STRICT - 133)) | (1L << (KW_STRIP - 133)) | (1L << (KW_SWITCH - 133)) | (1L << (KW_TEXT - 133)) | (1L << (KW_THEN - 133)) | (1L << (KW_TO - 133)) | (1L << (KW_TREAT - 133)) | (1L << (KW_TRY - 133)) | (1L << (KW_TUMBLING - 133)) | (1L << (KW_TYPE - 133)) | (1L << (KW_TYPESWITCH - 133)) | (1L << (KW_UNION - 133)) | (1L << (KW_UNORDERED - 133)) | (1L << (KW_UPDATE - 133)) | (1L << (KW_VALIDATE - 133)) | (1L << (KW_VARIABLE - 133)) | (1L << (KW_VERSION - 133)) | (1L << (KW_WHEN - 133)) | (1L << (KW_WHERE - 133)) | (1L << (KW_WINDOW - 133)) | (1L << (KW_XQUERY - 133)) | (1L << (KW_ARRAY_NODE - 133)) | (1L << (KW_BOOLEAN_NODE - 133)) | (1L << (KW_NULL_NODE - 133)) | (1L << (KW_NUMBER_NODE - 133)) | (1L << (KW_OBJECT_NODE - 133)) | (1L << (KW_REPLACE - 133)) | (1L << (KW_WITH - 133)) | (1L << (KW_VALUE - 133)) | (1L << (KW_INSERT - 133)) | (1L << (KW_INTO - 133)) | (1L << (KW_DELETE - 133)) | (1L << (KW_RENAME - 133)) | (1L << (URIQualifiedName - 133)) | (1L << (FullQName - 133)) | (1L << (NCName - 133)) | (1L << (ENTER_STRING - 133)))) != 0)) {
				{
				setState(1724);
				mapConstructorEntry();
				setState(1729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1725);
					match(COMMA);
					setState(1726);
					mapConstructorEntry();
					}
					}
					setState(1731);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1734);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapConstructorEntryContext extends ParserRuleContext {
		public ExprSingleContext mapKey;
		public ExprSingleContext mapValue;
		public List<ExprSingleContext> exprSingle() {
			return getRuleContexts(ExprSingleContext.class);
		}
		public ExprSingleContext exprSingle(int i) {
			return getRuleContext(ExprSingleContext.class,i);
		}
		public TerminalNode COLON() { return getToken(XQueryParser.COLON, 0); }
		public TerminalNode COLON_EQ() { return getToken(XQueryParser.COLON_EQ, 0); }
		public MapConstructorEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapConstructorEntry; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitMapConstructorEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapConstructorEntryContext mapConstructorEntry() throws RecognitionException {
		MapConstructorEntryContext _localctx = new MapConstructorEntryContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_mapConstructorEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1736);
			((MapConstructorEntryContext)_localctx).mapKey = exprSingle();
			setState(1737);
			_la = _input.LA(1);
			if ( !(_la==COLON || _la==COLON_EQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1738);
			((MapConstructorEntryContext)_localctx).mapValue = exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayConstructorContext extends ParserRuleContext {
		public SquareArrayConstructorContext squareArrayConstructor() {
			return getRuleContext(SquareArrayConstructorContext.class,0);
		}
		public CurlyArrayConstructorContext curlyArrayConstructor() {
			return getRuleContext(CurlyArrayConstructorContext.class,0);
		}
		public ArrayConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitArrayConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayConstructorContext arrayConstructor() throws RecognitionException {
		ArrayConstructorContext _localctx = new ArrayConstructorContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_arrayConstructor);
		try {
			setState(1742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1740);
				squareArrayConstructor();
				}
				break;
			case KW_ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1741);
				curlyArrayConstructor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SquareArrayConstructorContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(XQueryParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(XQueryParser.RBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SquareArrayConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_squareArrayConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitSquareArrayConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SquareArrayConstructorContext squareArrayConstructor() throws RecognitionException {
		SquareArrayConstructorContext _localctx = new SquareArrayConstructorContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_squareArrayConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			match(LBRACKET);
			setState(1746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (IntegerLiteral - 5)) | (1L << (DecimalLiteral - 5)) | (1L << (DoubleLiteral - 5)) | (1L << (DFPropertyName - 5)) | (1L << (Quot - 5)) | (1L << (Apos - 5)) | (1L << (COMMENT - 5)) | (1L << (PI - 5)) | (1L << (PRAGMA - 5)) | (1L << (LPAREN - 5)) | (1L << (LBRACKET - 5)) | (1L << (PLUS - 5)) | (1L << (MINUS - 5)) | (1L << (DOT - 5)) | (1L << (LANGLE - 5)) | (1L << (QUESTION - 5)) | (1L << (DOLLAR - 5)) | (1L << (MOD - 5)) | (1L << (KW_ALLOWING - 5)) | (1L << (KW_ANCESTOR - 5)) | (1L << (KW_ANCESTOR_OR_SELF - 5)) | (1L << (KW_AND - 5)) | (1L << (KW_ARRAY - 5)) | (1L << (KW_AS - 5)) | (1L << (KW_ASCENDING - 5)) | (1L << (KW_AT - 5)) | (1L << (KW_ATTRIBUTE - 5)) | (1L << (KW_BASE_URI - 5)) | (1L << (KW_BOUNDARY_SPACE - 5)) | (1L << (KW_BINARY - 5)) | (1L << (KW_BY - 5)) | (1L << (KW_CASE - 5)) | (1L << (KW_CAST - 5)) | (1L << (KW_CASTABLE - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (KW_CATCH - 69)) | (1L << (KW_CHILD - 69)) | (1L << (KW_COLLATION - 69)) | (1L << (KW_COMMENT - 69)) | (1L << (KW_CONSTRUCTION - 69)) | (1L << (KW_CONTEXT - 69)) | (1L << (KW_COPY_NS - 69)) | (1L << (KW_COUNT - 69)) | (1L << (KW_DECLARE - 69)) | (1L << (KW_DEFAULT - 69)) | (1L << (KW_DESCENDANT - 69)) | (1L << (KW_DESCENDANT_OR_SELF - 69)) | (1L << (KW_DESCENDING - 69)) | (1L << (KW_DECIMAL_FORMAT - 69)) | (1L << (KW_DIV - 69)) | (1L << (KW_DOCUMENT - 69)) | (1L << (KW_DOCUMENT_NODE - 69)) | (1L << (KW_ELEMENT - 69)) | (1L << (KW_ELSE - 69)) | (1L << (KW_EMPTY - 69)) | (1L << (KW_EMPTY_SEQUENCE - 69)) | (1L << (KW_ENCODING - 69)) | (1L << (KW_END - 69)) | (1L << (KW_EQ - 69)) | (1L << (KW_EVERY - 69)) | (1L << (KW_EXCEPT - 69)) | (1L << (KW_EXTERNAL - 69)) | (1L << (KW_FOLLOWING - 69)) | (1L << (KW_FOLLOWING_SIBLING - 69)) | (1L << (KW_FOR - 69)) | (1L << (KW_FUNCTION - 69)) | (1L << (KW_GE - 69)) | (1L << (KW_GREATEST - 69)) | (1L << (KW_GROUP - 69)) | (1L << (KW_GT - 69)) | (1L << (KW_IDIV - 69)) | (1L << (KW_IF - 69)) | (1L << (KW_IMPORT - 69)) | (1L << (KW_IN - 69)) | (1L << (KW_INHERIT - 69)) | (1L << (KW_INSTANCE - 69)) | (1L << (KW_INTERSECT - 69)) | (1L << (KW_IS - 69)) | (1L << (KW_ITEM - 69)) | (1L << (KW_LAX - 69)) | (1L << (KW_LE - 69)) | (1L << (KW_LEAST - 69)) | (1L << (KW_LET - 69)) | (1L << (KW_LT - 69)) | (1L << (KW_MAP - 69)) | (1L << (KW_MOD - 69)) | (1L << (KW_MODULE - 69)) | (1L << (KW_NAMESPACE - 69)) | (1L << (KW_NE - 69)) | (1L << (KW_NEXT - 69)) | (1L << (KW_NAMESPACE_NODE - 69)) | (1L << (KW_NO_INHERIT - 69)) | (1L << (KW_NO_PRESERVE - 69)) | (1L << (KW_NODE - 69)) | (1L << (KW_OF - 69)) | (1L << (KW_ONLY - 69)) | (1L << (KW_OPTION - 69)) | (1L << (KW_OR - 69)) | (1L << (KW_ORDER - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (KW_ORDERED - 133)) | (1L << (KW_ORDERING - 133)) | (1L << (KW_PARENT - 133)) | (1L << (KW_PRECEDING - 133)) | (1L << (KW_PRECEDING_SIBLING - 133)) | (1L << (KW_PRESERVE - 133)) | (1L << (KW_PI - 133)) | (1L << (KW_RETURN - 133)) | (1L << (KW_SATISFIES - 133)) | (1L << (KW_SCHEMA - 133)) | (1L << (KW_SCHEMA_ATTR - 133)) | (1L << (KW_SCHEMA_ELEM - 133)) | (1L << (KW_SELF - 133)) | (1L << (KW_SLIDING - 133)) | (1L << (KW_SOME - 133)) | (1L << (KW_STABLE - 133)) | (1L << (KW_START - 133)) | (1L << (KW_STRICT - 133)) | (1L << (KW_STRIP - 133)) | (1L << (KW_SWITCH - 133)) | (1L << (KW_TEXT - 133)) | (1L << (KW_THEN - 133)) | (1L << (KW_TO - 133)) | (1L << (KW_TREAT - 133)) | (1L << (KW_TRY - 133)) | (1L << (KW_TUMBLING - 133)) | (1L << (KW_TYPE - 133)) | (1L << (KW_TYPESWITCH - 133)) | (1L << (KW_UNION - 133)) | (1L << (KW_UNORDERED - 133)) | (1L << (KW_UPDATE - 133)) | (1L << (KW_VALIDATE - 133)) | (1L << (KW_VARIABLE - 133)) | (1L << (KW_VERSION - 133)) | (1L << (KW_WHEN - 133)) | (1L << (KW_WHERE - 133)) | (1L << (KW_WINDOW - 133)) | (1L << (KW_XQUERY - 133)) | (1L << (KW_ARRAY_NODE - 133)) | (1L << (KW_BOOLEAN_NODE - 133)) | (1L << (KW_NULL_NODE - 133)) | (1L << (KW_NUMBER_NODE - 133)) | (1L << (KW_OBJECT_NODE - 133)) | (1L << (KW_REPLACE - 133)) | (1L << (KW_WITH - 133)) | (1L << (KW_VALUE - 133)) | (1L << (KW_INSERT - 133)) | (1L << (KW_INTO - 133)) | (1L << (KW_DELETE - 133)) | (1L << (KW_RENAME - 133)) | (1L << (URIQualifiedName - 133)) | (1L << (FullQName - 133)) | (1L << (NCName - 133)) | (1L << (ENTER_STRING - 133)))) != 0)) {
				{
				setState(1745);
				expr();
				}
			}

			setState(1748);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CurlyArrayConstructorContext extends ParserRuleContext {
		public TerminalNode KW_ARRAY() { return getToken(XQueryParser.KW_ARRAY, 0); }
		public EnclosedExpressionContext enclosedExpression() {
			return getRuleContext(EnclosedExpressionContext.class,0);
		}
		public CurlyArrayConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curlyArrayConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCurlyArrayConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CurlyArrayConstructorContext curlyArrayConstructor() throws RecognitionException {
		CurlyArrayConstructorContext _localctx = new CurlyArrayConstructorContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_curlyArrayConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1750);
			match(KW_ARRAY);
			setState(1751);
			enclosedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringConstructorContext extends ParserRuleContext {
		public TerminalNode ENTER_STRING() { return getToken(XQueryParser.ENTER_STRING, 0); }
		public StringConstructorContentContext stringConstructorContent() {
			return getRuleContext(StringConstructorContentContext.class,0);
		}
		public TerminalNode EXIT_STRING() { return getToken(XQueryParser.EXIT_STRING, 0); }
		public StringConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitStringConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConstructorContext stringConstructor() throws RecognitionException {
		StringConstructorContext _localctx = new StringConstructorContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_stringConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1753);
			match(ENTER_STRING);
			setState(1754);
			stringConstructorContent();
			setState(1755);
			match(EXIT_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringConstructorContentContext extends ParserRuleContext {
		public List<StringConstructorCharsContext> stringConstructorChars() {
			return getRuleContexts(StringConstructorCharsContext.class);
		}
		public StringConstructorCharsContext stringConstructorChars(int i) {
			return getRuleContext(StringConstructorCharsContext.class,i);
		}
		public List<StringConstructorInterpolationContext> stringConstructorInterpolation() {
			return getRuleContexts(StringConstructorInterpolationContext.class);
		}
		public StringConstructorInterpolationContext stringConstructorInterpolation(int i) {
			return getRuleContext(StringConstructorInterpolationContext.class,i);
		}
		public StringConstructorContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstructorContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitStringConstructorContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConstructorContentContext stringConstructorContent() throws RecognitionException {
		StringConstructorContentContext _localctx = new StringConstructorContentContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_stringConstructorContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1757);
			stringConstructorChars();
			setState(1763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENTER_INTERPOLATION) {
				{
				{
				setState(1758);
				stringConstructorInterpolation();
				setState(1759);
				stringConstructorChars();
				}
				}
				setState(1765);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharNoGraveContext extends ParserRuleContext {
		public TerminalNode BASIC_CHAR() { return getToken(XQueryParser.BASIC_CHAR, 0); }
		public TerminalNode LBRACE() { return getToken(XQueryParser.LBRACE, 0); }
		public TerminalNode RBRACKET() { return getToken(XQueryParser.RBRACKET, 0); }
		public CharNoGraveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charNoGrave; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCharNoGrave(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharNoGraveContext charNoGrave() throws RecognitionException {
		CharNoGraveContext _localctx = new CharNoGraveContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_charNoGrave);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			_la = _input.LA(1);
			if ( !(_la==RBRACKET || _la==LBRACE || _la==BASIC_CHAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharNoLBraceContext extends ParserRuleContext {
		public TerminalNode BASIC_CHAR() { return getToken(XQueryParser.BASIC_CHAR, 0); }
		public TerminalNode GRAVE() { return getToken(XQueryParser.GRAVE, 0); }
		public TerminalNode RBRACKET() { return getToken(XQueryParser.RBRACKET, 0); }
		public CharNoLBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charNoLBrace; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCharNoLBrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharNoLBraceContext charNoLBrace() throws RecognitionException {
		CharNoLBraceContext _localctx = new CharNoLBraceContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_charNoLBrace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768);
			_la = _input.LA(1);
			if ( !(_la==RBRACKET || _la==GRAVE || _la==BASIC_CHAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharNoRBrackContext extends ParserRuleContext {
		public TerminalNode BASIC_CHAR() { return getToken(XQueryParser.BASIC_CHAR, 0); }
		public TerminalNode GRAVE() { return getToken(XQueryParser.GRAVE, 0); }
		public TerminalNode LBRACE() { return getToken(XQueryParser.LBRACE, 0); }
		public CharNoRBrackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charNoRBrack; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCharNoRBrack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharNoRBrackContext charNoRBrack() throws RecognitionException {
		CharNoRBrackContext _localctx = new CharNoRBrackContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_charNoRBrack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1770);
			_la = _input.LA(1);
			if ( !(_la==LBRACE || _la==GRAVE || _la==BASIC_CHAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringConstructorCharsContext extends ParserRuleContext {
		public List<TerminalNode> BASIC_CHAR() { return getTokens(XQueryParser.BASIC_CHAR); }
		public TerminalNode BASIC_CHAR(int i) {
			return getToken(XQueryParser.BASIC_CHAR, i);
		}
		public List<CharNoGraveContext> charNoGrave() {
			return getRuleContexts(CharNoGraveContext.class);
		}
		public CharNoGraveContext charNoGrave(int i) {
			return getRuleContext(CharNoGraveContext.class,i);
		}
		public List<CharNoLBraceContext> charNoLBrace() {
			return getRuleContexts(CharNoLBraceContext.class);
		}
		public CharNoLBraceContext charNoLBrace(int i) {
			return getRuleContext(CharNoLBraceContext.class,i);
		}
		public List<CharNoRBrackContext> charNoRBrack() {
			return getRuleContexts(CharNoRBrackContext.class);
		}
		public CharNoRBrackContext charNoRBrack(int i) {
			return getRuleContext(CharNoRBrackContext.class,i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(XQueryParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(XQueryParser.LBRACE, i);
		}
		public StringConstructorCharsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstructorChars; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitStringConstructorChars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConstructorCharsContext stringConstructorChars() throws RecognitionException {
		StringConstructorCharsContext _localctx = new StringConstructorCharsContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_stringConstructorChars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RBRACKET) | (1L << LBRACE) | (1L << GRAVE))) != 0) || _la==BASIC_CHAR) {
				{
				setState(1782);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1772);
					match(BASIC_CHAR);
					}
					break;
				case 2:
					{
					setState(1773);
					charNoGrave();
					setState(1774);
					charNoLBrace();
					}
					break;
				case 3:
					{
					setState(1776);
					charNoRBrack();
					setState(1777);
					charNoGrave();
					setState(1778);
					charNoGrave();
					}
					break;
				case 4:
					{
					setState(1780);
					charNoGrave();
					}
					break;
				case 5:
					{
					setState(1781);
					match(LBRACE);
					}
					break;
				}
				}
				setState(1786);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringConstructorInterpolationContext extends ParserRuleContext {
		public TerminalNode ENTER_INTERPOLATION() { return getToken(XQueryParser.ENTER_INTERPOLATION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EXIT_INTERPOLATION() { return getToken(XQueryParser.EXIT_INTERPOLATION, 0); }
		public StringConstructorInterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstructorInterpolation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitStringConstructorInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConstructorInterpolationContext stringConstructorInterpolation() throws RecognitionException {
		StringConstructorInterpolationContext _localctx = new StringConstructorInterpolationContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_stringConstructorInterpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			match(ENTER_INTERPOLATION);
			setState(1788);
			expr();
			setState(1789);
			match(EXIT_INTERPOLATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryLookupContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(XQueryParser.QUESTION, 0); }
		public KeySpecifierContext keySpecifier() {
			return getRuleContext(KeySpecifierContext.class,0);
		}
		public UnaryLookupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryLookup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitUnaryLookup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryLookupContext unaryLookup() throws RecognitionException {
		UnaryLookupContext _localctx = new UnaryLookupContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_unaryLookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1791);
			match(QUESTION);
			setState(1792);
			keySpecifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTypeContext extends ParserRuleContext {
		public SimpleTypeNameContext item;
		public Token QUESTION;
		public List<Token> question = new ArrayList<Token>();
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(XQueryParser.QUESTION, 0); }
		public SingleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitSingleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTypeContext singleType() throws RecognitionException {
		SingleTypeContext _localctx = new SingleTypeContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_singleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1794);
			((SingleTypeContext)_localctx).item = simpleTypeName();
			setState(1796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1795);
				((SingleTypeContext)_localctx).QUESTION = match(QUESTION);
				((SingleTypeContext)_localctx).question.add(((SingleTypeContext)_localctx).QUESTION);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TerminalNode KW_AS() { return getToken(XQueryParser.KW_AS, 0); }
		public SequenceTypeContext sequenceType() {
			return getRuleContext(SequenceTypeContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1798);
			match(KW_AS);
			setState(1799);
			sequenceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceTypeContext extends ParserRuleContext {
		public ItemTypeContext item;
		public Token QUESTION;
		public List<Token> question = new ArrayList<Token>();
		public Token STAR;
		public List<Token> star = new ArrayList<Token>();
		public Token PLUS;
		public List<Token> plus = new ArrayList<Token>();
		public TerminalNode KW_EMPTY_SEQUENCE() { return getToken(XQueryParser.KW_EMPTY_SEQUENCE, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public ItemTypeContext itemType() {
			return getRuleContext(ItemTypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(XQueryParser.QUESTION, 0); }
		public TerminalNode STAR() { return getToken(XQueryParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(XQueryParser.PLUS, 0); }
		public SequenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitSequenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceTypeContext sequenceType() throws RecognitionException {
		SequenceTypeContext _localctx = new SequenceTypeContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_sequenceType);
		try {
			setState(1810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1801);
				match(KW_EMPTY_SEQUENCE);
				setState(1802);
				match(LPAREN);
				setState(1803);
				match(RPAREN);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1804);
				((SequenceTypeContext)_localctx).item = itemType();
				setState(1808);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1805);
					((SequenceTypeContext)_localctx).QUESTION = match(QUESTION);
					((SequenceTypeContext)_localctx).question.add(((SequenceTypeContext)_localctx).QUESTION);
					}
					break;
				case 2:
					{
					setState(1806);
					((SequenceTypeContext)_localctx).STAR = match(STAR);
					((SequenceTypeContext)_localctx).star.add(((SequenceTypeContext)_localctx).STAR);
					}
					break;
				case 3:
					{
					setState(1807);
					((SequenceTypeContext)_localctx).PLUS = match(PLUS);
					((SequenceTypeContext)_localctx).plus.add(((SequenceTypeContext)_localctx).PLUS);
					}
					break;
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemTypeContext extends ParserRuleContext {
		public KindTestContext kindTest() {
			return getRuleContext(KindTestContext.class,0);
		}
		public TerminalNode KW_ITEM() { return getToken(XQueryParser.KW_ITEM, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public FunctionTestContext functionTest() {
			return getRuleContext(FunctionTestContext.class,0);
		}
		public MapTestContext mapTest() {
			return getRuleContext(MapTestContext.class,0);
		}
		public ArrayTestContext arrayTest() {
			return getRuleContext(ArrayTestContext.class,0);
		}
		public AtomicOrUnionTypeContext atomicOrUnionType() {
			return getRuleContext(AtomicOrUnionTypeContext.class,0);
		}
		public ParenthesizedItemTestContext parenthesizedItemTest() {
			return getRuleContext(ParenthesizedItemTestContext.class,0);
		}
		public ItemTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitItemType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemTypeContext itemType() throws RecognitionException {
		ItemTypeContext _localctx = new ItemTypeContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_itemType);
		try {
			setState(1821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1812);
				kindTest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1813);
				match(KW_ITEM);
				setState(1814);
				match(LPAREN);
				setState(1815);
				match(RPAREN);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1816);
				functionTest();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1817);
				mapTest();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1818);
				arrayTest();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1819);
				atomicOrUnionType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1820);
				parenthesizedItemTest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicOrUnionTypeContext extends ParserRuleContext {
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public AtomicOrUnionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicOrUnionType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAtomicOrUnionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicOrUnionTypeContext atomicOrUnionType() throws RecognitionException {
		AtomicOrUnionTypeContext _localctx = new AtomicOrUnionTypeContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_atomicOrUnionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1823);
			eqName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KindTestContext extends ParserRuleContext {
		public DocumentTestContext documentTest() {
			return getRuleContext(DocumentTestContext.class,0);
		}
		public ElementTestContext elementTest() {
			return getRuleContext(ElementTestContext.class,0);
		}
		public AttributeTestContext attributeTest() {
			return getRuleContext(AttributeTestContext.class,0);
		}
		public SchemaElementTestContext schemaElementTest() {
			return getRuleContext(SchemaElementTestContext.class,0);
		}
		public SchemaAttributeTestContext schemaAttributeTest() {
			return getRuleContext(SchemaAttributeTestContext.class,0);
		}
		public PiTestContext piTest() {
			return getRuleContext(PiTestContext.class,0);
		}
		public CommentTestContext commentTest() {
			return getRuleContext(CommentTestContext.class,0);
		}
		public TextTestContext textTest() {
			return getRuleContext(TextTestContext.class,0);
		}
		public NamespaceNodeTestContext namespaceNodeTest() {
			return getRuleContext(NamespaceNodeTestContext.class,0);
		}
		public MlNodeTestContext mlNodeTest() {
			return getRuleContext(MlNodeTestContext.class,0);
		}
		public BinaryNodeTestContext binaryNodeTest() {
			return getRuleContext(BinaryNodeTestContext.class,0);
		}
		public AnyKindTestContext anyKindTest() {
			return getRuleContext(AnyKindTestContext.class,0);
		}
		public KindTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kindTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitKindTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KindTestContext kindTest() throws RecognitionException {
		KindTestContext _localctx = new KindTestContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_kindTest);
		try {
			setState(1837);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_DOCUMENT_NODE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1825);
				documentTest();
				}
				break;
			case KW_ELEMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1826);
				elementTest();
				}
				break;
			case KW_ATTRIBUTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1827);
				attributeTest();
				}
				break;
			case KW_SCHEMA_ELEM:
				enterOuterAlt(_localctx, 4);
				{
				setState(1828);
				schemaElementTest();
				}
				break;
			case KW_SCHEMA_ATTR:
				enterOuterAlt(_localctx, 5);
				{
				setState(1829);
				schemaAttributeTest();
				}
				break;
			case KW_PI:
				enterOuterAlt(_localctx, 6);
				{
				setState(1830);
				piTest();
				}
				break;
			case KW_COMMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1831);
				commentTest();
				}
				break;
			case KW_TEXT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1832);
				textTest();
				}
				break;
			case KW_NAMESPACE_NODE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1833);
				namespaceNodeTest();
				}
				break;
			case KW_ARRAY_NODE:
			case KW_BOOLEAN_NODE:
			case KW_NULL_NODE:
			case KW_NUMBER_NODE:
			case KW_OBJECT_NODE:
				enterOuterAlt(_localctx, 10);
				{
				setState(1834);
				mlNodeTest();
				}
				break;
			case KW_BINARY:
				enterOuterAlt(_localctx, 11);
				{
				setState(1835);
				binaryNodeTest();
				}
				break;
			case KW_NODE:
				enterOuterAlt(_localctx, 12);
				{
				setState(1836);
				anyKindTest();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyKindTestContext extends ParserRuleContext {
		public TerminalNode KW_NODE() { return getToken(XQueryParser.KW_NODE, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public TerminalNode STAR() { return getToken(XQueryParser.STAR, 0); }
		public AnyKindTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyKindTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAnyKindTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyKindTestContext anyKindTest() throws RecognitionException {
		AnyKindTestContext _localctx = new AnyKindTestContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_anyKindTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1839);
			match(KW_NODE);
			setState(1840);
			match(LPAREN);
			setState(1842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(1841);
				match(STAR);
				}
			}

			setState(1844);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryNodeTestContext extends ParserRuleContext {
		public TerminalNode KW_BINARY() { return getToken(XQueryParser.KW_BINARY, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public BinaryNodeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryNodeTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitBinaryNodeTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryNodeTestContext binaryNodeTest() throws RecognitionException {
		BinaryNodeTestContext _localctx = new BinaryNodeTestContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_binaryNodeTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1846);
			match(KW_BINARY);
			setState(1847);
			match(LPAREN);
			setState(1848);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DocumentTestContext extends ParserRuleContext {
		public TerminalNode KW_DOCUMENT_NODE() { return getToken(XQueryParser.KW_DOCUMENT_NODE, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public ElementTestContext elementTest() {
			return getRuleContext(ElementTestContext.class,0);
		}
		public SchemaElementTestContext schemaElementTest() {
			return getRuleContext(SchemaElementTestContext.class,0);
		}
		public DocumentTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_documentTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitDocumentTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentTestContext documentTest() throws RecognitionException {
		DocumentTestContext _localctx = new DocumentTestContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_documentTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
			match(KW_DOCUMENT_NODE);
			setState(1851);
			match(LPAREN);
			setState(1854);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ELEMENT:
				{
				setState(1852);
				elementTest();
				}
				break;
			case KW_SCHEMA_ELEM:
				{
				setState(1853);
				schemaElementTest();
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(1856);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextTestContext extends ParserRuleContext {
		public TerminalNode KW_TEXT() { return getToken(XQueryParser.KW_TEXT, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public TextTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitTextTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextTestContext textTest() throws RecognitionException {
		TextTestContext _localctx = new TextTestContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_textTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1858);
			match(KW_TEXT);
			setState(1859);
			match(LPAREN);
			setState(1860);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentTestContext extends ParserRuleContext {
		public TerminalNode KW_COMMENT() { return getToken(XQueryParser.KW_COMMENT, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public CommentTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitCommentTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentTestContext commentTest() throws RecognitionException {
		CommentTestContext _localctx = new CommentTestContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_commentTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1862);
			match(KW_COMMENT);
			setState(1863);
			match(LPAREN);
			setState(1864);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceNodeTestContext extends ParserRuleContext {
		public TerminalNode KW_NAMESPACE_NODE() { return getToken(XQueryParser.KW_NAMESPACE_NODE, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public NamespaceNodeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceNodeTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitNamespaceNodeTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceNodeTestContext namespaceNodeTest() throws RecognitionException {
		NamespaceNodeTestContext _localctx = new NamespaceNodeTestContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_namespaceNodeTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			match(KW_NAMESPACE_NODE);
			setState(1867);
			match(LPAREN);
			setState(1868);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PiTestContext extends ParserRuleContext {
		public TerminalNode KW_PI() { return getToken(XQueryParser.KW_PI, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public NcNameContext ncName() {
			return getRuleContext(NcNameContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public PiTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_piTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitPiTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PiTestContext piTest() throws RecognitionException {
		PiTestContext _localctx = new PiTestContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_piTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1870);
			match(KW_PI);
			setState(1871);
			match(LPAREN);
			setState(1874);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DFPropertyName:
			case KW_ALLOWING:
			case KW_ANCESTOR:
			case KW_ANCESTOR_OR_SELF:
			case KW_AND:
			case KW_ARRAY:
			case KW_AS:
			case KW_ASCENDING:
			case KW_AT:
			case KW_ATTRIBUTE:
			case KW_BASE_URI:
			case KW_BOUNDARY_SPACE:
			case KW_BINARY:
			case KW_BY:
			case KW_CASE:
			case KW_CAST:
			case KW_CASTABLE:
			case KW_CATCH:
			case KW_CHILD:
			case KW_COLLATION:
			case KW_COMMENT:
			case KW_CONSTRUCTION:
			case KW_CONTEXT:
			case KW_COPY_NS:
			case KW_COUNT:
			case KW_DECLARE:
			case KW_DEFAULT:
			case KW_DESCENDANT:
			case KW_DESCENDANT_OR_SELF:
			case KW_DESCENDING:
			case KW_DECIMAL_FORMAT:
			case KW_DIV:
			case KW_DOCUMENT:
			case KW_DOCUMENT_NODE:
			case KW_ELEMENT:
			case KW_ELSE:
			case KW_EMPTY:
			case KW_EMPTY_SEQUENCE:
			case KW_ENCODING:
			case KW_END:
			case KW_EQ:
			case KW_EVERY:
			case KW_EXCEPT:
			case KW_EXTERNAL:
			case KW_FOLLOWING:
			case KW_FOLLOWING_SIBLING:
			case KW_FOR:
			case KW_FUNCTION:
			case KW_GE:
			case KW_GREATEST:
			case KW_GROUP:
			case KW_GT:
			case KW_IDIV:
			case KW_IF:
			case KW_IMPORT:
			case KW_IN:
			case KW_INHERIT:
			case KW_INSTANCE:
			case KW_INTERSECT:
			case KW_IS:
			case KW_ITEM:
			case KW_LAX:
			case KW_LE:
			case KW_LEAST:
			case KW_LET:
			case KW_LT:
			case KW_MAP:
			case KW_MOD:
			case KW_MODULE:
			case KW_NAMESPACE:
			case KW_NE:
			case KW_NEXT:
			case KW_NAMESPACE_NODE:
			case KW_NO_INHERIT:
			case KW_NO_PRESERVE:
			case KW_NODE:
			case KW_OF:
			case KW_ONLY:
			case KW_OPTION:
			case KW_OR:
			case KW_ORDER:
			case KW_ORDERED:
			case KW_ORDERING:
			case KW_PARENT:
			case KW_PRECEDING:
			case KW_PRECEDING_SIBLING:
			case KW_PRESERVE:
			case KW_PI:
			case KW_RETURN:
			case KW_SATISFIES:
			case KW_SCHEMA:
			case KW_SCHEMA_ATTR:
			case KW_SCHEMA_ELEM:
			case KW_SELF:
			case KW_SLIDING:
			case KW_SOME:
			case KW_STABLE:
			case KW_START:
			case KW_STRICT:
			case KW_STRIP:
			case KW_SWITCH:
			case KW_TEXT:
			case KW_THEN:
			case KW_TO:
			case KW_TREAT:
			case KW_TRY:
			case KW_TUMBLING:
			case KW_TYPE:
			case KW_TYPESWITCH:
			case KW_UNION:
			case KW_UNORDERED:
			case KW_UPDATE:
			case KW_VALIDATE:
			case KW_VARIABLE:
			case KW_VERSION:
			case KW_WHEN:
			case KW_WHERE:
			case KW_WINDOW:
			case KW_XQUERY:
			case KW_ARRAY_NODE:
			case KW_BOOLEAN_NODE:
			case KW_NULL_NODE:
			case KW_NUMBER_NODE:
			case KW_OBJECT_NODE:
			case KW_REPLACE:
			case KW_WITH:
			case KW_VALUE:
			case KW_INSERT:
			case KW_INTO:
			case KW_DELETE:
			case KW_RENAME:
			case NCName:
				{
				setState(1872);
				ncName();
				}
				break;
			case Quot:
			case Apos:
				{
				setState(1873);
				stringLiteral();
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(1876);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeTestContext extends ParserRuleContext {
		public TypeNameContext type;
		public TerminalNode KW_ATTRIBUTE() { return getToken(XQueryParser.KW_ATTRIBUTE, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public AttributeNameOrWildcardContext attributeNameOrWildcard() {
			return getRuleContext(AttributeNameOrWildcardContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(XQueryParser.COMMA, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public AttributeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAttributeTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeTestContext attributeTest() throws RecognitionException {
		AttributeTestContext _localctx = new AttributeTestContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_attributeTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1878);
			match(KW_ATTRIBUTE);
			setState(1879);
			match(LPAREN);
			setState(1885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DFPropertyName) | (1L << STAR) | (1L << KW_ALLOWING) | (1L << KW_ANCESTOR) | (1L << KW_ANCESTOR_OR_SELF) | (1L << KW_AND) | (1L << KW_ARRAY) | (1L << KW_AS) | (1L << KW_ASCENDING) | (1L << KW_AT) | (1L << KW_ATTRIBUTE) | (1L << KW_BASE_URI) | (1L << KW_BOUNDARY_SPACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_BINARY - 64)) | (1L << (KW_BY - 64)) | (1L << (KW_CASE - 64)) | (1L << (KW_CAST - 64)) | (1L << (KW_CASTABLE - 64)) | (1L << (KW_CATCH - 64)) | (1L << (KW_CHILD - 64)) | (1L << (KW_COLLATION - 64)) | (1L << (KW_COMMENT - 64)) | (1L << (KW_CONSTRUCTION - 64)) | (1L << (KW_CONTEXT - 64)) | (1L << (KW_COPY_NS - 64)) | (1L << (KW_COUNT - 64)) | (1L << (KW_DECLARE - 64)) | (1L << (KW_DEFAULT - 64)) | (1L << (KW_DESCENDANT - 64)) | (1L << (KW_DESCENDANT_OR_SELF - 64)) | (1L << (KW_DESCENDING - 64)) | (1L << (KW_DECIMAL_FORMAT - 64)) | (1L << (KW_DIV - 64)) | (1L << (KW_DOCUMENT - 64)) | (1L << (KW_DOCUMENT_NODE - 64)) | (1L << (KW_ELEMENT - 64)) | (1L << (KW_ELSE - 64)) | (1L << (KW_EMPTY - 64)) | (1L << (KW_EMPTY_SEQUENCE - 64)) | (1L << (KW_ENCODING - 64)) | (1L << (KW_END - 64)) | (1L << (KW_EQ - 64)) | (1L << (KW_EVERY - 64)) | (1L << (KW_EXCEPT - 64)) | (1L << (KW_EXTERNAL - 64)) | (1L << (KW_FOLLOWING - 64)) | (1L << (KW_FOLLOWING_SIBLING - 64)) | (1L << (KW_FOR - 64)) | (1L << (KW_FUNCTION - 64)) | (1L << (KW_GE - 64)) | (1L << (KW_GREATEST - 64)) | (1L << (KW_GROUP - 64)) | (1L << (KW_GT - 64)) | (1L << (KW_IDIV - 64)) | (1L << (KW_IF - 64)) | (1L << (KW_IMPORT - 64)) | (1L << (KW_IN - 64)) | (1L << (KW_INHERIT - 64)) | (1L << (KW_INSTANCE - 64)) | (1L << (KW_INTERSECT - 64)) | (1L << (KW_IS - 64)) | (1L << (KW_ITEM - 64)) | (1L << (KW_LAX - 64)) | (1L << (KW_LE - 64)) | (1L << (KW_LEAST - 64)) | (1L << (KW_LET - 64)) | (1L << (KW_LT - 64)) | (1L << (KW_MAP - 64)) | (1L << (KW_MOD - 64)) | (1L << (KW_MODULE - 64)) | (1L << (KW_NAMESPACE - 64)) | (1L << (KW_NE - 64)) | (1L << (KW_NEXT - 64)) | (1L << (KW_NAMESPACE_NODE - 64)) | (1L << (KW_NO_INHERIT - 64)) | (1L << (KW_NO_PRESERVE - 64)) | (1L << (KW_NODE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (KW_OF - 128)) | (1L << (KW_ONLY - 128)) | (1L << (KW_OPTION - 128)) | (1L << (KW_OR - 128)) | (1L << (KW_ORDER - 128)) | (1L << (KW_ORDERED - 128)) | (1L << (KW_ORDERING - 128)) | (1L << (KW_PARENT - 128)) | (1L << (KW_PRECEDING - 128)) | (1L << (KW_PRECEDING_SIBLING - 128)) | (1L << (KW_PRESERVE - 128)) | (1L << (KW_PI - 128)) | (1L << (KW_RETURN - 128)) | (1L << (KW_SATISFIES - 128)) | (1L << (KW_SCHEMA - 128)) | (1L << (KW_SCHEMA_ATTR - 128)) | (1L << (KW_SCHEMA_ELEM - 128)) | (1L << (KW_SELF - 128)) | (1L << (KW_SLIDING - 128)) | (1L << (KW_SOME - 128)) | (1L << (KW_STABLE - 128)) | (1L << (KW_START - 128)) | (1L << (KW_STRICT - 128)) | (1L << (KW_STRIP - 128)) | (1L << (KW_SWITCH - 128)) | (1L << (KW_TEXT - 128)) | (1L << (KW_THEN - 128)) | (1L << (KW_TO - 128)) | (1L << (KW_TREAT - 128)) | (1L << (KW_TRY - 128)) | (1L << (KW_TUMBLING - 128)) | (1L << (KW_TYPE - 128)) | (1L << (KW_TYPESWITCH - 128)) | (1L << (KW_UNION - 128)) | (1L << (KW_UNORDERED - 128)) | (1L << (KW_UPDATE - 128)) | (1L << (KW_VALIDATE - 128)) | (1L << (KW_VARIABLE - 128)) | (1L << (KW_VERSION - 128)) | (1L << (KW_WHEN - 128)) | (1L << (KW_WHERE - 128)) | (1L << (KW_WINDOW - 128)) | (1L << (KW_XQUERY - 128)) | (1L << (KW_ARRAY_NODE - 128)) | (1L << (KW_BOOLEAN_NODE - 128)) | (1L << (KW_NULL_NODE - 128)) | (1L << (KW_NUMBER_NODE - 128)) | (1L << (KW_OBJECT_NODE - 128)) | (1L << (KW_REPLACE - 128)) | (1L << (KW_WITH - 128)) | (1L << (KW_VALUE - 128)) | (1L << (KW_INSERT - 128)) | (1L << (KW_INTO - 128)) | (1L << (KW_DELETE - 128)) | (1L << (KW_RENAME - 128)) | (1L << (URIQualifiedName - 128)) | (1L << (FullQName - 128)) | (1L << (NCName - 128)))) != 0)) {
				{
				setState(1880);
				attributeNameOrWildcard();
				setState(1883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1881);
					match(COMMA);
					setState(1882);
					((AttributeTestContext)_localctx).type = typeName();
					}
				}

				}
			}

			setState(1887);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeNameOrWildcardContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode STAR() { return getToken(XQueryParser.STAR, 0); }
		public AttributeNameOrWildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeNameOrWildcard; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAttributeNameOrWildcard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameOrWildcardContext attributeNameOrWildcard() throws RecognitionException {
		AttributeNameOrWildcardContext _localctx = new AttributeNameOrWildcardContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_attributeNameOrWildcard);
		try {
			setState(1891);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DFPropertyName:
			case KW_ALLOWING:
			case KW_ANCESTOR:
			case KW_ANCESTOR_OR_SELF:
			case KW_AND:
			case KW_ARRAY:
			case KW_AS:
			case KW_ASCENDING:
			case KW_AT:
			case KW_ATTRIBUTE:
			case KW_BASE_URI:
			case KW_BOUNDARY_SPACE:
			case KW_BINARY:
			case KW_BY:
			case KW_CASE:
			case KW_CAST:
			case KW_CASTABLE:
			case KW_CATCH:
			case KW_CHILD:
			case KW_COLLATION:
			case KW_COMMENT:
			case KW_CONSTRUCTION:
			case KW_CONTEXT:
			case KW_COPY_NS:
			case KW_COUNT:
			case KW_DECLARE:
			case KW_DEFAULT:
			case KW_DESCENDANT:
			case KW_DESCENDANT_OR_SELF:
			case KW_DESCENDING:
			case KW_DECIMAL_FORMAT:
			case KW_DIV:
			case KW_DOCUMENT:
			case KW_DOCUMENT_NODE:
			case KW_ELEMENT:
			case KW_ELSE:
			case KW_EMPTY:
			case KW_EMPTY_SEQUENCE:
			case KW_ENCODING:
			case KW_END:
			case KW_EQ:
			case KW_EVERY:
			case KW_EXCEPT:
			case KW_EXTERNAL:
			case KW_FOLLOWING:
			case KW_FOLLOWING_SIBLING:
			case KW_FOR:
			case KW_FUNCTION:
			case KW_GE:
			case KW_GREATEST:
			case KW_GROUP:
			case KW_GT:
			case KW_IDIV:
			case KW_IF:
			case KW_IMPORT:
			case KW_IN:
			case KW_INHERIT:
			case KW_INSTANCE:
			case KW_INTERSECT:
			case KW_IS:
			case KW_ITEM:
			case KW_LAX:
			case KW_LE:
			case KW_LEAST:
			case KW_LET:
			case KW_LT:
			case KW_MAP:
			case KW_MOD:
			case KW_MODULE:
			case KW_NAMESPACE:
			case KW_NE:
			case KW_NEXT:
			case KW_NAMESPACE_NODE:
			case KW_NO_INHERIT:
			case KW_NO_PRESERVE:
			case KW_NODE:
			case KW_OF:
			case KW_ONLY:
			case KW_OPTION:
			case KW_OR:
			case KW_ORDER:
			case KW_ORDERED:
			case KW_ORDERING:
			case KW_PARENT:
			case KW_PRECEDING:
			case KW_PRECEDING_SIBLING:
			case KW_PRESERVE:
			case KW_PI:
			case KW_RETURN:
			case KW_SATISFIES:
			case KW_SCHEMA:
			case KW_SCHEMA_ATTR:
			case KW_SCHEMA_ELEM:
			case KW_SELF:
			case KW_SLIDING:
			case KW_SOME:
			case KW_STABLE:
			case KW_START:
			case KW_STRICT:
			case KW_STRIP:
			case KW_SWITCH:
			case KW_TEXT:
			case KW_THEN:
			case KW_TO:
			case KW_TREAT:
			case KW_TRY:
			case KW_TUMBLING:
			case KW_TYPE:
			case KW_TYPESWITCH:
			case KW_UNION:
			case KW_UNORDERED:
			case KW_UPDATE:
			case KW_VALIDATE:
			case KW_VARIABLE:
			case KW_VERSION:
			case KW_WHEN:
			case KW_WHERE:
			case KW_WINDOW:
			case KW_XQUERY:
			case KW_ARRAY_NODE:
			case KW_BOOLEAN_NODE:
			case KW_NULL_NODE:
			case KW_NUMBER_NODE:
			case KW_OBJECT_NODE:
			case KW_REPLACE:
			case KW_WITH:
			case KW_VALUE:
			case KW_INSERT:
			case KW_INTO:
			case KW_DELETE:
			case KW_RENAME:
			case URIQualifiedName:
			case FullQName:
			case NCName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1889);
				attributeName();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1890);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaAttributeTestContext extends ParserRuleContext {
		public TerminalNode KW_SCHEMA_ATTR() { return getToken(XQueryParser.KW_SCHEMA_ATTR, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public AttributeDeclarationContext attributeDeclaration() {
			return getRuleContext(AttributeDeclarationContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public SchemaAttributeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaAttributeTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitSchemaAttributeTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaAttributeTestContext schemaAttributeTest() throws RecognitionException {
		SchemaAttributeTestContext _localctx = new SchemaAttributeTestContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_schemaAttributeTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1893);
			match(KW_SCHEMA_ATTR);
			setState(1894);
			match(LPAREN);
			setState(1895);
			attributeDeclaration();
			setState(1896);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementTestContext extends ParserRuleContext {
		public Token optional;
		public TerminalNode KW_ELEMENT() { return getToken(XQueryParser.KW_ELEMENT, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public ElementNameOrWildcardContext elementNameOrWildcard() {
			return getRuleContext(ElementNameOrWildcardContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(XQueryParser.COMMA, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(XQueryParser.QUESTION, 0); }
		public ElementTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitElementTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementTestContext elementTest() throws RecognitionException {
		ElementTestContext _localctx = new ElementTestContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_elementTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1898);
			match(KW_ELEMENT);
			setState(1899);
			match(LPAREN);
			setState(1908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DFPropertyName) | (1L << STAR) | (1L << KW_ALLOWING) | (1L << KW_ANCESTOR) | (1L << KW_ANCESTOR_OR_SELF) | (1L << KW_AND) | (1L << KW_ARRAY) | (1L << KW_AS) | (1L << KW_ASCENDING) | (1L << KW_AT) | (1L << KW_ATTRIBUTE) | (1L << KW_BASE_URI) | (1L << KW_BOUNDARY_SPACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_BINARY - 64)) | (1L << (KW_BY - 64)) | (1L << (KW_CASE - 64)) | (1L << (KW_CAST - 64)) | (1L << (KW_CASTABLE - 64)) | (1L << (KW_CATCH - 64)) | (1L << (KW_CHILD - 64)) | (1L << (KW_COLLATION - 64)) | (1L << (KW_COMMENT - 64)) | (1L << (KW_CONSTRUCTION - 64)) | (1L << (KW_CONTEXT - 64)) | (1L << (KW_COPY_NS - 64)) | (1L << (KW_COUNT - 64)) | (1L << (KW_DECLARE - 64)) | (1L << (KW_DEFAULT - 64)) | (1L << (KW_DESCENDANT - 64)) | (1L << (KW_DESCENDANT_OR_SELF - 64)) | (1L << (KW_DESCENDING - 64)) | (1L << (KW_DECIMAL_FORMAT - 64)) | (1L << (KW_DIV - 64)) | (1L << (KW_DOCUMENT - 64)) | (1L << (KW_DOCUMENT_NODE - 64)) | (1L << (KW_ELEMENT - 64)) | (1L << (KW_ELSE - 64)) | (1L << (KW_EMPTY - 64)) | (1L << (KW_EMPTY_SEQUENCE - 64)) | (1L << (KW_ENCODING - 64)) | (1L << (KW_END - 64)) | (1L << (KW_EQ - 64)) | (1L << (KW_EVERY - 64)) | (1L << (KW_EXCEPT - 64)) | (1L << (KW_EXTERNAL - 64)) | (1L << (KW_FOLLOWING - 64)) | (1L << (KW_FOLLOWING_SIBLING - 64)) | (1L << (KW_FOR - 64)) | (1L << (KW_FUNCTION - 64)) | (1L << (KW_GE - 64)) | (1L << (KW_GREATEST - 64)) | (1L << (KW_GROUP - 64)) | (1L << (KW_GT - 64)) | (1L << (KW_IDIV - 64)) | (1L << (KW_IF - 64)) | (1L << (KW_IMPORT - 64)) | (1L << (KW_IN - 64)) | (1L << (KW_INHERIT - 64)) | (1L << (KW_INSTANCE - 64)) | (1L << (KW_INTERSECT - 64)) | (1L << (KW_IS - 64)) | (1L << (KW_ITEM - 64)) | (1L << (KW_LAX - 64)) | (1L << (KW_LE - 64)) | (1L << (KW_LEAST - 64)) | (1L << (KW_LET - 64)) | (1L << (KW_LT - 64)) | (1L << (KW_MAP - 64)) | (1L << (KW_MOD - 64)) | (1L << (KW_MODULE - 64)) | (1L << (KW_NAMESPACE - 64)) | (1L << (KW_NE - 64)) | (1L << (KW_NEXT - 64)) | (1L << (KW_NAMESPACE_NODE - 64)) | (1L << (KW_NO_INHERIT - 64)) | (1L << (KW_NO_PRESERVE - 64)) | (1L << (KW_NODE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (KW_OF - 128)) | (1L << (KW_ONLY - 128)) | (1L << (KW_OPTION - 128)) | (1L << (KW_OR - 128)) | (1L << (KW_ORDER - 128)) | (1L << (KW_ORDERED - 128)) | (1L << (KW_ORDERING - 128)) | (1L << (KW_PARENT - 128)) | (1L << (KW_PRECEDING - 128)) | (1L << (KW_PRECEDING_SIBLING - 128)) | (1L << (KW_PRESERVE - 128)) | (1L << (KW_PI - 128)) | (1L << (KW_RETURN - 128)) | (1L << (KW_SATISFIES - 128)) | (1L << (KW_SCHEMA - 128)) | (1L << (KW_SCHEMA_ATTR - 128)) | (1L << (KW_SCHEMA_ELEM - 128)) | (1L << (KW_SELF - 128)) | (1L << (KW_SLIDING - 128)) | (1L << (KW_SOME - 128)) | (1L << (KW_STABLE - 128)) | (1L << (KW_START - 128)) | (1L << (KW_STRICT - 128)) | (1L << (KW_STRIP - 128)) | (1L << (KW_SWITCH - 128)) | (1L << (KW_TEXT - 128)) | (1L << (KW_THEN - 128)) | (1L << (KW_TO - 128)) | (1L << (KW_TREAT - 128)) | (1L << (KW_TRY - 128)) | (1L << (KW_TUMBLING - 128)) | (1L << (KW_TYPE - 128)) | (1L << (KW_TYPESWITCH - 128)) | (1L << (KW_UNION - 128)) | (1L << (KW_UNORDERED - 128)) | (1L << (KW_UPDATE - 128)) | (1L << (KW_VALIDATE - 128)) | (1L << (KW_VARIABLE - 128)) | (1L << (KW_VERSION - 128)) | (1L << (KW_WHEN - 128)) | (1L << (KW_WHERE - 128)) | (1L << (KW_WINDOW - 128)) | (1L << (KW_XQUERY - 128)) | (1L << (KW_ARRAY_NODE - 128)) | (1L << (KW_BOOLEAN_NODE - 128)) | (1L << (KW_NULL_NODE - 128)) | (1L << (KW_NUMBER_NODE - 128)) | (1L << (KW_OBJECT_NODE - 128)) | (1L << (KW_REPLACE - 128)) | (1L << (KW_WITH - 128)) | (1L << (KW_VALUE - 128)) | (1L << (KW_INSERT - 128)) | (1L << (KW_INTO - 128)) | (1L << (KW_DELETE - 128)) | (1L << (KW_RENAME - 128)) | (1L << (URIQualifiedName - 128)) | (1L << (FullQName - 128)) | (1L << (NCName - 128)))) != 0)) {
				{
				setState(1900);
				elementNameOrWildcard();
				setState(1906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1901);
					match(COMMA);
					setState(1902);
					typeName();
					setState(1904);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==QUESTION) {
						{
						setState(1903);
						((ElementTestContext)_localctx).optional = match(QUESTION);
						}
					}

					}
				}

				}
			}

			setState(1910);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementNameOrWildcardContext extends ParserRuleContext {
		public ElementNameContext elementName() {
			return getRuleContext(ElementNameContext.class,0);
		}
		public TerminalNode STAR() { return getToken(XQueryParser.STAR, 0); }
		public ElementNameOrWildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementNameOrWildcard; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitElementNameOrWildcard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementNameOrWildcardContext elementNameOrWildcard() throws RecognitionException {
		ElementNameOrWildcardContext _localctx = new ElementNameOrWildcardContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_elementNameOrWildcard);
		try {
			setState(1914);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DFPropertyName:
			case KW_ALLOWING:
			case KW_ANCESTOR:
			case KW_ANCESTOR_OR_SELF:
			case KW_AND:
			case KW_ARRAY:
			case KW_AS:
			case KW_ASCENDING:
			case KW_AT:
			case KW_ATTRIBUTE:
			case KW_BASE_URI:
			case KW_BOUNDARY_SPACE:
			case KW_BINARY:
			case KW_BY:
			case KW_CASE:
			case KW_CAST:
			case KW_CASTABLE:
			case KW_CATCH:
			case KW_CHILD:
			case KW_COLLATION:
			case KW_COMMENT:
			case KW_CONSTRUCTION:
			case KW_CONTEXT:
			case KW_COPY_NS:
			case KW_COUNT:
			case KW_DECLARE:
			case KW_DEFAULT:
			case KW_DESCENDANT:
			case KW_DESCENDANT_OR_SELF:
			case KW_DESCENDING:
			case KW_DECIMAL_FORMAT:
			case KW_DIV:
			case KW_DOCUMENT:
			case KW_DOCUMENT_NODE:
			case KW_ELEMENT:
			case KW_ELSE:
			case KW_EMPTY:
			case KW_EMPTY_SEQUENCE:
			case KW_ENCODING:
			case KW_END:
			case KW_EQ:
			case KW_EVERY:
			case KW_EXCEPT:
			case KW_EXTERNAL:
			case KW_FOLLOWING:
			case KW_FOLLOWING_SIBLING:
			case KW_FOR:
			case KW_FUNCTION:
			case KW_GE:
			case KW_GREATEST:
			case KW_GROUP:
			case KW_GT:
			case KW_IDIV:
			case KW_IF:
			case KW_IMPORT:
			case KW_IN:
			case KW_INHERIT:
			case KW_INSTANCE:
			case KW_INTERSECT:
			case KW_IS:
			case KW_ITEM:
			case KW_LAX:
			case KW_LE:
			case KW_LEAST:
			case KW_LET:
			case KW_LT:
			case KW_MAP:
			case KW_MOD:
			case KW_MODULE:
			case KW_NAMESPACE:
			case KW_NE:
			case KW_NEXT:
			case KW_NAMESPACE_NODE:
			case KW_NO_INHERIT:
			case KW_NO_PRESERVE:
			case KW_NODE:
			case KW_OF:
			case KW_ONLY:
			case KW_OPTION:
			case KW_OR:
			case KW_ORDER:
			case KW_ORDERED:
			case KW_ORDERING:
			case KW_PARENT:
			case KW_PRECEDING:
			case KW_PRECEDING_SIBLING:
			case KW_PRESERVE:
			case KW_PI:
			case KW_RETURN:
			case KW_SATISFIES:
			case KW_SCHEMA:
			case KW_SCHEMA_ATTR:
			case KW_SCHEMA_ELEM:
			case KW_SELF:
			case KW_SLIDING:
			case KW_SOME:
			case KW_STABLE:
			case KW_START:
			case KW_STRICT:
			case KW_STRIP:
			case KW_SWITCH:
			case KW_TEXT:
			case KW_THEN:
			case KW_TO:
			case KW_TREAT:
			case KW_TRY:
			case KW_TUMBLING:
			case KW_TYPE:
			case KW_TYPESWITCH:
			case KW_UNION:
			case KW_UNORDERED:
			case KW_UPDATE:
			case KW_VALIDATE:
			case KW_VARIABLE:
			case KW_VERSION:
			case KW_WHEN:
			case KW_WHERE:
			case KW_WINDOW:
			case KW_XQUERY:
			case KW_ARRAY_NODE:
			case KW_BOOLEAN_NODE:
			case KW_NULL_NODE:
			case KW_NUMBER_NODE:
			case KW_OBJECT_NODE:
			case KW_REPLACE:
			case KW_WITH:
			case KW_VALUE:
			case KW_INSERT:
			case KW_INTO:
			case KW_DELETE:
			case KW_RENAME:
			case URIQualifiedName:
			case FullQName:
			case NCName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1912);
				elementName();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1913);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaElementTestContext extends ParserRuleContext {
		public TerminalNode KW_SCHEMA_ELEM() { return getToken(XQueryParser.KW_SCHEMA_ELEM, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public ElementDeclarationContext elementDeclaration() {
			return getRuleContext(ElementDeclarationContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public SchemaElementTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaElementTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitSchemaElementTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaElementTestContext schemaElementTest() throws RecognitionException {
		SchemaElementTestContext _localctx = new SchemaElementTestContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_schemaElementTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1916);
			match(KW_SCHEMA_ELEM);
			setState(1917);
			match(LPAREN);
			setState(1918);
			elementDeclaration();
			setState(1919);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementDeclarationContext extends ParserRuleContext {
		public ElementNameContext elementName() {
			return getRuleContext(ElementNameContext.class,0);
		}
		public ElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementDeclarationContext elementDeclaration() throws RecognitionException {
		ElementDeclarationContext _localctx = new ElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_elementDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1921);
			elementName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeNameContext extends ParserRuleContext {
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1923);
			eqName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementNameContext extends ParserRuleContext {
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public ElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitElementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementNameContext elementName() throws RecognitionException {
		ElementNameContext _localctx = new ElementNameContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_elementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			eqName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitSimpleTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1927);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1929);
			eqName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTestContext extends ParserRuleContext {
		public AnyFunctionTestContext anyFunctionTest() {
			return getRuleContext(AnyFunctionTestContext.class,0);
		}
		public TypedFunctionTestContext typedFunctionTest() {
			return getRuleContext(TypedFunctionTestContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FunctionTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitFunctionTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTestContext functionTest() throws RecognitionException {
		FunctionTestContext _localctx = new FunctionTestContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_functionTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MOD) {
				{
				{
				setState(1931);
				annotation();
				}
				}
				setState(1936);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1937);
				anyFunctionTest();
				}
				break;
			case 2:
				{
				setState(1938);
				typedFunctionTest();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyFunctionTestContext extends ParserRuleContext {
		public TerminalNode KW_FUNCTION() { return getToken(XQueryParser.KW_FUNCTION, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode STAR() { return getToken(XQueryParser.STAR, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public AnyFunctionTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyFunctionTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAnyFunctionTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyFunctionTestContext anyFunctionTest() throws RecognitionException {
		AnyFunctionTestContext _localctx = new AnyFunctionTestContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_anyFunctionTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1941);
			match(KW_FUNCTION);
			setState(1942);
			match(LPAREN);
			setState(1943);
			match(STAR);
			setState(1944);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedFunctionTestContext extends ParserRuleContext {
		public TerminalNode KW_FUNCTION() { return getToken(XQueryParser.KW_FUNCTION, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public TerminalNode KW_AS() { return getToken(XQueryParser.KW_AS, 0); }
		public List<SequenceTypeContext> sequenceType() {
			return getRuleContexts(SequenceTypeContext.class);
		}
		public SequenceTypeContext sequenceType(int i) {
			return getRuleContext(SequenceTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public TypedFunctionTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedFunctionTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitTypedFunctionTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedFunctionTestContext typedFunctionTest() throws RecognitionException {
		TypedFunctionTestContext _localctx = new TypedFunctionTestContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_typedFunctionTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1946);
			match(KW_FUNCTION);
			setState(1947);
			match(LPAREN);
			setState(1956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DFPropertyName) | (1L << LPAREN) | (1L << MOD) | (1L << KW_ALLOWING) | (1L << KW_ANCESTOR) | (1L << KW_ANCESTOR_OR_SELF) | (1L << KW_AND) | (1L << KW_ARRAY) | (1L << KW_AS) | (1L << KW_ASCENDING) | (1L << KW_AT) | (1L << KW_ATTRIBUTE) | (1L << KW_BASE_URI) | (1L << KW_BOUNDARY_SPACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_BINARY - 64)) | (1L << (KW_BY - 64)) | (1L << (KW_CASE - 64)) | (1L << (KW_CAST - 64)) | (1L << (KW_CASTABLE - 64)) | (1L << (KW_CATCH - 64)) | (1L << (KW_CHILD - 64)) | (1L << (KW_COLLATION - 64)) | (1L << (KW_COMMENT - 64)) | (1L << (KW_CONSTRUCTION - 64)) | (1L << (KW_CONTEXT - 64)) | (1L << (KW_COPY_NS - 64)) | (1L << (KW_COUNT - 64)) | (1L << (KW_DECLARE - 64)) | (1L << (KW_DEFAULT - 64)) | (1L << (KW_DESCENDANT - 64)) | (1L << (KW_DESCENDANT_OR_SELF - 64)) | (1L << (KW_DESCENDING - 64)) | (1L << (KW_DECIMAL_FORMAT - 64)) | (1L << (KW_DIV - 64)) | (1L << (KW_DOCUMENT - 64)) | (1L << (KW_DOCUMENT_NODE - 64)) | (1L << (KW_ELEMENT - 64)) | (1L << (KW_ELSE - 64)) | (1L << (KW_EMPTY - 64)) | (1L << (KW_EMPTY_SEQUENCE - 64)) | (1L << (KW_ENCODING - 64)) | (1L << (KW_END - 64)) | (1L << (KW_EQ - 64)) | (1L << (KW_EVERY - 64)) | (1L << (KW_EXCEPT - 64)) | (1L << (KW_EXTERNAL - 64)) | (1L << (KW_FOLLOWING - 64)) | (1L << (KW_FOLLOWING_SIBLING - 64)) | (1L << (KW_FOR - 64)) | (1L << (KW_FUNCTION - 64)) | (1L << (KW_GE - 64)) | (1L << (KW_GREATEST - 64)) | (1L << (KW_GROUP - 64)) | (1L << (KW_GT - 64)) | (1L << (KW_IDIV - 64)) | (1L << (KW_IF - 64)) | (1L << (KW_IMPORT - 64)) | (1L << (KW_IN - 64)) | (1L << (KW_INHERIT - 64)) | (1L << (KW_INSTANCE - 64)) | (1L << (KW_INTERSECT - 64)) | (1L << (KW_IS - 64)) | (1L << (KW_ITEM - 64)) | (1L << (KW_LAX - 64)) | (1L << (KW_LE - 64)) | (1L << (KW_LEAST - 64)) | (1L << (KW_LET - 64)) | (1L << (KW_LT - 64)) | (1L << (KW_MAP - 64)) | (1L << (KW_MOD - 64)) | (1L << (KW_MODULE - 64)) | (1L << (KW_NAMESPACE - 64)) | (1L << (KW_NE - 64)) | (1L << (KW_NEXT - 64)) | (1L << (KW_NAMESPACE_NODE - 64)) | (1L << (KW_NO_INHERIT - 64)) | (1L << (KW_NO_PRESERVE - 64)) | (1L << (KW_NODE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (KW_OF - 128)) | (1L << (KW_ONLY - 128)) | (1L << (KW_OPTION - 128)) | (1L << (KW_OR - 128)) | (1L << (KW_ORDER - 128)) | (1L << (KW_ORDERED - 128)) | (1L << (KW_ORDERING - 128)) | (1L << (KW_PARENT - 128)) | (1L << (KW_PRECEDING - 128)) | (1L << (KW_PRECEDING_SIBLING - 128)) | (1L << (KW_PRESERVE - 128)) | (1L << (KW_PI - 128)) | (1L << (KW_RETURN - 128)) | (1L << (KW_SATISFIES - 128)) | (1L << (KW_SCHEMA - 128)) | (1L << (KW_SCHEMA_ATTR - 128)) | (1L << (KW_SCHEMA_ELEM - 128)) | (1L << (KW_SELF - 128)) | (1L << (KW_SLIDING - 128)) | (1L << (KW_SOME - 128)) | (1L << (KW_STABLE - 128)) | (1L << (KW_START - 128)) | (1L << (KW_STRICT - 128)) | (1L << (KW_STRIP - 128)) | (1L << (KW_SWITCH - 128)) | (1L << (KW_TEXT - 128)) | (1L << (KW_THEN - 128)) | (1L << (KW_TO - 128)) | (1L << (KW_TREAT - 128)) | (1L << (KW_TRY - 128)) | (1L << (KW_TUMBLING - 128)) | (1L << (KW_TYPE - 128)) | (1L << (KW_TYPESWITCH - 128)) | (1L << (KW_UNION - 128)) | (1L << (KW_UNORDERED - 128)) | (1L << (KW_UPDATE - 128)) | (1L << (KW_VALIDATE - 128)) | (1L << (KW_VARIABLE - 128)) | (1L << (KW_VERSION - 128)) | (1L << (KW_WHEN - 128)) | (1L << (KW_WHERE - 128)) | (1L << (KW_WINDOW - 128)) | (1L << (KW_XQUERY - 128)) | (1L << (KW_ARRAY_NODE - 128)) | (1L << (KW_BOOLEAN_NODE - 128)) | (1L << (KW_NULL_NODE - 128)) | (1L << (KW_NUMBER_NODE - 128)) | (1L << (KW_OBJECT_NODE - 128)) | (1L << (KW_REPLACE - 128)) | (1L << (KW_WITH - 128)) | (1L << (KW_VALUE - 128)) | (1L << (KW_INSERT - 128)) | (1L << (KW_INTO - 128)) | (1L << (KW_DELETE - 128)) | (1L << (KW_RENAME - 128)) | (1L << (URIQualifiedName - 128)) | (1L << (FullQName - 128)) | (1L << (NCName - 128)))) != 0)) {
				{
				setState(1948);
				sequenceType();
				setState(1953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1949);
					match(COMMA);
					setState(1950);
					sequenceType();
					}
					}
					setState(1955);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1958);
			match(RPAREN);
			setState(1959);
			match(KW_AS);
			setState(1960);
			sequenceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapTestContext extends ParserRuleContext {
		public AnyMapTestContext anyMapTest() {
			return getRuleContext(AnyMapTestContext.class,0);
		}
		public TypedMapTestContext typedMapTest() {
			return getRuleContext(TypedMapTestContext.class,0);
		}
		public MapTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitMapTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapTestContext mapTest() throws RecognitionException {
		MapTestContext _localctx = new MapTestContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_mapTest);
		try {
			setState(1964);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1962);
				anyMapTest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1963);
				typedMapTest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyMapTestContext extends ParserRuleContext {
		public TerminalNode KW_MAP() { return getToken(XQueryParser.KW_MAP, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode STAR() { return getToken(XQueryParser.STAR, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public AnyMapTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyMapTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAnyMapTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyMapTestContext anyMapTest() throws RecognitionException {
		AnyMapTestContext _localctx = new AnyMapTestContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_anyMapTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1966);
			match(KW_MAP);
			setState(1967);
			match(LPAREN);
			setState(1968);
			match(STAR);
			setState(1969);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedMapTestContext extends ParserRuleContext {
		public TerminalNode KW_MAP() { return getToken(XQueryParser.KW_MAP, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(XQueryParser.COMMA, 0); }
		public SequenceTypeContext sequenceType() {
			return getRuleContext(SequenceTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public TypedMapTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedMapTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitTypedMapTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedMapTestContext typedMapTest() throws RecognitionException {
		TypedMapTestContext _localctx = new TypedMapTestContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_typedMapTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
			match(KW_MAP);
			setState(1972);
			match(LPAREN);
			setState(1973);
			eqName();
			setState(1974);
			match(COMMA);
			setState(1975);
			sequenceType();
			setState(1976);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTestContext extends ParserRuleContext {
		public AnyArrayTestContext anyArrayTest() {
			return getRuleContext(AnyArrayTestContext.class,0);
		}
		public TypedArrayTestContext typedArrayTest() {
			return getRuleContext(TypedArrayTestContext.class,0);
		}
		public ArrayTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitArrayTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTestContext arrayTest() throws RecognitionException {
		ArrayTestContext _localctx = new ArrayTestContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_arrayTest);
		try {
			setState(1980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1978);
				anyArrayTest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1979);
				typedArrayTest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyArrayTestContext extends ParserRuleContext {
		public TerminalNode KW_ARRAY() { return getToken(XQueryParser.KW_ARRAY, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode STAR() { return getToken(XQueryParser.STAR, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public AnyArrayTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyArrayTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAnyArrayTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyArrayTestContext anyArrayTest() throws RecognitionException {
		AnyArrayTestContext _localctx = new AnyArrayTestContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_anyArrayTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1982);
			match(KW_ARRAY);
			setState(1983);
			match(LPAREN);
			setState(1984);
			match(STAR);
			setState(1985);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedArrayTestContext extends ParserRuleContext {
		public TerminalNode KW_ARRAY() { return getToken(XQueryParser.KW_ARRAY, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public SequenceTypeContext sequenceType() {
			return getRuleContext(SequenceTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public TypedArrayTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedArrayTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitTypedArrayTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedArrayTestContext typedArrayTest() throws RecognitionException {
		TypedArrayTestContext _localctx = new TypedArrayTestContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_typedArrayTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1987);
			match(KW_ARRAY);
			setState(1988);
			match(LPAREN);
			setState(1989);
			sequenceType();
			setState(1990);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesizedItemTestContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public ItemTypeContext itemType() {
			return getRuleContext(ItemTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public ParenthesizedItemTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedItemTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitParenthesizedItemTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesizedItemTestContext parenthesizedItemTest() throws RecognitionException {
		ParenthesizedItemTestContext _localctx = new ParenthesizedItemTestContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_parenthesizedItemTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1992);
			match(LPAREN);
			setState(1993);
			itemType();
			setState(1994);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeDeclarationContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public AttributeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitAttributeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeDeclarationContext attributeDeclaration() throws RecognitionException {
		AttributeDeclarationContext _localctx = new AttributeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_attributeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1996);
			attributeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MlNodeTestContext extends ParserRuleContext {
		public MlArrayNodeTestContext mlArrayNodeTest() {
			return getRuleContext(MlArrayNodeTestContext.class,0);
		}
		public MlObjectNodeTestContext mlObjectNodeTest() {
			return getRuleContext(MlObjectNodeTestContext.class,0);
		}
		public MlNumberNodeTestContext mlNumberNodeTest() {
			return getRuleContext(MlNumberNodeTestContext.class,0);
		}
		public MlBooleanNodeTestContext mlBooleanNodeTest() {
			return getRuleContext(MlBooleanNodeTestContext.class,0);
		}
		public MlNullNodeTestContext mlNullNodeTest() {
			return getRuleContext(MlNullNodeTestContext.class,0);
		}
		public MlNodeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlNodeTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitMlNodeTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MlNodeTestContext mlNodeTest() throws RecognitionException {
		MlNodeTestContext _localctx = new MlNodeTestContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_mlNodeTest);
		try {
			setState(2003);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ARRAY_NODE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1998);
				mlArrayNodeTest();
				}
				break;
			case KW_OBJECT_NODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1999);
				mlObjectNodeTest();
				}
				break;
			case KW_NUMBER_NODE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2000);
				mlNumberNodeTest();
				}
				break;
			case KW_BOOLEAN_NODE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2001);
				mlBooleanNodeTest();
				}
				break;
			case KW_NULL_NODE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2002);
				mlNullNodeTest();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MlArrayNodeTestContext extends ParserRuleContext {
		public TerminalNode KW_ARRAY_NODE() { return getToken(XQueryParser.KW_ARRAY_NODE, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public MlArrayNodeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlArrayNodeTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitMlArrayNodeTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MlArrayNodeTestContext mlArrayNodeTest() throws RecognitionException {
		MlArrayNodeTestContext _localctx = new MlArrayNodeTestContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_mlArrayNodeTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2005);
			match(KW_ARRAY_NODE);
			setState(2006);
			match(LPAREN);
			setState(2008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Quot || _la==Apos) {
				{
				setState(2007);
				stringLiteral();
				}
			}

			setState(2010);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MlObjectNodeTestContext extends ParserRuleContext {
		public TerminalNode KW_OBJECT_NODE() { return getToken(XQueryParser.KW_OBJECT_NODE, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public MlObjectNodeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlObjectNodeTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitMlObjectNodeTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MlObjectNodeTestContext mlObjectNodeTest() throws RecognitionException {
		MlObjectNodeTestContext _localctx = new MlObjectNodeTestContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_mlObjectNodeTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2012);
			match(KW_OBJECT_NODE);
			setState(2013);
			match(LPAREN);
			setState(2015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Quot || _la==Apos) {
				{
				setState(2014);
				stringLiteral();
				}
			}

			setState(2017);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MlNumberNodeTestContext extends ParserRuleContext {
		public TerminalNode KW_NUMBER_NODE() { return getToken(XQueryParser.KW_NUMBER_NODE, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public MlNumberNodeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlNumberNodeTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitMlNumberNodeTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MlNumberNodeTestContext mlNumberNodeTest() throws RecognitionException {
		MlNumberNodeTestContext _localctx = new MlNumberNodeTestContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_mlNumberNodeTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2019);
			match(KW_NUMBER_NODE);
			setState(2020);
			match(LPAREN);
			setState(2022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Quot || _la==Apos) {
				{
				setState(2021);
				stringLiteral();
				}
			}

			setState(2024);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MlBooleanNodeTestContext extends ParserRuleContext {
		public TerminalNode KW_BOOLEAN_NODE() { return getToken(XQueryParser.KW_BOOLEAN_NODE, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public MlBooleanNodeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlBooleanNodeTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitMlBooleanNodeTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MlBooleanNodeTestContext mlBooleanNodeTest() throws RecognitionException {
		MlBooleanNodeTestContext _localctx = new MlBooleanNodeTestContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_mlBooleanNodeTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2026);
			match(KW_BOOLEAN_NODE);
			setState(2027);
			match(LPAREN);
			setState(2029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Quot || _la==Apos) {
				{
				setState(2028);
				stringLiteral();
				}
			}

			setState(2031);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MlNullNodeTestContext extends ParserRuleContext {
		public TerminalNode KW_NULL_NODE() { return getToken(XQueryParser.KW_NULL_NODE, 0); }
		public TerminalNode LPAREN() { return getToken(XQueryParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XQueryParser.RPAREN, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public MlNullNodeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlNullNodeTest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitMlNullNodeTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MlNullNodeTestContext mlNullNodeTest() throws RecognitionException {
		MlNullNodeTestContext _localctx = new MlNullNodeTestContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_mlNullNodeTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2033);
			match(KW_NULL_NODE);
			setState(2034);
			match(LPAREN);
			setState(2036);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Quot || _la==Apos) {
				{
				setState(2035);
				stringLiteral();
				}
			}

			setState(2038);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqNameContext extends ParserRuleContext {
		public QNameContext qName() {
			return getRuleContext(QNameContext.class,0);
		}
		public TerminalNode URIQualifiedName() { return getToken(XQueryParser.URIQualifiedName, 0); }
		public EqNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitEqName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqNameContext eqName() throws RecognitionException {
		EqNameContext _localctx = new EqNameContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_eqName);
		try {
			setState(2042);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DFPropertyName:
			case KW_ALLOWING:
			case KW_ANCESTOR:
			case KW_ANCESTOR_OR_SELF:
			case KW_AND:
			case KW_ARRAY:
			case KW_AS:
			case KW_ASCENDING:
			case KW_AT:
			case KW_ATTRIBUTE:
			case KW_BASE_URI:
			case KW_BOUNDARY_SPACE:
			case KW_BINARY:
			case KW_BY:
			case KW_CASE:
			case KW_CAST:
			case KW_CASTABLE:
			case KW_CATCH:
			case KW_CHILD:
			case KW_COLLATION:
			case KW_COMMENT:
			case KW_CONSTRUCTION:
			case KW_CONTEXT:
			case KW_COPY_NS:
			case KW_COUNT:
			case KW_DECLARE:
			case KW_DEFAULT:
			case KW_DESCENDANT:
			case KW_DESCENDANT_OR_SELF:
			case KW_DESCENDING:
			case KW_DECIMAL_FORMAT:
			case KW_DIV:
			case KW_DOCUMENT:
			case KW_DOCUMENT_NODE:
			case KW_ELEMENT:
			case KW_ELSE:
			case KW_EMPTY:
			case KW_EMPTY_SEQUENCE:
			case KW_ENCODING:
			case KW_END:
			case KW_EQ:
			case KW_EVERY:
			case KW_EXCEPT:
			case KW_EXTERNAL:
			case KW_FOLLOWING:
			case KW_FOLLOWING_SIBLING:
			case KW_FOR:
			case KW_FUNCTION:
			case KW_GE:
			case KW_GREATEST:
			case KW_GROUP:
			case KW_GT:
			case KW_IDIV:
			case KW_IF:
			case KW_IMPORT:
			case KW_IN:
			case KW_INHERIT:
			case KW_INSTANCE:
			case KW_INTERSECT:
			case KW_IS:
			case KW_ITEM:
			case KW_LAX:
			case KW_LE:
			case KW_LEAST:
			case KW_LET:
			case KW_LT:
			case KW_MAP:
			case KW_MOD:
			case KW_MODULE:
			case KW_NAMESPACE:
			case KW_NE:
			case KW_NEXT:
			case KW_NAMESPACE_NODE:
			case KW_NO_INHERIT:
			case KW_NO_PRESERVE:
			case KW_NODE:
			case KW_OF:
			case KW_ONLY:
			case KW_OPTION:
			case KW_OR:
			case KW_ORDER:
			case KW_ORDERED:
			case KW_ORDERING:
			case KW_PARENT:
			case KW_PRECEDING:
			case KW_PRECEDING_SIBLING:
			case KW_PRESERVE:
			case KW_PI:
			case KW_RETURN:
			case KW_SATISFIES:
			case KW_SCHEMA:
			case KW_SCHEMA_ATTR:
			case KW_SCHEMA_ELEM:
			case KW_SELF:
			case KW_SLIDING:
			case KW_SOME:
			case KW_STABLE:
			case KW_START:
			case KW_STRICT:
			case KW_STRIP:
			case KW_SWITCH:
			case KW_TEXT:
			case KW_THEN:
			case KW_TO:
			case KW_TREAT:
			case KW_TRY:
			case KW_TUMBLING:
			case KW_TYPE:
			case KW_TYPESWITCH:
			case KW_UNION:
			case KW_UNORDERED:
			case KW_UPDATE:
			case KW_VALIDATE:
			case KW_VARIABLE:
			case KW_VERSION:
			case KW_WHEN:
			case KW_WHERE:
			case KW_WINDOW:
			case KW_XQUERY:
			case KW_ARRAY_NODE:
			case KW_BOOLEAN_NODE:
			case KW_NULL_NODE:
			case KW_NUMBER_NODE:
			case KW_OBJECT_NODE:
			case KW_REPLACE:
			case KW_WITH:
			case KW_VALUE:
			case KW_INSERT:
			case KW_INTO:
			case KW_DELETE:
			case KW_RENAME:
			case FullQName:
			case NCName:
				enterOuterAlt(_localctx, 1);
				{
				setState(2040);
				qName();
				}
				break;
			case URIQualifiedName:
				enterOuterAlt(_localctx, 2);
				{
				setState(2041);
				match(URIQualifiedName);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QNameContext extends ParserRuleContext {
		public TerminalNode FullQName() { return getToken(XQueryParser.FullQName, 0); }
		public NcNameContext ncName() {
			return getRuleContext(NcNameContext.class,0);
		}
		public QNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitQName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QNameContext qName() throws RecognitionException {
		QNameContext _localctx = new QNameContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_qName);
		try {
			setState(2046);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FullQName:
				enterOuterAlt(_localctx, 1);
				{
				setState(2044);
				match(FullQName);
				}
				break;
			case DFPropertyName:
			case KW_ALLOWING:
			case KW_ANCESTOR:
			case KW_ANCESTOR_OR_SELF:
			case KW_AND:
			case KW_ARRAY:
			case KW_AS:
			case KW_ASCENDING:
			case KW_AT:
			case KW_ATTRIBUTE:
			case KW_BASE_URI:
			case KW_BOUNDARY_SPACE:
			case KW_BINARY:
			case KW_BY:
			case KW_CASE:
			case KW_CAST:
			case KW_CASTABLE:
			case KW_CATCH:
			case KW_CHILD:
			case KW_COLLATION:
			case KW_COMMENT:
			case KW_CONSTRUCTION:
			case KW_CONTEXT:
			case KW_COPY_NS:
			case KW_COUNT:
			case KW_DECLARE:
			case KW_DEFAULT:
			case KW_DESCENDANT:
			case KW_DESCENDANT_OR_SELF:
			case KW_DESCENDING:
			case KW_DECIMAL_FORMAT:
			case KW_DIV:
			case KW_DOCUMENT:
			case KW_DOCUMENT_NODE:
			case KW_ELEMENT:
			case KW_ELSE:
			case KW_EMPTY:
			case KW_EMPTY_SEQUENCE:
			case KW_ENCODING:
			case KW_END:
			case KW_EQ:
			case KW_EVERY:
			case KW_EXCEPT:
			case KW_EXTERNAL:
			case KW_FOLLOWING:
			case KW_FOLLOWING_SIBLING:
			case KW_FOR:
			case KW_FUNCTION:
			case KW_GE:
			case KW_GREATEST:
			case KW_GROUP:
			case KW_GT:
			case KW_IDIV:
			case KW_IF:
			case KW_IMPORT:
			case KW_IN:
			case KW_INHERIT:
			case KW_INSTANCE:
			case KW_INTERSECT:
			case KW_IS:
			case KW_ITEM:
			case KW_LAX:
			case KW_LE:
			case KW_LEAST:
			case KW_LET:
			case KW_LT:
			case KW_MAP:
			case KW_MOD:
			case KW_MODULE:
			case KW_NAMESPACE:
			case KW_NE:
			case KW_NEXT:
			case KW_NAMESPACE_NODE:
			case KW_NO_INHERIT:
			case KW_NO_PRESERVE:
			case KW_NODE:
			case KW_OF:
			case KW_ONLY:
			case KW_OPTION:
			case KW_OR:
			case KW_ORDER:
			case KW_ORDERED:
			case KW_ORDERING:
			case KW_PARENT:
			case KW_PRECEDING:
			case KW_PRECEDING_SIBLING:
			case KW_PRESERVE:
			case KW_PI:
			case KW_RETURN:
			case KW_SATISFIES:
			case KW_SCHEMA:
			case KW_SCHEMA_ATTR:
			case KW_SCHEMA_ELEM:
			case KW_SELF:
			case KW_SLIDING:
			case KW_SOME:
			case KW_STABLE:
			case KW_START:
			case KW_STRICT:
			case KW_STRIP:
			case KW_SWITCH:
			case KW_TEXT:
			case KW_THEN:
			case KW_TO:
			case KW_TREAT:
			case KW_TRY:
			case KW_TUMBLING:
			case KW_TYPE:
			case KW_TYPESWITCH:
			case KW_UNION:
			case KW_UNORDERED:
			case KW_UPDATE:
			case KW_VALIDATE:
			case KW_VARIABLE:
			case KW_VERSION:
			case KW_WHEN:
			case KW_WHERE:
			case KW_WINDOW:
			case KW_XQUERY:
			case KW_ARRAY_NODE:
			case KW_BOOLEAN_NODE:
			case KW_NULL_NODE:
			case KW_NUMBER_NODE:
			case KW_OBJECT_NODE:
			case KW_REPLACE:
			case KW_WITH:
			case KW_VALUE:
			case KW_INSERT:
			case KW_INTO:
			case KW_DELETE:
			case KW_RENAME:
			case NCName:
				enterOuterAlt(_localctx, 2);
				{
				setState(2045);
				ncName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NcNameContext extends ParserRuleContext {
		public Token local_name;
		public KeywordContext local_namekw;
		public TerminalNode NCName() { return getToken(XQueryParser.NCName, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public NcNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ncName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitNcName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NcNameContext ncName() throws RecognitionException {
		NcNameContext _localctx = new NcNameContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_ncName);
		try {
			setState(2050);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NCName:
				enterOuterAlt(_localctx, 1);
				{
				setState(2048);
				((NcNameContext)_localctx).local_name = match(NCName);
				}
				break;
			case DFPropertyName:
			case KW_ALLOWING:
			case KW_ANCESTOR:
			case KW_ANCESTOR_OR_SELF:
			case KW_AND:
			case KW_ARRAY:
			case KW_AS:
			case KW_ASCENDING:
			case KW_AT:
			case KW_ATTRIBUTE:
			case KW_BASE_URI:
			case KW_BOUNDARY_SPACE:
			case KW_BINARY:
			case KW_BY:
			case KW_CASE:
			case KW_CAST:
			case KW_CASTABLE:
			case KW_CATCH:
			case KW_CHILD:
			case KW_COLLATION:
			case KW_COMMENT:
			case KW_CONSTRUCTION:
			case KW_CONTEXT:
			case KW_COPY_NS:
			case KW_COUNT:
			case KW_DECLARE:
			case KW_DEFAULT:
			case KW_DESCENDANT:
			case KW_DESCENDANT_OR_SELF:
			case KW_DESCENDING:
			case KW_DECIMAL_FORMAT:
			case KW_DIV:
			case KW_DOCUMENT:
			case KW_DOCUMENT_NODE:
			case KW_ELEMENT:
			case KW_ELSE:
			case KW_EMPTY:
			case KW_EMPTY_SEQUENCE:
			case KW_ENCODING:
			case KW_END:
			case KW_EQ:
			case KW_EVERY:
			case KW_EXCEPT:
			case KW_EXTERNAL:
			case KW_FOLLOWING:
			case KW_FOLLOWING_SIBLING:
			case KW_FOR:
			case KW_FUNCTION:
			case KW_GE:
			case KW_GREATEST:
			case KW_GROUP:
			case KW_GT:
			case KW_IDIV:
			case KW_IF:
			case KW_IMPORT:
			case KW_IN:
			case KW_INHERIT:
			case KW_INSTANCE:
			case KW_INTERSECT:
			case KW_IS:
			case KW_ITEM:
			case KW_LAX:
			case KW_LE:
			case KW_LEAST:
			case KW_LET:
			case KW_LT:
			case KW_MAP:
			case KW_MOD:
			case KW_MODULE:
			case KW_NAMESPACE:
			case KW_NE:
			case KW_NEXT:
			case KW_NAMESPACE_NODE:
			case KW_NO_INHERIT:
			case KW_NO_PRESERVE:
			case KW_NODE:
			case KW_OF:
			case KW_ONLY:
			case KW_OPTION:
			case KW_OR:
			case KW_ORDER:
			case KW_ORDERED:
			case KW_ORDERING:
			case KW_PARENT:
			case KW_PRECEDING:
			case KW_PRECEDING_SIBLING:
			case KW_PRESERVE:
			case KW_PI:
			case KW_RETURN:
			case KW_SATISFIES:
			case KW_SCHEMA:
			case KW_SCHEMA_ATTR:
			case KW_SCHEMA_ELEM:
			case KW_SELF:
			case KW_SLIDING:
			case KW_SOME:
			case KW_STABLE:
			case KW_START:
			case KW_STRICT:
			case KW_STRIP:
			case KW_SWITCH:
			case KW_TEXT:
			case KW_THEN:
			case KW_TO:
			case KW_TREAT:
			case KW_TRY:
			case KW_TUMBLING:
			case KW_TYPE:
			case KW_TYPESWITCH:
			case KW_UNION:
			case KW_UNORDERED:
			case KW_UPDATE:
			case KW_VALIDATE:
			case KW_VARIABLE:
			case KW_VERSION:
			case KW_WHEN:
			case KW_WHERE:
			case KW_WINDOW:
			case KW_XQUERY:
			case KW_ARRAY_NODE:
			case KW_BOOLEAN_NODE:
			case KW_NULL_NODE:
			case KW_NUMBER_NODE:
			case KW_OBJECT_NODE:
			case KW_REPLACE:
			case KW_WITH:
			case KW_VALUE:
			case KW_INSERT:
			case KW_INTO:
			case KW_DELETE:
			case KW_RENAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(2049);
				((NcNameContext)_localctx).local_namekw = keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode FullQName() { return getToken(XQueryParser.FullQName, 0); }
		public TerminalNode NCName() { return getToken(XQueryParser.NCName, 0); }
		public TerminalNode URIQualifiedName() { return getToken(XQueryParser.URIQualifiedName, 0); }
		public KeywordOKForFunctionContext keywordOKForFunction() {
			return getRuleContext(KeywordOKForFunctionContext.class,0);
		}
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_functionName);
		try {
			setState(2056);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FullQName:
				enterOuterAlt(_localctx, 1);
				{
				setState(2052);
				match(FullQName);
				}
				break;
			case NCName:
				enterOuterAlt(_localctx, 2);
				{
				setState(2053);
				match(NCName);
				}
				break;
			case URIQualifiedName:
				enterOuterAlt(_localctx, 3);
				{
				setState(2054);
				match(URIQualifiedName);
				}
				break;
			case KW_ANCESTOR:
			case KW_ANCESTOR_OR_SELF:
			case KW_AND:
			case KW_AS:
			case KW_ASCENDING:
			case KW_AT:
			case KW_BASE_URI:
			case KW_BOUNDARY_SPACE:
			case KW_BY:
			case KW_CASE:
			case KW_CAST:
			case KW_CASTABLE:
			case KW_CHILD:
			case KW_COLLATION:
			case KW_CONSTRUCTION:
			case KW_COPY_NS:
			case KW_DECLARE:
			case KW_DEFAULT:
			case KW_DESCENDANT:
			case KW_DESCENDANT_OR_SELF:
			case KW_DESCENDING:
			case KW_DIV:
			case KW_DOCUMENT:
			case KW_ELSE:
			case KW_EMPTY:
			case KW_ENCODING:
			case KW_EQ:
			case KW_EVERY:
			case KW_EXCEPT:
			case KW_EXTERNAL:
			case KW_FOLLOWING:
			case KW_FOLLOWING_SIBLING:
			case KW_FOR:
			case KW_FUNCTION:
			case KW_GE:
			case KW_GREATEST:
			case KW_GROUP:
			case KW_GT:
			case KW_IDIV:
			case KW_IMPORT:
			case KW_IN:
			case KW_INHERIT:
			case KW_INSTANCE:
			case KW_INTERSECT:
			case KW_IS:
			case KW_LAX:
			case KW_LE:
			case KW_LEAST:
			case KW_LET:
			case KW_LT:
			case KW_MOD:
			case KW_MODULE:
			case KW_NAMESPACE:
			case KW_NE:
			case KW_NO_INHERIT:
			case KW_NO_PRESERVE:
			case KW_OF:
			case KW_OPTION:
			case KW_OR:
			case KW_ORDER:
			case KW_ORDERED:
			case KW_ORDERING:
			case KW_PARENT:
			case KW_PRECEDING:
			case KW_PRECEDING_SIBLING:
			case KW_PRESERVE:
			case KW_RETURN:
			case KW_SATISFIES:
			case KW_SCHEMA:
			case KW_SELF:
			case KW_SOME:
			case KW_STABLE:
			case KW_START:
			case KW_STRICT:
			case KW_STRIP:
			case KW_THEN:
			case KW_TO:
			case KW_TREAT:
			case KW_UNION:
			case KW_UNORDERED:
			case KW_VALIDATE:
			case KW_VARIABLE:
			case KW_VERSION:
			case KW_WHERE:
			case KW_XQUERY:
				enterOuterAlt(_localctx, 4);
				{
				setState(2055);
				keywordOKForFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public KeywordOKForFunctionContext keywordOKForFunction() {
			return getRuleContext(KeywordOKForFunctionContext.class,0);
		}
		public KeywordNotOKForFunctionContext keywordNotOKForFunction() {
			return getRuleContext(KeywordNotOKForFunctionContext.class,0);
		}
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_keyword);
		try {
			setState(2060);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ANCESTOR:
			case KW_ANCESTOR_OR_SELF:
			case KW_AND:
			case KW_AS:
			case KW_ASCENDING:
			case KW_AT:
			case KW_BASE_URI:
			case KW_BOUNDARY_SPACE:
			case KW_BY:
			case KW_CASE:
			case KW_CAST:
			case KW_CASTABLE:
			case KW_CHILD:
			case KW_COLLATION:
			case KW_CONSTRUCTION:
			case KW_COPY_NS:
			case KW_DECLARE:
			case KW_DEFAULT:
			case KW_DESCENDANT:
			case KW_DESCENDANT_OR_SELF:
			case KW_DESCENDING:
			case KW_DIV:
			case KW_DOCUMENT:
			case KW_ELSE:
			case KW_EMPTY:
			case KW_ENCODING:
			case KW_EQ:
			case KW_EVERY:
			case KW_EXCEPT:
			case KW_EXTERNAL:
			case KW_FOLLOWING:
			case KW_FOLLOWING_SIBLING:
			case KW_FOR:
			case KW_FUNCTION:
			case KW_GE:
			case KW_GREATEST:
			case KW_GROUP:
			case KW_GT:
			case KW_IDIV:
			case KW_IMPORT:
			case KW_IN:
			case KW_INHERIT:
			case KW_INSTANCE:
			case KW_INTERSECT:
			case KW_IS:
			case KW_LAX:
			case KW_LE:
			case KW_LEAST:
			case KW_LET:
			case KW_LT:
			case KW_MOD:
			case KW_MODULE:
			case KW_NAMESPACE:
			case KW_NE:
			case KW_NO_INHERIT:
			case KW_NO_PRESERVE:
			case KW_OF:
			case KW_OPTION:
			case KW_OR:
			case KW_ORDER:
			case KW_ORDERED:
			case KW_ORDERING:
			case KW_PARENT:
			case KW_PRECEDING:
			case KW_PRECEDING_SIBLING:
			case KW_PRESERVE:
			case KW_RETURN:
			case KW_SATISFIES:
			case KW_SCHEMA:
			case KW_SELF:
			case KW_SOME:
			case KW_STABLE:
			case KW_START:
			case KW_STRICT:
			case KW_STRIP:
			case KW_THEN:
			case KW_TO:
			case KW_TREAT:
			case KW_UNION:
			case KW_UNORDERED:
			case KW_VALIDATE:
			case KW_VARIABLE:
			case KW_VERSION:
			case KW_WHERE:
			case KW_XQUERY:
				enterOuterAlt(_localctx, 1);
				{
				setState(2058);
				keywordOKForFunction();
				}
				break;
			case DFPropertyName:
			case KW_ALLOWING:
			case KW_ARRAY:
			case KW_ATTRIBUTE:
			case KW_BINARY:
			case KW_CATCH:
			case KW_COMMENT:
			case KW_CONTEXT:
			case KW_COUNT:
			case KW_DECIMAL_FORMAT:
			case KW_DOCUMENT_NODE:
			case KW_ELEMENT:
			case KW_EMPTY_SEQUENCE:
			case KW_END:
			case KW_IF:
			case KW_ITEM:
			case KW_MAP:
			case KW_NEXT:
			case KW_NAMESPACE_NODE:
			case KW_NODE:
			case KW_ONLY:
			case KW_PI:
			case KW_SCHEMA_ATTR:
			case KW_SCHEMA_ELEM:
			case KW_SLIDING:
			case KW_SWITCH:
			case KW_TEXT:
			case KW_TRY:
			case KW_TUMBLING:
			case KW_TYPE:
			case KW_TYPESWITCH:
			case KW_UPDATE:
			case KW_WHEN:
			case KW_WINDOW:
			case KW_ARRAY_NODE:
			case KW_BOOLEAN_NODE:
			case KW_NULL_NODE:
			case KW_NUMBER_NODE:
			case KW_OBJECT_NODE:
			case KW_REPLACE:
			case KW_WITH:
			case KW_VALUE:
			case KW_INSERT:
			case KW_INTO:
			case KW_DELETE:
			case KW_RENAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(2059);
				keywordNotOKForFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordNotOKForFunctionContext extends ParserRuleContext {
		public TerminalNode KW_ATTRIBUTE() { return getToken(XQueryParser.KW_ATTRIBUTE, 0); }
		public TerminalNode KW_COMMENT() { return getToken(XQueryParser.KW_COMMENT, 0); }
		public TerminalNode KW_DOCUMENT_NODE() { return getToken(XQueryParser.KW_DOCUMENT_NODE, 0); }
		public TerminalNode KW_ELEMENT() { return getToken(XQueryParser.KW_ELEMENT, 0); }
		public TerminalNode KW_EMPTY_SEQUENCE() { return getToken(XQueryParser.KW_EMPTY_SEQUENCE, 0); }
		public TerminalNode KW_IF() { return getToken(XQueryParser.KW_IF, 0); }
		public TerminalNode KW_ITEM() { return getToken(XQueryParser.KW_ITEM, 0); }
		public TerminalNode KW_CONTEXT() { return getToken(XQueryParser.KW_CONTEXT, 0); }
		public TerminalNode KW_NODE() { return getToken(XQueryParser.KW_NODE, 0); }
		public TerminalNode KW_PI() { return getToken(XQueryParser.KW_PI, 0); }
		public TerminalNode KW_SCHEMA_ATTR() { return getToken(XQueryParser.KW_SCHEMA_ATTR, 0); }
		public TerminalNode KW_SCHEMA_ELEM() { return getToken(XQueryParser.KW_SCHEMA_ELEM, 0); }
		public TerminalNode KW_BINARY() { return getToken(XQueryParser.KW_BINARY, 0); }
		public TerminalNode KW_TEXT() { return getToken(XQueryParser.KW_TEXT, 0); }
		public TerminalNode KW_TYPESWITCH() { return getToken(XQueryParser.KW_TYPESWITCH, 0); }
		public TerminalNode KW_SWITCH() { return getToken(XQueryParser.KW_SWITCH, 0); }
		public TerminalNode KW_NAMESPACE_NODE() { return getToken(XQueryParser.KW_NAMESPACE_NODE, 0); }
		public TerminalNode KW_TYPE() { return getToken(XQueryParser.KW_TYPE, 0); }
		public TerminalNode KW_TUMBLING() { return getToken(XQueryParser.KW_TUMBLING, 0); }
		public TerminalNode KW_TRY() { return getToken(XQueryParser.KW_TRY, 0); }
		public TerminalNode KW_CATCH() { return getToken(XQueryParser.KW_CATCH, 0); }
		public TerminalNode KW_ONLY() { return getToken(XQueryParser.KW_ONLY, 0); }
		public TerminalNode KW_WHEN() { return getToken(XQueryParser.KW_WHEN, 0); }
		public TerminalNode KW_SLIDING() { return getToken(XQueryParser.KW_SLIDING, 0); }
		public TerminalNode KW_DECIMAL_FORMAT() { return getToken(XQueryParser.KW_DECIMAL_FORMAT, 0); }
		public TerminalNode KW_WINDOW() { return getToken(XQueryParser.KW_WINDOW, 0); }
		public TerminalNode KW_COUNT() { return getToken(XQueryParser.KW_COUNT, 0); }
		public TerminalNode KW_MAP() { return getToken(XQueryParser.KW_MAP, 0); }
		public TerminalNode KW_END() { return getToken(XQueryParser.KW_END, 0); }
		public TerminalNode KW_ALLOWING() { return getToken(XQueryParser.KW_ALLOWING, 0); }
		public TerminalNode KW_ARRAY() { return getToken(XQueryParser.KW_ARRAY, 0); }
		public TerminalNode DFPropertyName() { return getToken(XQueryParser.DFPropertyName, 0); }
		public TerminalNode KW_ARRAY_NODE() { return getToken(XQueryParser.KW_ARRAY_NODE, 0); }
		public TerminalNode KW_BOOLEAN_NODE() { return getToken(XQueryParser.KW_BOOLEAN_NODE, 0); }
		public TerminalNode KW_NULL_NODE() { return getToken(XQueryParser.KW_NULL_NODE, 0); }
		public TerminalNode KW_NUMBER_NODE() { return getToken(XQueryParser.KW_NUMBER_NODE, 0); }
		public TerminalNode KW_OBJECT_NODE() { return getToken(XQueryParser.KW_OBJECT_NODE, 0); }
		public TerminalNode KW_UPDATE() { return getToken(XQueryParser.KW_UPDATE, 0); }
		public TerminalNode KW_REPLACE() { return getToken(XQueryParser.KW_REPLACE, 0); }
		public TerminalNode KW_WITH() { return getToken(XQueryParser.KW_WITH, 0); }
		public TerminalNode KW_VALUE() { return getToken(XQueryParser.KW_VALUE, 0); }
		public TerminalNode KW_INSERT() { return getToken(XQueryParser.KW_INSERT, 0); }
		public TerminalNode KW_INTO() { return getToken(XQueryParser.KW_INTO, 0); }
		public TerminalNode KW_DELETE() { return getToken(XQueryParser.KW_DELETE, 0); }
		public TerminalNode KW_NEXT() { return getToken(XQueryParser.KW_NEXT, 0); }
		public TerminalNode KW_RENAME() { return getToken(XQueryParser.KW_RENAME, 0); }
		public KeywordNotOKForFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordNotOKForFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitKeywordNotOKForFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordNotOKForFunctionContext keywordNotOKForFunction() throws RecognitionException {
		KeywordNotOKForFunctionContext _localctx = new KeywordNotOKForFunctionContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_keywordNotOKForFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2062);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DFPropertyName) | (1L << KW_ALLOWING) | (1L << KW_ARRAY) | (1L << KW_ATTRIBUTE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_BINARY - 64)) | (1L << (KW_CATCH - 64)) | (1L << (KW_COMMENT - 64)) | (1L << (KW_CONTEXT - 64)) | (1L << (KW_COUNT - 64)) | (1L << (KW_DECIMAL_FORMAT - 64)) | (1L << (KW_DOCUMENT_NODE - 64)) | (1L << (KW_ELEMENT - 64)) | (1L << (KW_EMPTY_SEQUENCE - 64)) | (1L << (KW_END - 64)) | (1L << (KW_IF - 64)) | (1L << (KW_ITEM - 64)) | (1L << (KW_MAP - 64)) | (1L << (KW_NEXT - 64)) | (1L << (KW_NAMESPACE_NODE - 64)) | (1L << (KW_NODE - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (KW_ONLY - 129)) | (1L << (KW_PI - 129)) | (1L << (KW_SCHEMA_ATTR - 129)) | (1L << (KW_SCHEMA_ELEM - 129)) | (1L << (KW_SLIDING - 129)) | (1L << (KW_SWITCH - 129)) | (1L << (KW_TEXT - 129)) | (1L << (KW_TRY - 129)) | (1L << (KW_TUMBLING - 129)) | (1L << (KW_TYPE - 129)) | (1L << (KW_TYPESWITCH - 129)) | (1L << (KW_UPDATE - 129)) | (1L << (KW_WHEN - 129)) | (1L << (KW_WINDOW - 129)) | (1L << (KW_ARRAY_NODE - 129)) | (1L << (KW_BOOLEAN_NODE - 129)) | (1L << (KW_NULL_NODE - 129)) | (1L << (KW_NUMBER_NODE - 129)) | (1L << (KW_OBJECT_NODE - 129)) | (1L << (KW_REPLACE - 129)) | (1L << (KW_WITH - 129)) | (1L << (KW_VALUE - 129)) | (1L << (KW_INSERT - 129)) | (1L << (KW_INTO - 129)) | (1L << (KW_DELETE - 129)) | (1L << (KW_RENAME - 129)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordOKForFunctionContext extends ParserRuleContext {
		public TerminalNode KW_ANCESTOR() { return getToken(XQueryParser.KW_ANCESTOR, 0); }
		public TerminalNode KW_ANCESTOR_OR_SELF() { return getToken(XQueryParser.KW_ANCESTOR_OR_SELF, 0); }
		public TerminalNode KW_AND() { return getToken(XQueryParser.KW_AND, 0); }
		public TerminalNode KW_AS() { return getToken(XQueryParser.KW_AS, 0); }
		public TerminalNode KW_ASCENDING() { return getToken(XQueryParser.KW_ASCENDING, 0); }
		public TerminalNode KW_AT() { return getToken(XQueryParser.KW_AT, 0); }
		public TerminalNode KW_BASE_URI() { return getToken(XQueryParser.KW_BASE_URI, 0); }
		public TerminalNode KW_BOUNDARY_SPACE() { return getToken(XQueryParser.KW_BOUNDARY_SPACE, 0); }
		public TerminalNode KW_BY() { return getToken(XQueryParser.KW_BY, 0); }
		public TerminalNode KW_CASE() { return getToken(XQueryParser.KW_CASE, 0); }
		public TerminalNode KW_CAST() { return getToken(XQueryParser.KW_CAST, 0); }
		public TerminalNode KW_CASTABLE() { return getToken(XQueryParser.KW_CASTABLE, 0); }
		public TerminalNode KW_CHILD() { return getToken(XQueryParser.KW_CHILD, 0); }
		public TerminalNode KW_COLLATION() { return getToken(XQueryParser.KW_COLLATION, 0); }
		public TerminalNode KW_CONSTRUCTION() { return getToken(XQueryParser.KW_CONSTRUCTION, 0); }
		public TerminalNode KW_COPY_NS() { return getToken(XQueryParser.KW_COPY_NS, 0); }
		public TerminalNode KW_DECLARE() { return getToken(XQueryParser.KW_DECLARE, 0); }
		public TerminalNode KW_DEFAULT() { return getToken(XQueryParser.KW_DEFAULT, 0); }
		public TerminalNode KW_DESCENDANT() { return getToken(XQueryParser.KW_DESCENDANT, 0); }
		public TerminalNode KW_DESCENDANT_OR_SELF() { return getToken(XQueryParser.KW_DESCENDANT_OR_SELF, 0); }
		public TerminalNode KW_DESCENDING() { return getToken(XQueryParser.KW_DESCENDING, 0); }
		public TerminalNode KW_DIV() { return getToken(XQueryParser.KW_DIV, 0); }
		public TerminalNode KW_DOCUMENT() { return getToken(XQueryParser.KW_DOCUMENT, 0); }
		public TerminalNode KW_ELSE() { return getToken(XQueryParser.KW_ELSE, 0); }
		public TerminalNode KW_EMPTY() { return getToken(XQueryParser.KW_EMPTY, 0); }
		public TerminalNode KW_ENCODING() { return getToken(XQueryParser.KW_ENCODING, 0); }
		public TerminalNode KW_EQ() { return getToken(XQueryParser.KW_EQ, 0); }
		public TerminalNode KW_EVERY() { return getToken(XQueryParser.KW_EVERY, 0); }
		public TerminalNode KW_EXCEPT() { return getToken(XQueryParser.KW_EXCEPT, 0); }
		public TerminalNode KW_EXTERNAL() { return getToken(XQueryParser.KW_EXTERNAL, 0); }
		public TerminalNode KW_FOLLOWING() { return getToken(XQueryParser.KW_FOLLOWING, 0); }
		public TerminalNode KW_FOLLOWING_SIBLING() { return getToken(XQueryParser.KW_FOLLOWING_SIBLING, 0); }
		public TerminalNode KW_FOR() { return getToken(XQueryParser.KW_FOR, 0); }
		public TerminalNode KW_FUNCTION() { return getToken(XQueryParser.KW_FUNCTION, 0); }
		public TerminalNode KW_GE() { return getToken(XQueryParser.KW_GE, 0); }
		public TerminalNode KW_GREATEST() { return getToken(XQueryParser.KW_GREATEST, 0); }
		public TerminalNode KW_GROUP() { return getToken(XQueryParser.KW_GROUP, 0); }
		public TerminalNode KW_GT() { return getToken(XQueryParser.KW_GT, 0); }
		public TerminalNode KW_IDIV() { return getToken(XQueryParser.KW_IDIV, 0); }
		public TerminalNode KW_IMPORT() { return getToken(XQueryParser.KW_IMPORT, 0); }
		public TerminalNode KW_IN() { return getToken(XQueryParser.KW_IN, 0); }
		public TerminalNode KW_INHERIT() { return getToken(XQueryParser.KW_INHERIT, 0); }
		public TerminalNode KW_INSTANCE() { return getToken(XQueryParser.KW_INSTANCE, 0); }
		public TerminalNode KW_INTERSECT() { return getToken(XQueryParser.KW_INTERSECT, 0); }
		public TerminalNode KW_IS() { return getToken(XQueryParser.KW_IS, 0); }
		public TerminalNode KW_LAX() { return getToken(XQueryParser.KW_LAX, 0); }
		public TerminalNode KW_LE() { return getToken(XQueryParser.KW_LE, 0); }
		public TerminalNode KW_LEAST() { return getToken(XQueryParser.KW_LEAST, 0); }
		public TerminalNode KW_LET() { return getToken(XQueryParser.KW_LET, 0); }
		public TerminalNode KW_LT() { return getToken(XQueryParser.KW_LT, 0); }
		public TerminalNode KW_MOD() { return getToken(XQueryParser.KW_MOD, 0); }
		public TerminalNode KW_MODULE() { return getToken(XQueryParser.KW_MODULE, 0); }
		public TerminalNode KW_NAMESPACE() { return getToken(XQueryParser.KW_NAMESPACE, 0); }
		public TerminalNode KW_NE() { return getToken(XQueryParser.KW_NE, 0); }
		public TerminalNode KW_NO_INHERIT() { return getToken(XQueryParser.KW_NO_INHERIT, 0); }
		public TerminalNode KW_NO_PRESERVE() { return getToken(XQueryParser.KW_NO_PRESERVE, 0); }
		public TerminalNode KW_OF() { return getToken(XQueryParser.KW_OF, 0); }
		public TerminalNode KW_OPTION() { return getToken(XQueryParser.KW_OPTION, 0); }
		public TerminalNode KW_OR() { return getToken(XQueryParser.KW_OR, 0); }
		public TerminalNode KW_ORDER() { return getToken(XQueryParser.KW_ORDER, 0); }
		public TerminalNode KW_ORDERED() { return getToken(XQueryParser.KW_ORDERED, 0); }
		public TerminalNode KW_ORDERING() { return getToken(XQueryParser.KW_ORDERING, 0); }
		public TerminalNode KW_PARENT() { return getToken(XQueryParser.KW_PARENT, 0); }
		public TerminalNode KW_PRECEDING() { return getToken(XQueryParser.KW_PRECEDING, 0); }
		public TerminalNode KW_PRECEDING_SIBLING() { return getToken(XQueryParser.KW_PRECEDING_SIBLING, 0); }
		public TerminalNode KW_PRESERVE() { return getToken(XQueryParser.KW_PRESERVE, 0); }
		public TerminalNode KW_RETURN() { return getToken(XQueryParser.KW_RETURN, 0); }
		public TerminalNode KW_SATISFIES() { return getToken(XQueryParser.KW_SATISFIES, 0); }
		public TerminalNode KW_SCHEMA() { return getToken(XQueryParser.KW_SCHEMA, 0); }
		public TerminalNode KW_SELF() { return getToken(XQueryParser.KW_SELF, 0); }
		public TerminalNode KW_SOME() { return getToken(XQueryParser.KW_SOME, 0); }
		public TerminalNode KW_STABLE() { return getToken(XQueryParser.KW_STABLE, 0); }
		public TerminalNode KW_START() { return getToken(XQueryParser.KW_START, 0); }
		public TerminalNode KW_STRICT() { return getToken(XQueryParser.KW_STRICT, 0); }
		public TerminalNode KW_STRIP() { return getToken(XQueryParser.KW_STRIP, 0); }
		public TerminalNode KW_THEN() { return getToken(XQueryParser.KW_THEN, 0); }
		public TerminalNode KW_TO() { return getToken(XQueryParser.KW_TO, 0); }
		public TerminalNode KW_TREAT() { return getToken(XQueryParser.KW_TREAT, 0); }
		public TerminalNode KW_UNION() { return getToken(XQueryParser.KW_UNION, 0); }
		public TerminalNode KW_UNORDERED() { return getToken(XQueryParser.KW_UNORDERED, 0); }
		public TerminalNode KW_VALIDATE() { return getToken(XQueryParser.KW_VALIDATE, 0); }
		public TerminalNode KW_VARIABLE() { return getToken(XQueryParser.KW_VARIABLE, 0); }
		public TerminalNode KW_VERSION() { return getToken(XQueryParser.KW_VERSION, 0); }
		public TerminalNode KW_WHERE() { return getToken(XQueryParser.KW_WHERE, 0); }
		public TerminalNode KW_XQUERY() { return getToken(XQueryParser.KW_XQUERY, 0); }
		public KeywordOKForFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordOKForFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitKeywordOKForFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordOKForFunctionContext keywordOKForFunction() throws RecognitionException {
		KeywordOKForFunctionContext _localctx = new KeywordOKForFunctionContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_keywordOKForFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2064);
			_la = _input.LA(1);
			if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (KW_ANCESTOR - 54)) | (1L << (KW_ANCESTOR_OR_SELF - 54)) | (1L << (KW_AND - 54)) | (1L << (KW_AS - 54)) | (1L << (KW_ASCENDING - 54)) | (1L << (KW_AT - 54)) | (1L << (KW_BASE_URI - 54)) | (1L << (KW_BOUNDARY_SPACE - 54)) | (1L << (KW_BY - 54)) | (1L << (KW_CASE - 54)) | (1L << (KW_CAST - 54)) | (1L << (KW_CASTABLE - 54)) | (1L << (KW_CHILD - 54)) | (1L << (KW_COLLATION - 54)) | (1L << (KW_CONSTRUCTION - 54)) | (1L << (KW_COPY_NS - 54)) | (1L << (KW_DECLARE - 54)) | (1L << (KW_DEFAULT - 54)) | (1L << (KW_DESCENDANT - 54)) | (1L << (KW_DESCENDANT_OR_SELF - 54)) | (1L << (KW_DESCENDING - 54)) | (1L << (KW_DIV - 54)) | (1L << (KW_DOCUMENT - 54)) | (1L << (KW_ELSE - 54)) | (1L << (KW_EMPTY - 54)) | (1L << (KW_ENCODING - 54)) | (1L << (KW_EQ - 54)) | (1L << (KW_EVERY - 54)) | (1L << (KW_EXCEPT - 54)) | (1L << (KW_EXTERNAL - 54)) | (1L << (KW_FOLLOWING - 54)) | (1L << (KW_FOLLOWING_SIBLING - 54)) | (1L << (KW_FOR - 54)) | (1L << (KW_FUNCTION - 54)) | (1L << (KW_GE - 54)) | (1L << (KW_GREATEST - 54)) | (1L << (KW_GROUP - 54)) | (1L << (KW_GT - 54)) | (1L << (KW_IDIV - 54)) | (1L << (KW_IMPORT - 54)) | (1L << (KW_IN - 54)) | (1L << (KW_INHERIT - 54)) | (1L << (KW_INSTANCE - 54)) | (1L << (KW_INTERSECT - 54)) | (1L << (KW_IS - 54)) | (1L << (KW_LAX - 54)) | (1L << (KW_LE - 54)) | (1L << (KW_LEAST - 54)) | (1L << (KW_LET - 54)) | (1L << (KW_LT - 54)))) != 0) || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (KW_MOD - 119)) | (1L << (KW_MODULE - 119)) | (1L << (KW_NAMESPACE - 119)) | (1L << (KW_NE - 119)) | (1L << (KW_NO_INHERIT - 119)) | (1L << (KW_NO_PRESERVE - 119)) | (1L << (KW_OF - 119)) | (1L << (KW_OPTION - 119)) | (1L << (KW_OR - 119)) | (1L << (KW_ORDER - 119)) | (1L << (KW_ORDERED - 119)) | (1L << (KW_ORDERING - 119)) | (1L << (KW_PARENT - 119)) | (1L << (KW_PRECEDING - 119)) | (1L << (KW_PRECEDING_SIBLING - 119)) | (1L << (KW_PRESERVE - 119)) | (1L << (KW_RETURN - 119)) | (1L << (KW_SATISFIES - 119)) | (1L << (KW_SCHEMA - 119)) | (1L << (KW_SELF - 119)) | (1L << (KW_SOME - 119)) | (1L << (KW_STABLE - 119)) | (1L << (KW_START - 119)) | (1L << (KW_STRICT - 119)) | (1L << (KW_STRIP - 119)) | (1L << (KW_THEN - 119)) | (1L << (KW_TO - 119)) | (1L << (KW_TREAT - 119)) | (1L << (KW_UNION - 119)) | (1L << (KW_UNORDERED - 119)) | (1L << (KW_VALIDATE - 119)) | (1L << (KW_VARIABLE - 119)) | (1L << (KW_VERSION - 119)) | (1L << (KW_WHERE - 119)) | (1L << (KW_XQUERY - 119)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UriLiteralContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public UriLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uriLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitUriLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UriLiteralContext uriLiteral() throws RecognitionException {
		UriLiteralContext _localctx = new UriLiteralContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_uriLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2066);
			stringLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralQuotContext extends ParserRuleContext {
		public List<TerminalNode> Quot() { return getTokens(XQueryParser.Quot); }
		public TerminalNode Quot(int i) {
			return getToken(XQueryParser.Quot, i);
		}
		public List<TerminalNode> PredefinedEntityRef() { return getTokens(XQueryParser.PredefinedEntityRef); }
		public TerminalNode PredefinedEntityRef(int i) {
			return getToken(XQueryParser.PredefinedEntityRef, i);
		}
		public List<TerminalNode> CharRef() { return getTokens(XQueryParser.CharRef); }
		public TerminalNode CharRef(int i) {
			return getToken(XQueryParser.CharRef, i);
		}
		public List<TerminalNode> EscapeQuot() { return getTokens(XQueryParser.EscapeQuot); }
		public TerminalNode EscapeQuot(int i) {
			return getToken(XQueryParser.EscapeQuot, i);
		}
		public List<StringContentQuotContext> stringContentQuot() {
			return getRuleContexts(StringContentQuotContext.class);
		}
		public StringContentQuotContext stringContentQuot(int i) {
			return getRuleContext(StringContentQuotContext.class,i);
		}
		public StringLiteralQuotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteralQuot; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitStringLiteralQuot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralQuotContext stringLiteralQuot() throws RecognitionException {
		StringLiteralQuotContext _localctx = new StringLiteralQuotContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_stringLiteralQuot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2068);
			match(Quot);
			setState(2075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EscapeQuot) | (1L << DOUBLE_LBRACE) | (1L << DOUBLE_RBRACE) | (1L << IntegerLiteral) | (1L << DecimalLiteral) | (1L << DoubleLiteral) | (1L << DFPropertyName) | (1L << PredefinedEntityRef) | (1L << CharRef) | (1L << Apos) | (1L << COMMENT) | (1L << PRAGMA) | (1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACKET) | (1L << RBRACKET) | (1L << LBRACE) | (1L << RBRACE) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << COMMA) | (1L << DOT) | (1L << DDOT) | (1L << COLON) | (1L << COLON_EQ) | (1L << SEMICOLON) | (1L << SLASH) | (1L << DSLASH) | (1L << BACKSLASH) | (1L << VBAR) | (1L << RANGLE) | (1L << QUESTION) | (1L << AT) | (1L << DOLLAR) | (1L << MOD) | (1L << BANG) | (1L << HASH) | (1L << CARAT) | (1L << ARROW) | (1L << GRAVE) | (1L << TILDE) | (1L << KW_ALLOWING) | (1L << KW_ANCESTOR) | (1L << KW_ANCESTOR_OR_SELF) | (1L << KW_AND) | (1L << KW_ARRAY) | (1L << KW_AS) | (1L << KW_ASCENDING) | (1L << KW_AT) | (1L << KW_ATTRIBUTE) | (1L << KW_BASE_URI) | (1L << KW_BOUNDARY_SPACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_BINARY - 64)) | (1L << (KW_BY - 64)) | (1L << (KW_CASE - 64)) | (1L << (KW_CAST - 64)) | (1L << (KW_CASTABLE - 64)) | (1L << (KW_CATCH - 64)) | (1L << (KW_CHILD - 64)) | (1L << (KW_COLLATION - 64)) | (1L << (KW_COMMENT - 64)) | (1L << (KW_CONSTRUCTION - 64)) | (1L << (KW_CONTEXT - 64)) | (1L << (KW_COPY_NS - 64)) | (1L << (KW_COUNT - 64)) | (1L << (KW_DECLARE - 64)) | (1L << (KW_DEFAULT - 64)) | (1L << (KW_DESCENDANT - 64)) | (1L << (KW_DESCENDANT_OR_SELF - 64)) | (1L << (KW_DESCENDING - 64)) | (1L << (KW_DECIMAL_FORMAT - 64)) | (1L << (KW_DIV - 64)) | (1L << (KW_DOCUMENT - 64)) | (1L << (KW_DOCUMENT_NODE - 64)) | (1L << (KW_ELEMENT - 64)) | (1L << (KW_ELSE - 64)) | (1L << (KW_EMPTY - 64)) | (1L << (KW_EMPTY_SEQUENCE - 64)) | (1L << (KW_ENCODING - 64)) | (1L << (KW_END - 64)) | (1L << (KW_EQ - 64)) | (1L << (KW_EVERY - 64)) | (1L << (KW_EXCEPT - 64)) | (1L << (KW_EXTERNAL - 64)) | (1L << (KW_FOLLOWING - 64)) | (1L << (KW_FOLLOWING_SIBLING - 64)) | (1L << (KW_FOR - 64)) | (1L << (KW_FUNCTION - 64)) | (1L << (KW_GE - 64)) | (1L << (KW_GREATEST - 64)) | (1L << (KW_GROUP - 64)) | (1L << (KW_GT - 64)) | (1L << (KW_IDIV - 64)) | (1L << (KW_IF - 64)) | (1L << (KW_IMPORT - 64)) | (1L << (KW_IN - 64)) | (1L << (KW_INHERIT - 64)) | (1L << (KW_INSTANCE - 64)) | (1L << (KW_INTERSECT - 64)) | (1L << (KW_IS - 64)) | (1L << (KW_ITEM - 64)) | (1L << (KW_LAX - 64)) | (1L << (KW_LE - 64)) | (1L << (KW_LEAST - 64)) | (1L << (KW_LET - 64)) | (1L << (KW_LT - 64)) | (1L << (KW_MAP - 64)) | (1L << (KW_MOD - 64)) | (1L << (KW_MODULE - 64)) | (1L << (KW_NAMESPACE - 64)) | (1L << (KW_NE - 64)) | (1L << (KW_NEXT - 64)) | (1L << (KW_NAMESPACE_NODE - 64)) | (1L << (KW_NO_INHERIT - 64)) | (1L << (KW_NO_PRESERVE - 64)) | (1L << (KW_NODE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (KW_OF - 128)) | (1L << (KW_ONLY - 128)) | (1L << (KW_OPTION - 128)) | (1L << (KW_OR - 128)) | (1L << (KW_ORDER - 128)) | (1L << (KW_ORDERED - 128)) | (1L << (KW_ORDERING - 128)) | (1L << (KW_PARENT - 128)) | (1L << (KW_PRECEDING - 128)) | (1L << (KW_PRECEDING_SIBLING - 128)) | (1L << (KW_PRESERVE - 128)) | (1L << (KW_PREVIOUS - 128)) | (1L << (KW_PI - 128)) | (1L << (KW_RETURN - 128)) | (1L << (KW_SATISFIES - 128)) | (1L << (KW_SCHEMA - 128)) | (1L << (KW_SCHEMA_ATTR - 128)) | (1L << (KW_SCHEMA_ELEM - 128)) | (1L << (KW_SELF - 128)) | (1L << (KW_SLIDING - 128)) | (1L << (KW_SOME - 128)) | (1L << (KW_STABLE - 128)) | (1L << (KW_START - 128)) | (1L << (KW_STRICT - 128)) | (1L << (KW_STRIP - 128)) | (1L << (KW_SWITCH - 128)) | (1L << (KW_TEXT - 128)) | (1L << (KW_THEN - 128)) | (1L << (KW_TO - 128)) | (1L << (KW_TREAT - 128)) | (1L << (KW_TRY - 128)) | (1L << (KW_TUMBLING - 128)) | (1L << (KW_TYPE - 128)) | (1L << (KW_TYPESWITCH - 128)) | (1L << (KW_UNION - 128)) | (1L << (KW_UNORDERED - 128)) | (1L << (KW_UPDATE - 128)) | (1L << (KW_VALIDATE - 128)) | (1L << (KW_VARIABLE - 128)) | (1L << (KW_VERSION - 128)) | (1L << (KW_WHEN - 128)) | (1L << (KW_WHERE - 128)) | (1L << (KW_WINDOW - 128)) | (1L << (KW_XQUERY - 128)) | (1L << (KW_ARRAY_NODE - 128)) | (1L << (KW_BOOLEAN_NODE - 128)) | (1L << (KW_NULL_NODE - 128)) | (1L << (KW_NUMBER_NODE - 128)) | (1L << (KW_OBJECT_NODE - 128)) | (1L << (KW_REPLACE - 128)) | (1L << (KW_WITH - 128)) | (1L << (KW_VALUE - 128)) | (1L << (KW_INSERT - 128)) | (1L << (KW_INTO - 128)) | (1L << (KW_DELETE - 128)) | (1L << (KW_RENAME - 128)) | (1L << (URIQualifiedName - 128)) | (1L << (FullQName - 128)) | (1L << (NCNameWithLocalWildcard - 128)) | (1L << (NCNameWithPrefixWildcard - 128)) | (1L << (NCName - 128)) | (1L << (XQDOC_COMMENT_START - 128)))) != 0) || _la==ContentChar) {
				{
				setState(2073);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PredefinedEntityRef:
					{
					setState(2069);
					match(PredefinedEntityRef);
					}
					break;
				case CharRef:
					{
					setState(2070);
					match(CharRef);
					}
					break;
				case EscapeQuot:
					{
					setState(2071);
					match(EscapeQuot);
					}
					break;
				case DOUBLE_LBRACE:
				case DOUBLE_RBRACE:
				case IntegerLiteral:
				case DecimalLiteral:
				case DoubleLiteral:
				case DFPropertyName:
				case Apos:
				case COMMENT:
				case PRAGMA:
				case EQUAL:
				case NOT_EQUAL:
				case LPAREN:
				case RPAREN:
				case LBRACKET:
				case RBRACKET:
				case LBRACE:
				case RBRACE:
				case STAR:
				case PLUS:
				case MINUS:
				case COMMA:
				case DOT:
				case DDOT:
				case COLON:
				case COLON_EQ:
				case SEMICOLON:
				case SLASH:
				case DSLASH:
				case BACKSLASH:
				case VBAR:
				case RANGLE:
				case QUESTION:
				case AT:
				case DOLLAR:
				case MOD:
				case BANG:
				case HASH:
				case CARAT:
				case ARROW:
				case GRAVE:
				case TILDE:
				case KW_ALLOWING:
				case KW_ANCESTOR:
				case KW_ANCESTOR_OR_SELF:
				case KW_AND:
				case KW_ARRAY:
				case KW_AS:
				case KW_ASCENDING:
				case KW_AT:
				case KW_ATTRIBUTE:
				case KW_BASE_URI:
				case KW_BOUNDARY_SPACE:
				case KW_BINARY:
				case KW_BY:
				case KW_CASE:
				case KW_CAST:
				case KW_CASTABLE:
				case KW_CATCH:
				case KW_CHILD:
				case KW_COLLATION:
				case KW_COMMENT:
				case KW_CONSTRUCTION:
				case KW_CONTEXT:
				case KW_COPY_NS:
				case KW_COUNT:
				case KW_DECLARE:
				case KW_DEFAULT:
				case KW_DESCENDANT:
				case KW_DESCENDANT_OR_SELF:
				case KW_DESCENDING:
				case KW_DECIMAL_FORMAT:
				case KW_DIV:
				case KW_DOCUMENT:
				case KW_DOCUMENT_NODE:
				case KW_ELEMENT:
				case KW_ELSE:
				case KW_EMPTY:
				case KW_EMPTY_SEQUENCE:
				case KW_ENCODING:
				case KW_END:
				case KW_EQ:
				case KW_EVERY:
				case KW_EXCEPT:
				case KW_EXTERNAL:
				case KW_FOLLOWING:
				case KW_FOLLOWING_SIBLING:
				case KW_FOR:
				case KW_FUNCTION:
				case KW_GE:
				case KW_GREATEST:
				case KW_GROUP:
				case KW_GT:
				case KW_IDIV:
				case KW_IF:
				case KW_IMPORT:
				case KW_IN:
				case KW_INHERIT:
				case KW_INSTANCE:
				case KW_INTERSECT:
				case KW_IS:
				case KW_ITEM:
				case KW_LAX:
				case KW_LE:
				case KW_LEAST:
				case KW_LET:
				case KW_LT:
				case KW_MAP:
				case KW_MOD:
				case KW_MODULE:
				case KW_NAMESPACE:
				case KW_NE:
				case KW_NEXT:
				case KW_NAMESPACE_NODE:
				case KW_NO_INHERIT:
				case KW_NO_PRESERVE:
				case KW_NODE:
				case KW_OF:
				case KW_ONLY:
				case KW_OPTION:
				case KW_OR:
				case KW_ORDER:
				case KW_ORDERED:
				case KW_ORDERING:
				case KW_PARENT:
				case KW_PRECEDING:
				case KW_PRECEDING_SIBLING:
				case KW_PRESERVE:
				case KW_PREVIOUS:
				case KW_PI:
				case KW_RETURN:
				case KW_SATISFIES:
				case KW_SCHEMA:
				case KW_SCHEMA_ATTR:
				case KW_SCHEMA_ELEM:
				case KW_SELF:
				case KW_SLIDING:
				case KW_SOME:
				case KW_STABLE:
				case KW_START:
				case KW_STRICT:
				case KW_STRIP:
				case KW_SWITCH:
				case KW_TEXT:
				case KW_THEN:
				case KW_TO:
				case KW_TREAT:
				case KW_TRY:
				case KW_TUMBLING:
				case KW_TYPE:
				case KW_TYPESWITCH:
				case KW_UNION:
				case KW_UNORDERED:
				case KW_UPDATE:
				case KW_VALIDATE:
				case KW_VARIABLE:
				case KW_VERSION:
				case KW_WHEN:
				case KW_WHERE:
				case KW_WINDOW:
				case KW_XQUERY:
				case KW_ARRAY_NODE:
				case KW_BOOLEAN_NODE:
				case KW_NULL_NODE:
				case KW_NUMBER_NODE:
				case KW_OBJECT_NODE:
				case KW_REPLACE:
				case KW_WITH:
				case KW_VALUE:
				case KW_INSERT:
				case KW_INTO:
				case KW_DELETE:
				case KW_RENAME:
				case URIQualifiedName:
				case FullQName:
				case NCNameWithLocalWildcard:
				case NCNameWithPrefixWildcard:
				case NCName:
				case XQDOC_COMMENT_START:
				case ContentChar:
					{
					setState(2072);
					stringContentQuot();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2077);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2078);
			match(Quot);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralAposContext extends ParserRuleContext {
		public List<TerminalNode> Apos() { return getTokens(XQueryParser.Apos); }
		public TerminalNode Apos(int i) {
			return getToken(XQueryParser.Apos, i);
		}
		public List<TerminalNode> PredefinedEntityRef() { return getTokens(XQueryParser.PredefinedEntityRef); }
		public TerminalNode PredefinedEntityRef(int i) {
			return getToken(XQueryParser.PredefinedEntityRef, i);
		}
		public List<TerminalNode> CharRef() { return getTokens(XQueryParser.CharRef); }
		public TerminalNode CharRef(int i) {
			return getToken(XQueryParser.CharRef, i);
		}
		public List<TerminalNode> EscapeApos() { return getTokens(XQueryParser.EscapeApos); }
		public TerminalNode EscapeApos(int i) {
			return getToken(XQueryParser.EscapeApos, i);
		}
		public List<StringContentAposContext> stringContentApos() {
			return getRuleContexts(StringContentAposContext.class);
		}
		public StringContentAposContext stringContentApos(int i) {
			return getRuleContext(StringContentAposContext.class,i);
		}
		public StringLiteralAposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteralApos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitStringLiteralApos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralAposContext stringLiteralApos() throws RecognitionException {
		StringLiteralAposContext _localctx = new StringLiteralAposContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_stringLiteralApos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2080);
			match(Apos);
			setState(2087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EscapeApos) | (1L << DOUBLE_LBRACE) | (1L << DOUBLE_RBRACE) | (1L << IntegerLiteral) | (1L << DecimalLiteral) | (1L << DoubleLiteral) | (1L << DFPropertyName) | (1L << PredefinedEntityRef) | (1L << CharRef) | (1L << Quot) | (1L << COMMENT) | (1L << PRAGMA) | (1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACKET) | (1L << RBRACKET) | (1L << LBRACE) | (1L << RBRACE) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << COMMA) | (1L << DOT) | (1L << DDOT) | (1L << COLON) | (1L << COLON_EQ) | (1L << SEMICOLON) | (1L << SLASH) | (1L << DSLASH) | (1L << BACKSLASH) | (1L << VBAR) | (1L << RANGLE) | (1L << QUESTION) | (1L << AT) | (1L << DOLLAR) | (1L << MOD) | (1L << BANG) | (1L << HASH) | (1L << CARAT) | (1L << ARROW) | (1L << GRAVE) | (1L << TILDE) | (1L << KW_ALLOWING) | (1L << KW_ANCESTOR) | (1L << KW_ANCESTOR_OR_SELF) | (1L << KW_AND) | (1L << KW_ARRAY) | (1L << KW_AS) | (1L << KW_ASCENDING) | (1L << KW_AT) | (1L << KW_ATTRIBUTE) | (1L << KW_BASE_URI) | (1L << KW_BOUNDARY_SPACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_BINARY - 64)) | (1L << (KW_BY - 64)) | (1L << (KW_CASE - 64)) | (1L << (KW_CAST - 64)) | (1L << (KW_CASTABLE - 64)) | (1L << (KW_CATCH - 64)) | (1L << (KW_CHILD - 64)) | (1L << (KW_COLLATION - 64)) | (1L << (KW_COMMENT - 64)) | (1L << (KW_CONSTRUCTION - 64)) | (1L << (KW_CONTEXT - 64)) | (1L << (KW_COPY_NS - 64)) | (1L << (KW_COUNT - 64)) | (1L << (KW_DECLARE - 64)) | (1L << (KW_DEFAULT - 64)) | (1L << (KW_DESCENDANT - 64)) | (1L << (KW_DESCENDANT_OR_SELF - 64)) | (1L << (KW_DESCENDING - 64)) | (1L << (KW_DECIMAL_FORMAT - 64)) | (1L << (KW_DIV - 64)) | (1L << (KW_DOCUMENT - 64)) | (1L << (KW_DOCUMENT_NODE - 64)) | (1L << (KW_ELEMENT - 64)) | (1L << (KW_ELSE - 64)) | (1L << (KW_EMPTY - 64)) | (1L << (KW_EMPTY_SEQUENCE - 64)) | (1L << (KW_ENCODING - 64)) | (1L << (KW_END - 64)) | (1L << (KW_EQ - 64)) | (1L << (KW_EVERY - 64)) | (1L << (KW_EXCEPT - 64)) | (1L << (KW_EXTERNAL - 64)) | (1L << (KW_FOLLOWING - 64)) | (1L << (KW_FOLLOWING_SIBLING - 64)) | (1L << (KW_FOR - 64)) | (1L << (KW_FUNCTION - 64)) | (1L << (KW_GE - 64)) | (1L << (KW_GREATEST - 64)) | (1L << (KW_GROUP - 64)) | (1L << (KW_GT - 64)) | (1L << (KW_IDIV - 64)) | (1L << (KW_IF - 64)) | (1L << (KW_IMPORT - 64)) | (1L << (KW_IN - 64)) | (1L << (KW_INHERIT - 64)) | (1L << (KW_INSTANCE - 64)) | (1L << (KW_INTERSECT - 64)) | (1L << (KW_IS - 64)) | (1L << (KW_ITEM - 64)) | (1L << (KW_LAX - 64)) | (1L << (KW_LE - 64)) | (1L << (KW_LEAST - 64)) | (1L << (KW_LET - 64)) | (1L << (KW_LT - 64)) | (1L << (KW_MAP - 64)) | (1L << (KW_MOD - 64)) | (1L << (KW_MODULE - 64)) | (1L << (KW_NAMESPACE - 64)) | (1L << (KW_NE - 64)) | (1L << (KW_NEXT - 64)) | (1L << (KW_NAMESPACE_NODE - 64)) | (1L << (KW_NO_INHERIT - 64)) | (1L << (KW_NO_PRESERVE - 64)) | (1L << (KW_NODE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (KW_OF - 128)) | (1L << (KW_ONLY - 128)) | (1L << (KW_OPTION - 128)) | (1L << (KW_OR - 128)) | (1L << (KW_ORDER - 128)) | (1L << (KW_ORDERED - 128)) | (1L << (KW_ORDERING - 128)) | (1L << (KW_PARENT - 128)) | (1L << (KW_PRECEDING - 128)) | (1L << (KW_PRECEDING_SIBLING - 128)) | (1L << (KW_PRESERVE - 128)) | (1L << (KW_PREVIOUS - 128)) | (1L << (KW_PI - 128)) | (1L << (KW_RETURN - 128)) | (1L << (KW_SATISFIES - 128)) | (1L << (KW_SCHEMA - 128)) | (1L << (KW_SCHEMA_ATTR - 128)) | (1L << (KW_SCHEMA_ELEM - 128)) | (1L << (KW_SELF - 128)) | (1L << (KW_SLIDING - 128)) | (1L << (KW_SOME - 128)) | (1L << (KW_STABLE - 128)) | (1L << (KW_START - 128)) | (1L << (KW_STRICT - 128)) | (1L << (KW_STRIP - 128)) | (1L << (KW_SWITCH - 128)) | (1L << (KW_TEXT - 128)) | (1L << (KW_THEN - 128)) | (1L << (KW_TO - 128)) | (1L << (KW_TREAT - 128)) | (1L << (KW_TRY - 128)) | (1L << (KW_TUMBLING - 128)) | (1L << (KW_TYPE - 128)) | (1L << (KW_TYPESWITCH - 128)) | (1L << (KW_UNION - 128)) | (1L << (KW_UNORDERED - 128)) | (1L << (KW_UPDATE - 128)) | (1L << (KW_VALIDATE - 128)) | (1L << (KW_VARIABLE - 128)) | (1L << (KW_VERSION - 128)) | (1L << (KW_WHEN - 128)) | (1L << (KW_WHERE - 128)) | (1L << (KW_WINDOW - 128)) | (1L << (KW_XQUERY - 128)) | (1L << (KW_ARRAY_NODE - 128)) | (1L << (KW_BOOLEAN_NODE - 128)) | (1L << (KW_NULL_NODE - 128)) | (1L << (KW_NUMBER_NODE - 128)) | (1L << (KW_OBJECT_NODE - 128)) | (1L << (KW_REPLACE - 128)) | (1L << (KW_WITH - 128)) | (1L << (KW_VALUE - 128)) | (1L << (KW_INSERT - 128)) | (1L << (KW_INTO - 128)) | (1L << (KW_DELETE - 128)) | (1L << (KW_RENAME - 128)) | (1L << (URIQualifiedName - 128)) | (1L << (FullQName - 128)) | (1L << (NCNameWithLocalWildcard - 128)) | (1L << (NCNameWithPrefixWildcard - 128)) | (1L << (NCName - 128)) | (1L << (XQDOC_COMMENT_START - 128)))) != 0) || _la==ContentChar) {
				{
				setState(2085);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PredefinedEntityRef:
					{
					setState(2081);
					match(PredefinedEntityRef);
					}
					break;
				case CharRef:
					{
					setState(2082);
					match(CharRef);
					}
					break;
				case EscapeApos:
					{
					setState(2083);
					match(EscapeApos);
					}
					break;
				case DOUBLE_LBRACE:
				case DOUBLE_RBRACE:
				case IntegerLiteral:
				case DecimalLiteral:
				case DoubleLiteral:
				case DFPropertyName:
				case Quot:
				case COMMENT:
				case PRAGMA:
				case EQUAL:
				case NOT_EQUAL:
				case LPAREN:
				case RPAREN:
				case LBRACKET:
				case RBRACKET:
				case LBRACE:
				case RBRACE:
				case STAR:
				case PLUS:
				case MINUS:
				case COMMA:
				case DOT:
				case DDOT:
				case COLON:
				case COLON_EQ:
				case SEMICOLON:
				case SLASH:
				case DSLASH:
				case BACKSLASH:
				case VBAR:
				case RANGLE:
				case QUESTION:
				case AT:
				case DOLLAR:
				case MOD:
				case BANG:
				case HASH:
				case CARAT:
				case ARROW:
				case GRAVE:
				case TILDE:
				case KW_ALLOWING:
				case KW_ANCESTOR:
				case KW_ANCESTOR_OR_SELF:
				case KW_AND:
				case KW_ARRAY:
				case KW_AS:
				case KW_ASCENDING:
				case KW_AT:
				case KW_ATTRIBUTE:
				case KW_BASE_URI:
				case KW_BOUNDARY_SPACE:
				case KW_BINARY:
				case KW_BY:
				case KW_CASE:
				case KW_CAST:
				case KW_CASTABLE:
				case KW_CATCH:
				case KW_CHILD:
				case KW_COLLATION:
				case KW_COMMENT:
				case KW_CONSTRUCTION:
				case KW_CONTEXT:
				case KW_COPY_NS:
				case KW_COUNT:
				case KW_DECLARE:
				case KW_DEFAULT:
				case KW_DESCENDANT:
				case KW_DESCENDANT_OR_SELF:
				case KW_DESCENDING:
				case KW_DECIMAL_FORMAT:
				case KW_DIV:
				case KW_DOCUMENT:
				case KW_DOCUMENT_NODE:
				case KW_ELEMENT:
				case KW_ELSE:
				case KW_EMPTY:
				case KW_EMPTY_SEQUENCE:
				case KW_ENCODING:
				case KW_END:
				case KW_EQ:
				case KW_EVERY:
				case KW_EXCEPT:
				case KW_EXTERNAL:
				case KW_FOLLOWING:
				case KW_FOLLOWING_SIBLING:
				case KW_FOR:
				case KW_FUNCTION:
				case KW_GE:
				case KW_GREATEST:
				case KW_GROUP:
				case KW_GT:
				case KW_IDIV:
				case KW_IF:
				case KW_IMPORT:
				case KW_IN:
				case KW_INHERIT:
				case KW_INSTANCE:
				case KW_INTERSECT:
				case KW_IS:
				case KW_ITEM:
				case KW_LAX:
				case KW_LE:
				case KW_LEAST:
				case KW_LET:
				case KW_LT:
				case KW_MAP:
				case KW_MOD:
				case KW_MODULE:
				case KW_NAMESPACE:
				case KW_NE:
				case KW_NEXT:
				case KW_NAMESPACE_NODE:
				case KW_NO_INHERIT:
				case KW_NO_PRESERVE:
				case KW_NODE:
				case KW_OF:
				case KW_ONLY:
				case KW_OPTION:
				case KW_OR:
				case KW_ORDER:
				case KW_ORDERED:
				case KW_ORDERING:
				case KW_PARENT:
				case KW_PRECEDING:
				case KW_PRECEDING_SIBLING:
				case KW_PRESERVE:
				case KW_PREVIOUS:
				case KW_PI:
				case KW_RETURN:
				case KW_SATISFIES:
				case KW_SCHEMA:
				case KW_SCHEMA_ATTR:
				case KW_SCHEMA_ELEM:
				case KW_SELF:
				case KW_SLIDING:
				case KW_SOME:
				case KW_STABLE:
				case KW_START:
				case KW_STRICT:
				case KW_STRIP:
				case KW_SWITCH:
				case KW_TEXT:
				case KW_THEN:
				case KW_TO:
				case KW_TREAT:
				case KW_TRY:
				case KW_TUMBLING:
				case KW_TYPE:
				case KW_TYPESWITCH:
				case KW_UNION:
				case KW_UNORDERED:
				case KW_UPDATE:
				case KW_VALIDATE:
				case KW_VARIABLE:
				case KW_VERSION:
				case KW_WHEN:
				case KW_WHERE:
				case KW_WINDOW:
				case KW_XQUERY:
				case KW_ARRAY_NODE:
				case KW_BOOLEAN_NODE:
				case KW_NULL_NODE:
				case KW_NUMBER_NODE:
				case KW_OBJECT_NODE:
				case KW_REPLACE:
				case KW_WITH:
				case KW_VALUE:
				case KW_INSERT:
				case KW_INTO:
				case KW_DELETE:
				case KW_RENAME:
				case URIQualifiedName:
				case FullQName:
				case NCNameWithLocalWildcard:
				case NCNameWithPrefixWildcard:
				case NCName:
				case XQDOC_COMMENT_START:
				case ContentChar:
					{
					setState(2084);
					stringContentApos();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2089);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2090);
			match(Apos);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public StringLiteralQuotContext stringLiteralQuot() {
			return getRuleContext(StringLiteralQuotContext.class,0);
		}
		public StringLiteralAposContext stringLiteralApos() {
			return getRuleContext(StringLiteralAposContext.class,0);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_stringLiteral);
		try {
			setState(2094);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Quot:
				enterOuterAlt(_localctx, 1);
				{
				setState(2092);
				stringLiteralQuot();
				}
				break;
			case Apos:
				enterOuterAlt(_localctx, 2);
				{
				setState(2093);
				stringLiteralApos();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContentQuotContext extends ParserRuleContext {
		public List<TerminalNode> ContentChar() { return getTokens(XQueryParser.ContentChar); }
		public TerminalNode ContentChar(int i) {
			return getToken(XQueryParser.ContentChar, i);
		}
		public TerminalNode LBRACE() { return getToken(XQueryParser.LBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(XQueryParser.RBRACE, 0); }
		public TerminalNode DOUBLE_LBRACE() { return getToken(XQueryParser.DOUBLE_LBRACE, 0); }
		public TerminalNode DOUBLE_RBRACE() { return getToken(XQueryParser.DOUBLE_RBRACE, 0); }
		public NoQuotesNoBracesNoAmpNoLAngContext noQuotesNoBracesNoAmpNoLAng() {
			return getRuleContext(NoQuotesNoBracesNoAmpNoLAngContext.class,0);
		}
		public StringLiteralAposContext stringLiteralApos() {
			return getRuleContext(StringLiteralAposContext.class,0);
		}
		public StringContentQuotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringContentQuot; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitStringContentQuot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContentQuotContext stringContentQuot() throws RecognitionException {
		StringContentQuotContext _localctx = new StringContentQuotContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_stringContentQuot);
		try {
			int _alt;
			setState(2113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2097); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2096);
						match(ContentChar);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2099); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2101);
				match(LBRACE);
				setState(2103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(2102);
					expr();
					}
					break;
				}
				setState(2106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(2105);
					match(RBRACE);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2108);
				match(RBRACE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2109);
				match(DOUBLE_LBRACE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2110);
				match(DOUBLE_RBRACE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2111);
				noQuotesNoBracesNoAmpNoLAng();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2112);
				stringLiteralApos();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContentAposContext extends ParserRuleContext {
		public List<TerminalNode> ContentChar() { return getTokens(XQueryParser.ContentChar); }
		public TerminalNode ContentChar(int i) {
			return getToken(XQueryParser.ContentChar, i);
		}
		public TerminalNode LBRACE() { return getToken(XQueryParser.LBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(XQueryParser.RBRACE, 0); }
		public TerminalNode DOUBLE_LBRACE() { return getToken(XQueryParser.DOUBLE_LBRACE, 0); }
		public TerminalNode DOUBLE_RBRACE() { return getToken(XQueryParser.DOUBLE_RBRACE, 0); }
		public NoQuotesNoBracesNoAmpNoLAngContext noQuotesNoBracesNoAmpNoLAng() {
			return getRuleContext(NoQuotesNoBracesNoAmpNoLAngContext.class,0);
		}
		public StringLiteralQuotContext stringLiteralQuot() {
			return getRuleContext(StringLiteralQuotContext.class,0);
		}
		public StringContentAposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringContentApos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitStringContentApos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContentAposContext stringContentApos() throws RecognitionException {
		StringContentAposContext _localctx = new StringContentAposContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_stringContentApos);
		try {
			int _alt;
			setState(2132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2116); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2115);
						match(ContentChar);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2118); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2120);
				match(LBRACE);
				setState(2122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(2121);
					expr();
					}
					break;
				}
				setState(2125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(2124);
					match(RBRACE);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2127);
				match(RBRACE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2128);
				match(DOUBLE_LBRACE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2129);
				match(DOUBLE_RBRACE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2130);
				noQuotesNoBracesNoAmpNoLAng();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2131);
				stringLiteralQuot();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoQuotesNoBracesNoAmpNoLAngContext extends ParserRuleContext {
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public List<TerminalNode> IntegerLiteral() { return getTokens(XQueryParser.IntegerLiteral); }
		public TerminalNode IntegerLiteral(int i) {
			return getToken(XQueryParser.IntegerLiteral, i);
		}
		public List<TerminalNode> DecimalLiteral() { return getTokens(XQueryParser.DecimalLiteral); }
		public TerminalNode DecimalLiteral(int i) {
			return getToken(XQueryParser.DecimalLiteral, i);
		}
		public List<TerminalNode> DoubleLiteral() { return getTokens(XQueryParser.DoubleLiteral); }
		public TerminalNode DoubleLiteral(int i) {
			return getToken(XQueryParser.DoubleLiteral, i);
		}
		public List<TerminalNode> PRAGMA() { return getTokens(XQueryParser.PRAGMA); }
		public TerminalNode PRAGMA(int i) {
			return getToken(XQueryParser.PRAGMA, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(XQueryParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(XQueryParser.EQUAL, i);
		}
		public List<TerminalNode> HASH() { return getTokens(XQueryParser.HASH); }
		public TerminalNode HASH(int i) {
			return getToken(XQueryParser.HASH, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(XQueryParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(XQueryParser.NOT_EQUAL, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(XQueryParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(XQueryParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(XQueryParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(XQueryParser.RPAREN, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(XQueryParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(XQueryParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(XQueryParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(XQueryParser.RBRACKET, i);
		}
		public List<TerminalNode> STAR() { return getTokens(XQueryParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(XQueryParser.STAR, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(XQueryParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(XQueryParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(XQueryParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(XQueryParser.MINUS, i);
		}
		public List<TerminalNode> TILDE() { return getTokens(XQueryParser.TILDE); }
		public TerminalNode TILDE(int i) {
			return getToken(XQueryParser.TILDE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public List<TerminalNode> ARROW() { return getTokens(XQueryParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(XQueryParser.ARROW, i);
		}
		public List<TerminalNode> KW_NEXT() { return getTokens(XQueryParser.KW_NEXT); }
		public TerminalNode KW_NEXT(int i) {
			return getToken(XQueryParser.KW_NEXT, i);
		}
		public List<TerminalNode> KW_PREVIOUS() { return getTokens(XQueryParser.KW_PREVIOUS); }
		public TerminalNode KW_PREVIOUS(int i) {
			return getToken(XQueryParser.KW_PREVIOUS, i);
		}
		public List<TerminalNode> MOD() { return getTokens(XQueryParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(XQueryParser.MOD, i);
		}
		public List<TerminalNode> DOT() { return getTokens(XQueryParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(XQueryParser.DOT, i);
		}
		public List<TerminalNode> GRAVE() { return getTokens(XQueryParser.GRAVE); }
		public TerminalNode GRAVE(int i) {
			return getToken(XQueryParser.GRAVE, i);
		}
		public List<TerminalNode> DDOT() { return getTokens(XQueryParser.DDOT); }
		public TerminalNode DDOT(int i) {
			return getToken(XQueryParser.DDOT, i);
		}
		public List<TerminalNode> XQDOC_COMMENT_START() { return getTokens(XQueryParser.XQDOC_COMMENT_START); }
		public TerminalNode XQDOC_COMMENT_START(int i) {
			return getToken(XQueryParser.XQDOC_COMMENT_START, i);
		}
		public List<TerminalNode> COLON() { return getTokens(XQueryParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(XQueryParser.COLON, i);
		}
		public List<TerminalNode> CARAT() { return getTokens(XQueryParser.CARAT); }
		public TerminalNode CARAT(int i) {
			return getToken(XQueryParser.CARAT, i);
		}
		public List<TerminalNode> COLON_EQ() { return getTokens(XQueryParser.COLON_EQ); }
		public TerminalNode COLON_EQ(int i) {
			return getToken(XQueryParser.COLON_EQ, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(XQueryParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(XQueryParser.SEMICOLON, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(XQueryParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(XQueryParser.SLASH, i);
		}
		public List<TerminalNode> DSLASH() { return getTokens(XQueryParser.DSLASH); }
		public TerminalNode DSLASH(int i) {
			return getToken(XQueryParser.DSLASH, i);
		}
		public List<TerminalNode> BACKSLASH() { return getTokens(XQueryParser.BACKSLASH); }
		public TerminalNode BACKSLASH(int i) {
			return getToken(XQueryParser.BACKSLASH, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(XQueryParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(XQueryParser.COMMENT, i);
		}
		public List<TerminalNode> VBAR() { return getTokens(XQueryParser.VBAR); }
		public TerminalNode VBAR(int i) {
			return getToken(XQueryParser.VBAR, i);
		}
		public List<TerminalNode> RANGLE() { return getTokens(XQueryParser.RANGLE); }
		public TerminalNode RANGLE(int i) {
			return getToken(XQueryParser.RANGLE, i);
		}
		public List<TerminalNode> QUESTION() { return getTokens(XQueryParser.QUESTION); }
		public TerminalNode QUESTION(int i) {
			return getToken(XQueryParser.QUESTION, i);
		}
		public List<TerminalNode> AT() { return getTokens(XQueryParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(XQueryParser.AT, i);
		}
		public List<TerminalNode> DOLLAR() { return getTokens(XQueryParser.DOLLAR); }
		public TerminalNode DOLLAR(int i) {
			return getToken(XQueryParser.DOLLAR, i);
		}
		public List<TerminalNode> BANG() { return getTokens(XQueryParser.BANG); }
		public TerminalNode BANG(int i) {
			return getToken(XQueryParser.BANG, i);
		}
		public List<TerminalNode> FullQName() { return getTokens(XQueryParser.FullQName); }
		public TerminalNode FullQName(int i) {
			return getToken(XQueryParser.FullQName, i);
		}
		public List<TerminalNode> URIQualifiedName() { return getTokens(XQueryParser.URIQualifiedName); }
		public TerminalNode URIQualifiedName(int i) {
			return getToken(XQueryParser.URIQualifiedName, i);
		}
		public List<TerminalNode> NCNameWithLocalWildcard() { return getTokens(XQueryParser.NCNameWithLocalWildcard); }
		public TerminalNode NCNameWithLocalWildcard(int i) {
			return getToken(XQueryParser.NCNameWithLocalWildcard, i);
		}
		public List<TerminalNode> NCNameWithPrefixWildcard() { return getTokens(XQueryParser.NCNameWithPrefixWildcard); }
		public TerminalNode NCNameWithPrefixWildcard(int i) {
			return getToken(XQueryParser.NCNameWithPrefixWildcard, i);
		}
		public List<TerminalNode> NCName() { return getTokens(XQueryParser.NCName); }
		public TerminalNode NCName(int i) {
			return getToken(XQueryParser.NCName, i);
		}
		public List<TerminalNode> ContentChar() { return getTokens(XQueryParser.ContentChar); }
		public TerminalNode ContentChar(int i) {
			return getToken(XQueryParser.ContentChar, i);
		}
		public NoQuotesNoBracesNoAmpNoLAngContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noQuotesNoBracesNoAmpNoLAng; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryParserVisitor ) return ((XQueryParserVisitor<? extends T>)visitor).visitNoQuotesNoBracesNoAmpNoLAng(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoQuotesNoBracesNoAmpNoLAngContext noQuotesNoBracesNoAmpNoLAng() throws RecognitionException {
		NoQuotesNoBracesNoAmpNoLAngContext _localctx = new NoQuotesNoBracesNoAmpNoLAngContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_noQuotesNoBracesNoAmpNoLAng);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2136); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(2136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
					case 1:
						{
						setState(2134);
						keyword();
						}
						break;
					case 2:
						{
						setState(2135);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << DecimalLiteral) | (1L << DoubleLiteral) | (1L << COMMENT) | (1L << PRAGMA) | (1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACKET) | (1L << RBRACKET) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << COMMA) | (1L << DOT) | (1L << DDOT) | (1L << COLON) | (1L << COLON_EQ) | (1L << SEMICOLON) | (1L << SLASH) | (1L << DSLASH) | (1L << BACKSLASH) | (1L << VBAR) | (1L << RANGLE) | (1L << QUESTION) | (1L << AT) | (1L << DOLLAR) | (1L << MOD) | (1L << BANG) | (1L << HASH) | (1L << CARAT) | (1L << ARROW) | (1L << GRAVE) | (1L << TILDE))) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (KW_NEXT - 123)) | (1L << (KW_PREVIOUS - 123)) | (1L << (URIQualifiedName - 123)) | (1L << (FullQName - 123)) | (1L << (NCNameWithLocalWildcard - 123)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (NCNameWithPrefixWildcard - 187)) | (1L << (NCName - 187)) | (1L << (XQDOC_COMMENT_START - 187)) | (1L << (ContentChar - 187)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2138); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00cd\u085f\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\3\2\5\2\u01e4\n\2\3\2\5\2\u01e7\n\2\3\2\5\2\u01ea\n\2\3\2\3\2"+
		"\5\2\u01ee\n\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\u01f7\n\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u020f\n\t\3\t\3\t\7\t\u0213\n\t\f\t\16\t\u0216\13\t\3\t\5\t\u0219"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u021f\n\t\3\t\3\t\7\t\u0223\n\t\f\t\16\t\u0226"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0236\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\5\25\u0262\n\25\3\25\3\25\3\25\7\25\u0267\n\25\f\25\16\25\u026a"+
		"\13\25\3\26\3\26\3\26\5\26\u026f\n\26\3\26\3\26\3\26\3\26\3\26\7\26\u0276"+
		"\n\26\f\26\16\26\u0279\13\26\5\26\u027b\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u0284\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u028c\n"+
		"\30\3\30\3\30\3\30\3\30\3\30\7\30\u0293\n\30\f\30\16\30\u0296\13\30\5"+
		"\30\u0298\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u02a3"+
		"\n\32\3\32\3\32\3\32\3\32\5\32\u02a9\n\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u02b0\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u02bb\n"+
		"\32\5\32\u02bd\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u02c8\n\35\3\35\3\35\3\35\3\35\3\35\5\35\u02cf\n\35\5\35\u02d1\n\35\3"+
		"\36\3\36\3\36\5\36\u02d6\n\36\3\36\3\36\3\36\3\36\5\36\u02dc\n\36\3\36"+
		"\3\36\5\36\u02e0\n\36\3\36\3\36\5\36\u02e4\n\36\3\37\3\37\3\37\7\37\u02e9"+
		"\n\37\f\37\16\37\u02ec\13\37\3 \3 \3 \5 \u02f1\n \3!\7!\u02f4\n!\f!\16"+
		"!\u02f7\13!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u02ff\n\"\3#\3#\3#\7#\u0304\n"+
		"#\f#\16#\u0307\13#\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\7\'\u0316"+
		"\n\'\f\'\16\'\u0319\13\'\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0323\n(\3)\3)\7)"+
		"\u0327\n)\f)\16)\u032a\13)\3)\3)\3*\3*\3*\5*\u0331\n*\3+\3+\3+\3+\3+\5"+
		"+\u0338\n+\3,\3,\3,\3,\7,\u033e\n,\f,\16,\u0341\13,\3-\3-\3-\5-\u0346"+
		"\n-\3-\5-\u0349\n-\3-\5-\u034c\n-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3\60\3"+
		"\60\3\60\3\60\7\60\u035c\n\60\f\60\16\60\u035f\13\60\3\61\3\61\3\61\5"+
		"\61\u0364\n\61\3\61\3\61\3\61\3\62\3\62\3\62\5\62\u036c\n\62\3\63\3\63"+
		"\3\63\3\63\3\63\5\63\u0373\n\63\3\63\3\63\3\63\3\63\5\63\u0379\n\63\3"+
		"\64\3\64\3\64\3\64\3\64\5\64\u0380\n\64\3\64\3\64\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\5\66\u038d\n\66\3\66\3\66\3\66\3\66\3\66\3\67"+
		"\3\67\5\67\u0396\n\67\3\67\5\67\u0399\n\67\3\67\3\67\3\67\5\67\u039e\n"+
		"\67\3\67\3\67\3\67\5\67\u03a3\n\67\38\38\38\38\39\39\39\3:\3:\3:\3:\3"+
		";\3;\3;\7;\u03b3\n;\f;\16;\u03b6\13;\3<\3<\3<\5<\u03bb\n<\3<\3<\5<\u03bf"+
		"\n<\3<\3<\5<\u03c3\n<\3=\5=\u03c6\n=\3=\3=\3=\3=\3=\7=\u03cd\n=\f=\16"+
		"=\u03d0\13=\3>\3>\3>\5>\u03d5\n>\3>\3>\3>\5>\u03da\n>\5>\u03dc\n>\3>\3"+
		">\5>\u03e0\n>\3?\3?\3?\3@\3@\5@\u03e7\n@\3@\3@\3@\7@\u03ec\n@\f@\16@\u03ef"+
		"\13@\3@\3@\3@\3A\3A\3A\5A\u03f7\nA\3A\3A\3A\3B\3B\3B\3B\3B\6B\u0401\n"+
		"B\rB\16B\u0402\3B\3B\3B\3B\3C\3C\6C\u040b\nC\rC\16C\u040c\3C\3C\3C\3D"+
		"\3D\3E\3E\3E\3E\3E\6E\u0419\nE\rE\16E\u041a\3E\3E\3E\5E\u0420\nE\3E\3"+
		"E\3E\3F\3F\3F\3F\3F\5F\u042a\nF\3F\3F\3F\3F\3G\3G\3G\7G\u0433\nG\fG\16"+
		"G\u0436\13G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\6I\u0443\nI\rI\16I\u0444"+
		"\3J\3J\3J\3K\3K\3L\3L\3L\3L\3L\3L\3L\5L\u0453\nL\3L\3L\3M\3M\5M\u0459"+
		"\nM\3M\3M\3N\3N\3N\7N\u0460\nN\fN\16N\u0463\13N\3O\3O\3O\3O\3O\3O\5O\u046b"+
		"\nO\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3S\3S\3S\3T\3T\3T\3T"+
		"\3T\3U\3U\3U\7U\u0487\nU\fU\16U\u048a\13U\3V\3V\3V\7V\u048f\nV\fV\16V"+
		"\u0492\13V\3W\3W\3W\3W\5W\u0498\nW\3W\3W\5W\u049c\nW\3X\3X\3X\7X\u04a1"+
		"\nX\fX\16X\u04a4\13X\3Y\3Y\3Y\5Y\u04a9\nY\3Z\3Z\3Z\7Z\u04ae\nZ\fZ\16Z"+
		"\u04b1\13Z\3[\3[\3[\7[\u04b6\n[\f[\16[\u04b9\13[\3\\\3\\\3\\\7\\\u04be"+
		"\n\\\f\\\16\\\u04c1\13\\\3]\3]\3]\7]\u04c6\n]\f]\16]\u04c9\13]\3^\3^\3"+
		"^\3^\5^\u04cf\n^\3_\3_\3_\3_\5_\u04d5\n_\3`\3`\3`\3`\5`\u04db\n`\3a\3"+
		"a\3a\3a\5a\u04e1\na\3b\3b\3b\7b\u04e6\nb\fb\16b\u04e9\13b\3c\7c\u04ec"+
		"\nc\fc\16c\u04ef\13c\3c\3c\3d\3d\3d\5d\u04f6\nd\3e\3e\3e\3e\3e\3e\3e\3"+
		"e\5e\u0500\ne\3f\3f\3g\3g\3g\3g\3g\5g\u0509\ng\3h\3h\3h\3h\5h\u050f\n"+
		"h\3h\3h\3i\3i\3j\6j\u0516\nj\rj\16j\u0517\3j\3j\3j\3j\3k\3k\3k\7k\u0521"+
		"\nk\fk\16k\u0524\13k\3l\3l\5l\u0528\nl\3l\3l\3l\5l\u052d\nl\3m\3m\3m\7"+
		"m\u0532\nm\fm\16m\u0535\13m\3n\3n\5n\u0539\nn\3o\3o\5o\u053d\no\3o\3o"+
		"\3p\3p\3p\3p\5p\u0545\np\3q\3q\3q\3q\3r\5r\u054c\nr\3r\3r\3s\3s\3s\3s"+
		"\5s\u0554\ns\3t\3t\3t\3t\3u\3u\3v\3v\5v\u055e\nv\3w\3w\5w\u0562\nw\3x"+
		"\3x\3x\5x\u0567\nx\3y\3y\3y\3y\7y\u056d\ny\fy\16y\u0570\13y\3z\3z\3z\5"+
		"z\u0575\nz\7z\u0577\nz\fz\16z\u057a\13z\3z\3z\3{\7{\u057f\n{\f{\16{\u0582"+
		"\13{\3|\3|\3|\3|\3}\3}\3}\3~\3~\3~\3~\5~\u058f\n~\3\177\3\177\3\177\5"+
		"\177\u0594\n\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u05a3\n\u0080"+
		"\3\u0081\3\u0081\5\u0081\u05a7\n\u0081\3\u0082\3\u0082\3\u0083\3\u0083"+
		"\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085\5\u0085\u05b2\n\u0085\3\u0085"+
		"\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\5\u008a\u05c3\n\u008a\3\u008b"+
		"\3\u008b\5\u008b\u05c7\n\u008b\3\u008c\3\u008c\3\u008c\5\u008c\u05cc\n"+
		"\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\7\u008d\u05d3\n\u008d\f"+
		"\u008d\16\u008d\u05d6\13\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\7\u008f\u05e7\n\u008f\f\u008f\16\u008f\u05ea\13\u008f\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\7\u0090\u05f1\n\u0090\f\u0090\16\u0090"+
		"\u05f4\13\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\7\u0091\u05fd\n\u0091\f\u0091\16\u0091\u0600\13\u0091\3\u0091\3\u0091"+
		"\3\u0092\3\u0092\5\u0092\u0606\n\u0092\3\u0093\6\u0093\u0609\n\u0093\r"+
		"\u0093\16\u0093\u060a\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093"+
		"\u0612\n\u0093\3\u0093\5\u0093\u0615\n\u0093\3\u0094\6\u0094\u0618\n\u0094"+
		"\r\u0094\16\u0094\u0619\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094"+
		"\u0621\n\u0094\3\u0094\5\u0094\u0624\n\u0094\3\u0095\3\u0095\3\u0095\3"+
		"\u0095\3\u0095\3\u0095\5\u0095\u062c\n\u0095\3\u0096\3\u0096\3\u0096\3"+
		"\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u0637\n\u0096\3"+
		"\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097"+
		"\u0641\n\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098"+
		"\u0649\n\u0098\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\7\u009a\u0658\n\u009a"+
		"\f\u009a\16\u009a\u065b\13\u009a\5\u009a\u065d\n\u009a\3\u009a\3\u009a"+
		"\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u0679\n\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\5\u00a2\u0685\n\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3"+
		"\5\u00a3\u068c\n\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a5\3\u00a5"+
		"\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u06a2\n\u00a9\3\u00a9"+
		"\3\u00a9\3\u00aa\3\u00aa\5\u00aa\u06a8\n\u00aa\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u06b2\n\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\5\u00ac\u06b7\n\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\7\u00ae\u06c2\n\u00ae\f\u00ae"+
		"\16\u00ae\u06c5\13\u00ae\5\u00ae\u06c7\n\u00ae\3\u00ae\3\u00ae\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\5\u00b0\u06d1\n\u00b0\3\u00b1"+
		"\3\u00b1\5\u00b1\u06d5\n\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\7\u00b4"+
		"\u06e4\n\u00b4\f\u00b4\16\u00b4\u06e7\13\u00b4\3\u00b5\3\u00b5\3\u00b6"+
		"\3\u00b6\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\7\u00b8\u06f9\n\u00b8\f\u00b8\16\u00b8"+
		"\u06fc\13\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00bb\3\u00bb\5\u00bb\u0707\n\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0713\n\u00bd"+
		"\5\u00bd\u0715\n\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\5\u00be\u0720\n\u00be\3\u00bf\3\u00bf\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\5\u00c0\u0730\n\u00c0\3\u00c1\3\u00c1\3\u00c1\5\u00c1"+
		"\u0735\n\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u0741\n\u00c3\3\u00c3\3\u00c3\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0755\n\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u075e"+
		"\n\u00c8\5\u00c8\u0760\n\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\5\u00c9"+
		"\u0766\n\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0773\n\u00cb\5\u00cb\u0775\n"+
		"\u00cb\5\u00cb\u0777\n\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc\5\u00cc\u077d"+
		"\n\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00cf"+
		"\3\u00cf\3\u00d0\3\u00d0\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d3\7\u00d3"+
		"\u078f\n\u00d3\f\u00d3\16\u00d3\u0792\13\u00d3\3\u00d3\3\u00d3\5\u00d3"+
		"\u0796\n\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\7\u00d5\u07a2\n\u00d5\f\u00d5\16\u00d5\u07a5"+
		"\13\u00d5\5\u00d5\u07a7\n\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d6"+
		"\3\u00d6\5\u00d6\u07af\n\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d9\3\u00d9"+
		"\5\u00d9\u07bf\n\u00d9\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dd"+
		"\3\u00dd\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\5\u00de\u07d6\n\u00de"+
		"\3\u00df\3\u00df\3\u00df\5\u00df\u07db\n\u00df\3\u00df\3\u00df\3\u00e0"+
		"\3\u00e0\3\u00e0\5\u00e0\u07e2\n\u00e0\3\u00e0\3\u00e0\3\u00e1\3\u00e1"+
		"\3\u00e1\5\u00e1\u07e9\n\u00e1\3\u00e1\3\u00e1\3\u00e2\3\u00e2\3\u00e2"+
		"\5\u00e2\u07f0\n\u00e2\3\u00e2\3\u00e2\3\u00e3\3\u00e3\3\u00e3\5\u00e3"+
		"\u07f7\n\u00e3\3\u00e3\3\u00e3\3\u00e4\3\u00e4\5\u00e4\u07fd\n\u00e4\3"+
		"\u00e5\3\u00e5\5\u00e5\u0801\n\u00e5\3\u00e6\3\u00e6\5\u00e6\u0805\n\u00e6"+
		"\3\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u080b\n\u00e7\3\u00e8\3\u00e8"+
		"\5\u00e8\u080f\n\u00e8\3\u00e9\3\u00e9\3\u00ea\3\u00ea\3\u00eb\3\u00eb"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\7\u00ec\u081c\n\u00ec\f\u00ec"+
		"\16\u00ec\u081f\13\u00ec\3\u00ec\3\u00ec\3\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\7\u00ed\u0828\n\u00ed\f\u00ed\16\u00ed\u082b\13\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ee\3\u00ee\5\u00ee\u0831\n\u00ee\3\u00ef\6\u00ef\u0834\n"+
		"\u00ef\r\u00ef\16\u00ef\u0835\3\u00ef\3\u00ef\5\u00ef\u083a\n\u00ef\3"+
		"\u00ef\5\u00ef\u083d\n\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\5"+
		"\u00ef\u0844\n\u00ef\3\u00f0\6\u00f0\u0847\n\u00f0\r\u00f0\16\u00f0\u0848"+
		"\3\u00f0\3\u00f0\5\u00f0\u084d\n\u00f0\3\u00f0\5\u00f0\u0850\n\u00f0\3"+
		"\u00f0\3\u00f0\3\u00f0\3\u00f0\3\u00f0\5\u00f0\u0857\n\u00f0\3\u00f1\3"+
		"\u00f1\6\u00f1\u085b\n\u00f1\r\u00f1\16\u00f1\u085c\3\u00f1\2\2\u00f2"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134"+
		"\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c"+
		"\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164"+
		"\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c"+
		"\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194"+
		"\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac"+
		"\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4"+
		"\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc"+
		"\u01de\u01e0\2\35\4\2XXee\4\2\u008c\u008c\u009a\u009a\4\2\u0087\u0087"+
		"\u00a5\u00a5\4\2gguu\4\2\u0080\u0080\u008c\u008c\4\2nn\177\177\5\2bb\u008a"+
		"\u008a\u00b7\u00b7\3\2\36\37\6\2\35\35UUjjyy\4\2))\u00a4\u00a4\4\2``p"+
		"p\b\2^^ffiittww||\4\2<<\u00a2\u00a2\4\2ss\u0099\u0099\3\2&\'\7\2??HHQ"+
		"Rbc\u0094\u0094\4\289\u0089\u008b\3\2\7\t\4\2\17\17\21\21\3\2\13\f\3\2"+
		"#$\4\2\32\33\u00c7\u00c7\5\2\32\32\64\64\u00c7\u00c7\5\2\33\33\64\64\u00c7"+
		"\u00c7\36\2\n\n\67\67;;??BBGGJJLLNNTTWX[[]]kkrrxx}~\u0081\u0081\u0083"+
		"\u0083\u008e\u008e\u0092\u0093\u0095\u0095\u009b\u009c\u00a0\u00a3\u00a6"+
		"\u00a6\u00aa\u00aa\u00ac\u00ac\u00ae\u00b9\34\28:<>@ACFHIKKMMOSUVYZ\\"+
		"\\^jlqswy|\177\u0080\u0082\u0082\u0084\u008c\u008f\u0091\u0094\u0094\u0096"+
		"\u009a\u009d\u009f\u00a4\u00a5\u00a7\u00a9\u00ab\u00ab\u00ad\u00ad\r\2"+
		"\7\t\17\17\23\23\25\32\35)+\64\66\66}}\u008d\u008d\u00ba\u00bf\u00c6\u00c6"+
		"\2\u08b5\2\u01e3\3\2\2\2\4\u01ef\3\2\2\2\6\u01f1\3\2\2\2\b\u01fa\3\2\2"+
		"\2\n\u01fd\3\2\2\2\f\u01ff\3\2\2\2\16\u0202\3\2\2\2\20\u0214\3\2\2\2\22"+
		"\u0227\3\2\2\2\24\u0235\3\2\2\2\26\u0237\3\2\2\2\30\u023b\3\2\2\2\32\u0240"+
		"\3\2\2\2\34\u0244\3\2\2\2\36\u0248\3\2\2\2 \u024c\3\2\2\2\"\u0252\3\2"+
		"\2\2$\u0258\3\2\2\2&\u025a\3\2\2\2(\u025c\3\2\2\2*\u026b\3\2\2\2,\u0283"+
		"\3\2\2\2.\u0285\3\2\2\2\60\u0299\3\2\2\2\62\u029f\3\2\2\2\64\u02be\3\2"+
		"\2\2\66\u02c0\3\2\2\28\u02c2\3\2\2\2:\u02d2\3\2\2\2<\u02e5\3\2\2\2>\u02ed"+
		"\3\2\2\2@\u02f5\3\2\2\2B\u02f8\3\2\2\2D\u0300\3\2\2\2F\u0308\3\2\2\2H"+
		"\u030a\3\2\2\2J\u030d\3\2\2\2L\u0312\3\2\2\2N\u0322\3\2\2\2P\u0324\3\2"+
		"\2\2R\u0330\3\2\2\2T\u0337\3\2\2\2V\u0339\3\2\2\2X\u0342\3\2\2\2Z\u0350"+
		"\3\2\2\2\\\u0353\3\2\2\2^\u0357\3\2\2\2`\u0360\3\2\2\2b\u0368\3\2\2\2"+
		"d\u036d\3\2\2\2f\u037a\3\2\2\2h\u0386\3\2\2\2j\u038c\3\2\2\2l\u0395\3"+
		"\2\2\2n\u03a4\3\2\2\2p\u03a8\3\2\2\2r\u03ab\3\2\2\2t\u03af\3\2\2\2v\u03b7"+
		"\3\2\2\2x\u03c5\3\2\2\2z\u03d1\3\2\2\2|\u03e1\3\2\2\2~\u03e6\3\2\2\2\u0080"+
		"\u03f3\3\2\2\2\u0082\u03fb\3\2\2\2\u0084\u040a\3\2\2\2\u0086\u0411\3\2"+
		"\2\2\u0088\u0413\3\2\2\2\u008a\u0424\3\2\2\2\u008c\u042f\3\2\2\2\u008e"+
		"\u0437\3\2\2\2\u0090\u0440\3\2\2\2\u0092\u0446\3\2\2\2\u0094\u0449\3\2"+
		"\2\2\u0096\u044b\3\2\2\2\u0098\u0456\3\2\2\2\u009a\u045c\3\2\2\2\u009c"+
		"\u0464\3\2\2\2\u009e\u046c\3\2\2\2\u00a0\u0471\3\2\2\2\u00a2\u0476\3\2"+
		"\2\2\u00a4\u047b\3\2\2\2\u00a6\u047e\3\2\2\2\u00a8\u0483\3\2\2\2\u00aa"+
		"\u048b\3\2\2\2\u00ac\u0493\3\2\2\2\u00ae\u049d\3\2\2\2\u00b0\u04a5\3\2"+
		"\2\2\u00b2\u04aa\3\2\2\2\u00b4\u04b2\3\2\2\2\u00b6\u04ba\3\2\2\2\u00b8"+
		"\u04c2\3\2\2\2\u00ba\u04ca\3\2\2\2\u00bc\u04d0\3\2\2\2\u00be\u04d6\3\2"+
		"\2\2\u00c0\u04dc\3\2\2\2\u00c2\u04e2\3\2\2\2\u00c4\u04ed\3\2\2\2\u00c6"+
		"\u04f5\3\2\2\2\u00c8\u04ff\3\2\2\2\u00ca\u0501\3\2\2\2\u00cc\u0508\3\2"+
		"\2\2\u00ce\u050a\3\2\2\2\u00d0\u0512\3\2\2\2\u00d2\u0515\3\2\2\2\u00d4"+
		"\u051d\3\2\2\2\u00d6\u052c\3\2\2\2\u00d8\u052e\3\2\2\2\u00da\u0538\3\2"+
		"\2\2\u00dc\u053c\3\2\2\2\u00de\u0544\3\2\2\2\u00e0\u0546\3\2\2\2\u00e2"+
		"\u054b\3\2\2\2\u00e4\u0553\3\2\2\2\u00e6\u0555\3\2\2\2\u00e8\u0559\3\2"+
		"\2\2\u00ea\u055d\3\2\2\2\u00ec\u0561\3\2\2\2\u00ee\u0566\3\2\2\2\u00f0"+
		"\u0568\3\2\2\2\u00f2\u0571\3\2\2\2\u00f4\u0580\3\2\2\2\u00f6\u0583\3\2"+
		"\2\2\u00f8\u0587\3\2\2\2\u00fa\u058e\3\2\2\2\u00fc\u0593\3\2\2\2\u00fe"+
		"\u05a2\3\2\2\2\u0100\u05a6\3\2\2\2\u0102\u05a8\3\2\2\2\u0104\u05aa\3\2"+
		"\2\2\u0106\u05ad\3\2\2\2\u0108\u05af\3\2\2\2\u010a\u05b5\3\2\2\2\u010c"+
		"\u05b7\3\2\2\2\u010e\u05ba\3\2\2\2\u0110\u05bd\3\2\2\2\u0112\u05c2\3\2"+
		"\2\2\u0114\u05c6\3\2\2\2\u0116\u05cb\3\2\2\2\u0118\u05cd\3\2\2\2\u011a"+
		"\u05dc\3\2\2\2\u011c\u05e8\3\2\2\2\u011e\u05eb\3\2\2\2\u0120\u05f7\3\2"+
		"\2\2\u0122\u0605\3\2\2\2\u0124\u0614\3\2\2\2\u0126\u0623\3\2\2\2\u0128"+
		"\u062b\3\2\2\2\u012a\u0636\3\2\2\2\u012c\u0640\3\2\2\2\u012e\u0648\3\2"+
		"\2\2\u0130\u064a\3\2\2\2\u0132\u064d\3\2\2\2\u0134\u0660\3\2\2\2\u0136"+
		"\u0663\3\2\2\2\u0138\u0668\3\2\2\2\u013a\u066c\3\2\2\2\u013c\u066f\3\2"+
		"\2\2\u013e\u0672\3\2\2\2\u0140\u067c\3\2\2\2\u0142\u067e\3\2\2\2\u0144"+
		"\u0688\3\2\2\2\u0146\u068f\3\2\2\2\u0148\u0691\3\2\2\2\u014a\u0693\3\2"+
		"\2\2\u014c\u0695\3\2\2\2\u014e\u0698\3\2\2\2\u0150\u069b\3\2\2\2\u0152"+
		"\u06a7\3\2\2\2\u0154\u06a9\3\2\2\2\u0156\u06ad\3\2\2\2\u0158\u06ba\3\2"+
		"\2\2\u015a\u06bc\3\2\2\2\u015c\u06ca\3\2\2\2\u015e\u06d0\3\2\2\2\u0160"+
		"\u06d2\3\2\2\2\u0162\u06d8\3\2\2\2\u0164\u06db\3\2\2\2\u0166\u06df\3\2"+
		"\2\2\u0168\u06e8\3\2\2\2\u016a\u06ea\3\2\2\2\u016c\u06ec\3\2\2\2\u016e"+
		"\u06fa\3\2\2\2\u0170\u06fd\3\2\2\2\u0172\u0701\3\2\2\2\u0174\u0704\3\2"+
		"\2\2\u0176\u0708\3\2\2\2\u0178\u0714\3\2\2\2\u017a\u071f\3\2\2\2\u017c"+
		"\u0721\3\2\2\2\u017e\u072f\3\2\2\2\u0180\u0731\3\2\2\2\u0182\u0738\3\2"+
		"\2\2\u0184\u073c\3\2\2\2\u0186\u0744\3\2\2\2\u0188\u0748\3\2\2\2\u018a"+
		"\u074c\3\2\2\2\u018c\u0750\3\2\2\2\u018e\u0758\3\2\2\2\u0190\u0765\3\2"+
		"\2\2\u0192\u0767\3\2\2\2\u0194\u076c\3\2\2\2\u0196\u077c\3\2\2\2\u0198"+
		"\u077e\3\2\2\2\u019a\u0783\3\2\2\2\u019c\u0785\3\2\2\2\u019e\u0787\3\2"+
		"\2\2\u01a0\u0789\3\2\2\2\u01a2\u078b\3\2\2\2\u01a4\u0790\3\2\2\2\u01a6"+
		"\u0797\3\2\2\2\u01a8\u079c\3\2\2\2\u01aa\u07ae\3\2\2\2\u01ac\u07b0\3\2"+
		"\2\2\u01ae\u07b5\3\2\2\2\u01b0\u07be\3\2\2\2\u01b2\u07c0\3\2\2\2\u01b4"+
		"\u07c5\3\2\2\2\u01b6\u07ca\3\2\2\2\u01b8\u07ce\3\2\2\2\u01ba\u07d5\3\2"+
		"\2\2\u01bc\u07d7\3\2\2\2\u01be\u07de\3\2\2\2\u01c0\u07e5\3\2\2\2\u01c2"+
		"\u07ec\3\2\2\2\u01c4\u07f3\3\2\2\2\u01c6\u07fc\3\2\2\2\u01c8\u0800\3\2"+
		"\2\2\u01ca\u0804\3\2\2\2\u01cc\u080a\3\2\2\2\u01ce\u080e\3\2\2\2\u01d0"+
		"\u0810\3\2\2\2\u01d2\u0812\3\2\2\2\u01d4\u0814\3\2\2\2\u01d6\u0816\3\2"+
		"\2\2\u01d8\u0822\3\2\2\2\u01da\u0830\3\2\2\2\u01dc\u0843\3\2\2\2\u01de"+
		"\u0856\3\2\2\2\u01e0\u085a\3\2\2\2\u01e2\u01e4\5\4\3\2\u01e3\u01e2\3\2"+
		"\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e7\5\6\4\2\u01e6"+
		"\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01ea\5\4"+
		"\3\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb"+
		"\u01ee\5\f\7\2\u01ec\u01ee\5\b\5\2\u01ed\u01eb\3\2\2\2\u01ed\u01ec\3\2"+
		"\2\2\u01ee\3\3\2\2\2\u01ef\u01f0\7\u00c1\2\2\u01f0\5\3\2\2\2\u01f1\u01f2"+
		"\7\u00ad\2\2\u01f2\u01f3\7\u00a9\2\2\u01f3\u01f6\5\u01da\u00ee\2\u01f4"+
		"\u01f5\7\\\2\2\u01f5\u01f7\5\u01da\u00ee\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\7%\2\2\u01f9\7\3\2\2\2\u01fa"+
		"\u01fb\5\20\t\2\u01fb\u01fc\5\n\6\2\u01fc\t\3\2\2\2\u01fd\u01fe\5L\'\2"+
		"\u01fe\13\3\2\2\2\u01ff\u0200\5\16\b\2\u0200\u0201\5\20\t\2\u0201\r\3"+
		"\2\2\2\u0202\u0203\7z\2\2\u0203\u0204\7{\2\2\u0204\u0205\5\u01ca\u00e6"+
		"\2\u0205\u0206\7\25\2\2\u0206\u0207\5\u01da\u00ee\2\u0207\u0208\7%\2\2"+
		"\u0208\17\3\2\2\2\u0209\u020f\5\22\n\2\u020a\u020f\5\24\13\2\u020b\u020f"+
		"\5\60\31\2\u020c\u020f\5*\26\2\u020d\u020f\5.\30\2\u020e\u0209\3\2\2\2"+
		"\u020e\u020a\3\2\2\2\u020e\u020b\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020d"+
		"\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\7%\2\2\u0211\u0213\3\2\2\2\u0212"+
		"\u020e\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2"+
		"\2\2\u0215\u0224\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0219\5\4\3\2\u0218"+
		"\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021e\3\2\2\2\u021a\u021f\5\62"+
		"\32\2\u021b\u021f\5:\36\2\u021c\u021f\58\35\2\u021d\u021f\5J&\2\u021e"+
		"\u021a\3\2\2\2\u021e\u021b\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021d\3\2"+
		"\2\2\u021f\u0220\3\2\2\2\u0220\u0221\7%\2\2\u0221\u0223\3\2\2\2\u0222"+
		"\u0218\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2"+
		"\2\2\u0225\21\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0228\7O\2\2\u0228\u0229"+
		"\7P\2\2\u0229\u022a\t\2\2\2\u022a\u022b\7{\2\2\u022b\u022c\5\u01da\u00ee"+
		"\2\u022c\23\3\2\2\2\u022d\u0236\5\26\f\2\u022e\u0236\5\30\r\2\u022f\u0236"+
		"\5\32\16\2\u0230\u0236\5\34\17\2\u0231\u0236\5\36\20\2\u0232\u0236\5 "+
		"\21\2\u0233\u0236\5\"\22\2\u0234\u0236\5(\25\2\u0235\u022d\3\2\2\2\u0235"+
		"\u022e\3\2\2\2\u0235\u022f\3\2\2\2\u0235\u0230\3\2\2\2\u0235\u0231\3\2"+
		"\2\2\u0235\u0232\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0234\3\2\2\2\u0236"+
		"\25\3\2\2\2\u0237\u0238\7O\2\2\u0238\u0239\7A\2\2\u0239\u023a\t\3\2\2"+
		"\u023a\27\3\2\2\2\u023b\u023c\7O\2\2\u023c\u023d\7P\2\2\u023d\u023e\7"+
		"I\2\2\u023e\u023f\5\u01d4\u00eb\2\u023f\31\3\2\2\2\u0240\u0241\7O\2\2"+
		"\u0241\u0242\7@\2\2\u0242\u0243\5\u01d4\u00eb\2\u0243\33\3\2\2\2\u0244"+
		"\u0245\7O\2\2\u0245\u0246\7K\2\2\u0246\u0247\t\3\2\2\u0247\35\3\2\2\2"+
		"\u0248\u0249\7O\2\2\u0249\u024a\7\u0088\2\2\u024a\u024b\t\4\2\2\u024b"+
		"\37\3\2\2\2\u024c\u024d\7O\2\2\u024d\u024e\7P\2\2\u024e\u024f\7\u0086"+
		"\2\2\u024f\u0250\7Z\2\2\u0250\u0251\t\5\2\2\u0251!\3\2\2\2\u0252\u0253"+
		"\7O\2\2\u0253\u0254\7M\2\2\u0254\u0255\5$\23\2\u0255\u0256\7 \2\2\u0256"+
		"\u0257\5&\24\2\u0257#\3\2\2\2\u0258\u0259\t\6\2\2\u0259%\3\2\2\2\u025a"+
		"\u025b\t\7\2\2\u025b\'\3\2\2\2\u025c\u0261\7O\2\2\u025d\u025e\7T\2\2\u025e"+
		"\u0262\5\u01c6\u00e4\2\u025f\u0260\7P\2\2\u0260\u0262\7T\2\2\u0261\u025d"+
		"\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0268\3\2\2\2\u0263\u0264\7\n\2\2\u0264"+
		"\u0265\7\25\2\2\u0265\u0267\5\u01da\u00ee\2\u0266\u0263\3\2\2\2\u0267"+
		"\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269)\3\2\2\2"+
		"\u026a\u0268\3\2\2\2\u026b\u026c\7l\2\2\u026c\u026e\7\u0091\2\2\u026d"+
		"\u026f\5,\27\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\3\2"+
		"\2\2\u0270\u027a\5\u01d4\u00eb\2\u0271\u0272\7>\2\2\u0272\u0277\5\u01d4"+
		"\u00eb\2\u0273\u0274\7 \2\2\u0274\u0276\5\u01d4\u00eb\2\u0275\u0273\3"+
		"\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278"+
		"\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u027a\u0271\3\2\2\2\u027a\u027b\3\2"+
		"\2\2\u027b+\3\2\2\2\u027c\u027d\7{\2\2\u027d\u027e\5\u01ca\u00e6\2\u027e"+
		"\u027f\7\25\2\2\u027f\u0284\3\2\2\2\u0280\u0281\7P\2\2\u0281\u0282\7X"+
		"\2\2\u0282\u0284\7{\2\2\u0283\u027c\3\2\2\2\u0283\u0280\3\2\2\2\u0284"+
		"-\3\2\2\2\u0285\u0286\7l\2\2\u0286\u028b\7z\2\2\u0287\u0288\7{\2\2\u0288"+
		"\u0289\5\u01ca\u00e6\2\u0289\u028a\7\25\2\2\u028a\u028c\3\2\2\2\u028b"+
		"\u0287\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u0297\5\u01d4"+
		"\u00eb\2\u028e\u028f\7>\2\2\u028f\u0294\5\u01d4\u00eb\2\u0290\u0291\7"+
		" \2\2\u0291\u0293\5\u01d4\u00eb\2\u0292\u0290\3\2\2\2\u0293\u0296\3\2"+
		"\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0298\3\2\2\2\u0296"+
		"\u0294\3\2\2\2\u0297\u028e\3\2\2\2\u0297\u0298\3\2\2\2\u0298/\3\2\2\2"+
		"\u0299\u029a\7O\2\2\u029a\u029b\7{\2\2\u029b\u029c\5\u01ca\u00e6\2\u029c"+
		"\u029d\7\25\2\2\u029d\u029e\5\u01d4\u00eb\2\u029e\61\3\2\2\2\u029f\u02a2"+
		"\7O\2\2\u02a0\u02a3\5@!\2\u02a1\u02a3\5\u01ca\u00e6\2\u02a2\u02a0\3\2"+
		"\2\2\u02a2\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\7\u00a8\2\2\u02a5"+
		"\u02a6\7.\2\2\u02a6\u02a8\5\u0106\u0084\2\u02a7\u02a9\5\u0176\u00bc\2"+
		"\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02bc\3\2\2\2\u02aa\u02ab"+
		"\7$\2\2\u02ab\u02bd\5\64\33\2\u02ac\u02af\7a\2\2\u02ad\u02ae\7$\2\2\u02ae"+
		"\u02b0\5\66\34\2\u02af\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02bd\3"+
		"\2\2\2\u02b1\u02b2\7\33\2\2\u02b2\u02b3\5\64\33\2\u02b3\u02b4\7\34\2\2"+
		"\u02b4\u02bd\3\2\2\2\u02b5\u02ba\7a\2\2\u02b6\u02b7\7\33\2\2\u02b7\u02b8"+
		"\5\66\34\2\u02b8\u02b9\7\34\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02b6\3\2\2"+
		"\2\u02ba\u02bb\3\2\2\2\u02bb\u02bd\3\2\2\2\u02bc\u02aa\3\2\2\2\u02bc\u02ac"+
		"\3\2\2\2\u02bc\u02b1\3\2\2\2\u02bc\u02b5\3\2\2\2\u02bd\63\3\2\2\2\u02be"+
		"\u02bf\5L\'\2\u02bf\65\3\2\2\2\u02c0\u02c1\5L\'\2\u02c1\67\3\2\2\2\u02c2"+
		"\u02c3\7O\2\2\u02c3\u02c4\7L\2\2\u02c4\u02c7\7r\2\2\u02c5\u02c6\7<\2\2"+
		"\u02c6\u02c8\5\u017a\u00be\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8"+
		"\u02d0\3\2\2\2\u02c9\u02ca\7$\2\2\u02ca\u02d1\5N(\2\u02cb\u02ce\7a\2\2"+
		"\u02cc\u02cd\7$\2\2\u02cd\u02cf\5N(\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf"+
		"\3\2\2\2\u02cf\u02d1\3\2\2\2\u02d0\u02c9\3\2\2\2\u02d0\u02cb\3\2\2\2\u02d1"+
		"9\3\2\2\2\u02d2\u02d5\7O\2\2\u02d3\u02d6\5@!\2\u02d4\u02d6\5\u01ca\u00e6"+
		"\2\u02d5\u02d3\3\2\2\2\u02d5\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8"+
		"\7e\2\2\u02d8\u02d9\5\u01c6\u00e4\2\u02d9\u02db\7\27\2\2\u02da\u02dc\5"+
		"<\37\2\u02db\u02da\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd"+
		"\u02df\7\30\2\2\u02de\u02e0\5H%\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2"+
		"\2\2\u02e0\u02e3\3\2\2\2\u02e1\u02e4\5\u0158\u00ad\2\u02e2\u02e4\7a\2"+
		"\2\u02e3\u02e1\3\2\2\2\u02e3\u02e2\3\2\2\2\u02e4;\3\2\2\2\u02e5\u02ea"+
		"\5> \2\u02e6\u02e7\7 \2\2\u02e7\u02e9\5> \2\u02e8\u02e6\3\2\2\2\u02e9"+
		"\u02ec\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb=\3\2\2\2"+
		"\u02ec\u02ea\3\2\2\2\u02ed\u02ee\7.\2\2\u02ee\u02f0\5\u01c8\u00e5\2\u02ef"+
		"\u02f1\5\u0176\u00bc\2\u02f0\u02ef\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1?"+
		"\3\2\2\2\u02f2\u02f4\5B\"\2\u02f3\u02f2\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5"+
		"\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6A\3\2\2\2\u02f7\u02f5\3\2\2\2"+
		"\u02f8\u02f9\7/\2\2\u02f9\u02fe\5\u01c8\u00e5\2\u02fa\u02fb\7\27\2\2\u02fb"+
		"\u02fc\5D#\2\u02fc\u02fd\7\30\2\2\u02fd\u02ff\3\2\2\2\u02fe\u02fa\3\2"+
		"\2\2\u02fe\u02ff\3\2\2\2\u02ffC\3\2\2\2\u0300\u0305\5F$\2\u0301\u0302"+
		"\7 \2\2\u0302\u0304\5F$\2\u0303\u0301\3\2\2\2\u0304\u0307\3\2\2\2\u0305"+
		"\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306E\3\2\2\2\u0307\u0305\3\2\2\2"+
		"\u0308\u0309\5\u0100\u0081\2\u0309G\3\2\2\2\u030a\u030b\7<\2\2\u030b\u030c"+
		"\5\u0178\u00bd\2\u030cI\3\2\2\2\u030d\u030e\7O\2\2\u030e\u030f\7\u0084"+
		"\2\2\u030f\u0310\5\u01c8\u00e5\2\u0310\u0311\5\u01da\u00ee\2\u0311K\3"+
		"\2\2\2\u0312\u0317\5N(\2\u0313\u0314\7 \2\2\u0314\u0316\5N(\2\u0315\u0313"+
		"\3\2\2\2\u0316\u0319\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"M\3\2\2\2\u0319\u0317\3\2\2\2\u031a\u0323\5P)\2\u031b\u0323\5~@\2\u031c"+
		"\u0323\5\u0082B\2\u031d\u0323\5\u0088E\2\u031e\u0323\5\u009cO\2\u031f"+
		"\u0323\5\u008eH\2\u0320\u0323\5\u0090I\2\u0321\u0323\5\u00a8U\2\u0322"+
		"\u031a\3\2\2\2\u0322\u031b\3\2\2\2\u0322\u031c\3\2\2\2\u0322\u031d\3\2"+
		"\2\2\u0322\u031e\3\2\2\2\u0322\u031f\3\2\2\2\u0322\u0320\3\2\2\2\u0322"+
		"\u0321\3\2\2\2\u0323O\3\2\2\2\u0324\u0328\5R*\2\u0325\u0327\5T+\2\u0326"+
		"\u0325\3\2\2\2\u0327\u032a\3\2\2\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2"+
		"\2\2\u0329\u032b\3\2\2\2\u032a\u0328\3\2\2\2\u032b\u032c\5|?\2\u032cQ"+
		"\3\2\2\2\u032d\u0331\5V,\2\u032e\u0331\5^\60\2\u032f\u0331\5b\62\2\u0330"+
		"\u032d\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u032f\3\2\2\2\u0331S\3\2\2\2"+
		"\u0332\u0338\5R*\2\u0333\u0338\5p9\2\u0334\u0338\5r:\2\u0335\u0338\5x"+
		"=\2\u0336\u0338\5n8\2\u0337\u0332\3\2\2\2\u0337\u0333\3\2\2\2\u0337\u0334"+
		"\3\2\2\2\u0337\u0335\3\2\2\2\u0337\u0336\3\2\2\2\u0338U\3\2\2\2\u0339"+
		"\u033a\7d\2\2\u033a\u033f\5X-\2\u033b\u033c\7 \2\2\u033c\u033e\5X-\2\u033d"+
		"\u033b\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2"+
		"\2\2\u0340W\3\2\2\2\u0341\u033f\3\2\2\2\u0342\u0343\7.\2\2\u0343\u0345"+
		"\5\u0106\u0084\2\u0344\u0346\5\u0176\u00bc\2\u0345\u0344\3\2\2\2\u0345"+
		"\u0346\3\2\2\2\u0346\u0348\3\2\2\2\u0347\u0349\5Z.\2\u0348\u0347\3\2\2"+
		"\2\u0348\u0349\3\2\2\2\u0349\u034b\3\2\2\2\u034a\u034c\5\\/\2\u034b\u034a"+
		"\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\7m\2\2\u034e"+
		"\u034f\5N(\2\u034fY\3\2\2\2\u0350\u0351\7\67\2\2\u0351\u0352\7Z\2\2\u0352"+
		"[\3\2\2\2\u0353\u0354\7>\2\2\u0354\u0355\7.\2\2\u0355\u0356\5\u0106\u0084"+
		"\2\u0356]\3\2\2\2\u0357\u0358\7v\2\2\u0358\u035d\5`\61\2\u0359\u035a\7"+
		" \2\2\u035a\u035c\5`\61\2\u035b\u0359\3\2\2\2\u035c\u035f\3\2\2\2\u035d"+
		"\u035b\3\2\2\2\u035d\u035e\3\2\2\2\u035e_\3\2\2\2\u035f\u035d\3\2\2\2"+
		"\u0360\u0361\7.\2\2\u0361\u0363\5\u0106\u0084\2\u0362\u0364\5\u0176\u00bc"+
		"\2\u0363\u0362\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0366"+
		"\7$\2\2\u0366\u0367\5N(\2\u0367a\3\2\2\2\u0368\u036b\7d\2\2\u0369\u036c"+
		"\5d\63\2\u036a\u036c\5f\64\2\u036b\u0369\3\2\2\2\u036b\u036a\3\2\2\2\u036c"+
		"c\3\2\2\2\u036d\u036e\7\u00a1\2\2\u036e\u036f\7\u00ac\2\2\u036f\u0370"+
		"\7.\2\2\u0370\u0372\5\u01c8\u00e5\2\u0371\u0373\5\u0176\u00bc\2\u0372"+
		"\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\7m"+
		"\2\2\u0375\u0376\5N(\2\u0376\u0378\5h\65\2\u0377\u0379\5j\66\2\u0378\u0377"+
		"\3\2\2\2\u0378\u0379\3\2\2\2\u0379e\3\2\2\2\u037a\u037b\7\u0095\2\2\u037b"+
		"\u037c\7\u00ac\2\2\u037c\u037d\7.\2\2\u037d\u037f\5\u01c8\u00e5\2\u037e"+
		"\u0380\5\u0176\u00bc\2\u037f\u037e\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381"+
		"\3\2\2\2\u0381\u0382\7m\2\2\u0382\u0383\5N(\2\u0383\u0384\5h\65\2\u0384"+
		"\u0385\5j\66\2\u0385g\3\2\2\2\u0386\u0387\7\u0098\2\2\u0387\u0388\5l\67"+
		"\2\u0388\u0389\7\u00aa\2\2\u0389\u038a\5N(\2\u038ai\3\2\2\2\u038b\u038d"+
		"\7\u0083\2\2\u038c\u038b\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038e\3\2\2"+
		"\2\u038e\u038f\7]\2\2\u038f\u0390\5l\67\2\u0390\u0391\7\u00aa\2\2\u0391"+
		"\u0392\5N(\2\u0392k\3\2\2\2\u0393\u0394\7.\2\2\u0394\u0396\5\u01c6\u00e4"+
		"\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0398\3\2\2\2\u0397\u0399"+
		"\5\\/\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039d\3\2\2\2\u039a"+
		"\u039b\7\u008d\2\2\u039b\u039c\7.\2\2\u039c\u039e\5\u01c6\u00e4\2\u039d"+
		"\u039a\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a2\3\2\2\2\u039f\u03a0\7}"+
		"\2\2\u03a0\u03a1\7.\2\2\u03a1\u03a3\5\u01c6\u00e4\2\u03a2\u039f\3\2\2"+
		"\2\u03a2\u03a3\3\2\2\2\u03a3m\3\2\2\2\u03a4\u03a5\7N\2\2\u03a5\u03a6\7"+
		".\2\2\u03a6\u03a7\5\u0106\u0084\2\u03a7o\3\2\2\2\u03a8\u03a9\7\u00ab\2"+
		"\2\u03a9\u03aa\5N(\2\u03aaq\3\2\2\2\u03ab\u03ac\7h\2\2\u03ac\u03ad\7C"+
		"\2\2\u03ad\u03ae\5t;\2\u03aes\3\2\2\2\u03af\u03b4\5v<\2\u03b0\u03b1\7"+
		" \2\2\u03b1\u03b3\5v<\2\u03b2\u03b0\3\2\2\2\u03b3\u03b6\3\2\2\2\u03b4"+
		"\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5u\3\2\2\2\u03b6\u03b4\3\2\2\2"+
		"\u03b7\u03b8\7.\2\2\u03b8\u03be\5\u0106\u0084\2\u03b9\u03bb\5\u0176\u00bc"+
		"\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03bd"+
		"\7$\2\2\u03bd\u03bf\5N(\2\u03be\u03ba\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf"+
		"\u03c2\3\2\2\2\u03c0\u03c1\7I\2\2\u03c1\u03c3\5\u01d4\u00eb\2\u03c2\u03c0"+
		"\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3w\3\2\2\2\u03c4\u03c6\7\u0097\2\2\u03c5"+
		"\u03c4\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8\7\u0086"+
		"\2\2\u03c8\u03c9\7C\2\2\u03c9\u03ce\5z>\2\u03ca\u03cb\7 \2\2\u03cb\u03cd"+
		"\5z>\2\u03cc\u03ca\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce"+
		"\u03cf\3\2\2\2\u03cfy\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1\u03d4\5N(\2\u03d2"+
		"\u03d5\7=\2\2\u03d3\u03d5\7S\2\2\u03d4\u03d2\3\2\2\2\u03d4\u03d3\3\2\2"+
		"\2\u03d4\u03d5\3\2\2\2\u03d5\u03db\3\2\2\2\u03d6\u03d9\7Z\2\2\u03d7\u03da"+
		"\7g\2\2\u03d8\u03da\7u\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03d8\3\2\2\2\u03da"+
		"\u03dc\3\2\2\2\u03db\u03d6\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03df\3\2"+
		"\2\2\u03dd\u03de\7I\2\2\u03de\u03e0\5\u01d4\u00eb\2\u03df\u03dd\3\2\2"+
		"\2\u03df\u03e0\3\2\2\2\u03e0{\3\2\2\2\u03e1\u03e2\7\u008f\2\2\u03e2\u03e3"+
		"\5N(\2\u03e3}\3\2\2\2\u03e4\u03e7\7\u0096\2\2\u03e5\u03e7\7_\2\2\u03e6"+
		"\u03e4\3\2\2\2\u03e6\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03ed\5\u0080"+
		"A\2\u03e9\u03ea\7 \2\2\u03ea\u03ec\5\u0080A\2\u03eb\u03e9\3\2\2\2\u03ec"+
		"\u03ef\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03f0\3\2"+
		"\2\2\u03ef\u03ed\3\2\2\2\u03f0\u03f1\7\u0090\2\2\u03f1\u03f2\5N(\2\u03f2"+
		"\177\3\2\2\2\u03f3\u03f4\7.\2\2\u03f4\u03f6\5\u0106\u0084\2\u03f5\u03f7"+
		"\5\u0176\u00bc\2\u03f6\u03f5\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\3"+
		"\2\2\2\u03f8\u03f9\7m\2\2\u03f9\u03fa\5N(\2\u03fa\u0081\3\2\2\2\u03fb"+
		"\u03fc\7\u009b\2\2\u03fc\u03fd\7\27\2\2\u03fd\u03fe\5L\'\2\u03fe\u0400"+
		"\7\30\2\2\u03ff\u0401\5\u0084C\2\u0400\u03ff\3\2\2\2\u0401\u0402\3\2\2"+
		"\2\u0402\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0405"+
		"\7P\2\2\u0405\u0406\7\u008f\2\2\u0406\u0407\5N(\2\u0407\u0083\3\2\2\2"+
		"\u0408\u0409\7D\2\2\u0409\u040b\5\u0086D\2\u040a\u0408\3\2\2\2\u040b\u040c"+
		"\3\2\2\2\u040c\u040a\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040e\3\2\2\2\u040e"+
		"\u040f\7\u008f\2\2\u040f\u0410\5N(\2\u0410\u0085\3\2\2\2\u0411\u0412\5"+
		"N(\2\u0412\u0087\3\2\2\2\u0413\u0414\7\u00a3\2\2\u0414\u0415\7\27\2\2"+
		"\u0415\u0416\5L\'\2\u0416\u0418\7\30\2\2\u0417\u0419\5\u008aF\2\u0418"+
		"\u0417\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2"+
		"\2\2\u041b\u041c\3\2\2\2\u041c\u041f\7P\2\2\u041d\u041e\7.\2\2\u041e\u0420"+
		"\5\u0106\u0084\2\u041f\u041d\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0421\3"+
		"\2\2\2\u0421\u0422\7\u008f\2\2\u0422\u0423\5N(\2\u0423\u0089\3\2\2\2\u0424"+
		"\u0429\7D\2\2\u0425\u0426\7.\2\2\u0426\u0427\5\u0106\u0084\2\u0427\u0428"+
		"\7<\2\2\u0428\u042a\3\2\2\2\u0429\u0425\3\2\2\2\u0429\u042a\3\2\2\2\u042a"+
		"\u042b\3\2\2\2\u042b\u042c\5\u008cG\2\u042c\u042d\7\u008f\2\2\u042d\u042e"+
		"\5N(\2\u042e\u008b\3\2\2\2\u042f\u0434\5\u0178\u00bd\2\u0430\u0431\7)"+
		"\2\2\u0431\u0433\5\u0178\u00bd\2\u0432\u0430\3\2\2\2\u0433\u0436\3\2\2"+
		"\2\u0434\u0432\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u008d\3\2\2\2\u0436\u0434"+
		"\3\2\2\2\u0437\u0438\7k\2\2\u0438\u0439\7\27\2\2\u0439\u043a\5L\'\2\u043a"+
		"\u043b\7\30\2\2\u043b\u043c\7\u009d\2\2\u043c\u043d\5N(\2\u043d\u043e"+
		"\7Y\2\2\u043e\u043f\5N(\2\u043f\u008f\3\2\2\2\u0440\u0442\5\u0092J\2\u0441"+
		"\u0443\5\u0096L\2\u0442\u0441\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0442"+
		"\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0091\3\2\2\2\u0446\u0447\7\u00a0\2"+
		"\2\u0447\u0448\5\u0094K\2\u0448\u0093\3\2\2\2\u0449\u044a\5\u0098M\2\u044a"+
		"\u0095\3\2\2\2\u044b\u0452\7G\2\2\u044c\u0453\5\u009aN\2\u044d\u044e\7"+
		"\27\2\2\u044e\u044f\7.\2\2\u044f\u0450\5\u0106\u0084\2\u0450\u0451\7\30"+
		"\2\2\u0451\u0453\3\2\2\2\u0452\u044c\3\2\2\2\u0452\u044d\3\2\2\2\u0453"+
		"\u0454\3\2\2\2\u0454\u0455\5\u0098M\2\u0455\u0097\3\2\2\2\u0456\u0458"+
		"\7\33\2\2\u0457\u0459\5L\'\2\u0458\u0457\3\2\2\2\u0458\u0459\3\2\2\2\u0459"+
		"\u045a\3\2\2\2\u045a\u045b\7\34\2\2\u045b\u0099\3\2\2\2\u045c\u0461\5"+
		"\u00ecw\2\u045d\u045e\7)\2\2\u045e\u0460\5\u00ecw\2\u045f\u045d\3\2\2"+
		"\2\u0460\u0463\3\2\2\2\u0461\u045f\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u009b"+
		"\3\2\2\2\u0463\u0461\3\2\2\2\u0464\u046a\7\u00a6\2\2\u0465\u046b\5\u009e"+
		"P\2\u0466\u046b\5\u00a0Q\2\u0467\u046b\5\u00a2R\2\u0468\u046b\5\u00a4"+
		"S\2\u0469\u046b\5\u00a6T\2\u046a\u0465\3\2\2\2\u046a\u0466\3\2\2\2\u046a"+
		"\u0467\3\2\2\2\u046a\u0468\3\2\2\2\u046a\u0469\3\2\2\2\u046b\u009d\3\2"+
		"\2\2\u046c\u046d\7\u00b3\2\2\u046d\u046e\5L\'\2\u046e\u046f\7\u00b4\2"+
		"\2\u046f\u0470\5N(\2\u0470\u009f\3\2\2\2\u0471\u0472\7\u00b5\2\2\u0472"+
		"\u0473\5L\'\2\u0473\u0474\7\u00b4\2\2\u0474\u0475\5N(\2\u0475\u00a1\3"+
		"\2\2\2\u0476\u0477\7\u00b6\2\2\u0477\u0478\5N(\2\u0478\u0479\t\b\2\2\u0479"+
		"\u047a\5N(\2\u047a\u00a3\3\2\2\2\u047b\u047c\7\u00b8\2\2\u047c\u047d\5"+
		"N(\2\u047d\u00a5\3\2\2\2\u047e\u047f\7\u00b9\2\2\u047f\u0480\5N(\2\u0480"+
		"\u0481\7<\2\2\u0481\u0482\5N(\2\u0482\u00a7\3\2\2\2\u0483\u0488\5\u00aa"+
		"V\2\u0484\u0485\7\u0085\2\2\u0485\u0487\5\u00aaV\2\u0486\u0484\3\2\2\2"+
		"\u0487\u048a\3\2\2\2\u0488\u0486\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u00a9"+
		"\3\2\2\2\u048a\u0488\3\2\2\2\u048b\u0490\5\u00acW\2\u048c\u048d\7:\2\2"+
		"\u048d\u048f\5\u00acW\2\u048e\u048c\3\2\2\2\u048f\u0492\3\2\2\2\u0490"+
		"\u048e\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u00ab\3\2\2\2\u0492\u0490\3\2"+
		"\2\2\u0493\u049b\5\u00aeX\2\u0494\u0498\5\u00caf\2\u0495\u0498\5\u00c8"+
		"e\2\u0496\u0498\5\u00ccg\2\u0497\u0494\3\2\2\2\u0497\u0495\3\2\2\2\u0497"+
		"\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049a\5\u00aeX\2\u049a\u049c"+
		"\3\2\2\2\u049b\u0497\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u00ad\3\2\2\2\u049d"+
		"\u04a2\5\u00b0Y\2\u049e\u049f\7\65\2\2\u049f\u04a1\5\u00b0Y\2\u04a0\u049e"+
		"\3\2\2\2\u04a1\u04a4\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3"+
		"\u00af\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a5\u04a8\5\u00b2Z\2\u04a6\u04a7"+
		"\7\u009e\2\2\u04a7\u04a9\5\u00b2Z\2\u04a8\u04a6\3\2\2\2\u04a8\u04a9\3"+
		"\2\2\2\u04a9\u00b1\3\2\2\2\u04aa\u04af\5\u00b4[\2\u04ab\u04ac\t\t\2\2"+
		"\u04ac\u04ae\5\u00b4[\2\u04ad\u04ab\3\2\2\2\u04ae\u04b1\3\2\2\2\u04af"+
		"\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u00b3\3\2\2\2\u04b1\u04af\3\2"+
		"\2\2\u04b2\u04b7\5\u00b6\\\2\u04b3\u04b4\t\n\2\2\u04b4\u04b6\5\u00b6\\"+
		"\2\u04b5\u04b3\3\2\2\2\u04b6\u04b9\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b7\u04b8"+
		"\3\2\2\2\u04b8\u00b5\3\2\2\2\u04b9\u04b7\3\2\2\2\u04ba\u04bf\5\u00b8]"+
		"\2\u04bb\u04bc\t\13\2\2\u04bc\u04be\5\u00b8]\2\u04bd\u04bb\3\2\2\2\u04be"+
		"\u04c1\3\2\2\2\u04bf\u04bd\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u00b7\3\2"+
		"\2\2\u04c1\u04bf\3\2\2\2\u04c2\u04c7\5\u00ba^\2\u04c3\u04c4\t\f\2\2\u04c4"+
		"\u04c6\5\u00ba^\2\u04c5\u04c3\3\2\2\2\u04c6\u04c9\3\2\2\2\u04c7\u04c5"+
		"\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u00b9\3\2\2\2\u04c9\u04c7\3\2\2\2\u04ca"+
		"\u04ce\5\u00bc_\2\u04cb\u04cc\7o\2\2\u04cc\u04cd\7\u0082\2\2\u04cd\u04cf"+
		"\5\u0178\u00bd\2\u04ce\u04cb\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u00bb\3"+
		"\2\2\2\u04d0\u04d4\5\u00be`\2\u04d1\u04d2\7\u009f\2\2\u04d2\u04d3\7<\2"+
		"\2\u04d3\u04d5\5\u0178\u00bd\2\u04d4\u04d1\3\2\2\2\u04d4\u04d5\3\2\2\2"+
		"\u04d5\u00bd\3\2\2\2\u04d6\u04da\5\u00c0a\2\u04d7\u04d8\7F\2\2\u04d8\u04d9"+
		"\7<\2\2\u04d9\u04db\5\u0174\u00bb\2\u04da\u04d7\3\2\2\2\u04da\u04db\3"+
		"\2\2\2\u04db\u00bf\3\2\2\2\u04dc\u04e0\5\u00c2b\2\u04dd\u04de\7E\2\2\u04de"+
		"\u04df\7<\2\2\u04df\u04e1\5\u0174\u00bb\2\u04e0\u04dd\3\2\2\2\u04e0\u04e1"+
		"\3\2\2\2\u04e1\u00c1\3\2\2\2\u04e2\u04e7\5\u00c4c\2\u04e3\u04e4\7\63\2"+
		"\2\u04e4\u04e6\5\u0110\u0089\2\u04e5\u04e3\3\2\2\2\u04e6\u04e9\3\2\2\2"+
		"\u04e7\u04e5\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u00c3\3\2\2\2\u04e9\u04e7"+
		"\3\2\2\2\u04ea\u04ec\t\t\2\2\u04eb\u04ea\3\2\2\2\u04ec\u04ef\3\2\2\2\u04ed"+
		"\u04eb\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04f0\3\2\2\2\u04ef\u04ed\3\2"+
		"\2\2\u04f0\u04f1\5\u00c6d\2\u04f1\u00c5\3\2\2\2\u04f2\u04f6\5\u00ceh\2"+
		"\u04f3\u04f6\5\u00d2j\2\u04f4\u04f6\5\u00d4k\2\u04f5\u04f2\3\2\2\2\u04f5"+
		"\u04f3\3\2\2\2\u04f5\u04f4\3\2\2\2\u04f6\u00c7\3\2\2\2\u04f7\u0500\7\25"+
		"\2\2\u04f8\u0500\7\26\2\2\u04f9\u0500\7*\2\2\u04fa\u04fb\7*\2\2\u04fb"+
		"\u0500\7\25\2\2\u04fc\u0500\7+\2\2\u04fd\u04fe\7+\2\2\u04fe\u0500\7\25"+
		"\2\2\u04ff\u04f7\3\2\2\2\u04ff\u04f8\3\2\2\2\u04ff\u04f9\3\2\2\2\u04ff"+
		"\u04fa\3\2\2\2\u04ff\u04fc\3\2\2\2\u04ff\u04fd\3\2\2\2\u0500\u00c9\3\2"+
		"\2\2\u0501\u0502\t\r\2\2\u0502\u00cb\3\2\2\2\u0503\u0509\7q\2\2\u0504"+
		"\u0505\7*\2\2\u0505\u0509\7*\2\2\u0506\u0507\7+\2\2\u0507\u0509\7+\2\2"+
		"\u0508\u0503\3\2\2\2\u0508\u0504\3\2\2\2\u0508\u0506\3\2\2\2\u0509\u00cd"+
		"\3\2\2\2\u050a\u050e\7\u00a7\2\2\u050b\u050f\5\u00d0i\2\u050c\u050d\t"+
		"\16\2\2\u050d\u050f\5\u01a2\u00d2\2\u050e\u050b\3\2\2\2\u050e\u050c\3"+
		"\2\2\2\u050e\u050f\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0511\5\u0098M\2"+
		"\u0511\u00cf\3\2\2\2\u0512\u0513\t\17\2\2\u0513\u00d1\3\2\2\2\u0514\u0516"+
		"\7\23\2\2\u0515\u0514\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0515\3\2\2\2"+
		"\u0517\u0518\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051a\7\33\2\2\u051a\u051b"+
		"\5L\'\2\u051b\u051c\7\34\2\2\u051c\u00d3\3\2\2\2\u051d\u0522\5\u00f0y"+
		"\2\u051e\u051f\7\60\2\2\u051f\u0521\5\u00f0y\2\u0520\u051e\3\2\2\2\u0521"+
		"\u0524\3\2\2\2\u0522\u0520\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u00d5\3\2"+
		"\2\2\u0524\u0522\3\2\2\2\u0525\u0527\7&\2\2\u0526\u0528\5\u00d8m\2\u0527"+
		"\u0526\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u052d\3\2\2\2\u0529\u052a\7\'"+
		"\2\2\u052a\u052d\5\u00d8m\2\u052b\u052d\5\u00d8m\2\u052c\u0525\3\2\2\2"+
		"\u052c\u0529\3\2\2\2\u052c\u052b\3\2\2\2\u052d\u00d7\3\2\2\2\u052e\u0533"+
		"\5\u00dan\2\u052f\u0530\t\20\2\2\u0530\u0532\5\u00dan\2\u0531\u052f\3"+
		"\2\2\2\u0532\u0535\3\2\2\2\u0533\u0531\3\2\2\2\u0533\u0534\3\2\2\2\u0534"+
		"\u00d9\3\2\2\2\u0535\u0533\3\2\2\2\u0536\u0539\5\u00f0y\2\u0537\u0539"+
		"\5\u00dco\2\u0538\u0536\3\2\2\2\u0538\u0537\3\2\2\2\u0539\u00db\3\2\2"+
		"\2\u053a\u053d\5\u00e4s\2\u053b\u053d\5\u00dep\2\u053c\u053a\3\2\2\2\u053c"+
		"\u053b\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u053f\5\u00f4{\2\u053f\u00dd"+
		"\3\2\2\2\u0540\u0541\5\u00e0q\2\u0541\u0542\5\u00eav\2\u0542\u0545\3\2"+
		"\2\2\u0543\u0545\5\u00e2r\2\u0544\u0540\3\2\2\2\u0544\u0543\3\2\2\2\u0545"+
		"\u00df\3\2\2\2\u0546\u0547\t\21\2\2\u0547\u0548\7#\2\2\u0548\u0549\7#"+
		"\2\2\u0549\u00e1\3\2\2\2\u054a\u054c\7-\2\2\u054b\u054a\3\2\2\2\u054b"+
		"\u054c\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u054e\5\u00eav\2\u054e\u00e3"+
		"\3\2\2\2\u054f\u0550\5\u00e6t\2\u0550\u0551\5\u00eav\2\u0551\u0554\3\2"+
		"\2\2\u0552\u0554\5\u00e8u\2\u0553\u054f\3\2\2\2\u0553\u0552\3\2\2\2\u0554"+
		"\u00e5\3\2\2\2\u0555\u0556\t\22\2\2\u0556\u0557\7#\2\2\u0557\u0558\7#"+
		"\2\2\u0558\u00e7\3\2\2\2\u0559\u055a\7\"\2\2\u055a\u00e9\3\2\2\2\u055b"+
		"\u055e\5\u00ecw\2\u055c\u055e\5\u017e\u00c0\2\u055d\u055b\3\2\2\2\u055d"+
		"\u055c\3\2\2\2\u055e\u00eb\3\2\2\2\u055f\u0562\5\u01c6\u00e4\2\u0560\u0562"+
		"\5\u00eex\2\u0561\u055f\3\2\2\2\u0561\u0560\3\2\2\2\u0562\u00ed\3\2\2"+
		"\2\u0563\u0567\7\35\2\2\u0564\u0567\7\u00bc\2\2\u0565\u0567\7\u00bd\2"+
		"\2\u0566\u0563\3\2\2\2\u0566\u0564\3\2\2\2\u0566\u0565\3\2\2\2\u0567\u00ef"+
		"\3\2\2\2\u0568\u056e\5\u00fe\u0080\2\u0569\u056d\5\u00f6|\2\u056a\u056d"+
		"\5\u00f2z\2\u056b\u056d\5\u00f8}\2\u056c\u0569\3\2\2\2\u056c\u056a\3\2"+
		"\2\2\u056c\u056b\3\2\2\2\u056d\u0570\3\2\2\2\u056e\u056c\3\2\2\2\u056e"+
		"\u056f\3\2\2\2\u056f\u00f1\3\2\2\2\u0570\u056e\3\2\2\2\u0571\u0578\7\27"+
		"\2\2\u0572\u0574\5\u0112\u008a\2\u0573\u0575\7 \2\2\u0574\u0573\3\2\2"+
		"\2\u0574\u0575\3\2\2\2\u0575\u0577\3\2\2\2\u0576\u0572\3\2\2\2\u0577\u057a"+
		"\3\2\2\2\u0578\u0576\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057b\3\2\2\2\u057a"+
		"\u0578\3\2\2\2\u057b\u057c\7\30\2\2\u057c\u00f3\3\2\2\2\u057d\u057f\5"+
		"\u00f6|\2\u057e\u057d\3\2\2\2\u057f\u0582\3\2\2\2\u0580\u057e\3\2\2\2"+
		"\u0580\u0581\3\2\2\2\u0581\u00f5\3\2\2\2\u0582\u0580\3\2\2\2\u0583\u0584"+
		"\7\31\2\2\u0584\u0585\5L\'\2\u0585\u0586\7\32\2\2\u0586\u00f7\3\2\2\2"+
		"\u0587\u0588\7,\2\2\u0588\u0589\5\u00fa~\2\u0589\u00f9\3\2\2\2\u058a\u058f"+
		"\5\u01ca\u00e6\2\u058b\u058f\7\7\2\2\u058c\u058f\5\u0108\u0085\2\u058d"+
		"\u058f\7\35\2\2\u058e\u058a\3\2\2\2\u058e\u058b\3\2\2\2\u058e\u058c\3"+
		"\2\2\2\u058e\u058d\3\2\2\2\u058f\u00fb\3\2\2\2\u0590\u0594\5\u01c6\u00e4"+
		"\2\u0591\u0594\5\u0104\u0083\2\u0592\u0594\5\u0108\u0085\2\u0593\u0590"+
		"\3\2\2\2\u0593\u0591\3\2\2\2\u0593\u0592\3\2\2\2\u0594\u00fd\3\2\2\2\u0595"+
		"\u05a3\5\u0100\u0081\2\u0596\u05a3\5\u0104\u0083\2\u0597\u05a3\5\u0108"+
		"\u0085\2\u0598\u05a3\5\u010a\u0086\2\u0599\u05a3\5\u0110\u0089\2\u059a"+
		"\u05a3\5\u010c\u0087\2\u059b\u05a3\5\u010e\u0088\2\u059c\u05a3\5\u0114"+
		"\u008b\2\u059d\u05a3\5\u0152\u00aa\2\u059e\u05a3\5\u015a\u00ae\2\u059f"+
		"\u05a3\5\u015e\u00b0\2\u05a0\u05a3\5\u0164\u00b3\2\u05a1\u05a3\5\u0172"+
		"\u00ba\2\u05a2\u0595\3\2\2\2\u05a2\u0596\3\2\2\2\u05a2\u0597\3\2\2\2\u05a2"+
		"\u0598\3\2\2\2\u05a2\u0599\3\2\2\2\u05a2\u059a\3\2\2\2\u05a2\u059b\3\2"+
		"\2\2\u05a2\u059c\3\2\2\2\u05a2\u059d\3\2\2\2\u05a2\u059e\3\2\2\2\u05a2"+
		"\u059f\3\2\2\2\u05a2\u05a0\3\2\2\2\u05a2\u05a1\3\2\2\2\u05a3\u00ff\3\2"+
		"\2\2\u05a4\u05a7\5\u0102\u0082\2\u05a5\u05a7\5\u01da\u00ee\2\u05a6\u05a4"+
		"\3\2\2\2\u05a6\u05a5\3\2\2\2\u05a7\u0101\3\2\2\2\u05a8\u05a9\t\23\2\2"+
		"\u05a9\u0103\3\2\2\2\u05aa\u05ab\7.\2\2\u05ab\u05ac\5\u01c6\u00e4\2\u05ac"+
		"\u0105\3\2\2\2\u05ad\u05ae\5\u01c6\u00e4\2\u05ae\u0107\3\2\2\2\u05af\u05b1"+
		"\7\27\2\2\u05b0\u05b2\5L\'\2\u05b1\u05b0\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2"+
		"\u05b3\3\2\2\2\u05b3\u05b4\7\30\2\2\u05b4\u0109\3\2\2\2\u05b5\u05b6\7"+
		"!\2\2\u05b6\u010b\3\2\2\2\u05b7\u05b8\7\u0087\2\2\u05b8\u05b9\5\u0098"+
		"M\2\u05b9\u010d\3\2\2\2\u05ba\u05bb\7\u00a5\2\2\u05bb\u05bc\5\u0098M\2"+
		"\u05bc\u010f\3\2\2\2\u05bd\u05be\5\u01c6\u00e4\2\u05be\u05bf\5\u00f2z"+
		"\2\u05bf\u0111\3\2\2\2\u05c0\u05c3\5N(\2\u05c1\u05c3\7,\2\2\u05c2\u05c0"+
		"\3\2\2\2\u05c2\u05c1\3\2\2\2\u05c3\u0113\3\2\2\2\u05c4\u05c7\5\u0116\u008c"+
		"\2\u05c5\u05c7\5\u012c\u0097\2\u05c6\u05c4\3\2\2\2\u05c6\u05c5\3\2\2\2"+
		"\u05c7\u0115\3\2\2\2\u05c8\u05cc\5\u0118\u008d\2\u05c9\u05cc\5\u011a\u008e"+
		"\2\u05ca\u05cc\t\24\2\2\u05cb\u05c8\3\2\2\2\u05cb\u05c9\3\2\2\2\u05cb"+
		"\u05ca\3\2\2\2\u05cc\u0117\3\2\2\2\u05cd\u05ce\7*\2\2\u05ce\u05cf\5\u01c8"+
		"\u00e5\2\u05cf\u05d0\5\u011c\u008f\2\u05d0\u05d4\7+\2\2\u05d1\u05d3\5"+
		"\u0128\u0095\2\u05d2\u05d1\3\2\2\2\u05d3\u05d6\3\2\2\2\u05d4\u05d2\3\2"+
		"\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d7\3\2\2\2\u05d6\u05d4\3\2\2\2\u05d7"+
		"\u05d8\7*\2\2\u05d8\u05d9\7&\2\2\u05d9\u05da\5\u01c8\u00e5\2\u05da\u05db"+
		"\7+\2\2\u05db\u0119\3\2\2\2\u05dc\u05dd\7*\2\2\u05dd\u05de\5\u01c8\u00e5"+
		"\2\u05de\u05df\5\u011c\u008f\2\u05df\u05e0\7&\2\2\u05e0\u05e1\7+\2\2\u05e1"+
		"\u011b\3\2\2\2\u05e2\u05e3\5\u01c8\u00e5\2\u05e3\u05e4\7\25\2\2\u05e4"+
		"\u05e5\5\u0122\u0092\2\u05e5\u05e7\3\2\2\2\u05e6\u05e2\3\2\2\2\u05e7\u05ea"+
		"\3\2\2\2\u05e8\u05e6\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u011d\3\2\2\2\u05ea"+
		"\u05e8\3\2\2\2\u05eb\u05f2\7\r\2\2\u05ec\u05f1\7\13\2\2\u05ed\u05f1\7"+
		"\f\2\2\u05ee\u05f1\7\3\2\2\u05ef\u05f1\5\u0124\u0093\2\u05f0\u05ec\3\2"+
		"\2\2\u05f0\u05ed\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f0\u05ef\3\2\2\2\u05f1"+
		"\u05f4\3\2\2\2\u05f2\u05f0\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f5\3\2"+
		"\2\2\u05f4\u05f2\3\2\2\2\u05f5\u05f6\7\r\2\2\u05f6\u011f\3\2\2\2\u05f7"+
		"\u05fe\7\16\2\2\u05f8\u05fd\7\13\2\2\u05f9\u05fd\7\f\2\2\u05fa\u05fd\7"+
		"\4\2\2\u05fb\u05fd\5\u0126\u0094\2\u05fc\u05f8\3\2\2\2\u05fc\u05f9\3\2"+
		"\2\2\u05fc\u05fa\3\2\2\2\u05fc\u05fb\3\2\2\2\u05fd\u0600\3\2\2\2\u05fe"+
		"\u05fc\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0601\3\2\2\2\u0600\u05fe\3\2"+
		"\2\2\u0601\u0602\7\16\2\2\u0602\u0121\3\2\2\2\u0603\u0606\5\u011e\u0090"+
		"\2\u0604\u0606\5\u0120\u0091\2\u0605\u0603\3\2\2\2\u0605\u0604\3\2\2\2"+
		"\u0606\u0123\3\2\2\2\u0607\u0609\7\u00c6\2\2\u0608\u0607\3\2\2\2\u0609"+
		"\u060a\3\2\2\2\u060a\u0608\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u0615\3\2"+
		"\2\2\u060c\u0615\7\5\2\2\u060d\u0615\7\6\2\2\u060e\u0615\5\u011e\u0090"+
		"\2\u060f\u0611\7\33\2\2\u0610\u0612\5L\'\2\u0611\u0610\3\2\2\2\u0611\u0612"+
		"\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0615\7\34\2\2\u0614\u0608\3\2\2\2"+
		"\u0614\u060c\3\2\2\2\u0614\u060d\3\2\2\2\u0614\u060e\3\2\2\2\u0614\u060f"+
		"\3\2\2\2\u0615\u0125\3\2\2\2\u0616\u0618\7\u00c6\2\2\u0617\u0616\3\2\2"+
		"\2\u0618\u0619\3\2\2\2\u0619\u0617\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u0624"+
		"\3\2\2\2\u061b\u0624\7\5\2\2\u061c\u0624\7\6\2\2\u061d\u0624\5\u0120\u0091"+
		"\2\u061e\u0620\7\33\2\2\u061f\u0621\5L\'\2\u0620\u061f\3\2\2\2\u0620\u0621"+
		"\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0624\7\34\2\2\u0623\u0617\3\2\2\2"+
		"\u0623\u061b\3\2\2\2\u0623\u061c\3\2\2\2\u0623\u061d\3\2\2\2\u0623\u061e"+
		"\3\2\2\2\u0624\u0127\3\2\2\2\u0625\u062c\5\u0116\u008c\2\u0626\u062c\5"+
		"\u012a\u0096\2\u0627\u062c\7\22\2\2\u0628\u062c\7\r\2\2\u0629\u062c\7"+
		"\16\2\2\u062a\u062c\5\u01e0\u00f1\2\u062b\u0625\3\2\2\2\u062b\u0626\3"+
		"\2\2\2\u062b\u0627\3\2\2\2\u062b\u0628\3\2\2\2\u062b\u0629\3\2\2\2\u062b"+
		"\u062a\3\2\2\2\u062c\u0129\3\2\2\2\u062d\u0637\t\25\2\2\u062e\u062f\7"+
		"\33\2\2\u062f\u0637\7\33\2\2\u0630\u0631\7\34\2\2\u0631\u0637\7\34\2\2"+
		"\u0632\u0633\7\33\2\2\u0633\u0634\5L\'\2\u0634\u0635\7\34\2\2\u0635\u0637"+
		"\3\2\2\2\u0636\u062d\3\2\2\2\u0636\u062e\3\2\2\2\u0636\u0630\3\2\2\2\u0636"+
		"\u0632\3\2\2\2\u0637\u012b\3\2\2\2\u0638\u0641\5\u013c\u009f\2\u0639\u0641"+
		"\5\u013e\u00a0\2\u063a\u0641\5\u0142\u00a2\2\u063b\u0641\5\u0144\u00a3"+
		"\2\u063c\u0641\5\u014c\u00a7\2\u063d\u0641\5\u014e\u00a8\2\u063e\u0641"+
		"\5\u0150\u00a9\2\u063f\u0641\5\u012e\u0098\2\u0640\u0638\3\2\2\2\u0640"+
		"\u0639\3\2\2\2\u0640\u063a\3\2\2\2\u0640\u063b\3\2\2\2\u0640\u063c\3\2"+
		"\2\2\u0640\u063d\3\2\2\2\u0640\u063e\3\2\2\2\u0640\u063f\3\2\2\2\u0641"+
		"\u012d\3\2\2\2\u0642\u0649\5\u0130\u0099\2\u0643\u0649\5\u0132\u009a\2"+
		"\u0644\u0649\5\u0134\u009b\2\u0645\u0649\5\u0136\u009c\2\u0646\u0649\5"+
		"\u0138\u009d\2\u0647\u0649\5\u013a\u009e\2\u0648\u0642\3\2\2\2\u0648\u0643"+
		"\3\2\2\2\u0648\u0644\3\2\2\2\u0648\u0645\3\2\2\2\u0648\u0646\3\2\2\2\u0648"+
		"\u0647\3\2\2\2\u0649\u012f\3\2\2\2\u064a\u064b\7\u00ae\2\2\u064b\u064c"+
		"\5\u0140\u00a1\2\u064c\u0131\3\2\2\2\u064d\u064e\7\u00b2\2\2\u064e\u065c"+
		"\7\33\2\2\u064f\u0650\5N(\2\u0650\u0651\7#\2\2\u0651\u0659\5N(\2\u0652"+
		"\u0653\7 \2\2\u0653\u0654\5N(\2\u0654\u0655\7#\2\2\u0655\u0656\5N(\2\u0656"+
		"\u0658\3\2\2\2\u0657\u0652\3\2\2\2\u0658\u065b\3\2\2\2\u0659\u0657\3\2"+
		"\2\2\u0659\u065a\3\2\2\2\u065a\u065d\3\2\2\2\u065b\u0659\3\2\2\2\u065c"+
		"\u064f\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u065f\7\34"+
		"\2\2\u065f\u0133\3\2\2\2\u0660\u0661\7\u00b1\2\2\u0661\u0662\5\u0140\u00a1"+
		"\2\u0662\u0135\3\2\2\2\u0663\u0664\7\u00af\2\2\u0664\u0665\7\33\2\2\u0665"+
		"\u0666\5N(\2\u0666\u0667\7\34\2\2\u0667\u0137\3\2\2\2\u0668\u0669\7\u00b0"+
		"\2\2\u0669\u066a\7\33\2\2\u066a\u066b\7\34\2\2\u066b\u0139\3\2\2\2\u066c"+
		"\u066d\7B\2\2\u066d\u066e\5\u0140\u00a1\2\u066e\u013b\3\2\2\2\u066f\u0670"+
		"\7V\2\2\u0670\u0671\5\u0098M\2\u0671\u013d\3\2\2\2\u0672\u0678\7X\2\2"+
		"\u0673\u0679\5\u01c6\u00e4\2\u0674\u0675\7\33\2\2\u0675\u0676\5L\'\2\u0676"+
		"\u0677\7\34\2\2\u0677\u0679\3\2\2\2\u0678\u0673\3\2\2\2\u0678\u0674\3"+
		"\2\2\2\u0679\u067a\3\2\2\2\u067a\u067b\5\u0140\u00a1\2\u067b\u013f\3\2"+
		"\2\2\u067c\u067d\5\u0098M\2\u067d\u0141\3\2\2\2\u067e\u0684\7?\2\2\u067f"+
		"\u0685\5\u01c6\u00e4\2\u0680\u0681\7\33\2\2\u0681\u0682\5L\'\2\u0682\u0683"+
		"\7\34\2\2\u0683\u0685\3\2\2\2\u0684\u067f\3\2\2\2\u0684\u0680\3\2\2\2"+
		"\u0685\u0686\3\2\2\2\u0686\u0687\5\u0098M\2\u0687\u0143\3\2\2\2\u0688"+
		"\u068b\7{\2\2\u0689\u068c\5\u0146\u00a4\2\u068a\u068c\5\u0148\u00a5\2"+
		"\u068b\u0689\3\2\2\2\u068b\u068a\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u068e"+
		"\5\u014a\u00a6\2\u068e\u0145\3\2\2\2\u068f\u0690\5\u01ca\u00e6\2\u0690"+
		"\u0147\3\2\2\2\u0691\u0692\5\u0098M\2\u0692\u0149\3\2\2\2\u0693\u0694"+
		"\5\u0098M\2\u0694\u014b\3\2\2\2\u0695\u0696\7\u009c\2\2\u0696\u0697\5"+
		"\u0098M\2\u0697\u014d\3\2\2\2\u0698\u0699\7J\2\2\u0699\u069a\5\u0098M"+
		"\2\u069a\u014f\3\2\2\2\u069b\u06a1\7\u008e\2\2\u069c\u06a2\5\u01ca\u00e6"+
		"\2\u069d\u069e\7\33\2\2\u069e\u069f\5L\'\2\u069f\u06a0\7\34\2\2\u06a0"+
		"\u06a2\3\2\2\2\u06a1\u069c\3\2\2\2\u06a1\u069d\3\2\2\2\u06a2\u06a3\3\2"+
		"\2\2\u06a3\u06a4\5\u0098M\2\u06a4\u0151\3\2\2\2\u06a5\u06a8\5\u0154\u00ab"+
		"\2\u06a6\u06a8\5\u0156\u00ac\2\u06a7\u06a5\3\2\2\2\u06a7\u06a6\3\2\2\2"+
		"\u06a8\u0153\3\2\2\2\u06a9\u06aa\5\u01c6\u00e4\2\u06aa\u06ab\7\61\2\2"+
		"\u06ab\u06ac\7\7\2\2\u06ac\u0155\3\2\2\2\u06ad\u06ae\5@!\2\u06ae\u06af"+
		"\7e\2\2\u06af\u06b1\7\27\2\2\u06b0\u06b2\5<\37\2\u06b1\u06b0\3\2\2\2\u06b1"+
		"\u06b2\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b6\7\30\2\2\u06b4\u06b5\7"+
		"<\2\2\u06b5\u06b7\5\u0178\u00bd\2\u06b6\u06b4\3\2\2\2\u06b6\u06b7\3\2"+
		"\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06b9\5\u0158\u00ad\2\u06b9\u0157\3\2\2"+
		"\2\u06ba\u06bb\5\u0098M\2\u06bb\u0159\3\2\2\2\u06bc\u06bd\7x\2\2\u06bd"+
		"\u06c6\7\33\2\2\u06be\u06c3\5\u015c\u00af\2\u06bf\u06c0\7 \2\2\u06c0\u06c2"+
		"\5\u015c\u00af\2\u06c1\u06bf\3\2\2\2\u06c2\u06c5\3\2\2\2\u06c3\u06c1\3"+
		"\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06c7\3\2\2\2\u06c5\u06c3\3\2\2\2\u06c6"+
		"\u06be\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8\u06c9\7\34"+
		"\2\2\u06c9\u015b\3\2\2\2\u06ca\u06cb\5N(\2\u06cb\u06cc\t\26\2\2\u06cc"+
		"\u06cd\5N(\2\u06cd\u015d\3\2\2\2\u06ce\u06d1\5\u0160\u00b1\2\u06cf\u06d1"+
		"\5\u0162\u00b2\2\u06d0\u06ce\3\2\2\2\u06d0\u06cf\3\2\2\2\u06d1\u015f\3"+
		"\2\2\2\u06d2\u06d4\7\31\2\2\u06d3\u06d5\5L\'\2\u06d4\u06d3\3\2\2\2\u06d4"+
		"\u06d5\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06d7\7\32\2\2\u06d7\u0161\3"+
		"\2\2\2\u06d8\u06d9\7;\2\2\u06d9\u06da\5\u0098M\2\u06da\u0163\3\2\2\2\u06db"+
		"\u06dc\7\u00c4\2\2\u06dc\u06dd\5\u0166\u00b4\2\u06dd\u06de\7\u00c9\2\2"+
		"\u06de\u0165\3\2\2\2\u06df\u06e5\5\u016e\u00b8\2\u06e0\u06e1\5\u0170\u00b9"+
		"\2\u06e1\u06e2\5\u016e\u00b8\2\u06e2\u06e4\3\2\2\2\u06e3\u06e0\3\2\2\2"+
		"\u06e4\u06e7\3\2\2\2\u06e5\u06e3\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u0167"+
		"\3\2\2\2\u06e7\u06e5\3\2\2\2\u06e8\u06e9\t\27\2\2\u06e9\u0169\3\2\2\2"+
		"\u06ea\u06eb\t\30\2\2\u06eb\u016b\3\2\2\2\u06ec\u06ed\t\31\2\2\u06ed\u016d"+
		"\3\2\2\2\u06ee\u06f9\7\u00c7\2\2\u06ef\u06f0\5\u0168\u00b5\2\u06f0\u06f1"+
		"\5\u016a\u00b6\2\u06f1\u06f9\3\2\2\2\u06f2\u06f3\5\u016c\u00b7\2\u06f3"+
		"\u06f4\5\u0168\u00b5\2\u06f4\u06f5\5\u0168\u00b5\2\u06f5\u06f9\3\2\2\2"+
		"\u06f6\u06f9\5\u0168\u00b5\2\u06f7\u06f9\7\33\2\2\u06f8\u06ee\3\2\2\2"+
		"\u06f8\u06ef\3\2\2\2\u06f8\u06f2\3\2\2\2\u06f8\u06f6\3\2\2\2\u06f8\u06f7"+
		"\3\2\2\2\u06f9\u06fc\3\2\2\2\u06fa\u06f8\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb"+
		"\u016f\3\2\2\2\u06fc\u06fa\3\2\2\2\u06fd\u06fe\7\u00c8\2\2\u06fe\u06ff"+
		"\5L\'\2\u06ff\u0700\7\u00c5\2\2\u0700\u0171\3\2\2\2\u0701\u0702\7,\2\2"+
		"\u0702\u0703\5\u00fa~\2\u0703\u0173\3\2\2\2\u0704\u0706\5\u01a0\u00d1"+
		"\2\u0705\u0707\7,\2\2\u0706\u0705\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u0175"+
		"\3\2\2\2\u0708\u0709\7<\2\2\u0709\u070a\5\u0178\u00bd\2\u070a\u0177\3"+
		"\2\2\2\u070b\u070c\7[\2\2\u070c\u070d\7\27\2\2\u070d\u0715\7\30\2\2\u070e"+
		"\u0712\5\u017a\u00be\2\u070f\u0713\7,\2\2\u0710\u0713\7\35\2\2\u0711\u0713"+
		"\7\36\2\2\u0712\u070f\3\2\2\2\u0712\u0710\3\2\2\2\u0712\u0711\3\2\2\2"+
		"\u0712\u0713\3\2\2\2\u0713\u0715\3\2\2\2\u0714\u070b\3\2\2\2\u0714\u070e"+
		"\3\2\2\2\u0715\u0179\3\2\2\2\u0716\u0720\5\u017e\u00c0\2\u0717\u0718\7"+
		"r\2\2\u0718\u0719\7\27\2\2\u0719\u0720\7\30\2\2\u071a\u0720\5\u01a4\u00d3"+
		"\2\u071b\u0720\5\u01aa\u00d6\2\u071c\u0720\5\u01b0\u00d9\2\u071d\u0720"+
		"\5\u017c\u00bf\2\u071e\u0720\5\u01b6\u00dc\2\u071f\u0716\3\2\2\2\u071f"+
		"\u0717\3\2\2\2\u071f\u071a\3\2\2\2\u071f\u071b\3\2\2\2\u071f\u071c\3\2"+
		"\2\2\u071f\u071d\3\2\2\2\u071f\u071e\3\2\2\2\u0720\u017b\3\2\2\2\u0721"+
		"\u0722\5\u01c6\u00e4\2\u0722\u017d\3\2\2\2\u0723\u0730\5\u0184\u00c3\2"+
		"\u0724\u0730\5\u0194\u00cb\2\u0725\u0730\5\u018e\u00c8\2\u0726\u0730\5"+
		"\u0198\u00cd\2\u0727\u0730\5\u0192\u00ca\2\u0728\u0730\5\u018c\u00c7\2"+
		"\u0729\u0730\5\u0188\u00c5\2\u072a\u0730\5\u0186\u00c4\2\u072b\u0730\5"+
		"\u018a\u00c6\2\u072c\u0730\5\u01ba\u00de\2\u072d\u0730\5\u0182\u00c2\2"+
		"\u072e\u0730\5\u0180\u00c1\2\u072f\u0723\3\2\2\2\u072f\u0724\3\2\2\2\u072f"+
		"\u0725\3\2\2\2\u072f\u0726\3\2\2\2\u072f\u0727\3\2\2\2\u072f\u0728\3\2"+
		"\2\2\u072f\u0729\3\2\2\2\u072f\u072a\3\2\2\2\u072f\u072b\3\2\2\2\u072f"+
		"\u072c\3\2\2\2\u072f\u072d\3\2\2\2\u072f\u072e\3\2\2\2\u0730\u017f\3\2"+
		"\2\2\u0731\u0732\7\u0081\2\2\u0732\u0734\7\27\2\2\u0733\u0735\7\35\2\2"+
		"\u0734\u0733\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u0737"+
		"\7\30\2\2\u0737\u0181\3\2\2\2\u0738\u0739\7B\2\2\u0739\u073a\7\27\2\2"+
		"\u073a\u073b\7\30\2\2\u073b\u0183\3\2\2\2\u073c\u073d\7W\2\2\u073d\u0740"+
		"\7\27\2\2\u073e\u0741\5\u0194\u00cb\2\u073f\u0741\5\u0198\u00cd\2\u0740"+
		"\u073e\3\2\2\2\u0740\u073f\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u0742\3\2"+
		"\2\2\u0742\u0743\7\30\2\2\u0743\u0185\3\2\2\2\u0744\u0745\7\u009c\2\2"+
		"\u0745\u0746\7\27\2\2\u0746\u0747\7\30\2\2\u0747\u0187\3\2\2\2\u0748\u0749"+
		"\7J\2\2\u0749\u074a\7\27\2\2\u074a\u074b\7\30\2\2\u074b\u0189\3\2\2\2"+
		"\u074c\u074d\7~\2\2\u074d\u074e\7\27\2\2\u074e\u074f\7\30\2\2\u074f\u018b"+
		"\3\2\2\2\u0750\u0751\7\u008e\2\2\u0751\u0754\7\27\2\2\u0752\u0755\5\u01ca"+
		"\u00e6\2\u0753\u0755\5\u01da\u00ee\2\u0754\u0752\3\2\2\2\u0754\u0753\3"+
		"\2\2\2\u0754\u0755\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u0757\7\30\2\2\u0757"+
		"\u018d\3\2\2\2\u0758\u0759\7?\2\2\u0759\u075f\7\27\2\2\u075a\u075d\5\u0190"+
		"\u00c9\2\u075b\u075c\7 \2\2\u075c\u075e\5\u01a2\u00d2\2\u075d\u075b\3"+
		"\2\2\2\u075d\u075e\3\2\2\2\u075e\u0760\3\2\2\2\u075f\u075a\3\2\2\2\u075f"+
		"\u0760\3\2\2\2\u0760\u0761\3\2\2\2\u0761\u0762\7\30\2\2\u0762\u018f\3"+
		"\2\2\2\u0763\u0766\5\u019c\u00cf\2\u0764\u0766\7\35\2\2\u0765\u0763\3"+
		"\2\2\2\u0765\u0764\3\2\2\2\u0766\u0191\3\2\2\2\u0767\u0768\7\u0092\2\2"+
		"\u0768\u0769\7\27\2\2\u0769\u076a\5\u01b8\u00dd\2\u076a\u076b\7\30\2\2"+
		"\u076b\u0193\3\2\2\2\u076c\u076d\7X\2\2\u076d\u0776\7\27\2\2\u076e\u0774"+
		"\5\u0196\u00cc\2\u076f\u0770\7 \2\2\u0770\u0772\5\u01a2\u00d2\2\u0771"+
		"\u0773\7,\2\2\u0772\u0771\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u0775\3\2"+
		"\2\2\u0774\u076f\3\2\2\2\u0774\u0775\3\2\2\2\u0775\u0777\3\2\2\2\u0776"+
		"\u076e\3\2\2\2\u0776\u0777\3\2\2\2\u0777\u0778\3\2\2\2\u0778\u0779\7\30"+
		"\2\2\u0779\u0195\3\2\2\2\u077a\u077d\5\u019e\u00d0\2\u077b\u077d\7\35"+
		"\2\2\u077c\u077a\3\2\2\2\u077c\u077b\3\2\2\2\u077d\u0197\3\2\2\2\u077e"+
		"\u077f\7\u0093\2\2\u077f\u0780\7\27\2\2\u0780\u0781\5\u019a\u00ce\2\u0781"+
		"\u0782\7\30\2\2\u0782\u0199\3\2\2\2\u0783\u0784\5\u019e\u00d0\2\u0784"+
		"\u019b\3\2\2\2\u0785\u0786\5\u01c6\u00e4\2\u0786\u019d\3\2\2\2\u0787\u0788"+
		"\5\u01c6\u00e4\2\u0788\u019f\3\2\2\2\u0789\u078a\5\u01a2\u00d2\2\u078a"+
		"\u01a1\3\2\2\2\u078b\u078c\5\u01c6\u00e4\2\u078c\u01a3\3\2\2\2\u078d\u078f"+
		"\5B\"\2\u078e\u078d\3\2\2\2\u078f\u0792\3\2\2\2\u0790\u078e\3\2\2\2\u0790"+
		"\u0791\3\2\2\2\u0791\u0795\3\2\2\2\u0792\u0790\3\2\2\2\u0793\u0796\5\u01a6"+
		"\u00d4\2\u0794\u0796\5\u01a8\u00d5\2\u0795\u0793\3\2\2\2\u0795\u0794\3"+
		"\2\2\2\u0796\u01a5\3\2\2\2\u0797\u0798\7e\2\2\u0798\u0799\7\27\2\2\u0799"+
		"\u079a\7\35\2\2\u079a\u079b\7\30\2\2\u079b\u01a7\3\2\2\2\u079c\u079d\7"+
		"e\2\2\u079d\u07a6\7\27\2\2\u079e\u07a3\5\u0178\u00bd\2\u079f\u07a0\7 "+
		"\2\2\u07a0\u07a2\5\u0178\u00bd\2\u07a1\u079f\3\2\2\2\u07a2\u07a5\3\2\2"+
		"\2\u07a3\u07a1\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4\u07a7\3\2\2\2\u07a5\u07a3"+
		"\3\2\2\2\u07a6\u079e\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8"+
		"\u07a9\7\30\2\2\u07a9\u07aa\7<\2\2\u07aa\u07ab\5\u0178\u00bd\2\u07ab\u01a9"+
		"\3\2\2\2\u07ac\u07af\5\u01ac\u00d7\2\u07ad\u07af\5\u01ae\u00d8\2\u07ae"+
		"\u07ac\3\2\2\2\u07ae\u07ad\3\2\2\2\u07af\u01ab\3\2\2\2\u07b0\u07b1\7x"+
		"\2\2\u07b1\u07b2\7\27\2\2\u07b2\u07b3\7\35\2\2\u07b3\u07b4\7\30\2\2\u07b4"+
		"\u01ad\3\2\2\2\u07b5\u07b6\7x\2\2\u07b6\u07b7\7\27\2\2\u07b7\u07b8\5\u01c6"+
		"\u00e4\2\u07b8\u07b9\7 \2\2\u07b9\u07ba\5\u0178\u00bd\2\u07ba\u07bb\7"+
		"\30\2\2\u07bb\u01af\3\2\2\2\u07bc\u07bf\5\u01b2\u00da\2\u07bd\u07bf\5"+
		"\u01b4\u00db\2\u07be\u07bc\3\2\2\2\u07be\u07bd\3\2\2\2\u07bf\u01b1\3\2"+
		"\2\2\u07c0\u07c1\7;\2\2\u07c1\u07c2\7\27\2\2\u07c2\u07c3\7\35\2\2\u07c3"+
		"\u07c4\7\30\2\2\u07c4\u01b3\3\2\2\2\u07c5\u07c6\7;\2\2\u07c6\u07c7\7\27"+
		"\2\2\u07c7\u07c8\5\u0178\u00bd\2\u07c8\u07c9\7\30\2\2\u07c9\u01b5\3\2"+
		"\2\2\u07ca\u07cb\7\27\2\2\u07cb\u07cc\5\u017a\u00be\2\u07cc\u07cd\7\30"+
		"\2\2\u07cd\u01b7\3\2\2\2\u07ce\u07cf\5\u019c\u00cf\2\u07cf\u01b9\3\2\2"+
		"\2\u07d0\u07d6\5\u01bc\u00df\2\u07d1\u07d6\5\u01be\u00e0\2\u07d2\u07d6"+
		"\5\u01c0\u00e1\2\u07d3\u07d6\5\u01c2\u00e2\2\u07d4\u07d6\5\u01c4\u00e3"+
		"\2\u07d5\u07d0\3\2\2\2\u07d5\u07d1\3\2\2\2\u07d5\u07d2\3\2\2\2\u07d5\u07d3"+
		"\3\2\2\2\u07d5\u07d4\3\2\2\2\u07d6\u01bb\3\2\2\2\u07d7\u07d8\7\u00ae\2"+
		"\2\u07d8\u07da\7\27\2\2\u07d9\u07db\5\u01da\u00ee\2\u07da\u07d9\3\2\2"+
		"\2\u07da\u07db\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07dd\7\30\2\2\u07dd"+
		"\u01bd\3\2\2\2\u07de\u07df\7\u00b2\2\2\u07df\u07e1\7\27\2\2\u07e0\u07e2"+
		"\5\u01da\u00ee\2\u07e1\u07e0\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u07e3\3"+
		"\2\2\2\u07e3\u07e4\7\30\2\2\u07e4\u01bf\3\2\2\2\u07e5\u07e6\7\u00b1\2"+
		"\2\u07e6\u07e8\7\27\2\2\u07e7\u07e9\5\u01da\u00ee\2\u07e8\u07e7\3\2\2"+
		"\2\u07e8\u07e9\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea\u07eb\7\30\2\2\u07eb"+
		"\u01c1\3\2\2\2\u07ec\u07ed\7\u00af\2\2\u07ed\u07ef\7\27\2\2\u07ee\u07f0"+
		"\5\u01da\u00ee\2\u07ef\u07ee\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f1\3"+
		"\2\2\2\u07f1\u07f2\7\30\2\2\u07f2\u01c3\3\2\2\2\u07f3\u07f4\7\u00b0\2"+
		"\2\u07f4\u07f6\7\27\2\2\u07f5\u07f7\5\u01da\u00ee\2\u07f6\u07f5\3\2\2"+
		"\2\u07f6\u07f7\3\2\2\2\u07f7\u07f8\3\2\2\2\u07f8\u07f9\7\30\2\2\u07f9"+
		"\u01c5\3\2\2\2\u07fa\u07fd\5\u01c8\u00e5\2\u07fb\u07fd\7\u00ba\2\2\u07fc"+
		"\u07fa\3\2\2\2\u07fc\u07fb\3\2\2\2\u07fd\u01c7\3\2\2\2\u07fe\u0801\7\u00bb"+
		"\2\2\u07ff\u0801\5\u01ca\u00e6\2\u0800\u07fe\3\2\2\2\u0800\u07ff\3\2\2"+
		"\2\u0801\u01c9\3\2\2\2\u0802\u0805\7\u00be\2\2\u0803\u0805\5\u01ce\u00e8"+
		"\2\u0804\u0802\3\2\2\2\u0804\u0803\3\2\2\2\u0805\u01cb\3\2\2\2\u0806\u080b"+
		"\7\u00bb\2\2\u0807\u080b\7\u00be\2\2\u0808\u080b\7\u00ba\2\2\u0809\u080b"+
		"\5\u01d2\u00ea\2\u080a\u0806\3\2\2\2\u080a\u0807\3\2\2\2\u080a\u0808\3"+
		"\2\2\2\u080a\u0809\3\2\2\2\u080b\u01cd\3\2\2\2\u080c\u080f\5\u01d2\u00ea"+
		"\2\u080d\u080f\5\u01d0\u00e9\2\u080e\u080c\3\2\2\2\u080e\u080d\3\2\2\2"+
		"\u080f\u01cf\3\2\2\2\u0810\u0811\t\32\2\2\u0811\u01d1\3\2\2\2\u0812\u0813"+
		"\t\33\2\2\u0813\u01d3\3\2\2\2\u0814\u0815\5\u01da\u00ee\2\u0815\u01d5"+
		"\3\2\2\2\u0816\u081d\7\r\2\2\u0817\u081c\7\13\2\2\u0818\u081c\7\f\2\2"+
		"\u0819\u081c\7\3\2\2\u081a\u081c\5\u01dc\u00ef\2\u081b\u0817\3\2\2\2\u081b"+
		"\u0818\3\2\2\2\u081b\u0819\3\2\2\2\u081b\u081a\3\2\2\2\u081c\u081f\3\2"+
		"\2\2\u081d\u081b\3\2\2\2\u081d\u081e\3\2\2\2\u081e\u0820\3\2\2\2\u081f"+
		"\u081d\3\2\2\2\u0820\u0821\7\r\2\2\u0821\u01d7\3\2\2\2\u0822\u0829\7\16"+
		"\2\2\u0823\u0828\7\13\2\2\u0824\u0828\7\f\2\2\u0825\u0828\7\4\2\2\u0826"+
		"\u0828\5\u01de\u00f0\2\u0827\u0823\3\2\2\2\u0827\u0824\3\2\2\2\u0827\u0825"+
		"\3\2\2\2\u0827\u0826\3\2\2\2\u0828\u082b\3\2\2\2\u0829\u0827\3\2\2\2\u0829"+
		"\u082a\3\2\2\2\u082a\u082c\3\2\2\2\u082b\u0829\3\2\2\2\u082c\u082d\7\16"+
		"\2\2\u082d\u01d9\3\2\2\2\u082e\u0831\5\u01d6\u00ec\2\u082f\u0831\5\u01d8"+
		"\u00ed\2\u0830\u082e\3\2\2\2\u0830\u082f\3\2\2\2\u0831\u01db\3\2\2\2\u0832"+
		"\u0834\7\u00c6\2\2\u0833\u0832\3\2\2\2\u0834\u0835\3\2\2\2\u0835\u0833"+
		"\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u0844\3\2\2\2\u0837\u0839\7\33\2\2"+
		"\u0838\u083a\5L\'\2\u0839\u0838\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u083c"+
		"\3\2\2\2\u083b\u083d\7\34\2\2\u083c\u083b\3\2\2\2\u083c\u083d\3\2\2\2"+
		"\u083d\u0844\3\2\2\2\u083e\u0844\7\34\2\2\u083f\u0844\7\5\2\2\u0840\u0844"+
		"\7\6\2\2\u0841\u0844\5\u01e0\u00f1\2\u0842\u0844\5\u01d8\u00ed\2\u0843"+
		"\u0833\3\2\2\2\u0843\u0837\3\2\2\2\u0843\u083e\3\2\2\2\u0843\u083f\3\2"+
		"\2\2\u0843\u0840\3\2\2\2\u0843\u0841\3\2\2\2\u0843\u0842\3\2\2\2\u0844"+
		"\u01dd\3\2\2\2\u0845\u0847\7\u00c6\2\2\u0846\u0845\3\2\2\2\u0847\u0848"+
		"\3\2\2\2\u0848\u0846\3\2\2\2\u0848\u0849\3\2\2\2\u0849\u0857\3\2\2\2\u084a"+
		"\u084c\7\33\2\2\u084b\u084d\5L\'\2\u084c\u084b\3\2\2\2\u084c\u084d\3\2"+
		"\2\2\u084d\u084f\3\2\2\2\u084e\u0850\7\34\2\2\u084f\u084e\3\2\2\2\u084f"+
		"\u0850\3\2\2\2\u0850\u0857\3\2\2\2\u0851\u0857\7\34\2\2\u0852\u0857\7"+
		"\5\2\2\u0853\u0857\7\6\2\2\u0854\u0857\5\u01e0\u00f1\2\u0855\u0857\5\u01d6"+
		"\u00ec\2\u0856\u0846\3\2\2\2\u0856\u084a\3\2\2\2\u0856\u0851\3\2\2\2\u0856"+
		"\u0852\3\2\2\2\u0856\u0853\3\2\2\2\u0856\u0854\3\2\2\2\u0856\u0855\3\2"+
		"\2\2\u0857\u01df\3\2\2\2\u0858\u085b\5\u01ce\u00e8\2\u0859\u085b\t\34"+
		"\2\2\u085a\u0858\3\2\2\2\u085a\u0859\3\2\2\2\u085b\u085c\3\2\2\2\u085c"+
		"\u085a\3\2\2\2\u085c\u085d\3\2\2\2\u085d\u01e1\3\2\2\2\u00d1\u01e3\u01e6"+
		"\u01e9\u01ed\u01f6\u020e\u0214\u0218\u021e\u0224\u0235\u0261\u0268\u026e"+
		"\u0277\u027a\u0283\u028b\u0294\u0297\u02a2\u02a8\u02af\u02ba\u02bc\u02c7"+
		"\u02ce\u02d0\u02d5\u02db\u02df\u02e3\u02ea\u02f0\u02f5\u02fe\u0305\u0317"+
		"\u0322\u0328\u0330\u0337\u033f\u0345\u0348\u034b\u035d\u0363\u036b\u0372"+
		"\u0378\u037f\u038c\u0395\u0398\u039d\u03a2\u03b4\u03ba\u03be\u03c2\u03c5"+
		"\u03ce\u03d4\u03d9\u03db\u03df\u03e6\u03ed\u03f6\u0402\u040c\u041a\u041f"+
		"\u0429\u0434\u0444\u0452\u0458\u0461\u046a\u0488\u0490\u0497\u049b\u04a2"+
		"\u04a8\u04af\u04b7\u04bf\u04c7\u04ce\u04d4\u04da\u04e0\u04e7\u04ed\u04f5"+
		"\u04ff\u0508\u050e\u0517\u0522\u0527\u052c\u0533\u0538\u053c\u0544\u054b"+
		"\u0553\u055d\u0561\u0566\u056c\u056e\u0574\u0578\u0580\u058e\u0593\u05a2"+
		"\u05a6\u05b1\u05c2\u05c6\u05cb\u05d4\u05e8\u05f0\u05f2\u05fc\u05fe\u0605"+
		"\u060a\u0611\u0614\u0619\u0620\u0623\u062b\u0636\u0640\u0648\u0659\u065c"+
		"\u0678\u0684\u068b\u06a1\u06a7\u06b1\u06b6\u06c3\u06c6\u06d0\u06d4\u06e5"+
		"\u06f8\u06fa\u0706\u0712\u0714\u071f\u072f\u0734\u0740\u0754\u075d\u075f"+
		"\u0765\u0772\u0774\u0776\u077c\u0790\u0795\u07a3\u07a6\u07ae\u07be\u07d5"+
		"\u07da\u07e1\u07e8\u07ef\u07f6\u07fc\u0800\u0804\u080a\u080e\u081b\u081d"+
		"\u0827\u0829\u0830\u0835\u0839\u083c\u0843\u0848\u084c\u084f\u0856\u085a"+
		"\u085c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}