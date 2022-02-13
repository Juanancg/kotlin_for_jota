package com.example.kotlin_for_jota


class MyNestedAndInnerClass {

    private val one = 1

    class MyNestedClass {

        fun add(first: Int, second: Int): Int {
            return (first + second)
            // Here you cannot access to upper members of the class
            // return (first + second + one) -> Compilation error -> You need inner word
        }
    }

    // An inner class can access to any attribute or method of the upper class
    inner class MyInnerClass {
        fun addOne(first: Int): Int {
            return (first + one)
        }
    }
}

