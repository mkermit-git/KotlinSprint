package org.example.lesson_3

fun main() {
    // В шахматах первыми ходят белые, пешки на второй строке
    var moveFrom = "E2"
    var moveTo = "E4"
    var moveNumber = 1

    // Запись хода в строку для отправки на сервер
    var moveString = "[$moveFrom-$moveTo;$moveNumber]"
    println(moveString)

    // Вторыми ходят черные, их пешки на 7 строке, а значит они не могут стартовать с d2
    moveFrom = "D7"
    moveTo = "D6" // Ход чёрных вперёд - это ход вниз
    moveNumber++

    // Перезапись строки хода
    moveString = "[$moveFrom-$moveTo;$moveNumber]"
    println(moveString)
}