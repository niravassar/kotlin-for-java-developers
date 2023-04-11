package academy.learnprogramming.functions

import jdk.jshell.execution.Util

fun main(args: Array<String>) {
//    println(labelMultiple(3, 4, "The result is: "))
//
//    val car1 = Car("blue", "Toyota", 2015)
//    val car2 = Car("red", "Ford", 2016)
//
//    printColors(car1, car2)

    println(Utils().upperFirstAndLast("this is all lowercase"))
    println("all lower case".upperFirstAndLast())
}

fun labelMultiple(operand1 : Int, operand2: Int, label : String): String {
    return ("$label ${operand1 * operand1}")
}

class Employee(val firstName : String) {

    fun upperCaseFirstName() = firstName.uppercase()
}

data class Car(val color: String, val model : String, val year : Int) {

}

fun printColors(vararg cars: Car) {
    for (car in cars) {
        println(car.color)
    }
    return
}

fun String.upperFirstAndLast() : String {
    val upperFirst = this.substring(0, 1).uppercase() + this.substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) +
            upperFirst.substring(upperFirst.length - 1, upperFirst.length).uppercase()
}