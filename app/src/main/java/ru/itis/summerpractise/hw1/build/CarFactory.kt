package ru.itis.summerpractise.hw1.build

import ru.itis.summerpractise.hw1.cars.Car
import kotlin.random.Random
import ru.itis.summerpractise.hw1.cars.Coupe
import ru.itis.summerpractise.hw1.cars.Crossover
import ru.itis.summerpractise.hw1.cars.Sedan
import ru.itis.summerpractise.hw1.cars.Truck

class CarFactory {
    companion object {
        private val marks = arrayOf("Toyota", "Honda", "BMW", "Ford", "Chevrolet")
        private val models = arrayOf("Camry", "Accord", "X5", "F-150", "Corvette")
        private val colors = arrayOf("Черный", "Белый", "Синий", "Красный", "Серый")
        private val enginePowers = arrayOf(150, 200, 250, 300, 350, 400, 450)
        private val typeOfDrives = arrayOf("FWD", "RWD", "AWD")
        private val weights = arrayOf(1600, 1800, 2000, 2200, 2400)
        private val payloadCapacities = intArrayOf(1000, 1500, 2000, 2500)
        private val doors = intArrayOf(2, 3)
        private val seatingCapacities = intArrayOf(2, 3, 4, 5)

        fun createRandomCar(): Car {
            val mark = marks.random()
            val model = models.random()
            val year = (1990..2024).random()
            val color = colors.random()
            val enginePower = enginePowers.random()
            val type = Random.nextInt(4)

            return when (type) {
                0 -> Coupe(mark, model, year, color, enginePower, doors.random())
                1 -> Crossover(
                    mark,
                    model,
                    year,
                    color,
                    enginePower,
                    typeOfDrives.random(),
                    weights.random()
                )

                2 -> Sedan(mark, model, year, color, enginePower, seatingCapacities.random())
                else -> Truck(mark, model, year, color, enginePower, payloadCapacities.random())
            }
        }

        fun race(car1: Car, car2: Car): Car {
            println("Гонка между ${car1.mark} ${car1.model} и ${car2.mark} ${car2.model}")

            val winner = if (car1.year > car2.year) car1 else car2
            println("Победитель: ${winner.mark} ${winner.model}")

            return winner
        }
    }
}