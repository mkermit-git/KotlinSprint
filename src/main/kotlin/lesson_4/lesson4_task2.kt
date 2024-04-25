package org.example.lesson_4

const val AVERAGE_MIN_WEIGHT = 35
const val AVERAGE_MAX_WEIGHT = 100
const val AVERAGE_MAX_VOLUME = 100

class Package(val weight: Int, val volume: Int)

fun main() {
    val firstPackage = Package(20, 80)
    val secondPackage = Package(50, 100)

    checkForAverage(firstPackage)
    checkForAverage(secondPackage)
}

fun checkForAverage(p: Package) {
    println(
        "Груз с весом ${p.weight} кг и объемом ${p.volume} л соответствует категории 'Average': " +
                "${p.weight > AVERAGE_MIN_WEIGHT && p.weight < AVERAGE_MAX_WEIGHT && p.volume < AVERAGE_MAX_VOLUME}"
    )
}