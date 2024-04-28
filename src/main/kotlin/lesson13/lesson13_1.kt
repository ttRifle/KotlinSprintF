package lesson13

class PhoneDir(_name: String, _phoneNumber: Long) {

    val name = _name
    val phoneNumber = _phoneNumber
    var company: String? = String()

    constructor(
        name: String,
        phoneNumber: Long,
        company: String?
    ) : this(name, phoneNumber)

}


fun main() {


}