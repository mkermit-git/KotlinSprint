package org.example.lesson_3

fun main() {

    var surName = "Андреева"
    val firstName = "Татьяна"
    val fatherName = "Сергеевна"
    var age = 20

    println("$surName $firstName $fatherName, $age лет")

    // Смена фамилиии в 22 года
    age = 22
    surName = "Сидорова"

    println("$surName $firstName $fatherName, $age года")
}