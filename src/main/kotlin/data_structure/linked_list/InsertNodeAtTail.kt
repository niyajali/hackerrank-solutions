package data_structure.linked_list

import java.util.*

private fun insertNodeAtTail(head: SinglyLinkedListNode?, data: Int): SinglyLinkedListNode? {
    if (head == null) {
        return SinglyLinkedListNode(data)
    }

    var current: SinglyLinkedListNode? = head

    while (current != null) {
        current = current.next
    }

    current?.next = SinglyLinkedListNode(data)

    return head
}

fun main() {
    val scan = Scanner(System.`in`)

    val listCount = scan.nextLine().trim().toInt()
    val list = SinglyLinkedList()

    for (i in 0 until listCount) {
        val listItem = scan.nextLine().trim().toInt()
        list.insertNode(listItem)
        list.head = insertNodeAtTail(list.head, listItem)
    }

    printSinglyLinkedList(list.head, "\n")
    println()
}