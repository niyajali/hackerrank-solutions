package data_structure.linked_list

import java.util.*


/* Input data
2
2
1
2
1
1
2
1
2
2
1
2
 *//* Output data
0
1
 */

fun main() {
    val scan = Scanner(System.`in`)
    val tests = scan.nextLine().trim().toInt()

    for (i in 0 until tests) {
        val firstList = SinglyLinkedList()
        val secondList = SinglyLinkedList()

        val firstCount = scan.nextLine().trim().toInt()

        for (j in 0 until firstCount) {
            val listItem = scan.nextLine().trim().toInt()
            firstList.insertNode(listItem)
        }

        val secondCount = scan.nextLine().trim().toInt()

        for (j in 0 until secondCount) {
            val listItem = scan.nextLine().trim().toInt()
            secondList.insertNode(listItem)
        }

        val result = mergeList(firstList.head, secondList.head)

        print(printSinglyLinkedList(result?.next, " "))
        println()
    }

    scan.close()
}

fun mergeList(headA: SinglyLinkedListNode?, headB: SinglyLinkedListNode?): SinglyLinkedListNode? {
    if (headA == null) return headB
    if (headB == null) return headA

    val dummyHead = SinglyLinkedListNode(0)
    var current: SinglyLinkedListNode? = dummyHead
    var tempA: SinglyLinkedListNode? = headA
    var tempB: SinglyLinkedListNode? = headB

    while (tempA != null && tempB != null) {
        if (tempA.data <= tempB.data) {
            current?.next = tempA
            tempA = tempA.next
        } else {
            current?.next = tempB
            tempB = tempB.next
        }
        current = current?.next
    }

    if (tempA != null) {
        current?.next = tempA
    } else {
        current?.next = tempB
    }

    return dummyHead.next
}
