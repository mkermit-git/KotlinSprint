package org.example.lesson_2

fun main() {
    val crystalAmount = 7
    val ironAmount = 11
    val buff = 20

    val crystalAmountBuffed = crystalAmount * buff / 100f
    val ironAmountBuffed = ironAmount * buff / 100f

    println("Кристаллы: +${crystalAmountBuffed.toInt()}")
    println("Железо: +${ironAmountBuffed.toInt()}")
}