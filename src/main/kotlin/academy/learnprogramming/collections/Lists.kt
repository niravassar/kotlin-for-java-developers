package academy.learnprogramming.collections

fun main(args: Array<String>) {
    val strings = listOf("spring", "summer", "fall", "winter")
    val colorList = listOf("black", "white", "red")

    println(strings.last())
    println(strings.asReversed())

    println(strings.getOrNull(5))

    val ints = listOf(1,2,3,4,5)
    println(ints.max())

    val immutableMap = mapOf(1 to Car("green", "toyota", 2015),
                            2 to Car("red", "Ford", 2016),
                            3 to Car("silver", "Honda", 2013))

    val mutableMap = mutableMapOf<String, Car>("Johns car" to Car("red", "RangeRover", 2010),
        "Janes car" to Car("blue", "Hyundai", 2012))

    for ((key, value) in mutableMap) {
        println("$key, $value")
    }

    val pair = Pair("dude", "wth")
    val (firstWord, secondWord) = pair
    println("$firstWord $secondWord")

    var car = Car("blue", "mazda", 2022)
    val (color, model, year) = car
    println ("$color -- $model -- $year")

    val setInts = setOf(10, 15, 19, 5)
    println(setInts.plus(20))
    println(setInts.minus(19))
    println(setInts.average())
    println(setInts)
}

class Car(val color: String, val model:String, val year:Int) {
    override fun toString() = "$color, $model, $year"

    operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year
}