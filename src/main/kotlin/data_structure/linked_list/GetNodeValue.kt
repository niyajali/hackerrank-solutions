package data_structure.linked_list

import java.util.*

/*
 * Complete the 'getNode' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_SINGLY_LINKED_LIST list
 *  2. INTEGER positionFromTail
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

fun getNode(node: SinglyLinkedListNode?, positionFromTail: Int): Int {
    // Write your code here
    val newList = mutableListOf<Int>()
    var currentNode = node

    while (currentNode != null) {
        newList.add(currentNode.data)
        currentNode = currentNode.next
    }

    return newList[newList.size - positionFromTail - 1]
}

/*
Sample Input

2
1
1
0
3
3
2
1
2
Sample Output

1
3
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

        val position = scan.nextLine().trim().toInt()

        val result = getNode(list.head, position)

        println(result)
    }
}