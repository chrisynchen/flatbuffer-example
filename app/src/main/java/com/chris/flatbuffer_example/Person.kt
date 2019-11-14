package com.chris.flatbuffer_example

data class Person(
    val name: String,
    val bloodVolume: Int,
    val speed: Float,
    val canFly: Boolean,
    val bag: Bag,
    val weapons: List<Weapon>,
    val accessories: List<String>
) {
    data class Bag(val name: String, val capacity: Int)
    data class Weapon(val name: String, val damage: Int)
}