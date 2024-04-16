fun main() {

    println("На сколько секунд поставить таймер")
    var timerSec = readln().toInt()
    val timerSecPrint = timerSec

    while (timerSec > 0) {
        timerSec--
        Thread.sleep(1000)
    }

    println("прошло ${timerSecPrint} секунд")

}
