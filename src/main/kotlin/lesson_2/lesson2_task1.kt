package org.example.lesson_2

fun main() {
    val englishScores = arrayOf(3, 4, 3, 5)
    val numberOfPupils = englishScores.size
    val averageScore = englishScores.sum() / numberOfPupils.toFloat()

    val formattedScore = String.format("%.2f", averageScore)
    println(formattedScore)
}