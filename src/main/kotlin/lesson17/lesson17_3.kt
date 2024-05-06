package lesson17

class Folder {

    var name: String = "Алегрова"
        get() {

            if (isSecretFlag) {
                field = "Скрытая папка"
                println("$field, количество файлов 0")
                return field
            } else {
                println("Папка $field, количество файлов $numberOfFiles")
                return field
            }

        }


    val numberOfFiles: Int = 10
    var isSecretFlag: Boolean = false

}

fun main() {

    val folder = Folder()

    var a = folder.name
    folder.isSecretFlag = true
    a = folder.name


}