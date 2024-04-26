package org.example.lesson_5

import java.util.*

fun main() {
    val userInput = Scanner(System.`in`)

    val secretNumber1 = 7
    val secretNumber2 = 21

    println("Добро пожаловать в лотерею! Для выигрыша нужно угадать числа от 0 до 42.\n")
    print("Введите первое число: ")
    val guessNumber1 = userInput.nextInt()

    print("Введите второе число: ")
    val guessNumber2 = userInput.nextInt()

    // Используем множества, чтобы не проверять порядок ввода вручную
    val guessSet = setOf(guessNumber1, guessNumber2)
    val secretSet = setOf(secretNumber1, secretNumber2)

    val resultMessage = when {
        guessSet == secretSet -> "Поздравляем! Вы выиграли главный приз!" // Если угаданы оба вне зависимости от порядка
        guessSet.intersect(secretSet).size == 1 -> "Вы выиграли утешительный приз!" // Если угадано одно
        else -> "Неудача!"
    }

    println(resultMessage)
    println("\nДля выигрыша нужно было угадать числа: $secretNumber1 и $secretNumber2")
}