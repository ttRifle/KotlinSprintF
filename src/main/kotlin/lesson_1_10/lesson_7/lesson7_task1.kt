fun main() {

    val passNumberRange = 1..9
    val passCharRange = 'a'..'z'
    val numberOfPassSymbols = 6
    var password = ""

    for (i in 1..numberOfPassSymbols step 2) {
        val charSymbol = passCharRange.random()
        val numSymbol = passNumberRange.random()
        password += charSymbol
        password += numSymbol
    }

    println(password)

}