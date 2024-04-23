fun main() {

    println("Введите длину пароля")
    val passLenght = readln().toInt()

    val userPassword = getPassword(passLenght)

    println(userPassword)

}

fun getPassword(lenght: Int): String {

    val rangeOfPassNumSymbols = (0..9)
    val rangeOfPassSpecSymbols = (' '..'/')
    var password = ""

    for (i in 1..lenght)
        if (i % 2 == 0) password += rangeOfPassSpecSymbols.random()
        else password += rangeOfPassNumSymbols.random()

    return password

}
