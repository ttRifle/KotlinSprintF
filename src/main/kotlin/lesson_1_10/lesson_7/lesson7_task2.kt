fun main() {

    val smsCodeRange = 1000..9999

    do {
        val smsCode = smsCodeRange.random()
        println("Ваш код авторизации: $smsCode")
        println("Введите код из СМС")
        val userCode = readln().toInt()

    } while (smsCode != userCode)

    println("Добро пожаловать! Код введен верно!")

}