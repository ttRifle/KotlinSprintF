package lesson_1_10.lesson_4

fun main() {

    val dayOfTraining = 2
    val isEvenDay = dayOfTraining % 2 == 0

    val handsTrainingToday = !isEvenDay
    val legsTrainingToday = isEvenDay
    val backTrainingToday = isEvenDay
    val pressTrainingToday = !isEvenDay

    println("Упражнения для рук: $handsTrainingToday\nУпражнения для ног: $legsTrainingToday\nУпражнения для спины: $backTrainingToday\nУпражнения для пресса: $pressTrainingToday")

}