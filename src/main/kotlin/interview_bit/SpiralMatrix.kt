package interview_bit

private fun generateSpiralMatrix(items: List<Int>, row: Int, column: Int): Array<Array<Int>> {
    val result = Array(row) { Array(column) { 0} }

    var num = 0
    var left = 0
    var top = 0
    var right = row - 1
    var bottom = column - 1

    while (left <= right && top <= bottom) {
        for (i in left..right) {
            result[top][i] = items[num++]
        }
        top++

        for (i in top..bottom) {
            result[i][right] = items[num++]
        }
        right--

        for (i in right downTo left) {
            result[bottom][i] = items[num++]
        }
        bottom--

        for (i in bottom downTo top) {
            result[i][left] = items[num++]
        }
        left++
    }

    return result
}

private fun printMatrix(items: Array<Array<Int>>) {
    for (row in items) {
        for (cell in row) {
            print("$cell \t")
        }

        println()
    }
}


fun main() {
    val items = readln().trimEnd().split(" ").map { it.toInt() }
    val row = readln().trimEnd().toInt()
    val col = readln().trimEnd().toInt()

    val result = generateSpiralMatrix(items, row, col)

    printMatrix(result)
}