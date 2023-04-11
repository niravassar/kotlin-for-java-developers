package academy.learnprogramming.challenge4

fun main(args: Array<String>) {

    // use a range to print out range by 5 from 5 to 500
    val range = 5..50
    val stepRange = range.step(5)
    for(number in stepRange) {
        println("stepRange step 5 - ${number}")
    }

    // print -500 to 0
    val negRange = -50..0
    for (i in negRange) {
        println("neg range - $i")
    }

    // use when clause to assign numbers
    val myNumber : Int = 25
    var dnum : Double = 1.0
    when {
        myNumber > 100 -> dnum = -234.44
        myNumber < 100 -> dnum = 444.55
        myNumber == 100 -> dnum = 0.0
    }

    println("dnum is $dnum")

}