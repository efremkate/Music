package ru.netology

fun main() {
    val itemPrice = 100.0
    val itemCount = 200.0
    val discount = 100.0
    val discountMin = 1_000.0
    val discountMax = 10_000.0
    val isMeloman = true

    val totalPrice = itemPrice * itemCount
    var result =
        if (totalPrice > discountMax)
            totalPrice - (totalPrice / 100 * 5)
        else
            if (totalPrice > discountMin)
                totalPrice - discount
            else
                totalPrice

    if (isMeloman)
        result = result * 0.99

    println("Итоговая стоимость " + result)
}