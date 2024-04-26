package org.example.lesson_5

import java.util.Scanner
import kotlin.random.Random

fun main() {
    val userInput = Scanner(System.`in`)

    val firstNumber = Random.nextInt(1, 10)
    val secondNumber = Random.nextInt(1, 10)

    print("Реши пример: $firstNumber + $secondNumber = ")

    val resultMessage = when {
        userInput.nextInt() == firstNumber + secondNumber -> "Добро пожаловать!"
        else -> "Доступ запрещен"
    }

    print(resultMessage)
}