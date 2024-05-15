package lesson20


fun main() {

    val lisOfString = listOf("a", "b", "c", "d", "e")

    val listOfLambdas: List<() -> Unit> = lisOfString.map { { println("Нажат элемент [$it]") } }

    for (i in listOfLambdas.indices step 2) listOfLambdas[i]()

}