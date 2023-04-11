# Kotlin Learning

This project is composed of exercises I did while learning kotlin. This readme file will contain the udemy class I used as an introduction
to learn kotlin, along with some useful link. In addition, I will line out the 10 top features of kotlin that i found to be the most 
productive.

## Udemy Class

- Kotlin for Java Developers
    - https://objectcomputing.udemy.com/course/kotlin-for-java-developers/
    - this class teaches the syntax and some of the philosophies that make up kotlin. It is geared for java developers. It has many exercise and I recommend that you code along with the class during the lectures.

## Useful Kotlin Videos and Links

- Story of Kotlin
  - https://www.youtube.com/watch?v=uE-1oF9PyiY
  - well produced video of the history of kotlin and why it was created. By jetbrains

- 10 REASONS WHY YOU SHOULD LEARN KOTLIN
  - https://www.youtube.com/watch?v=F8_cGGOptD4
  - gives various examples of java vs kotlin and shows why kotlin is better at solving some issues based on its features. 

- Kotlin in 100 Seconds
  - https://www.youtube.com/watch?v=xT8oP0wy-A0
  - overview

## 5 best features of Kotlin

These are what I think are the 10 best features in kotlin. Recall I am a groovy programmer as well, so I did not include some of the
groovy-like features, because I am already familiar with them. The features I have chosen are added benefits that I have no encountered
in Java nor Groovy. When possible I will provide a link for further information. The features are in no preferential order. These are some highlights
there are plenty of other cool nuggets as you learn and discover Kotlin. 

1. Null Safety 

Kotlin is big on null safety. Kotlins type system is aimed at eliminating the jeopardy of a null pointer exception. It is extremely difficult 
to get a NPE because the static compiler flags possible null variables. By default, Kotlin assumes a value cannot be null, and most types
are not nullable. You have to explicitly make variables nullable or choose a type that can be nullable.

https://www.baeldung.com/kotlin/null-safety

2. Data Classes

Data classes in Kotlin eliminate boilerplate code such as getters and setters, toString, equals, and hashCode. It reduces noise
and repetition. It is similar to Java `record` keyword.

https://www.programiz.com/kotlin-programming/data-class

3. Extensions

Kotlin provides the ability to extend a class without having to inherit the class. This is called extensions and is very easy to implement.
In fact, much of the handy functions used un kotlin core classes are implemented with extensions.  You can now implement additional
functionality on top of third party libraries, and they will act like they are part of the class. 

https://kotlinlang.org/docs/extensions.html

4. When Expression

The when expression is new to kotlin and is basically the switch statement on steriods. It provides concise syntax and allows
flexibility with evaluated expression in the clauses. It can replace some elongated nested ifs that are confusing.

https://www.geeksforgeeks.org/kotlin-when-expression/

5. Destructuring declarations

Kotlin has a destructuring concept which allows you to extra properties of a class into multiple variables with one line of code. 

```java
val person = Person(1, "Jon Snow", 20)
val(id, name, age) = person
```

Here the variables `id`, `name`, and `age` now have the values of what was in Person. A Data class comes with this functionality. For other
classes you need to implement `component1()`, `component2()` etc. This reduces alot of code and is concise.

https://www.baeldung.com/kotlin/destructuring-declarations
