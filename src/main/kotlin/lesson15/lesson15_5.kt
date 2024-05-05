package lesson15

abstract class Vehicle : Moveable, PassengerTransportable {
    abstract val cargoCapacity: Int
    abstract val passengersCapacity: Int
}

class PassengerCar(
    override val cargoCapacity: Int = 0,
    override val passengersCapacity: Int = 3,
) : Vehicle() {
    override fun loadUpPassengers(passengersTransported: Int): Int {
        val passengers = passengersTransported + passengersCapacity
        println("Загружено $passengersCapacity пассажира. Сейчас в машине $passengers.")
        return passengers
    }

    override fun unloadPassengers(passengersTransported: Int): Int {
        val passengers = passengersTransported - passengersCapacity
        println("Выгружено $passengersCapacity пассажира. Сейчас в машине $passengers.")
        return passengers
    }

}

class CargoCar(
    override val cargoCapacity: Int = 2,
    override val passengersCapacity: Int = 1,
) : Vehicle(), CargoTransportable {
    override fun loadUpPassengers(passengersTransported: Int): Int {
        val passengers = passengersTransported + passengersCapacity
        println("Загружен $passengersCapacity пассажир. Сейчас в машине $passengers.")
        return passengers
    }

    override fun unloadPassengers(passengersTransported: Int): Int {
        val passengers = passengersTransported - passengersCapacity
        println("Выгружен $passengersCapacity пассажир. Сейчас в машине $passengers.")
        return passengers
    }

    override fun loadUpCargo(cargoTransported: Int): Int {
        val cargo = cargoTransported + cargoCapacity
        println("Загружено $cargoCapacity грузоместа. Сейчас в машине $cargo.")
        return cargo
    }

    override fun unloadCargo(cargoTransported: Int): Int {
        val cargo = cargoTransported - cargoCapacity
        println("Выгружено $cargoCapacity грузоместа. Сейчас в машине $cargo.")
        return cargo
    }

}

interface CargoTransportable {

    fun loadUpCargo(cargoTransported: Int): Int

    fun unloadCargo(cargoTransported: Int): Int

}

interface PassengerTransportable {

    fun loadUpPassengers(passengersTransported: Int): Int


    fun unloadPassengers(passengersTransported: Int): Int

}

interface Moveable {

    fun departure() {
        println("Автомобиль отъехал")
    }

    fun drive() {
        println("Автомобиль в пути")
    }

    fun arrive() {
        println("Автомобиль прибыл")
    }

}

fun main() {

    var cargoInVehicle = 0
    var passengersInVehicle = 0

    val passengerCar = PassengerCar()
    val cargoCar = CargoCar()

    cargoInVehicle = cargoCar.loadUpCargo(cargoInVehicle)
    cargoCar.departure()
    cargoCar.drive()
    cargoCar.arrive()
    cargoInVehicle = cargoCar.unloadCargo(cargoInVehicle)

    passengersInVehicle = passengerCar.loadUpPassengers(passengersInVehicle)
    passengerCar.departure()
    passengerCar.drive()
    passengerCar.arrive()
    passengersInVehicle = passengerCar.unloadPassengers(passengersInVehicle)

    passengersInVehicle = passengerCar.loadUpPassengers(passengersInVehicle)
    passengerCar.departure()
    passengerCar.drive()
    passengerCar.arrive()
    passengersInVehicle = passengerCar.unloadPassengers(passengersInVehicle)

}

