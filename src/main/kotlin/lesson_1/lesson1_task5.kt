package org.example.lesson_1

fun main() {

    val seconds: Int = 6480
    val hours: Int = seconds / 3600
    val minutes: Int
    val timeSec: Int

    if (seconds < 3600) minutes = seconds / 60
    else minutes = seconds / 60 - hours * 60

    if (minutes == 0 && hours == 0) timeSec = seconds
    else if (minutes > 0 && hours == 0) timeSec = seconds - minutes * 60
         else timeSec = seconds - hours * 3600 - minutes * 60

    val hoursString = if (hours < 10) "0$hours"
    else "$hours"
    val minutesString = if (minutes < 10) "0$minutes"
    else "$minutes"
    val secsString = if (timeSec < 10) "0$timeSec"
    else "$timeSec"

    println("$hoursString:$minutesString:$secsString")

}