package data_structure.linked_list

class SinglyLinkedList {
    var head: SinglyLinkedListNode?
    private var tail: SinglyLinkedListNode?

    init {
        head = null
        tail = null
    }

    fun insertNode(nodeData: Int) {
        val node = SinglyLinkedListNode(nodeData)

        if (head == null) {
            head = node
        } else {
            tail?.next = node
        }

        tail = node
    }
}

fun printSinglyLinkedList(head: SinglyLinkedListNode?, sep: String) {
    var node = head;

    while (node != null) {
        print(node?.data)
        node = node.next

        if (node != null) {
            print(sep)
        }
    }
}
