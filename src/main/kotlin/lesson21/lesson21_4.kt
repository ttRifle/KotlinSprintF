package lesson21

import java.io.File

fun main() {

    val file = File("file.txt")
    val text = "F123F"

    fun File.appendLowerCaseTextToBeginning(text: String) {

        val currentLines = file.readLines()

        this.writeText(text.lowercase())

        currentLines.forEach() {
            file.appendText(it)
        }

    }

    file.appendLowerCaseTextToBeginning(text)

}