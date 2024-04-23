fun main() {

    println("Сколько секунд засечь?")
    val secondsTimer = readln().toInt()

    for (i in secondsTimer downTo 1) {
        println("Осталось секунд: $i")
        Thread.sleep(1000)
    }

}