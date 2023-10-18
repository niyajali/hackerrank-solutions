package data_structure.linked_list

import java.util.*

/*
 * Complete the 'removeDuplicates' function below.
 *
 * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
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

fun removeDuplicates(listNode: SinglyLinkedListNode?): SinglyLinkedListNode? {
    // Write your code here
    var temp = listNode
    val list = mutableListOf<Int>()

    while (temp != null) {
        list.add(temp.data)
        temp = temp.next
    }

    val distinctList = list.distinct().sorted()

    val ll = SinglyLinkedList()
    for (item in distinctList) {
        ll.insertNode(item)
    }

    return ll.head
}

fun main() {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val listCount = scan.nextLine().trim().toInt()
        val list = SinglyLinkedList()

        for (i in 0 until listCount) {
            val listItem = scan.nextLine().trim().toInt()
            list.insertNode(listItem)
        }

        val newList = removeDuplicates(list.head)

        printSinglyLinkedList(newList, " ")
    }
}