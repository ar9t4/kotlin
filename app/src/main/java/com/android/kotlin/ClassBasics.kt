package com.android.kotlin

// every class in Kotlin is by default Final and is inherited from the Any class and thus contains the equals(), hashCode(), copy() and toString() functions
// primary constructor, if primary constructor params have val/var modifier then that params will be the properties of the class also
class ClassBasics(firstValue: Int) {

    private var firstNumber: Int

    // initializer block
    init {
        println("${ClassBasics::class.java.simpleName} Initializer Block called")
        firstNumber = firstValue
        println("Value is: $firstNumber")
    }

    var name: String = ClassBasics::class.java.simpleName
        set(value) {
            if (!value.isBlank()) {
                field = value
            }
        }

    // secondary constructor with delegation to the primary constructor of the same class
    constructor(firstNumber: Int, secondNumber: Int) : this(firstNumber) {
        println("Secondary constructor called")
        println("First value is: $firstNumber and second value is $secondNumber")
    }
}