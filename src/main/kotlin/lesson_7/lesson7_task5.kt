fun main() {

    val rangeUpperCase = 'A'..'Z'
    val rangeLowerCase = 'a'..'z'
    val rangeNumbers = 0..9
    val minPassLenght = 6
    val numberOfSymbolTypes = 1..3
    var password: String = ""

    println("Введите длину пароля который хотите сгенерировать(минимальная длина пароля 6 символов")
    var passLenght = readln().toInt()
    if (passLenght < minPassLenght) passLenght = 6

    for (i in 1..passLenght) {

        val symbolType = numberOfSymbolTypes.random()

        val symbol: String = when (symbolType) {
            1 -> rangeUpperCase.random().toString()
            2 -> rangeLowerCase.random().toString()
            else -> rangeNumbers.random().toString()
        }

        password += symbol

    }

    println(password)

}