package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val timeOfDeparture = String.format("%02d:%02d", hourOfDeparture, minuteOfDeparture)

    val travelTimeInMinutes = 457
    val travelHours = travelTimeInMinutes / MINUTES_IN_HOUR
    val travelMinutes = travelTimeInMinutes % MINUTES_IN_HOUR

    var hourOfArrival = travelHours + hourOfDeparture // Использовала var, так как меняется в зависимости от if далее
    var minuteOfArrival = travelMinutes + minuteOfDeparture // Аналогично

    // Если сумма остатка минут и минут отправления более 59,
    if (minuteOfArrival > 59) {
        hourOfArrival++ // Число часов увеличиваем на 1
        minuteOfArrival = minuteOfArrival % MINUTES_IN_HOUR
    }

    val timeOfArrival = String.format("%02d:%02d", hourOfArrival, minuteOfArrival)
    println("Время отправления: $timeOfDeparture\nВремя прибытия: $timeOfArrival\n\nВ пути: $travelHours ч, $travelMinutes мин")
}