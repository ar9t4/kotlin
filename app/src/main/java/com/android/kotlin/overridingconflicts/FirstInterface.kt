package com.android.kotlin.overridingconflicts

interface FirstInterface {
    fun print() {
        println("Print called of ${FirstInterface::class.java.simpleName}")
    }
}