package org.example.lesson_2

fun main(){
    val crystalAmount = 7
    val ironAmount = 11
    val buff = 0.2f

    val crystalAmountBuffed = crystalAmount * buff
    val ironAmountBuffed = ironAmount * buff

    println("Кристаллы: +${crystalAmountBuffed.toInt()}")
    println("Железо: +${ironAmountBuffed.toInt()}")
}