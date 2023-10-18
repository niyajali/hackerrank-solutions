package project_euler

import kotlin.math.pow

fun calculateDifference(n: Int): Long {
    val s1 = ((n * (n + 1)) / 2).toDouble().pow(2.0).toLong()
    val s2 = ((n * (n + 1) * (2 * n + 1)) / 6)
    return s1 - s2
}

fun main() {
    val t = readln().trim().toInt()

    for (tItr in 1..t) {
        val n = readln().trim().toInt()
        println(calculateDifference(n))
    }
}