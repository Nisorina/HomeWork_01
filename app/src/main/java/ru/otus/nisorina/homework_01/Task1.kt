package ru.otus.nisorina.homework_01

fun main() {
    val list = (0..99).toList()
    val sum = list.filter { it % 2 == 0 }
        .slice(10..20)
        .map { it + 1 }
        .sum()
    println(sum)
}


