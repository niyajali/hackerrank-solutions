package data_structure.linked_list

import java.util.*

/*
 * Complete the 'insertNodeAtPosition' function below.
 *
 * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
 * The function accepts following parameters:
 *  1. INTEGER_SINGLY_LINKED_LIST list
 *  2. INTEGER data
 *  3. INTEGER position
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

fun insertNodeAtPosition(list: SinglyLinkedListNode?, data: Int, position: Int): SinglyLinkedListNode? {
    // Write your code here
    var newPosition = position

    if (newPosition == 0) {
        val node = SinglyLinkedListNode(data)
        node.next = list
        return node
    }

    var current: SinglyLinkedListNode? = list

    while (newPosition-- > 1) {
        current = current?.next
    }

    val node = SinglyLinkedListNode(data)
    node.next = current?.next
    current?.next = node

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

    val data = scan.nextLine().trim().toInt()

    val position = scan.nextLine().trim().toInt()

    val listHead = insertNodeAtPosition(list.head, data, position)

    printSinglyLinkedList(listHead, " ")
}