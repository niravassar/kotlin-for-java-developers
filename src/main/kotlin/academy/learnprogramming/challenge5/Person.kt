package academy.learnprogramming.challenge5

fun main(args: Array<String>) {
    val joe = Person("Joe", 45)
    val jane = Person("Jane", 12)
    val mary = Person("Mary", 70)
    val john = Person("John", 66)

    val listPersons = listOf(joe, jane, mary, john)

    val mapPersons = mutableMapOf<String, Person>()

    for (p in listPersons) {
        mapPersons[p.firstName] = p
    }

    println(mapPersons)

    /****************************/

    val startsWithJ = listPersons.filter { it.firstName[0]=='J'}.count()
    println ("# persons start with J: $startsWithJ")
    /****************************/

    val personPairs = listPersons.map { Pair(it.firstName, it.age) }
    println("personPairs: $personPairs")

    /****************************/

    val (fName, age) = joe
    println("fName = $fName, age=$age")
}

class Person (val firstName : String, val age : Int) {
    operator fun component1() = firstName
    operator fun component2() = age
    override fun toString() = "$firstName - $age"

}