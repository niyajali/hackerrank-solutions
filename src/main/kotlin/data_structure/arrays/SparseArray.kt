package data_structure.arrays

/*
 * Complete the 'matchingStrings' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. STRING_ARRAY stringList
 *  2. STRING_ARRAY queries
 */

fun matchingStrings(stringList: Array<String>, queries: Array<String>): Array<Int> {
    // Write your code here
    val result = Array<Int>(queries.size){0}

    queries.forEachIndexed { index: Int, query: String ->
        result[index] = stringList.count { it ==  query}
    }

    return result
}

fun main(args: Array<String>) {
    val stringListCount = readln().trim().toInt()

    val stringList = Array<String>(stringListCount) { "" }
    for (i in 0 until stringListCount) {
        val stringListItem = readln()
        stringList[i] = stringListItem
    }

    val queriesCount = readln().trim().toInt()

    val queries = Array<String>(queriesCount) { "" }
    for (i in 0 until queriesCount) {
        val queriesItem = readln()
        queries[i] = queriesItem
    }

    val res = matchingStrings(stringList, queries)

    println(res.joinToString("\n"))
}