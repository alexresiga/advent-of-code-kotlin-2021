fun main() = advent<String> { input ->
    input.fold(Triple(0, 0, 0)) { acc, cur ->
        val (command, amount) = cur.split(' ')
        when (command) {
            "forward" -> Triple(acc.first + amount.toInt(), acc.second + acc.third * amount.toInt(), acc.third)
            "up" -> Triple(acc.first, acc.second, acc.third - amount.toInt())
            "down" -> Triple(acc.first, acc.second, acc.third + amount.toInt())
            else -> Triple(0, 0, 0)
        }
    }.also { println(it.first * it.third) }.let { it.first * it.second }.print()
}
