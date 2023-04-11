package academy.learnprogramming.collections

fun main(args: Array<String>) {

    val setInts = setOf(10, 15, 19, 3, -23, 22)

    println(setInts.filter { it % 2 != 0 })

    val immutableMap = mapOf(1 to Car("green", "toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013))

    val ints = arrayOf(1,2,4,5)
    val add10List = ints.map { it + 10 }
    println(add10List)

    /***********************************************************************/


}