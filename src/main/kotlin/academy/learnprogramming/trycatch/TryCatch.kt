package academy.learnprogramming.trycatch

fun main(args: Array<String>) {

    println(getNumber("22.5"))
}

fun getNumber(str: String): Int {
    return try {
            Integer.parseInt(str)
        }
        catch (e: NumberFormatException) {
            0
        }
        finally {
            println("I'm in the finally block")
        }
}