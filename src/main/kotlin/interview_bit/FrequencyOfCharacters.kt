package interview_bit

fun solve(a: String): IntArray {
    val result = IntArray(26) // Initialize result array with 26 zeros

    for (c in a) {
        if (c.isLetter()) { // Check if the character is an alphabet letter
            val index = c - 'a'
            if (index in 0..25) {
                result[index]++ // Increment the corresponding element in the result array
            }
        }
    }

    return result
}

fun main() {
    val inputString = readln().trimEnd()
    val result = solve(inputString)

    println("Frequency of lowercase alphabets:")
    for (i in 0 until 26) {
        val letter = ('a' + i).toString()
        println("$letter: ${result[i]}")
    }
}
