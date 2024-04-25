package org.example.lesson_4

const val TABLE_NUMBER = 13
fun main() {
    val tablesBookedToday = 13
    val tablesBookedTomorrow = 9

    println("[Доступность столиков на сегодня: ${tablesBookedToday < TABLE_NUMBER}]")
    println("[Доступность столиков на завтра: ${tablesBookedTomorrow < TABLE_NUMBER}]")
}