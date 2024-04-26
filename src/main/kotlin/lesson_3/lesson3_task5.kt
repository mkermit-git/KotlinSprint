package org.example.lesson_3

fun main() {
    // Строка, пришедшая на сервер
    val moveString = "E2-E4;1"

    // Парсинг данных из строки в массив
    val moveData = moveString.split("-", ";")

    // Присваивание переменным хода данных из массива
    val moveFrom = moveData[0]
    val moveTo = moveData[1]
    val moveNumber = moveData[2].toInt()

    println("Откуда: $moveFrom  Куда: $moveTo   Ход: $moveNumber")
}