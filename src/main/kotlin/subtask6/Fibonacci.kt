package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var a = 0
        var b = 1
        val res = intArrayOf(1, 1, 1)
    
         while (a * b < n) {
            var tmp = b
            b += a
            a = tmp
         }

         res[0] = a
         res[1] = b
         res[2] = (if (a * b == n) 1 else 0)

//    for (i in 0..res.size -1 ) {
//        println(res[i])
//    }
         return res
    }
}
