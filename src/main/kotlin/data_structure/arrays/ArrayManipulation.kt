package data_structure.arrays

import java.util.logging.LogManager
import java.util.logging.Logger

/*
 * Complete the 'arrayManipulation' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. 2D_INTEGER_ARRAY queries
 */

fun arrayManipulation(n: Int, queries: Array<Array<Int>>): Long {
    // Write your code here
    val result = LongArray(n)
    var max = 0L
    var sum = 0L

    for (i in queries.indices) {
        val a = queries[i][0] - 1
        val b = queries[i][1] - 1
        val k = queries[i][2].toLong()

        result[a] += k
        if (b + 1 < n) {
            result[b + 1] -= k
        }
    }

    for (i in 0 until n) {
        sum += result[i]
        max = maxOf(max, sum)
    }

    return max
}

fun main(args: Array<String>) {
    val firstMultipleInput = readln().trimEnd().split(" ")

    val n = firstMultipleInput[0].toInt()

    val m = firstMultipleInput[1].toInt()

    val queries = Array<Array<Int>>(m) { Array<Int>(3) { 0 } }

    for (i in 0 until m) {
        queries[i] = readln().trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = arrayManipulation(n, queries)

    println(result)
}