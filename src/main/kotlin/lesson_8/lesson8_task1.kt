fun main() {

    val arrayOfDayViews = arrayOf(111, 222, 333, 444, 555, 666, 777)
    var weeklyViews = 0

    for (element in arrayOfDayViews) {
        weeklyViews += element
    }

    println(weeklyViews)

}