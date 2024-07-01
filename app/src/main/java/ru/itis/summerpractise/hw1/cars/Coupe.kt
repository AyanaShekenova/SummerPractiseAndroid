package ru.itis.summerpractise.hw1.cars

class Coupe(
    mark: String,
    model: String,
    year: Int,
    color: String,
    enginePower: Int,
    val doors: Int
) : Car(mark, model, year, color, enginePower) {
    override fun printInfoOfCar() {
        super.printInfoOfCar()
        println("Количество дверей: $doors")
    }
}