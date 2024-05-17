package lesson21

import java.io.File

fun main() {

    val file = File("file.txt")
    val text = "123"

    fun File.appendLowerCaseTextToBeginning(text: String) {

        val currentLines = file.readLines()

        this.writeText(text)

        currentLines.forEach() {
            file.appendText(it)
        }

    }

    file.appendLowerCaseTextToBeginning(text)

}