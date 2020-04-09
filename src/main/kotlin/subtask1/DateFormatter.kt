package subtask1

class DateFormatter {


    fun toTextDay(day: String, month: String, year: String): String {
        val dayInt = day.toInt()
        val monthInt = month.toInt()
        val yearInt = year.toInt()
        var b : Boolean
        var list30 = mutableListOf(1, 3, 5, 7, 8, 10, 11)
        var res = ""

        //visokosnyi ili net
        if (yearInt % 4 != 0) {
            b = false
        } else {
            if (yearInt % 100 == 0) {
                if (yearInt % 400 == 0) {
                    b = true
                } else {
                    b = false
                }
            } else {
                b = true
            }
        }

        if ( dayInt<0 || dayInt>31 || monthInt<0 || monthInt>12 || yearInt<0 ) {
            res = ("Такого дня не существует")
        } else {
            if (list30.contains(monthInt) && dayInt == 31)  {
                res = ("Такого дня не существует")
            } else {
                if (!b && (monthInt == 2) && ((dayInt == 29) || (dayInt == 30) || (dayInt == 31))) {   //проверка февраля
                    res = ("Такого дня не существует")
                } else {
                    if (b && monthInt == 2 && dayInt > 29 ) { //проверка февраля
                        res = ("Такого дня не существует")
                    } else {
                        var yearcode = 0
                        var monthcode = 0
                        var daycode : Int
                        var s = ""

                        when (monthInt) {
                            1, 10 -> monthcode = 1
                            2, 3, 11 -> monthcode = 4
                            4, 7 -> monthcode = 0
                            5 -> monthcode = 2
                            6 -> monthcode = 5
                            9, 12 -> monthcode = 6
                        }

                        when (monthInt) {
                            1 -> s = "января"
                            2 -> s = "февраля"
                            3 -> s = "марта"
                            4 -> s = "апреля"
                            5 -> s = "мая"
                            6 -> s = "июня"
                            7 -> s = "июля"
                            8 -> s = "августа"
                            9 -> s = "сентября"
                            10 -> s = "октября"
                            11 -> s = "ноября"
                            12 -> s = "декабря"
                        }

                        when (yearInt / 100) {
                            15 -> yearcode = ( 0 + yearInt % 100 + (yearInt % 100)/4 ) % 7
                            16 -> yearcode = ( 6 + yearInt % 100 + (yearInt % 100)/4 ) % 7
                            17 -> yearcode = ( 4 + yearInt % 100 + (yearInt % 100)/4 ) % 7
                            18 -> yearcode = ( 2 + yearInt % 100 + (yearInt % 100)/4 ) % 7
                            19 -> yearcode = ( 0 + yearInt % 100 + (yearInt % 100)/4 ) % 7
                            20 -> yearcode = ( 6 + yearInt % 100 + (yearInt % 100)/4 ) % 7
                            21 -> yearcode = ( 4 + yearInt % 100 + (yearInt % 100)/4 ) % 7
                            22 -> yearcode = ( 2 + yearInt % 100 + (yearInt % 100)/4 ) % 7
                        }

                        daycode = (dayInt + monthcode + yearcode) % 7

                        when (daycode) {
                            0 -> res = ("$dayInt $s, суббота")
                            1 -> res = ("$dayInt $s, воскресенье")
                            2 -> res = ("$dayInt $s, понедельник")
                            3 -> res = ("$dayInt $s, вторник")
                            4 -> res = ("$dayInt $s, среда")
                            5 -> res = ("$dayInt $s, четверг")
                            6 -> res = ("$dayInt $s, пятница")
                        }

                    }
                }
            }
        }

        return res
    }
}
