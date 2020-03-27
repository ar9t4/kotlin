package com.android.kotlin.overridingconflicts

interface SecondInterface {
    fun print() {
        println("Print called of ${SecondInterface::class.java.simpleName}")
    }
}