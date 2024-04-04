package org.example.lesson_2

fun main() {

    val trainDepartureTimeHour = 9
    val trainDepartureTimeMinute = 39
    val trainWayMinutes = 457

    val trainDepartureInMinutes = trainDepartureTimeHour * 60 + trainDepartureTimeMinute
    val trainArrivalInMinutes = trainDepartureInMinutes + trainWayMinutes

    val trainArrivalTimeHour = trainArrivalInMinutes / 60
    val trainArrivalTimeMinute = trainArrivalInMinutes % 60

    val trainArrivalTime = String.format ("%02d:%02d", trainArrivalTimeHour, trainArrivalTimeMinute)
    println(trainArrivalTime)

}