package org.example.lesson_3

import java.time.LocalTime

fun main() {
    val userName = "товарищ"
    val currentTime = LocalTime.now()
    val greetingPhrase = when {
        currentTime.hour < 16 -> "Добрый день"
        else -> "Добрый вечер"
    }
    println("$greetingPhrase, $userName!")
}