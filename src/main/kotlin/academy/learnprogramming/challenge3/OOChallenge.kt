package academy.learnprogramming.challenge3

open class KotlinBicycle(open var cadence: Int, open var gear: Int, open var speed: Int) {

    fun applyBreak(decrement: Int) {
        this.speed -= decrement
    }

    fun speedUp(increment: Int) {
        this.speed += increment
    }

}

data class KotlinMountainBike(var seatHeight: Int, override var cadence: Int, override var gear: Int, override var speed: Int) :
    KotlinBicycle(cadence, gear, speed) {

}