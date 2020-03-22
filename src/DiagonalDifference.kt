import java.util.*
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)

    val dimension = scanner.nextLine().trim().toInt()

    val input =
        (0 until dimension).map {
            scanner.nextLine().trim().split(" ").map { it.toInt() }.toIntArray()
        }.toTypedArray()

    val leftToRight = (0 until dimension).map { i -> input[i][i] }.sum()
    val rightToLeft = (0 until dimension).map { i -> input[i][dimension - i - 1] }.sum()

    println(abs(leftToRight - rightToLeft))

}