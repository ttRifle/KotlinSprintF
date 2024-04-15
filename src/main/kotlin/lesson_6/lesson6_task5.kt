fun main() {

    var numberOfTry = 3

    while (numberOfTry > 0) {

        numberOfTry--

        val checkNumber1 = (1..9).random()
        val checkNumber2 = (1..9).random()
        val sumOfCheckNumbers = checkNumber1 + checkNumber2

        println("Сколько будет $checkNumber1 + $checkNumber2")
        val userNumber = readln().toInt()

        if (userNumber == sumOfCheckNumbers) {
            println("Добро пожаловать!")
            return
        } else println("Неверно!")

    }

    println("Доступ запрещен!")

}
