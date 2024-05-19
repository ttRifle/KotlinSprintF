package lesson22

class ViewModel(
    private var mainScreenState: MainScreenState? = MainScreenState(),
) {

    data class MainScreenState(
        val data: String? = null,
        val isLoading: Boolean = false,
    )

    fun loadData(data: MainScreenState?) {

        if (data == null) {
            println("отсутствуют данные")
        } else {
            if (mainScreenState?.isLoading == false) {
                println("загрузка данных")
                mainScreenState = mainScreenState?.copy(data = data.data, isLoading = true)
            } else {
                println("наличие загруженных данных")
                mainScreenState = mainScreenState?.copy(data = data.data, isLoading = false)
            }
        }

    }
}

fun main() {

    val viewModel = ViewModel()
    var data: ViewModel.MainScreenState? = null

    viewModel.loadData(data)

    data = ViewModel.MainScreenState("some data")

    viewModel.loadData(data)
    viewModel.loadData(data)

}

