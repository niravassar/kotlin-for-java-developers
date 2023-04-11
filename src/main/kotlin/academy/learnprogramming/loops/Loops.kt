package academy.learnprogramming.loops

fun main(args: Array<String>) {

//    val range = 1..5
//    for (i in range) {
//        println(i)
//    }
//
//    var charRange = 'a'..'z'
//    var stringRange = "ABD".."XYZ"
//
//    val backwardRange = 5.downTo(1)
//
//    val stepRange = 3..15
//    val stepThree = stepRange.step(3)
//    val reversedRange = range.reversed()
//
//    var seasons = arrayOf("spring", "fall", "summer", "winter")
//    for (season in seasons) {
//        println(season)
//    }
//
//    for(x in seasons.indices) {
//        println("$x - ${seasons[x]}")
//    }
//
//    seasons.forEach { println(it) }

    for (i in 1..3) {
        println("i = $i")
        jloop@ for (j in 1..4) {
            println("j = $j")
            for (k in 5..10) {
                println("k = $k")
                if (k == 7) break@jloop;
            }
        }
    }
}