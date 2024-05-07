package lesson18

class Order3(
    val number: Int = 0,
    val good: String = String(),
    val goods: List<String> = listOf()
) {

    fun printOrder(order: String) {
        println("Заказан товар $order")
    }

    fun printOrder(order: List<String>) {
        println("Заказаны следующие товары: $order")
    }

}

fun main() {
    val order1 = Order3(1, "Телевизор Samsung", listOf())
    val order2 = Order3(2, "", (listOf("Телевизир Samsung", "Холодильник Indesit")))

    order1.printOrder(order1.good)
    order2.printOrder(order2.goods)

}