package lesson_1_10.lesson_3

fun main() {

    val turnWayAndNum = "D2-D4;0"

    val splitTurnWayAndNum: List<String> = turnWayAndNum.split("-", ";")

    val turnFrom = splitTurnWayAndNum[0]
    val turnTo = splitTurnWayAndNum[1]
    val turnNum = splitTurnWayAndNum[2]

    println(turnFrom)
    println(turnTo)
    println(turnNum)

}