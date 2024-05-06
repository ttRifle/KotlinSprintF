package lesson17

class Quiz {

    val question: String = String()
        get() = field

    var answer: String = String()
        get() = field
        set(value) {
            field = value
        }

}