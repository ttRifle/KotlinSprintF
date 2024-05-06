package lesson17

class Package1 {

    val number: Int = 0
    var currentLocation = "Отделение почты 1"
        set(value) {
            field = value
            changeLocationCount += 1
        }
    var changeLocationCount = 0


}

fun main() {

    val package1 = Package1()

    package1.currentLocation = "Отделение почты 1"
    println(package1.changeLocationCount)

}