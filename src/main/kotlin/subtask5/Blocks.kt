package subtask5

import kotlin.reflect.KClass

class Blocks {   
    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        return when(b) {
             String :: class -> a.filterIsInstance<String>().joinToString("")
             Int :: class -> a.filterIsInstance<Int>().sum()
             LocalDate :: class -> a.filterIsInstance<LocalDate>().max()!!.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
             else -> ""
        }
    }
}
