package org.example.lesson_4

fun main() {

    val dayOfTraining = 2

    val handsTrainingToday = !(dayOfTraining % 2 == 0)
    val legsTrainingToday = (dayOfTraining % 2 == 0)
    val backTrainingToday = (dayOfTraining % 2 == 0)
    val pressTrainingToday = !(dayOfTraining % 2 == 0)

    println("Упражнения для рук: $handsTrainingToday\nУпражнения для ног: $legsTrainingToday\nУпражнения для спины: $backTrainingToday\nУпражнения для пресса: $pressTrainingToday")

}