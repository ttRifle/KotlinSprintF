package lesson17

class Quiz(question: String, answer: String) {

    val question = question
        get() = field

    var answer: String = answer
        get() = field
        set(value) {
            field = value


        }
}
