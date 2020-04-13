package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var t = a.filter{b.contains(it,true)}
    //println(t)
    if (b.toUpperCase() == t.toUpperCase()) {
        return( "YES")
    } else return("NO")
    }
}
