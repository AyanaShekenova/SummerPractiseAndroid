package ru.itis.summerpractise.hw1.build

import ru.itis.summerpractise.hw1.cars.Car

fun main() {
    println("Введите количество машин для гонки:")
    val numberOfCars = readln().toIntOrNull()

    if (numberOfCars == null || numberOfCars <= 0) {
        println("Некорректное количество машин. Пожалуйста, введите положительное число.")
        return
    }

    val cars = List(numberOfCars) { CarFactory.createRandomCar() }.toMutableList()

    while (cars.size > 1) {
        val pairs = cars.shuffled().chunked(2)
        val winners = mutableListOf<Car>()

        for (pair in pairs) {
            when {
                pair.size == 2 -> {
                    val winner = CarFactory.race(pair[0], pair[1])
                    winners.add(winner)
                }
                pair.size == 1 -> {
                    winners.add(pair[0])
                }
            }
        }
        println("--- Победители этого раунда ---")
        winners.forEachIndexed { index, car ->
            println("${index + 1}: ${car.mark} ${car.model}")
        }
        println("--- Конец раунда ---")
        cars.clear()
        cars.addAll(winners)
    }

    println("Победитель: ${cars.first().mark} ${cars.first().model}")
}

fun race(car1: Car, car2: Car): Car {
    println("Гонка между ${car1.mark} ${car1.model} и ${car2.mark} ${car2.model}")

    val winner = if (car1.year > car2.year) car1 else car2
    println("Победитель: ${winner.mark} ${winner.model}")

    return winner
}