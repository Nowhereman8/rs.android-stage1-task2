package subtask2

class TimeConverter {

    fun toTextFormat(hour: String, minute: String): String {

        val hourInt = hour.toInt()
        val min = minute.toInt()
        val min1 = (min / 10)
        val min2 = (min % 10)

        var stringhour = ""
        var stringmin2 = ""
        var res = ""

        when (hourInt) {
            1 -> stringhour = "one"
            2 -> stringhour = "two"
            3 -> stringhour = "three"
            4 -> stringhour = "four"
            5 -> stringhour = "five"
            6 -> stringhour = "six"
            7 -> stringhour = "seven"
            8 -> stringhour = "eight"
            9 -> stringhour = "nine"
            10 -> stringhour = "ten"
            11 -> stringhour = "eleven"
            12 -> stringhour = "twelve"
        }

        if (min == 0) {
            res = ("$stringhour o' clock")
        }

        if (min > 0 && min < 31) {
            if (min == 15) {
                res = ("quarter past $stringhour")
            } else {
                if (min == 30) {
                    res = ("half past $stringhour")
                } else {
                    if (min1 == 1) {
                        when (min2) {
                            1 -> stringmin2 = "eleven minutes"
                            2 -> stringmin2 = "twelve minutes"
                            3 -> stringmin2 = "thirteen minutes"
                            4 -> stringmin2 = "fourteen minutes"
                            6 -> stringmin2 = "sixteen minutes"
                            7 -> stringmin2 = "seventeen minutes"
                            8 -> stringmin2 = "eighteen minutes"
                            9 -> stringmin2 = "nineteen minutes"
                        }
                        res = ("$stringmin2 past $stringhour")
                    } else {
                        if (min1 == 0) {
                            when (min2) {
                                1 -> stringmin2 = "one minute"
                                2 -> stringmin2 = "two minutes"
                                3 -> stringmin2 = "three minutes"
                                4 -> stringmin2 = "four minutes"
                                5 -> stringmin2 = "five minutes"
                                6 -> stringmin2 = "six minutes"
                                7 -> stringmin2 = "seven minutes"
                                8 -> stringmin2 = "eight minutes"
                                9 -> stringmin2 = "nine minutes"
                            }
                            res = ("$stringmin2 past $stringhour")
                        } else {
                            if (min1 == 2) {
                                when (min2) {
                                    1 -> stringmin2 = "one minute"
                                    2 -> stringmin2 = "two minutes"
                                    3 -> stringmin2 = "three minutes"
                                    4 -> stringmin2 = "four minutes"
                                    5 -> stringmin2 = "five minutes"
                                    6 -> stringmin2 = "six minutes"
                                    7 -> stringmin2 = "seven minutes"
                                    8 -> stringmin2 = "eight minutes"
                                    9 -> stringmin2 = "nine minutes"
                                }
                                res = ("twenty $stringmin2 past $stringhour")
                            }
                        }
                    }
                }
            }
        }

        if (min > 30 && min <= 59) {
            when (hourInt) {
                1 -> stringhour = "two"
                2 -> stringhour = "three"
                3 -> stringhour = "four"
                4 -> stringhour = "five"
                5 -> stringhour = "six"
                6 -> stringhour = "seven"
                7 -> stringhour = "eight"
                8 -> stringhour = "nine"
                9 -> stringhour = "ten"
                10 -> stringhour = "eleven"
                11 -> stringhour = "twelve"
                12 -> stringhour = "one"
            }

            if (((60 - min)/10) == 0) {
                when ((60 - min) % 10) {
                    1 -> res = ("one minute to $stringhour")
                    2 -> res = ("two minutes to $stringhour")
                    3 -> res = ("three minutes to $stringhour")
                    4 -> res = ("four minutes to $stringhour")
                    5 -> res = ("five minutes to $stringhour")
                    6 -> res = ("six minutes to $stringhour")
                    8 -> res = ("eight minutes to $stringhour")
                    9 -> res = ("nine minutes to $stringhour")
                }
            } else {
                if (((60 - min)/10) == 1) {
                    when ((60 - min) % 10) {
                        1 -> res = ("eleven minutes to $stringhour")
                        2 -> res = ("twelve minutes to $stringhour")
                        3 -> res = ("thirteen minutes to $stringhour")
                        4 -> res = ("fourteen minutes to $stringhour")
                        5 -> res = ("quarter to $stringhour")
                        6 -> res = ("sixteen minutes to $stringhour")
                        8 -> res = ("eighteen minutes to $stringhour")
                        9 -> res = ("nineteen minutes to $stringhour")
                    }
                } else {
                    when ((60 - min) % 10) {
                        1 -> res = ("twenty one minute to $stringhour")
                        2 -> res = ("twenty two minutes to $stringhour")
                        3 -> res = ("twenty three minutes to $stringhour")
                        4 -> res = ("twenty four minutes to $stringhour")
                        5 -> res = ("twenty five minutes to $stringhour")
                        6 -> res = ("twenty six minutes to $stringhour")
                        7 -> res = ("twenty seven minutes to $stringhour")
                        8 -> res = ("twenty eight minutes to $stringhour")
                        9 -> res = ("twenty nine minutes to $stringhour")
                    }
                }
            }
        }
        return res
    }
}
