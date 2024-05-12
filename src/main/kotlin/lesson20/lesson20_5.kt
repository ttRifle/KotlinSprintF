package lesson20

class Robot {

    private val listOfPhrases = listOf(
        "Начинать всегда стоит с того, что сеет сомнения",
        "Настоящая ответственность бывает только личной",
        "Неосмысленная жизнь не стоит того, чтобы жит",
        "80% успеха - это появиться в нужном месте в нужное время",
        "Ваше время ограничено, не тратьте его, живя чужой жизнью"
    )

    private var currentPhrase: String = listOfPhrases[listOfPhrases.indices.random()]

    fun say() {
        println(currentPhrase)
    }

    fun setModifier(reverseWords: (String) -> String) {
        currentPhrase = reverseWords(currentPhrase)
    }

}

fun main() {

    val robot = Robot()

    val reverseWords: (String) -> (String) = { phrase: String -> phrase.split(" ").reversed().joinToString(" ") }

    robot.say()

    robot.setModifier(reverseWords)

    robot.say()

}