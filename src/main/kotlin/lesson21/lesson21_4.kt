package lesson21

import java.io.File

fun main() {

    val file = File("file.txt")
    val text = "neW"

    file.appendLowerCaseTextToBeginning(text)

}

fun File.appendLowerCaseTextToBeginning(text: String) {

    val currentLines = this.readText()

    this.writeText(text.lowercase() + currentLines)

}