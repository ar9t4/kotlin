package com.android.kotlin.inheritance

class Derived(private val firstName: String, private val lastName: String) :
    Base("$firstName $lastName") {

    override fun print(text: String) {
        println("Text to print is $text")
    }

    override fun printClassName() {
        super.printClassName()
        println("Class name is ${Derived::class.java.simpleName} and properties are $firstName and $lastName")
    }
}