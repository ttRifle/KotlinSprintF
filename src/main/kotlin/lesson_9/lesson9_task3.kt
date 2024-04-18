fun main() {

    val listOfVolumesForOmelet = mutableListOf(2, 50, 15)

    println("Введите количество порций омлета")
    val numberOfPortions = readln().toInt()

    val listOfVolumesForOmeletNum = listOfVolumesForOmelet.map {
        it * numberOfPortions
    }

    println(
        "На $numberOfPortions порций вам понадобится: Яиц – ${listOfVolumesForOmeletNum[0]} шт, " +
                "молока – ${listOfVolumesForOmeletNum[1]} мл, сливочного масла – ${listOfVolumesForOmeletNum[2]} гр"
    )

}