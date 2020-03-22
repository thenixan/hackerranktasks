import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val count = scanner.nextLine().trim().toInt()

    (0 until count).forEach { level ->
        val spacing = " ".repeat(count - level - 1)
        val stair = "#".repeat(level + 1)
        println("$spacing$stair")
    }
}