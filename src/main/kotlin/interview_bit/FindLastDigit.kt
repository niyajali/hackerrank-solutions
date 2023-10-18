package interview_bit

import kotlin.math.pow

fun solve(a: String, b1: String): Int {
    val b2 = b1.takeLast(2)
    val b = b2.toInt()
    val x = Character.getNumericValue(a[a.length - 1])
    val ans = x.toDouble().pow((b % 4 + 4).toDouble()).toLong()

    return (ans % 10).toInt()
}

fun main() {
    val a = readln().trimEnd()
    val b = readln().trimEnd()

    val result = solve(a, b)
    println("Result: $result")
}