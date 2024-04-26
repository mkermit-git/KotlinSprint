package org.example.lesson_5

import java.time.LocalDate
import java.util.*

const val AGE_OF_MAJORITY = 18

fun main() {
    val userInput = Scanner(System.`in`)
    print("Введите год рождения: ")

    if (LocalDate.now().year - userInput.nextInt() >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")
}