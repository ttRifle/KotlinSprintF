package lesson16

class Order {

    private val orderId: Int = 0
    var isOrderReady = false

    private fun changeStatus(manager: Boolean): Boolean {
        if (manager) {
            isOrderReady = !isOrderReady
            println("Статус готовности заказа поменялся на $isOrderReady")
        } else
            println("Менеджер не согласовал смену статуса заказа")

        return isOrderReady
    }

    fun resolveManager() {
        val managerAnswer = true
        println("Ответ менеджера на запрос согласования $managerAnswer")
        changeStatus(managerAnswer)
    }

}

fun main() {

    val order = Order()

    order.resolveManager()

}

