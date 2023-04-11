package academy.learnprogramming.whenexpression

fun main(args: Array<String>) {

    val num = 100

    when (num) {
        100, 600 -> println("600 or 100")
        in 200..250 -> println("200 range")
        300 -> println("300")

        else -> println("no match")
    }

    val y = 10

    when (num) {
        y + 90 -> println("y + 90")
        300 -> println("300")

        else -> println("no match")
    }
}