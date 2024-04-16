fun main() {

    val passNumberRange = 1 .. 9
    val passCharRange = 'a' .. 'z'

    val password = passCharRange.random() + passNumberRange.random().toString() + passCharRange.random() + passNumberRange.random().toString() + passCharRange.random() + passNumberRange.random().toString()

    println(password)

}