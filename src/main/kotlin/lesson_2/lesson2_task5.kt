package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val depositInitialAmount = 50000
    val depositInterest = (17.0 / 12) / 100 // Помесячная процентная ставка
    val depositTerm = 2 // Срок вклада - 2 месяца
    val calculationPeriod = 1 // Начисление процентов каждый месяц

    // Расчет сложных процентов по формуле: A = P * (1 + i / n) ^ (n * t)
    val depositFinalAmount = depositInitialAmount *
            (1 + depositInterest / calculationPeriod).pow(calculationPeriod * depositTerm)

    println(String.format("%.3f", depositFinalAmount))
}