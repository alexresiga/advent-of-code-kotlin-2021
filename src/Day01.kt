fun main() = advent<Int> { input ->
    input.windowed(2).count { (a, b) -> a < b }.print()
    input.windowed(3) { it.sum() }.windowed(2).count { (a, b) -> a < b }.print()
}
