package org.example.lesson_3

fun main() {
    val baseNumber = 4
    val multiTable = """
  $baseNumber x 1 = ${baseNumber * 1}
  $baseNumber x 2 = ${baseNumber * 2}
  $baseNumber x 3 = ${baseNumber * 3}
  $baseNumber x 4 = ${baseNumber * 4}
  $baseNumber x 5 = ${baseNumber * 5}
  $baseNumber x 6 = ${baseNumber * 6}
  $baseNumber x 7 = ${baseNumber * 7}
  $baseNumber x 8 = ${baseNumber * 8}
  $baseNumber x 9 = ${baseNumber * 9}
  """

    println(multiTable)
}