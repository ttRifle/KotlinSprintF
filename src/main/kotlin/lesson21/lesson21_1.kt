package lesson21

fun main() {

    val word = "HellO"

    println(word.vowelCount())

}

const val VOWEL = "aoeiuy"

fun String.vowelCount(): Int = this.count { it.lowercase() in VOWEL }