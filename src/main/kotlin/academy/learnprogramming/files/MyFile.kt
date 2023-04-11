package academy.learnprogramming.files

import java.io.File

fun main() {

    val lines = File("testfile.txt").reader().use { it.readText() }
    println(lines)

    File(".").walkTopDown().forEach { println(it) }

    File(".").walkBottomUp().forEach { println(it) }
}