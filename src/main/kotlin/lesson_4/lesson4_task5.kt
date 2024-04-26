package org.example.lesson_4

import java.util.*

const val MIX_CREW_SIZE = 55
const val RECOMMENDED_CREW_SIZE = 70
const val MIN_PROVISION_CASES_AMOUNT = 50

fun main() {
    val userInput = Scanner(System.`in`)

    print("Наличие повреждений корпуса: ")
    val hasDamages = userInput.nextBoolean()

    print("Текущий состав экипажа: ")
    val crewSize = userInput.nextInt()

    print("Количество ящиков с провизией на борту: ")
    val provisionCasesAmount = userInput.nextInt()

    print("Благоприятность метеоусловий: ")
    val isWeatherOK = userInput.nextBoolean()

    val isReadyForLongRide =
        (!hasDamages && crewSize in MIX_CREW_SIZE..RECOMMENDED_CREW_SIZE && provisionCasesAmount > MIN_PROVISION_CASES_AMOUNT) ||
                (crewSize == RECOMMENDED_CREW_SIZE && isWeatherOK && provisionCasesAmount >= MIN_PROVISION_CASES_AMOUNT)

    println("Научно-исследовательский корабль может приступить к долгосрочному плаванию: $isReadyForLongRide")

}