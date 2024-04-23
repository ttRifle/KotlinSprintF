fun main() {

    println("Введите количество инредиентов")
    val numberOfIngredients = readln().toInt()
    val arrayOfIngredients = arrayOfNulls<String>(numberOfIngredients)

    for (i in 0..<numberOfIngredients) {
        println("Введите ингридиент №${i + 1}")
        arrayOfIngredients[i] = readln()
    }

    println(arrayOfIngredients.contentToString())

}