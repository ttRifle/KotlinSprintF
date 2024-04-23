fun main() {

    val userName = "Boris"
    val userPass = "Razor1"
    val token = getToken(userName, userPass)

    if (token != null)
        println(getCart(token))
    else println("Авторизация не удалась")

}

fun getCart(cartToken: String): List<String> {

    val listOfCartData = listOf("Телевизор", "Телефон", "Вертолет", "Трусы")

    return listOfCartData

}

fun getToken(nameToCheck: String, passToCheck: String): String? {

    val userNameData = "boris"
    val userPassData = "Razor1"
    var newToken: String? = null

    if ((userNameData.equals(nameToCheck, ignoreCase = true)) && (passToCheck == userPassData)) {
        val tokenLenght = 32
        val tokenSymbols = ('0'..'9') + ('A'..'Z') + ('a'..'z')
        for (i in 1..tokenLenght) newToken += tokenSymbols.random()
    }

    return newToken

}