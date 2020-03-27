package com.android.kotlin.interfacesinheritance

data class Employee(
    override val firstName: String,
    override val lastName: String,
    val fullName: String
) : Person