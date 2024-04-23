package lesson_1_10.lesson_1

fun main() {

    val hoursOfTimeInCosmos = lesson_1_10.lesson_1.SECONDSINCOSMOS / lesson_1_10.lesson_1.SECONDSINHOUR
    val minutesOfTimeInCosmos = lesson_1_10.lesson_1.SECONDSINCOSMOS % lesson_1_10.lesson_1.SECONDSINHOUR / lesson_1_10.lesson_1.SECONDSINMINUTE
    val secondsOfTimeInCosmos = lesson_1_10.lesson_1.SECONDSINCOSMOS % lesson_1_10.lesson_1.SECONDSINMINUTE

    val timeInCosmos =
        String.format("%02d:%02d:%02d", hoursOfTimeInCosmos, minutesOfTimeInCosmos, secondsOfTimeInCosmos)

    println(timeInCosmos)

}

const val SECONDSINCOSMOS = 6480
const val SECONDSINHOUR = 3600
const val SECONDSINMINUTE = 60