package org.example.lesson_4

fun main() {
    val dayOfExercise = 5
    val isEven = (dayOfExercise % 2) == 0 // Проверка дня на четность
    val message = """
        Упражнения для рук: ${!isEven}
        Упражнения для ног: ${isEven}
        Упражнения для спины: ${isEven}
        Упражнения для пресса: ${!isEven}
    """.trimIndent()
    println(message)
}