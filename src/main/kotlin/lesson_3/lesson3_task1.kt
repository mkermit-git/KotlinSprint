package org.example.lesson_3

import java.time.LocalTime

fun main() {
    val userName = "товарищ"
    val currentTime = LocalTime.now()
    val greetingPhrase = when (currentTime.hour) {
        in 6..11 -> "Доброе утро"
        in 12..17 -> "Добрый день"
        in 18..21 -> "Добрый вечер"
        else -> "Доброй ночи"
    }
    println("$greetingPhrase, $userName!")
}