import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val count = scanner.nextLine().trim().toInt()

    val input = scanner.nextLine().trim().split(" ").map { it.toInt() }.toIntArray()

    val positive = input.filter { it > 0 }.count().toFloat()
    val negative = input.filter { it < 0 }.count().toFloat()
    val zeroes = input.filter { it == 0 }.count().toFloat()

    println("%.6f".format(Locale.US, positive / count))
    println("%.6f".format(Locale.US, negative / count))
    println("%.6f".format(Locale.US, zeroes / count))
}