fun main() {

    val arrayOfTomyamIngredients = arrayOf("галанган", "чили", "креветки", "лемонграс", "грибы")

    for (i in arrayOfTomyamIngredients)
        println(i)

    println("Введи ингридиент который хочешь заменить")
    val userIngredientChange = readln()

    if (arrayOfTomyamIngredients.indexOf(userIngredientChange) != -1) {
        println("Введите ингредиент который необходимо добавить")
        arrayOfTomyamIngredients[arrayOfTomyamIngredients.indexOf(userIngredientChange)] = readln()
        println("Готово! Вы сохранили следующий список: ${arrayOfTomyamIngredients.contentToString()}")
    } else println("Такого ингрединета в рецепте нет")

}