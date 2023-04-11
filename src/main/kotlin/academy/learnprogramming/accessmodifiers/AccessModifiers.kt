package academy.learnprogramming.accessmodifiers

val MY_CONSTANT = 100

fun main(args: Array<String>) {

//    val emp = Employee("John")
//    println(emp.firstName)

    val car = Car("blue", "toyota", 2015)

    println(car)

    //println(MY_CONSTANT)

}

//// this long way of writing things
//class Employee constructor(firstName : String){
//    val firstName: String
//
//    init {
//        this.firstName = firstName
//    }
//}

// short way
//class Employee constructor(firstName : String){
//    val firstName: String = firstName
//}

// shorter way
class Employee(val firstName : String, var fullTime : Boolean = true    ){

}

class Demo {
    val dummy : String
    constructor() {
        dummy = "Hello"
    }
}

data class Car(val color: String, val model : String, val year : Int) {

}

