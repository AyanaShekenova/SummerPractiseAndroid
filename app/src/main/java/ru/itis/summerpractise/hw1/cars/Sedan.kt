package ru.itis.summerpractise.hw1.cars

class Sedan(
    mark: String,
    model: String,
    year: Int,
    color: String,
    enginePower: Int,
    val seatingCapacity: Int
) : Car(mark, model, year, color, enginePower) {
    override fun printInfoOfCar() {
        super.printInfoOfCar()
        println("Количество сидячих мест: $seatingCapacity")
    }
}