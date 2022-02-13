package com.example.kotlin_for_jota

enum class Direction(var movement : Pair <Int, Int> = Pair(0,0)) {

    NORTH(Pair(1,0)),
    SOUTH(Pair(-1,0)),
    EAST(Pair(0,1)),
    WEST(Pair(0,-1));

    // enum class could have member functions
    fun descriptionInSpanish(): String {
        val sameString: String = "La direccion en ESPAÑOL es "
        return when (this) {
            NORTH -> sameString +  "NORTE"
            SOUTH -> sameString +  "SUR"
            EAST -> sameString +  "ESTE"
            WEST -> sameString +  "OESTE"
        }
    }
}
