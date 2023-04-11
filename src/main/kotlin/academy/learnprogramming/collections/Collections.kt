package academy.learnprogramming.collections

fun main(args: Array<String>) {

    val emptyList = emptyList<String>()
    println(emptyList.javaClass)

    var strings1 = listOf<String>()

    val notNullList = listOfNotNull("hello", null, "goodbye")
    println(notNullList)

    val arrayList = arrayListOf(1, 3, 4)
    println(arrayList.javaClass)
}