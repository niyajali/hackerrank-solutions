package data_structure.arrays

/*
 * Complete the 'dynamicArray' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. 2D_INTEGER_ARRAY queries
 */

fun dynamicArray(n: Int, queries: Array<Array<Int>>): Array<Int> {
    // Write your code here
    val newList: MutableList<MutableList<Int>> = ArrayList()
    val result: MutableList<Int> = ArrayList()
    var lastAnswer = 0

    for (i in 0 until n) {
        newList.add(ArrayList())
    }

    for (i in queries.indices) {
        val query = queries[i]

        if (query[0] == 1) {
            newList[(query[1] xor lastAnswer) % n].add(query[2])
        }else {
            val sequence = newList[(query[1] xor lastAnswer) % n]
            lastAnswer = sequence[query[2] % sequence.size]
            result.add(lastAnswer)
        }
    }


    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val firstMultipleInput = readln().trimEnd().split(" ")

    val n = firstMultipleInput[0].toInt()

    val q = firstMultipleInput[1].toInt()

    val queries = Array<Array<Int>>(q) { Array<Int>(3) { 0 } }

    for (i in 0 until q) {
        queries[i] = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = dynamicArray(n, queries)

    println(result.joinToString("\n"))
}