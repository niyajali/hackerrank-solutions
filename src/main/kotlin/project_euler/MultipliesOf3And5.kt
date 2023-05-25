package project_euler


/* Sample Input
2
10
100
 */

/* Sample Output
23
2318
 */
fun main() {
    val t = readln().trim().toInt()

    for (tItr in 1..t) {
        val n = readln().trim().toLong()

        println(getResult(n))
    }
}

private fun getResult(n: Long): Long {
    return calcResult(n, 3) + calcResult(n, 5) - calcResult(n, 15)
}

private fun calcResult(n: Long, x: Int): Long {
    if (x > n) return 0
    var remainder = n % x
    if (remainder == 0L) {
        remainder = (n - 1) % x
    }
    val k = (n - remainder) / x
    return x * (k * (k + 1) / 2)
}