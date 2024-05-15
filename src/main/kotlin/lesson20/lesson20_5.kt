package lesson20

class Robot {

    private val listOfPhrases = listOf(
        "Начинать всегда стоит с того, что сеет сомнения",
        "Настоящая ответственность бывает только личной",
        "Неосмысленная жизнь не стоит того, чтобы жит",
        "80% успеха - это появиться в нужном месте в нужное время",
        "Ваше время ограничено, не тратьте его, живя чужой жизнью"
    )

    val reverseWords: (String) -> (String) = { phrase: String -> phrase.split(" ").reversed().joinToString(" ") }

    val currentPhrase = { listOfPhrases.random() }

    fun say() {
        println(currentPhrase())
    }

    fun setModifier(): String = reverseWords(currentPhrase())

    fun say(modified: String) {
        println(modified)
    }

}

fun main() {

    val robot = Robot()

    robot.say()

    robot.say(robot.setModifier())

}