package interview_bit

fun solve(a: List<Int>, b: List<Int>, c: Int): Int {
    val countA = a.count { it > c }
    val countB = b.count { it < c }
    return maxOf(countA, countB)
}

fun main() {
    println("Enter elements for list A separated by spaces:")
    val listA = readln().split(" ").map { it.toInt() }

    println("Enter elements for list B separated by spaces:")
    val listB = readln().split(" ").map { it.toInt() }

    println("Enter the value for C:")
    val c = readln().toInt()

    val result = solve(listA, listB, c)

    println(result)
}