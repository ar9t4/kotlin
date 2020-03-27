package com.android.kotlin.inheritance

abstract class Base(val name: String) {

    // abstract functions must be override in the derived class
    abstract fun print(text: String)

    // open functions: it is optional to override open functions in the derived class
    open fun printClassName() {
        println("Class name is ${Base::class.java.simpleName} and properties are $name")
    }
}