package ru.itis.summerpractise.hw1.build

import ru.itis.summerpractise.hw1.cars.Coupe
import ru.itis.summerpractise.hw1.cars.Crossover
import ru.itis.summerpractise.hw1.cars.Sedan
import ru.itis.summerpractise.hw1.cars.Truck


class CarBuilder {
    private var mark: String = ""
    private var model: String = ""
    private var year: Int = 0
    private var color: String = ""
    private var enginePower: Int = 0
    private var doors: Int = 0
    private var typeOfDrive: String = ""
    private var weight: Int = 0
    private var seatingCapacity: Int = 0
    private var payloadCapacity: Int = 0

    fun setMark(mark: String) = apply {this.mark = mark}
    fun setModel(model: String) = apply {this.model = model}
    fun setYear(year: Int) = apply {this.year = year}
    fun setColor(color: String) = apply {this.color = color}
    fun setEnginePower(enginePower: Int) = apply {this.enginePower = enginePower}
    fun setDoors(doors: Int) = apply {this.doors = doors}
    fun setTypeOfDrive(typeOfDrive: String) = apply {this.typeOfDrive = typeOfDrive}
    fun setWeight(weight: Int) = apply {this.weight = weight}
    fun setSeatingCapacity(seatingCapacity: Int) = apply {this.seatingCapacity = seatingCapacity}
    fun setPayLoadCapacity(payloadCapacity: Int) = apply {this.payloadCapacity = payloadCapacity}

    fun buildCoupe(): Coupe {
        return Coupe(mark, model, year, color, enginePower, doors)
    }

    fun buildCrossover(): Crossover {
        return Crossover(mark, model, year, color, enginePower, typeOfDrive, weight)
    }

    fun buildSedan(): Sedan {
        return Sedan(mark, model, year, color, enginePower, seatingCapacity)
    }

    fun buildTruck(): Truck {
        return Truck(mark, model, year, color, enginePower, payloadCapacity)
    }
}