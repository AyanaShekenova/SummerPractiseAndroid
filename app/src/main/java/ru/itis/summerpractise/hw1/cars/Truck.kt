package ru.itis.summerpractise.hw1.cars

class Truck(
    mark: String,
    model: String,
    year: Int,
    color: String,
    enginePower: Int,
    val payloadCapacity: Int
) : Car(mark, model, year, color, enginePower) {
    override fun printInfoOfCar() {
        super.printInfoOfCar()
        println("Грузоподъёмность: $payloadCapacity")
    }
}