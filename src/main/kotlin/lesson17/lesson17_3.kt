package lesson17

class Folder(
    _name: String,
    _numberOfFiles: Int,
    _isSecretFlag: Boolean,
) {

    var name: String = _name
        get() =
            if (isSecretFlag) "Скрытая папка, количестов файлов 0".also { println(it) }
            else field.also { println("Папка $field, количество файлов $numberOfFiles") }

    val numberOfFiles: Int = _numberOfFiles
    var isSecretFlag: Boolean = _isSecretFlag

}

fun main() {

    val folder = Folder("Аллегрова", 10, false)

    var newFolderName = folder.name
    folder.isSecretFlag = true
    newFolderName = folder.name


}