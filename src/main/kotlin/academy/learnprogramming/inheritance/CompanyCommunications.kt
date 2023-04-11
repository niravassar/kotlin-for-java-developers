package academy.learnprogramming.inheritance

import java.time.Year

fun main() {
    println(CompanyCommunications.getCopyrightLine())
    println(CompanyCommunications.getTagLine())

    println(SomeClass.MyCompanion.accessVar())

    wantsSomeInterface(object: SometInterface {
        override fun mustImplement(num: Int) = "this is from mustimplement ${num * 100}"
    })

    println(Department.ACCOUNTING.getDeptInfo())
}

object CompanyCommunications {
    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks"
    fun getCopyrightLine() = "Copyright $currentYear. All rights reserved"
}

class SomeClass {

    companion object MyCompanion {
        private var privateVar = 7;
        fun accessVar() = "im accessing privateVar: $privateVar"
    }
}

interface SometInterface {
    fun mustImplement(num: Int): String
}

fun wantsSomeInterface(si : SometInterface) {
    println("Printing from wantssomeinteface ${si.mustImplement(22)}")
}

enum class Department(val fullName :String, val numEmployees: Int) {
    HR("Human Resources", 22), IT("IT", 4), ACCOUNTING("Accounting", 3);

    fun getDeptInfo() = "the $fullName department has $numEmployees employees"
}