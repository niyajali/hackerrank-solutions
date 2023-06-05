package data_structure.linked_list

import java.util.*

/*
 * Complete the 'reversePrint' function below.
 *
 * The function accepts INTEGER_SINGLY_LINKED_LIST list as parameter.
 */

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     data: Int
 *     next: SinglyLinkedListNode
 * }
 *
 */

private fun reversePrint(list: SinglyLinkedListNode?) {
    // Write your code here
    if (list != null) {
        if(list.next != null) {
            reversePrint(list.next)
        }

        println(list.data)
    }
}

fun main() {
    val scan = Scanner(System.`in`)

    val tests = scan.nextLine().trim().toInt()

    for (testsItr in 1..tests) {
        val count = scan.nextLine().trim().toInt()
        val list = SinglyLinkedList()

        for (i in 0 until count) {
            val listItem = scan.nextLine().trim().toInt()
            list.insertNode(listItem)
        }

        reversePrint(list.head)
    }
}