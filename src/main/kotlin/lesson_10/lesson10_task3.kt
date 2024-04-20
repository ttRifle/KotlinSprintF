fun main() {

    println("Введите длину пароля")
    val passLenght = readln().toInt()

    val userPassword = getPassword(passLenght)

    println(userPassword)

}

fun getPassword(lenght: Int): String {

    val passNumSymbols = (0..9)
    val passSpecSymbols = "!\"#$%&'()*+,-./ "
    var password = ""

    for (i in 1..lenght)
        if (i % 2 == 0) password += passSpecSymbols.random()
        else password += passNumSymbols.random()


    return password

}
