package lesson19

enum class Gender(val ruGender: String) {

    MALE("Мужчина"),
    FEMALE("Женщина");

    fun getRuGender() = ruGender

}

class HumanCard(_name: String, _gender: Gender?) {

    val name = _name
    val gender = _gender

    fun printCard() {
        println("Имя: $name, пол: ${gender?.getRuGender()}")
    }

}

fun main() {

    val humanCardList: List<HumanCard> = addCard()

    humanCardList.indices.forEach() {
        humanCardList[it].printCard()
    }

}

fun getGenderFromString(gender: String?): Gender? {

    return when {
        gender.equals(gender, ignoreCase = true) -> Gender.MALE
        gender.equals(gender, ignoreCase = true) -> Gender.FEMALE
        else -> null
    }

}

fun addCard(): List<HumanCard> {

    val numberOfCards = 5
    val humanCardList: MutableList<HumanCard> = mutableListOf()

    println(
        "Необходимо заполнить имя и пол человека в одну строку через пробел. пример: \"Борис Мужчина\"\n" +
                "Список полов ${Gender.entries}"
    )

    for (i in 1..numberOfCards) {

        println("Введите карточку человека №$i")
        val nameAndGender = readln()

        if (nameAndGender.split(" ").size == 2) {
            humanCardList.add(
                HumanCard(
                    nameAndGender.split(" ")[0],
                    getGenderFromString(nameAndGender.split(" ")[1])
                )
            )
        } else println("Вы ввели не корретные данные. Карточка не заведена")

    }

    return humanCardList

}
