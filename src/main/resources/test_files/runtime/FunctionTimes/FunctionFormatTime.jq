(:JIQS: ShouldRun; Output="(13-20-0, test13, a-0-b-20-c-13-d-, test\20\test, no component test, 0)" :)
format-time(time("13:20:00"), "[H]-[m]-[s]"),
format-time(time("13:20:30.5555"), "test[H]"),
format-time(time("13:20:00-05:00"), "a-[s]-b-[m]-c-[H]-d-"),
format-time(time("13:20:00Z"), "test\\[m]\\test"),
format-time(time("00:00:00"), "no component test"),
format-time(time("24:00:00"), "[H]"), 
format-time(time(()), "")

(: general tests :)