package com.android.kotlin.overridingconflicts

class OverridingConflicts : FirstInterface, SecondInterface {

    override fun print() {
        // calling print function of FirstInterface
        super<FirstInterface>.print()
        // calling print function of SecondInterface
        super<SecondInterface>.print()
    }
}