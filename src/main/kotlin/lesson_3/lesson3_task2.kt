package org.example.lesson_3

import java.time.LocalDate
import java.time.temporal.ChronoUnit

class Citizen(
    var surName: String,
    val firstName: String,
    val fatherName: String,
    val dateOfBirth: LocalDate
) {
    fun getInfo(requestDate: LocalDate) {
        val age = ChronoUnit.YEARS.between(dateOfBirth, requestDate)
        val ageLable = when (age.toString().last()) {
            '1' -> "год"
            in '2'..'4' -> "года"
            else -> "лет"
        }
        println("$surName $firstName $fatherName, $age $ageLable")
    }

    fun changeSurName(surName: String) {
        this.surName = surName
    }
}

fun main() {
    val citizen = Citizen(
        "Андреева",
        "Татьяна",
        "Сергеевна",
        LocalDate.of(2001, 9, 1)
    )

    // Первый запрос например, 1янваля2020, когда человеку 20 лет
    var requestDate = LocalDate.of(2022, 1, 1)
    citizen.getInfo(requestDate)

    // Смена фамилиии
    citizen.changeSurName("Сидорова")

    // Второй запрос сейчас, когда человеку 22 года, и после заключения брака
    requestDate = LocalDate.now()
    citizen.getInfo(requestDate)
}