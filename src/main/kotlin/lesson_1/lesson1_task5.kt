package org.example.lesson_1

fun main() {

    val hoursOfTimeInCosmos = SECONDSINCOSMOS / SECONDSINHOUR
    val minutesOfTimeInCosmos = SECONDSINCOSMOS % SECONDSINHOUR / SECONDSINMINUTE
    val secondsOfTimeInCosmos = SECONDSINCOSMOS % SECONDSINMINUTE

    val timeInCosmos =
        String.format("%02d:%02d:%02d", hoursOfTimeInCosmos, minutesOfTimeInCosmos, secondsOfTimeInCosmos)

    println(timeInCosmos)

}

const val SECONDSINCOSMOS = 6480
const val SECONDSINHOUR = 3600
const val SECONDSINMINUTE = 60