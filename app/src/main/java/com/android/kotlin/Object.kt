package com.android.kotlin

import java.util.*

/**
 * object type file contains static members i.e either properties or functions or both, object type file is also referred to as Singleton in Kotlin
 */
object Object {
    fun getCurrentDate(): Date {
        return Date()
    }
}