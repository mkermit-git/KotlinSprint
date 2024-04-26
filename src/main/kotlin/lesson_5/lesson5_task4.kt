package org.example.lesson_5

import java.util.Scanner

const val AUTHORISED_LOGIN = "Zaphod"
const val AUTHORISED_PASSWORD = "PanGalactic"

fun main() {
    val userInput = Scanner(System.`in`)

    val welcomeMessage = """
        Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля "Heart of Gold". 
        [вздыхает...] 
        Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. 
        Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. 
        [вздыхает ещё глубже...] 
        Да, вперед, пожалуйста, вводите свои данные...
    """.trimIndent()

    println(welcomeMessage)
    print("\nЛогин: ")
    val userLogin = userInput.nextLine()
    if (userLogin == AUTHORISED_LOGIN) {
        print("Пароль: ")
        val userPassword = userInput.nextLine()
        val authMessage = when {
            userPassword != AUTHORISED_PASSWORD -> "Неправильный пароль"
            else -> """
                [вздыхает...] 
                Ваши данные проверены, и о, чудо, они верны... 
                Пользователь $AUTHORISED_LOGIN, вам разрешено входить на борт корабля "Heart of Gold". 
                Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... 
                [меланхолический вздох...] 
                Надеюсь, вам понравится пребывание здесь больше, чем мне.
            """.trimIndent()
        }
        println("\n$authMessage")
    } else {
        println("\nТакого пользователя нет. Желаете зарегистирироваться?")
    }

    userInput.close()
}