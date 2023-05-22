package data_structure.linked_list

import java.util.*

private fun printList(head: SinglyLinkedListNode?) {
    if (head != null) {
        println(head.data)
        printList(head.next)
    }
}

fun main() {
    val scan = Scanner(System.`in`)

    val listCount = scan.nextLine().trim().toInt()
    val list = SinglyLinkedList()

    for (i in 0 until listCount) {
        val listItem = scan.nextLine().trim().toInt()
        list.insertNode(listItem)
    }

    printList(list.head)
}