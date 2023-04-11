package academy.learnprogramming.generics

fun main(args: Array<String>) {

    val list: MutableList<String> = mutableListOf("Hello")
    list.add("another string")
    list[0].uppercase()
    printCollection(list)
}

fun printCollection(collection: List<String>) {
    for(item in collection) {
        println(item)
    }
}