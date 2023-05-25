package project_euler

private fun largestPalindrome(n: Int): Int {
    var largestPalindrome = 0

    for (i in 999 downTo 100) {
        for (j in i downTo 100) {
            val num = i * j

            if (num <= largestPalindrome) {
                break
            } else {
                if (num < n && num.toString() == num.toString().reversed()) {
                    largestPalindrome = num
                    break
                }
            }
        }
    }

    return largestPalindrome
}

/*
Sample Input 0

2
101110
800000
Sample Output 0

101101
793397
 */
fun main() {
    val t = readln().trim().toInt()

    for (tItr in 1..t) {
        val n = readln().trim().toInt()
        println(largestPalindrome(n))
    }
}