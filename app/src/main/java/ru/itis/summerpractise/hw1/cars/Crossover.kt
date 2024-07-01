package ru.itis.summerpractise.hw1.cars

class Crossover(
    mark: String,
    model: String,
    year: Int,
    color: String,
    enginePower: Int,
    val typeOfDrive: String,
    val weight: Int
) : Car(mark, model, year, color, enginePower) {
    override fun printInfoOfCar() {
        super.printInfoOfCar()
        println("Тип привода: $typeOfDrive")
        println("Вес автомобиля: $weight кг")
    }
}