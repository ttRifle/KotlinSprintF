fun main() {

    val listOfBusinessIdeas = mutableListOf("спать", "есть", "сидеть")

    println("В рецепте есть базовые ингредиенты: $listOfBusinessIdeas")

    println("Желаете добавить еще?")

    if (readln().equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        listOfBusinessIdeas.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: $listOfBusinessIdeas")
    }

}