package lesson22

class ViewModel {

    var mainScreenState: MainScreenState? = null

    data class MainScreenState(
        val isLoading: Boolean = false,
        val data: String = "",
    )

    fun loadData() {

        if (mainScreenState != null) {
            if (mainScreenState?.isLoading == false) {
                println("Загрузка данных")
                mainScreenState = mainScreenState?.copy(isLoading = true)
            } else {
                println("Наличие загруженных данных")
                mainScreenState = mainScreenState?.copy(isLoading = false)
            }
        } else {
            println("Данные отсутствуют")
        }

    }
}

fun main() {

    val viewModel = ViewModel()

    viewModel.loadData()

    viewModel.mainScreenState = ViewModel.MainScreenState(true, "some data")

    viewModel.loadData()
    viewModel.loadData()

}

