package com.android.kotlin

import java.util.*

/**
 * only one companion object is allowed per class, companion object name is optional
 */
class CompanionObject {
    companion object StaticMembers {
        fun getCurrentDate(): Date {
            return Date()
        }
    }
}