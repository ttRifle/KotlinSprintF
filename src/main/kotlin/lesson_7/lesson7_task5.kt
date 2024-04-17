fun main() {

    val rangeUpperCase = 'A'..'Z'
    val rangeLowerCase = 'a'..'z'
    val rangeNumbers = 0..9
    val rangeOfAllChars = rangeNumbers + rangeLowerCase + rangeUpperCase
    val minPassLenght = 6
    val listOfPasswordSymbols: MutableList<String> = mutableListOf()
    var password = ""

    println("Введите длину пароля который хотите сгенерировать(минимальная длина пароля 6 символов")
    var passLenght = readln().toInt()
    if (passLenght < minPassLenght) passLenght = 6

    listOfPasswordSymbols.add(rangeNumbers.random().toString())
    listOfPasswordSymbols.add(rangeLowerCase.random().toString())
    listOfPasswordSymbols.add(rangeUpperCase.random().toString())

    for (i in 4..passLenght) {
        listOfPasswordSymbols.add(rangeOfAllChars.random().toString())
    }

    listOfPasswordSymbols.shuffle()

    listOfPasswordSymbols.forEach() {
        password += it
    }

    println(password)

}