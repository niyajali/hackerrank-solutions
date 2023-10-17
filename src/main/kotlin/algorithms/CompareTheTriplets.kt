package algorithms

/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    val result = Array(2){0}
    for(i in a.indices) {
        if(a[i] > b[i]) {
            result[0]++
        }else if (a[i] < b[i]) {
            result[1]++
        }
    }

    return result
}

fun main(args: Array<String>) {

    val a = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
