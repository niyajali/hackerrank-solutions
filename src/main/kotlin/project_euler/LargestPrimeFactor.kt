package project_euler

import kotlin.math.max
import kotlin.math.sqrt

private fun findLargestPrimeFactor(n: Long): Long {
    var num = n
    while (num % 2 == 0L) {
        num /= 2
    }

    if (num == 1L) {
        return 2L
    }

    var i = 3L
    while (i <= sqrt(num.toDouble())) {
        if (num % i == 0L) {
            num /= i
        } else {
            i += 2
        }
    }

    return max(num, i)
}

/*
Sample Input

2
10
17
Sample Output

5
17
 */
fun main() {
    val t = readln().trim().toInt()

    for (tItr in 1..t) {
        val n = readln().trim().toLong()

        println(findLargestPrimeFactor(n))
    }
}