import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val count = scanner.nextLine().trim().toInt()

    val input = scanner.nextLine().trim().split(" ").map { it.toInt() }.toIntArray()

    println(input.sum())
}