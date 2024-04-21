fun main() {

    val userName = "Boris"
    val userPass = "Razor1"
    val listOfCart = getCart((getToken(userName, userPass)))

    if (listOfCart.isNotEmpty())
        println(listOfCart.joinToString())
    else println("Отказ в доступе")

}

fun getCart(checkToken: String): List<String> {
    val listOfCartData = listOf("Телевизор", "Телефон", "Вертолет", "Трусы")

    val returnCart: List<String> = if (checkToken != "null") listOfCartData else listOf()

    return returnCart

}

fun getToken(nameToCheck: String, passToCheck: String): String {

    val userNameData = "boris"
    val userPassData = "Razor1"
    var newToken = "null"

    if ((userNameData.equals(nameToCheck, ignoreCase = true)) && (passToCheck == userPassData)) {
        val tokenLenght = 32
        val tokenSymbols = ('0'..'9') + ('A'..'Z') + ('a'..'z')
        for (i in 1..tokenLenght) newToken += tokenSymbols.random()
    }

    return newToken

}