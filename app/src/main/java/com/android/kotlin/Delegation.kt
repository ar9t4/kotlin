package com.android.kotlin

class Delegation() {
    constructor(firstValue: Int, secondValue: Int) : this() {
        println(
            "Every secondary constructor must have to delegate to the primary constructor using this keyword," +
                    "params of this secondary constructor are: $firstValue, $secondValue"
        )
    }

    constructor(firstValue: Int, secondValue: Int, thirdValue: Int) : this() {
        println(
            "Every secondary constructor must have to delegate to the primary constructor using this keyword," +
                    "params of this secondary constructor are: $firstValue, $secondValue and $thirdValue"
        )
    }
}