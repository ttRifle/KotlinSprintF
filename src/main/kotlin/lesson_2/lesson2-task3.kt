package org.example.lesson_2

fun main() {

    val trainDepartureTimeHour = 9
    val trainDepartureTimeMinute = 39
    val trainWayMinutes = 457

    val trainDepartureInMinutes = trainDepartureTimeHour * SECINMINUTE + trainDepartureTimeMinute
    val trainArrivalInMinutes = trainDepartureInMinutes + trainWayMinutes

    val trainArrivalTimeHour = trainArrivalInMinutes / SECINMINUTE
    val trainArrivalTimeMinute = trainArrivalInMinutes % SECINMINUTE

    val trainArrivalTime = String.format ("%02d:%02d", trainArrivalTimeHour, trainArrivalTimeMinute)
    println(trainArrivalTime)

}

const val SECINMINUTE = 60