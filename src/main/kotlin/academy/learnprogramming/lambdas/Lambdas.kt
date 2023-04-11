package academy.learnprogramming.lambdas

fun main(args: Array<String>) {
    run { println("Im in a lambda") }

    val employees = listOf(Employee("john", "smith", 2012),
                        Employee("Jane", "Wilson", 2015),
                        Employee("Mary", "Johnson", 2010))

    // find longest serving employee
    println(employees.minBy{ it.startYear})
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int) {
}