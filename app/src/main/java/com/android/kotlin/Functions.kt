package com.android.kotlin

fun topLevelFunction() {
    println("This is a top level function and it does not require its declaration in a class body like in Java, C# and etc.")
}

// 'String' with . before function name is called the 'receiver type' or you can say the class in which you want to add this function and
// 'this' is called the 'receiver object' or you can say the object passed to extension function (or object with which you can call this function),
// here it is 'text' variable in the below example
fun String.removeFirstCharacter(): String {
    return this.substring(1, this.length)
}

class Functions {

    fun singleExpressionFunction(number: Int): Int = number * 2

    fun unitReturningFunction() {
        println("This is a unit returning function")
    }

    fun memberFunction() {
        println("This is a member function")
    }

    fun defaultArgumentFunction(number: Int, multiplier: Int = 10) {
        println("This is a default argument function receiving number $number as parameter and multiplier $multiplier as default argument")
    }

    fun namedArgumentFunction(number: Int, multiplier: Int) {
        println("This is a named argument function receiving number $number and multiplier $multiplier as parameters")
    }

    fun localFunction(number: Int) {
        fun doubleNumber(number: Int): Int = number * 2
        println(
            "This function receives $number as argument and uses local function to double this number i.e ${doubleNumber(
                number
            )}"
        )
    }

    fun variableArguments(vararg numbers: Int): Int {
        return numbers.sum()
    }

    fun higherOrderFunctionReceivingFunctionAsParameter(data: String, functionAsParameter: (String, String) -> Unit) {
        functionAsParameter(data.split(" ")[0], data.split(" ")[1])
    }

    fun printData(firstName: String, lastName: String) {
        println("$firstName $lastName")
    }

    fun higherOrderFunctionReturningFunction(): (Int) -> Int = { num: Int -> num + num }
}