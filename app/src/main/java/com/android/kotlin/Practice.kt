package com.android.kotlin

import com.android.kotlin.inheritance.Derived
import com.android.kotlin.interfacesinheritance.Employee
import com.android.kotlin.interoperability.Person
import com.android.kotlin.overridingconflicts.OverridingConflicts

fun main(args: Array<String>) {

    println("main() function arguments are: $args")

    println("\nClass Basics: Open the below class and read out the comments")
    ClassBasics(1)
    ClassBasics(1, 2)

    val classBasics = ClassBasics(100)
    classBasics.name = " "
    println("Assigned empty value to name property, let's check that the setter method works or not: ${classBasics.name}")
    classBasics.name = "Name is ${ClassBasics::class.java.simpleName}"
    println("Assigned non blank value to name property, let's check that the setter method works or not: ${classBasics.name}")

    println("\nWhen Case: It is alternative to Switch case in java")
    println(WhenCase().getStringValue(5))

    println("\nDelegation to Primary Constructor")
    Delegation(1, 2)
    Delegation(1, 2, 3)

    println("\nData Class")
    val dataClass = DataClass("Abdul", "Rahman")
    dataClass.address = "Lahore, Pakistan"
    println(dataClass.toString())

    println("\nEnum Class")
    println("Enum constant is: ${EnumClass.GOLD} and it's value (color) is ${EnumClass.GOLD.color}")

    println("\nNested Class")
    NestedClass.PlainInnerClass().printNumber()
    NestedClass().ProperInnerClass().printNumber()

    println("\nObject")
    println("Current date is : " + Object.getCurrentDate())

    println("\nCompanion Object")
    println("Current date is : " + CompanionObject.getCurrentDate())

    println("\nInheritance")
    val derivedClass = Derived("Abdul", "Rahman")
    derivedClass.print("Hello World!")
    derivedClass.printClassName()

    println("\nInterfaces Inheritance: Open the below class and check out the interfaces inheritance")
    val employee = Employee("Abdul", "Rahman", "Mr. Abdul Rahman")
    println("Name is ${employee.name}")
    println("First name is ${employee.firstName}")
    println("Last name is ${employee.lastName}")
    println("Full name is ${employee.fullName}")
    println(employee.toString())

    println("\nResolving overriding conflicts in interfaces: Open the below class and read the comments")
    OverridingConflicts().print()


    println("\nFunctions\n")
    val function = Functions()
    topLevelFunction()
    function.singleExpressionFunction(5)
    function.unitReturningFunction()
    function.memberFunction()
    function.defaultArgumentFunction(5)
    function.namedArgumentFunction(number = 5, multiplier = 10)
    function.localFunction(5)
    println("Sum of variable number of arguments are: ${function.variableArguments(1, 2, 3, 4, 5)}")
    println("This is called the Lambda Expression { a: Int, b: Int -> a + b }")
    println(
        "Higher-Order Function receiving function as a parameter: " +
                "${function.higherOrderFunctionReceivingFunctionAsParameter(
                    "Abdul Rahman",
                    function::printData
                )}"
    )
    val returnedFunction = function.higherOrderFunctionReturningFunction()
    println("Higher-Order Function returning function: ${returnedFunction(5)}")
    println(
        "Extension Function: It is a member function of a class that is defined outside the class and is used to extend the functionality of that class," +
                "for example there is no method in String class that can remove the first character of text and return the modified text, see below example"
    )
    var text = "AAbdul Rahman"
    println("Before calling removeFirstCharacter() function object value is: $text")
    text = text.removeFirstCharacter()
    println("After calling removeFirstCharacter() function object value is: $text")


    println("\nCollections\n")
    val readOnlyList = listOf(1, 2, 3, 4, 5)
    println("ReadOnlyList is: $readOnlyList")

    val mutableList = mutableListOf(1, 2, 3, 4)
    mutableList.add(5)
    println("MutableList is: $mutableList")

    val readOnlySet = setOf(1, 2, 3, 4, 5)
    println("ReadOnlySet is: $readOnlySet")

    val mutableSet = mutableSetOf(1, 2, 3, 4)
    mutableSet.add(5)
    println("MutableSet is: $mutableList)")

    val readOnlyMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5)
    println("ReadOnlyMap is: $readOnlyMap")

    val mutableMap = mutableMapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    mutableMap["five"] = 5
    println("MutableMap is: $mutableMap")

    println("Constructing new Collections")
    val emptyCollection = mutableListOf<String>()
    println("This is an empty collection: $emptyCollection")

    val initializerFunctionForLists = List(5) { it * 2 }
    println("This is the initializer function for the List: $initializerFunctionForLists")

    val originalList = mutableListOf(1, 2, 3, 4, 5)
    val copiedList = originalList.toMutableList()
    println("Constructing new list by copying other list: $copiedList is the copied list of $originalList")

    val alphabeticalNumbers = listOf("One", "Two", "Three", "Four", "Five")
    println("Constructing new list by calling function to other list: ${alphabeticalNumbers.filter { it.length > 3 }}")


    println("\nIterators\n")
    print("This is a one direction Forward iterator: ")
    val iterator = readOnlyList.iterator()
    while (iterator.hasNext()) {
        print("${iterator.next()} ")
    }

    print("\nTraditional for loop iterator: ")
    for (number in readOnlyList) {
        print("$number ")
    }

    print("\nforeach loop iterator: ")
    readOnlyList.forEach {
        print("$it ")
    }

    print("\nListIterator: It can iterate in both Forward and Backward directions")
    val listIterator = readOnlyList.listIterator()
    println("\nIterating Forward")
    while (listIterator.hasNext()) {
        print("${listIterator.next()} ")
    }
    println("\nIterating Backwards")
    while (listIterator.hasPrevious()) {
        print("${listIterator.previous()} ")
    }


    println("\n\nRanges and Progressions\n")
    print("Forward Order: ")
    for (i in 1..5) {
        print("$i ")
    }
    print("\nReverse Order: ")
    for (i in 5 downTo 1) {
        print("$i ")
    }
    print("\nForward Order with gap of 2 step: ")
    for (i in 1..5 step 2) {
        print("$i ")
    }
    print("\nReverse Order with gap of 2 step: ")
    for (i in 5 downTo 1 step 2) {
        print("$i ")
    }

    
    println("\n\nInteroperability\n")
    println("We are calling Java code from Kotlin code")
    val person = Person("Abdul", "Rahman", "Pakistan")
    person.concatenateFields()
}