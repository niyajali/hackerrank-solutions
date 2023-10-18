package interview_bit

fun solve(a: Int, b: Int, c: Int): Int {
    for (i in a..b) {
        if (c == i % 10) {
            return (b - i) / 10 + 1
        }
    }

    return 0
}

fun main() {
    val a = readln().trimEnd().toInt()
    val b = readln().trimEnd().toInt()
    val c = readln().trimEnd().toInt()

    val result = solve(a, b, c)

    println(result)
}