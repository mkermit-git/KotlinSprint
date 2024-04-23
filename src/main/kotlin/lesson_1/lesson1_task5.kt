package org.example.lesson_1

fun main(){
    val secondsInSpaceTotal: Short = 6480

    val hoursInSpace = secondsInSpaceTotal/ 3600
    val minutesInSpace = (secondsInSpaceTotal % 3600)/ 60
    val secondsInSpace = secondsInSpaceTotal % 60

    val formattedTime = String.format("%02d:%02d:%02d", hoursInSpace, minutesInSpace, secondsInSpace)
    print(formattedTime)
}