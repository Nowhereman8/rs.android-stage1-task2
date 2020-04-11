package subtask4

class Pangram {

    // TODO: Complete the following function
    fun getResult(inputString: String): String {
        var k = inputString
        var alphabet = arrayListOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
        var vovels = arrayListOf('a', 'A', 'i', 'I', 'u', 'U', 'e', 'E', 'o', 'O', 'y', 'Y')
        var consonants = arrayListOf('b', 'B', 'c', 'C', 'd', 'D', 'f', 'F', 'j', 'J', 'h', 'H', 'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'p', 'P', 'q', 'Q', 'r', 'R', 's', 'S', 't', 'T', 'v', 'V', 'w', 'W', 'x', 'X', 'z', 'Z')
        var normwords = arrayListOf<String>()
        var fin = arrayListOf<String>()
        var w = ""
        var s = k
        fun removeChars(s: String) = s.replace(Regex("""\n"""), "")
        s = removeChars(s)

        var isPangram = false
        for (i in s.indices) {
            if (alphabet.contains(s[i].toLowerCase())) {
                alphabet.remove(s[i].toLowerCase())
            }
        }
        if (alphabet.size == 0) {
            isPangram = true
        } else {
            isPangram = false
        }


        fun rep(phrase: String): String = phrase.replace(Regex("[aeiouy]")) {
            when (it.value) {
                "a" -> "A"
                "e" -> "E"
                "i" -> "I"
                "o" -> "O"
                "u" -> "U"
                "y" -> "Y"
                else -> it.value
            }
        }
        fun rep2(phrase: String): String = phrase.replace(Regex("[bcdfghjklmnpqrstvwxz]")) {
            when (it.value) {
                "b" -> "B"
                "c" -> "C"
                "d" -> "D"
                "f" -> "F"
                "g" -> "G"
                "h" -> "H"
                "j" -> "J"
                "k" -> "K"
                "l" -> "L"
                "m" -> "M"
                "n" -> "N"
                "p" -> "P"
                "q" -> "Q"
                "s" -> "S"
                "t" -> "T"
                "v" -> "V"
                "w" -> "W"
                "x" -> "X"
                "z" -> "Z"
                else -> it.value
            }
        }

        if (s.filterNot { it ==' ' } != "") {
            var words = s.split(" ")
            words = words.filterNot { it == "" || it == """\n"""" || it == """+"""|| it == """""""}

            if (isPangram) {
                for (i in 0..words.size - 1) {
                    var t = 0
                    var slovo = words[i]
                    for (i in 0..slovo.length - 1) {
                        if (vovels.contains(slovo[i])) {
                            slovo = rep(slovo)
                            t++
                        }
                    }
                    normwords.add("$t" + "$slovo")
                }
            } else {
                for (i in 0..words.size - 1) {
                    var t = 0
                    var slovo = words[i]
                    for (i in 0..slovo.length - 1) {
                        if (consonants.contains(slovo[i])) {
                            slovo = rep2(slovo)
                            t++
                        }
                    }
                    normwords.add("$t" + "$slovo")
                }
            }

            var klas = normwords.toMutableList()
            var l = 0
            //var res = klas[0].first()
            var res = klas[0].first()
            println(klas)
            while (klas.size > 0) {
                res = '9'
                for (i in 0..(klas.size - 1)) {
                    if (klas[i].first() < res)  {

                        res = klas[i].first()
                        l = i
                    }
                }
                fin.add(klas[l])
                klas.removeAt(l)
                l = 0

            }

            return(fin.joinToString(" "))

        } else {
            return("")
        }


    }
}
