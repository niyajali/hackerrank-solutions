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
 */
/* Output data
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
        
        val result = compareList(firstList.head, secondList.head)

        print(result)
        println()
    }

    scan.close()
}

// Complete the compareLists function below.
/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
private fun compareList(firstList: SinglyLinkedListNode?, secondList: SinglyLinkedListNode?): Int {
    var temp1 = firstList
    var temp2 = secondList

    while (temp1 != null && temp2 != null && temp1.data == temp2.data) {
      temp1 = temp1.next
      temp2 = temp2.next
    }

    if (temp1 == null && temp2 == null) return 1

    return 0
}
