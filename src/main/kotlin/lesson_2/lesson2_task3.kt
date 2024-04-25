package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val timeOfDeparture = String.format("%02d:%02d", hourOfDeparture, minuteOfDeparture)

    val travelTimeInMinutes = 457
    val travelHours = travelTimeInMinutes / MINUTES_IN_HOUR
    val travelMinutes = travelTimeInMinutes % MINUTES_IN_HOUR

    val hourOfArrival = travelHours + hourOfDeparture + (travelMinutes + minuteOfDeparture) / MINUTES_IN_HOUR
    val minuteOfArrival = (travelMinutes + minuteOfDeparture) % MINUTES_IN_HOUR

    val timeOfArrival = String.format("%02d:%02d", hourOfArrival, minuteOfArrival)
    println("Время отправления: $timeOfDeparture\nВремя прибытия: $timeOfArrival\n\nВ пути: $travelHours ч, $travelMinutes мин")
}