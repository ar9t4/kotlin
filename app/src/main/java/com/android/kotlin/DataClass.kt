package com.android.kotlin

data class DataClass(val firstName: String, val lastName: String) {
    // this is a property of the class but it will not appear in the primary constructor +
    // this property will not include in the auto generated functions like equals(), hashCode(), copy() and toString()
    lateinit var address: String

}