package project_euler

private fun findSmallestMultiple(n: Int): Int {
    var t = n

    if (t == 1) return 1

    val multi = t * (t - 1)
    var count = 1

    while (t > 0) {
        if ((multi * count) % t == 0) {
            t--
        } else {
            count++
            t = n
        }
    }

    return multi * count
}

/*
Sample Input 0

2
3
10
Sample Output 0

6
2520
 */
fun main() {
    val t = readln().trim().toInt()

    for (tItr in 1..t) {
        val n = readln().trim().toInt()
        println(findSmallestMultiple(n))
    }
}
