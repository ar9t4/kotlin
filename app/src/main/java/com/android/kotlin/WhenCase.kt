package com.android.kotlin

/**
 * else is equivalent to default case in java, no need to write case and break keyword in each expression unlike java
 * beauty of when case is, it can return match case / default case with a single return statement
 */
class WhenCase {
    fun getStringValue(value: Int): String {
        return when (value) {
            1 -> "One"
            2 -> "Two"
            3 -> "Three"
            4 -> "Four"
            5 -> "Five"
            else -> "Unknown"
        }
    }
}

//public String getStringValue(int number) {
//    String numberInString;
//    switch (number) {
//        case 1:
//        numberInString = "One";
//        case 2:
//        numberInString = "Two";
//        break;
//        case 3:
//        numberInString = "Three";
//        break;
//        case 4:
//        numberInString = "Four";
//        break;
//        case 5:
//        numberInString = "Five";
//        break;
//        default:
//        numberInString = "Unknown";
//    }
//    return numberInString;
//}