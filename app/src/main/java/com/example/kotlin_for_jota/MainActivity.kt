package com.example.kotlin_for_jota

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1- Enum Classes
        // workWithEnumClasses()

        // 2- Nested and Inner Classes
        // nestedAndInnerClasses()
    }

    private fun workWithEnumClasses() {

        var userDirection: Direction? = null
        println("Direction: $userDirection")

        userDirection = Direction.EAST
        println("Direction: Name ${userDirection.name} and Ordinal ${userDirection.ordinal}")
        println(userDirection.descriptionInSpanish() + " | Movement" + userDirection.movement)
    }

    private fun nestedAndInnerClasses() {

        // Nested Class
        val myNestedClass = MyNestedAndInnerClass.MyNestedClass()
        val result = myNestedClass.add(1, 2)
        println("Result $result")

        // Inner class
        val myInnerClass = MyNestedAndInnerClass().MyInnerClass()
        val result2: Int = myInnerClass.addOne(1)
    }


    private fun classInheritance() {

    }
}