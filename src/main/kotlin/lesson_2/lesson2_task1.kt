package org.example.lesson_2

fun main(){
    val englishScorePupil1: Byte = 3
    val englishScorePupil2: Byte = 4
    val englishScorePupil3: Byte = 3
    val englishScorePupil4: Byte = 5

    val englishScoreAverage: Float =
        (englishScorePupil1 + englishScorePupil2 + englishScorePupil3 + englishScorePupil4)/4f

    val formattedScore = String.format("%.2f", englishScoreAverage)
    println(formattedScore)
}