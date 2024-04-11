fun main() {

    val isSunny = true
    val isAwningOpen = true
    val airWarmInPercent = 20
    val seasonTime = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(isSunny == IS_FOR_BEAN_SUNNY) && (isAwningOpen == IS_FOR_BEAN_AWNING_OPEN) && (airWarmInPercent == BEAM_AIR_WARM_IN_PERCENT) && (seasonTime != BEAM_SEASON_TIME)}")

}

const val IS_FOR_BEAN_SUNNY = true
const val IS_FOR_BEAN_AWNING_OPEN = true
const val BEAM_AIR_WARM_IN_PERCENT = 20
const val BEAM_SEASON_TIME = "зима"