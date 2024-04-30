package org.example.lesson_5

import java.util.*
import kotlin.random.Random

fun main() {
    val userInput = Scanner(System.`in`)

    val secretSet = setOf(Random.nextInt(0, 42), Random.nextInt(0, 42), Random.nextInt(0, 42))

    println("Добро пожаловать в лотерею! Для выигрыша нужно угадать числа от 0 до 42.\n")
    print("Введите первое число: ")
    val guessNumber1 = userInput.nextInt()

    print("Введите второе число: ")
    val guessNumber2 = userInput.nextInt()

    print("Введите второе число: ")
    val guessNumber3 = userInput.nextInt()

    // Множество чисел пользователя
    val guessSet = setOf(guessNumber1, guessNumber2, guessNumber3)

    val intersects = guessSet.intersect(secretSet).size

    val resultMessage = when {
        guessSet == secretSet -> "Поздравляем! Вы угадали все числа и выиграли джекпот" // Если угаданы все три числа вне зависимости от порядка
        intersects == 2 -> "Вы угадали два числа и получаете крупный приз!" // Если угадано два
        intersects == 1 -> "Вы выиграли утешительный приз!" // Если угадано одно
        else -> "Увы, вы не угадали ни одного числа :("
    }

    println("\n$resultMessage")
    print("\nНужно было угадать числа: ${secretSet.joinToString(", ")}")
}

