package lesson17

class Package1(_currentLocation: String, _changeLocationCount: Int) {

    val number: Int = 0
    var currentLocation = _currentLocation
        set(value) {
            field = value
            changeLocationCount += 1
        }
    var changeLocationCount = _changeLocationCount

}

fun main() {

    val package1 = Package1("Отделение почты 2", 0)

    package1.currentLocation = "Отделение почты 1"
    println(package1.changeLocationCount)

}