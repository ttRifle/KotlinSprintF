package lesson21

fun main() {

    val word = "Hello"

    fun String.vowelCount(): Int {
        val vowel = "aoeiuy"
        var count = 0

        this.forEach {
            for (i in vowel.indices) {
                if (vowel[i].equals(it, ignoreCase = true)) count++
            }
        }

        return count
    }

    println(word.vowelCount())

}