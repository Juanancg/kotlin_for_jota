package com.example.kotlin_for_jota

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enum Classes
        workWithEnumClasses()
    }

    private fun workWithEnumClasses() {

        var userDirection: Direction? = null
        println("Direction: $userDirection")

        userDirection = Direction.EAST
        println("Direction: Name ${userDirection.name} and Ordinal ${userDirection.ordinal}")
        println(userDirection.descriptionInSpanish() + " | Movement" + userDirection.movement)
    }

}