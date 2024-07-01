package ru.itis.summerpractise.hw1.cars

open class Car (
    val mark: String,
    val model: String,
    val year: Int,
    val color: String,
    val enginePower: Int
) {
    open fun printInfoOfCar() {
        println("Марка: $mark")
        println("Модель: $model")
        println("Год выпуска: $year")
        println("Цвет: $color")
        println("Мощность двигателя: $enginePower кВт")
    }
}