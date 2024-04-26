package org.example.lesson_4

const val FIRST_GROUP_EXERCISES = true // Начал с первой группы упражнений
const val SECOND_GROUP_EXERCISES = false

fun main() {
    val dayOfExercise = 5
    val isEven = (dayOfExercise % 2) == 0 // Проверка дня на четность

    /* В нечетные дни xor будет выдавать:
    - для первой группы упражнений (true ⊕ false) = true
    - для второй группы упражнений (false ⊕ false) = false

    В четные дни xor будет выдавать:
    - для первой группы упражнений (true ⊕ true) = false
    - для второй группы упражнений (false ⊕ true) = true */
    val message = """
        Упражнения для рук: ${FIRST_GROUP_EXERCISES xor isEven}
        Упражнения для ног: ${SECOND_GROUP_EXERCISES xor isEven}
        Упражнения для спины: ${SECOND_GROUP_EXERCISES xor isEven}
        Упражнения для пресса: ${FIRST_GROUP_EXERCISES xor isEven}
    """.trimIndent()

    println(message)

    // Можно начать с другой группы, поставив константам false и true соответственно, все будет работать
}