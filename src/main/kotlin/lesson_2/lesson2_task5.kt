package org.example.lesson_2
import kotlin.math.pow

fun main(){
    val depositInitialAmount = 70000
    val depositInterest = 16.7/100 //double для большей точности
    val depositTerm = 20
    val calculationPeriod = 1
    val depositFinalAmount = depositInitialAmount *
            (1 + depositInterest/calculationPeriod).pow(calculationPeriod * depositTerm)

    println(String.format("%.3f", depositFinalAmount))
}