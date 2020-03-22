import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val count = scanner.nextLine().trim().toInt();

    val result = scanner.nextLine().trim().split(" ").map { it.toLong() }.sum()

    println(result)
}