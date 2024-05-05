package lesson16

class Order {

    private val orderId: Int = 0
    var isOrderReady = false

    fun changeStatus(manager: Boolean): Boolean {
        if (manager) {
            isOrderReady = !isOrderReady
            println("Статус готовности заказа поменялся на $isOrderReady")
        } else
            println("Менеджер не согласовал смену статуса заказа")

        return isOrderReady
    }
}

class Manager {

    val name = String()

    fun resolveManager(): Boolean {
        val managerAnswer = true
        println("Ответ менеджера на запрос согласования $managerAnswer")
        return managerAnswer
    }

}


fun main() {

    val order = Order()
    val manager = Manager()

    order.changeStatus(manager.resolveManager())

}
