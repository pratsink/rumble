(:JIQS: ShouldRun; Output="(1, 2.14, 1, 3.4, 230004, 30000, aa, false, true, null, false, 30000, 3, 3, true, null, null, null, null, null, P3Y5M, P2Y4M, P10Y3M, P3DT5H6.001S, P21D, 2001-12-12T23:00:00.000Z, 2001-12-12T23:00:00.000Z, 2001-12-12T23:00:00.000-02:00, 2001-12-12-10:00, 2001-12-12T00:00:00.000-10:00, 2001-12-12-02:00, 3011-02-11-02:00, 13:20:20.000+09:00, 23:12:00.123Z, 12:34:56.789Z, AABBCC, 0 FB8 0F+9, Q Q = =)" :)
1 cast as integer,
2.14 cast as decimal,
1 cast as decimal,
3.4 cast as double,
(4 + 2.3e5) cast as decimal,
3e4 cast as integer,
"aa" cast as string,
false cast as boolean,
2 cast as boolean,
null cast as string?,
() cast as string?,
"false" cast as boolean,
"3e4" cast as double,
"3" cast as decimal,
3 cast as string,
3.4 cast as boolean,
null cast as null,
null cast as null?,
"null" cast as null,
"null" cast as null?,
null cast as string,
duration("P3Y5M") cast as string,
yearMonthDuration("P2Y4M") cast as string,
yearMonthDuration("P2Y99M") cast as duration,
dayTimeDuration("P3DT5H6.001S") cast as string,
dayTimeDuration("P3DT432H") cast as duration,
dateTime("2001-12-12T23:00:00") cast as dateTime,
dateTime("2001-12-12T23:00:00Z") cast as dateTime,
dateTime("2001-12-12T23:00:00-02:00") cast as dateTime,
date("2001-12-12-10:00") cast as string,
date("2001-12-12-10:00") cast as dateTime,
dateTime("2001-12-12T23:00:00-02:00") cast as date,
"3011-02-11-02:00" cast as date,
time("13:20:20+09:00") cast as time,
time("23:12:00.123") cast as string,
dateTime("2001-12-12T12:34:56.789Z") cast as time,
"aabbCC" cast as hexBinary,
"0 FB8 0F+9" cast as base64Binary,
"Q Q = =" cast as base64Binary


(: general tests :)