package project_euler

private fun fibonacciSum(n: Long): Long {
    if (n <= 1)
        return 0

    var sum = 2L
    var n1 = 1L
    var n2 = 2L
    var n3 = 0L

    while (n3 < n) {
        n3 = n1 + n2
        if (n3 > n) break
        if (n3 % 2 == 0L) sum += n3
        n1 = n2
        n2 = n3
    }
    return sum
}

/* Sample Input
2
10
100
 */
/* Sample Output
10
44
 */
fun main() {
    val t = readln().trim().toInt()

    for (tItr in 1..t) {
        val n = readln().trim().toLong()

        println(fibonacciSum(n))
    }
}
