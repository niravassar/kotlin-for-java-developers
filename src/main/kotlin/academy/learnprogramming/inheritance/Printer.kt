package academy.learnprogramming.inheritance

fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("brother1234", 15)
    laserPrinter.printModel()
}

abstract class Printer(val modelName : String) {

    open fun printModel() = println("The model name of this printer is $modelName")
}

open class LaserPrinter(modelName: String, ppm : Int) : Printer(modelName) {

    final override fun printModel() = println("The model of this laser printer is $modelName")
}

class SpecialLaserPrinter(modelName: String) : LaserPrinter(modelName, 10) {

}

interface MyInterface {
    fun myFunction(str: String): String
}

interface MySubInterface: MyInterface {
    fun mySubFunction(num: Int): Int
}

class Something: MySubInterface {
    override fun mySubFunction(num: Int): Int {
        TODO("Not yet implemented")
    }

    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }

}

