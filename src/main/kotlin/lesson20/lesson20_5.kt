package lesson20

class Robot {

    private val listOfPhrases = listOf(
        "Начинать всегда стоит с того, что сеет сомнения",
        "Настоящая ответственность бывает только личной",
        "Неосмысленная жизнь не стоит того, чтобы жит",
        "80% успеха - это появиться в нужном месте в нужное время",
        "Ваше время ограничено, не тратьте его, живя чужой жизнью"
    )

    var modify: (String) -> String = { it }

    fun say() = println(modify(listOfPhrases.random()))

    fun setModifier(reverseWords: (String) -> String) {
        modify = reverseWords
    }

}

fun main() {
    val reverseWords: (String) -> String = { phrase: String -> phrase.split(" ").reversed().joinToString(" ") }
    val robot = Robot()
    robot.say()
    robot.setModifier(reverseWords)
    robot.say()
}