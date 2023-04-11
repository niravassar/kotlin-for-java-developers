package academy.learnprogramming.challenge1

fun main(args: Array<String>) {

    // Declare two immutable Strings hello
    val hello1 = "Hello"
    val hello2 = "Hello"

    // Using one line of code, test whethere hello1 and hello2 are referentiallu equal and print result
    println("hello1 and hello2 is referentially equal: ${hello1 === hello2}") // it is equal because jvm optimizes string literals

    // Determine whether structurally
    println("hello1 and hello2 is structurally equal: ${hello1 == hello2}")

    // Declare mutable variable int and assign 2988
    var number = 2988

    // Declare immutable variable of type Any and assign String "The any type is the root of the kotlin classes", the using smarttype print
    // out uppercase
    var text : Any = "The any type is the root of the kotlin classes"
    if (text is String) {
        println(text.toUpperCase())
    }

    // using one line print out following and make sure code is nicely indented
    //     1
    //    11
    //   111
    //  1111
    println("""    1
              |   11
              |  111
              | 1111  
    """.trimMargin())
}