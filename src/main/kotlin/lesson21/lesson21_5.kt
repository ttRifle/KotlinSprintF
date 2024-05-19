package lesson21

fun main() {

    val experience: Map<String, Int> = mapOf("pistol" to 0, "machine gun" to 1001, "knife" to 1001, "rifle" to 200)

    println(experience.maxCategory())

}

fun Map<String, Int>.maxCategory(): String? = maxByOrNull { it.value }?.key