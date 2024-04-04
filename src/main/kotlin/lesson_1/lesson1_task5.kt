package org.example.lesson_1

fun main() {

    val hoursOfTimeInCosmos = secondsInCosmos / 3600
    val minutesOfTimeInCosmos = secondsInCosmos % 3600 / 60
    val secondsOfTimeInCosmos = secondsInCosmos % 60

    val timeInCosmos = String.format ("%02d:%02d:%02d",hoursOfTimeInCosmos, minutesOfTimeInCosmos, secondsOfTimeInCosmos)

    println(timeInCosmos)

}

const val secondsInCosmos = 6480
