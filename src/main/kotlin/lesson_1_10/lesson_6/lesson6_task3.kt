fun main() {

    println("На сколько секунд поставить таймер")
    var timerSec = readln().toInt()

    while (timerSec > 0) {
        println("Осталось секунд: ${timerSec--}")
        Thread.sleep(1000)
    }

    println("Время вышло")

}
