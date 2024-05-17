package lesson21

fun main() {

    val experience: Map<String, Int> = mapOf("pistol" to 0, "machine gun" to 1000, "knife" to 1000, "rifle" to 200)

    fun Map<String, Int>.maxCategory(): String =
        (this.filterValues { it == this.maxOf { max -> max.value } }).keys.max().toString()

    println(experience.maxCategory())

}