fun main() {

    val progressionFrom = 0

    println("Введите конец прогрессии")
    val progressionTo = readln().toInt()

    val rangeEven = progressionFrom..progressionTo

    for (i in rangeEven step 2) println(i)

}
