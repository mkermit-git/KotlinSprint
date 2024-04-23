package org.example.lesson_2

fun main(){
    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val timeOfDeparture = String.format("%02d:%02d", hourOfDeparture, minuteOfDeparture)

    val travelTimeInMinutes = 457
    val travelHours = travelTimeInMinutes / 60
    val travelMinutes = travelTimeInMinutes % 60

    var hourOfArrival =  travelHours + hourOfDeparture
    var minuteOfArrival =  travelMinutes + minuteOfDeparture
    if (minuteOfArrival > 59){
        hourOfArrival++
        minuteOfArrival = minuteOfArrival % 60
    }

    val timeOfArrival = String.format("%02d:%02d", hourOfArrival, minuteOfArrival)
    println("Время отправления: $timeOfDeparture\nВремя прибытия: $timeOfArrival\n\nВ пути: $travelHours ч, $travelMinutes мин")
}