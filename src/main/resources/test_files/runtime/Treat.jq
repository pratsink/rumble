(:JIQS: ShouldRun; Output="(1, 2.14, 1, aa, 1, { "a" : "b" }, 1, 2, 3, false, null, [ 1, 2, 3 ], { "aa" : "bb" }, { "cc" : "dd" }, P3Y5M, P2Y4M, P10Y3M, P3DT5H6.001S, P21D, 2001-12-12T23:00:00.000Z, 2001-12-12-10:00, 13:20:30.555Z, AABBCC, 0 FB8 0F+9, Q Q = =)" :)
1 treat as integer,
2.14 treat as decimal,
1 treat as decimal,
"aa" treat as string+,
1 treat as item,
{"a": "b"} treat as object,
(1,2,3) treat as integer*,
false treat as boolean,
null treat as null,
[1,2,3] treat as array,
({"aa": "bb"}, {"cc": "dd"}) treat as json-item+,
() treat as string?,
() treat as string*,
() treat as (),
duration("P3Y5M") treat as duration,
yearMonthDuration("P2Y4M") treat as yearMonthDuration,
yearMonthDuration("P2Y99M") treat as duration,
dayTimeDuration("P3DT5H6.001S") treat as dayTimeDuration,
dayTimeDuration("P3DT432H") treat as duration,
dateTime("2001-12-12T23:00:00") treat as dateTime,
date("2001-12-12-10:00") treat as date,
time("13:20:30.5555") treat as time,
hexBinary("aabbCC") treat as hexBinary,
base64Binary("0 FB8 0F+9") treat as base64Binary,
base64Binary("Q Q = =") treat as base64Binary

(: general tests :)

