package lesson18

open class Cube {

    open fun getThrowResult() = ""

}


class FourCube() : Cube() {

    private val numberOfFace = 4
    override fun getThrowResult(): String {
        return "кубик c с количеством граней $numberOfFace: Результат броска ${(1..numberOfFace).random()}"

    }

}

class SixCube() : Cube() {
    private val numberOfFace = 6
    override fun getThrowResult(): String {
        return "кубик c с количеством граней $numberOfFace: Результат броска ${(1..numberOfFace).random()}"
    }
}

class EightCube() : Cube() {
    private val numberOfFace = 8
    override fun getThrowResult(): String {
        return "кубик c с количеством граней $numberOfFace: Результат броска ${(1..numberOfFace).random()}"
    }
}

fun main() {

    val fourCube: Cube = FourCube()
    val sixCube: Cube = SixCube()
    val eightCube: Cube = EightCube()

    val arrayOfCubes = arrayOf<Cube>(fourCube, sixCube, eightCube)

    getAllResults(arrayOfCubes)

}

fun getAllResults(cubes: Array<Cube>) {

    cubes.forEach {
        println(it.getThrowResult())
    }

}