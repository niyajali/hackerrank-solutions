package data_structure.arrays

/*
 * Complete the 'hourglassSum' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun hourglassSum(arr: Array<Array<Int>>): Int {
    var result = Int.MIN_VALUE

    for(row in 0 until 4){
        for(column in 0 until 4){
            result = result.coerceAtLeast(findMaxHourGlassSum(arr, row, column))
        }
    }

    return result
}

private fun findMaxHourGlassSum(arr: Array<Array<Int>>, row: Int, column: Int): Int {
    var sum = 0
    for (i in column until column + 3) {
        sum += arr[row][i] + arr[row + 2][i]
    }

    return sum + arr[row + 1][column + 1]
}

fun main(args: Array<String>) {

    val arr = Array<Array<Int>>(6) { Array<Int>(6) { 0 } }

    for (i in 0 until 6) {
        arr[i] = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = hourglassSum(arr)

    println(result)
}