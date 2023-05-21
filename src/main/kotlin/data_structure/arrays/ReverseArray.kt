package data_structure.arrays

/*
 * Complete the 'reverseArray' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun reverseArray(a: Array<Int>): Array<Int> {
    // Write your code here
    val newArr: Array<Int> = Array(a.size){0}

    for(i in a.indices) {
        newArr[i] = a[a.size - 1 - i]
    }

    return newArr
}

//An array is a type of data structure that stores elements
// of the same type in a contiguous block of memory. In an array,
// [n] of size , each memory location has some unique index,
// (where ), that can be referenced as  or .
//Reverse an array of integers.

fun main(args: Array<String>) {
    val arrCount = readln().trim().toInt()

    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val res = reverseArray(arr)

    println(res.joinToString(" "))
}