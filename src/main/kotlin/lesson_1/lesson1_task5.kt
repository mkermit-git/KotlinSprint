package org.example.lesson_1

/* Константы времени */
const val SECONDS_IN_MINUTE = 60
const val MINUTES_IN_HOUR = 60
const val SECONDS_IN_HOUR = SECONDS_IN_MINUTE * MINUTES_IN_HOUR

fun main() {

    val secondsInSpaceTotal: Short = 6480

    val hoursInSpace = secondsInSpaceTotal / SECONDS_IN_HOUR
    val minutesInSpace = (secondsInSpaceTotal % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val secondsInSpace = secondsInSpaceTotal % SECONDS_IN_MINUTE

    val formattedTime = String.format("%02d:%02d:%02d", hoursInSpace, minutesInSpace, secondsInSpace)
    print(formattedTime)
}