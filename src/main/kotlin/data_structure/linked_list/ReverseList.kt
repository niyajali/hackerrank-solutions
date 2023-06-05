package data_structure.linked_list

import java.util.*

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     data: Int
 *     next: SinglyLinkedListNode
 * }
 *
 */
private fun reverseRecursive(head: SinglyLinkedListNode?): SinglyLinkedListNode? {
    // Base case
    if (head?.next == null) {
        return head
    }

    // Get current llist data
    val curr = SinglyLinkedListNode(head.data)

    // Recurse through the list until base case (new head of reversed)
    val new = reverseRecursive(head.next)

    // Set pointer to go through new reversed linked list
    var tail = new
    while (tail?.next != null) {
        tail = tail.next
    }

    // Set tail of the linked list to the current value
    tail?.next = curr

    // Return head of reversed linked list
    return new
}

/*
Sample Input
1
5
1
2
3
4
5
Sample Output

5 4 3 2 1
 */
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

        printSinglyLinkedList(reverseRecursive(list.head), " ")
    }
}