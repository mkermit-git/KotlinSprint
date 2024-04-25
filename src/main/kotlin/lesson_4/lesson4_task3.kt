package org.example.lesson_4

const val BEANS_WEATHER_IS_SUNNY = true
const val BEANS_TENT_IS_OPEN = true
const val BEANS_HUMIDITY_OK = 20
const val BEANS_SEASONS_NOT_OK = "Зима"

class Condition(val weatherIsSunny: Boolean, val tentIsOpen: Boolean, val humidity: Int, val season: String)

fun main() {
    val todayCondition = Condition(true, true, 20, "Зима")

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${
                    todayCondition.weatherIsSunny == BEANS_WEATHER_IS_SUNNY &&
                            todayCondition.tentIsOpen == BEANS_TENT_IS_OPEN &&
                            todayCondition.humidity == BEANS_HUMIDITY_OK &&
                            todayCondition.season != BEANS_SEASONS_NOT_OK
                }"
    )
}