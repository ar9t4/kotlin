package com.android.kotlin

class NestedClass {

    val number: Int = 0

    class PlainInnerClass {
        fun printNumber() {
            println("This is a regular inner class and it cannot access the members of the outer class")
        }
    }

    inner class ProperInnerClass {
        fun printNumber() {
            println("This is a proper inner class and it can access the members of the outer class, outer class member variable value is: $number")
        }
    }
}