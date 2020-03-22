import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine().trim().split(" ").map { it.toInt() }.sorted()

    val min = input.take(4).fold(0L, { acc, v -> acc + v})
    val max = input.takeLast(4).fold(0L, { acc, v -> acc + v})

    println("$min $max")
}