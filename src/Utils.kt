import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

/**
 * Reads lines from the given input txt file.
 */
fun readInput() = File("src", "Input.txt").readLines()

/**
 * Converts string to md5 hash.
 */
fun String.md5(): String = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray())).toString(16)


inline fun <reified T> advent(block: (input: List<T>) -> Any) {
    val input = when (T::class) {
        Int::class -> readInput().map { it.toInt() } as List<T>
        String::class -> readInput() as List<T>
        else -> emptyList()
    }
    block.invoke(input)
}

fun Any.print() = println(this)
