package data_structure.linked_list

import java.util.*

private fun insertNodeAtHead(head: SinglyLinkedListNode?, data: Int): SinglyLinkedListNode {
    if (head == null) {
        return SinglyLinkedListNode(data)
    }

    val current = SinglyLinkedListNode(data)
    current.next = head

    return current
}

/* Sample Input
5
383
484
392
975
321
 */
/* Sample Output
321
975
392
484
383
 */
fun main() {
    val scan = Scanner(System.`in`)

    val listCount = scan.nextLine().trim().toInt()
    val list = SinglyLinkedList()

    for (i in 0 until listCount) {
        val listItem = scan.nextLine().trim().toInt()
        list.head = insertNodeAtHead(list.head, listItem)
    }

    printSinglyLinkedList(list.head, "\n")
    println()
}