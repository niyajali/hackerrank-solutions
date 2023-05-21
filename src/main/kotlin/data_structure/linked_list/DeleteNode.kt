package data_structure.linked_list

import java.util.*

/*
 * Complete the 'deleteNode' function below.
 *
 * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
 * The function accepts following parameters:
 *  1. INTEGER_SINGLY_LINKED_LIST list
 *  2. INTEGER position
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

fun deleteNode(list: SinglyLinkedListNode?, position: Int): SinglyLinkedListNode? {
    var newPosition = position
    // Write your code here
    if (newPosition == 0) {
        return list?.next
    }

    var current: SinglyLinkedListNode? = list
    while (newPosition-- > 1) {
        current = current?.next
    }
    current?.next = current?.next?.next

    return list
}

fun main() {
    val scan = Scanner(System.`in`)

    val listCount = scan.nextLine().trim().toInt()
    val list = SinglyLinkedList()

    for (i in 0 until listCount) {
        val listItem = scan.nextLine().trim().toInt()
        list.insertNode(listItem)
    }

    val position = scan.nextLine().trim().toInt()

    val deletedList = deleteNode(list.head, position)

    printSinglyLinkedList(deletedList, " ")
}
