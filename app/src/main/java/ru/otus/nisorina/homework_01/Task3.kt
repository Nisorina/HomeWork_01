package ru.otus.nisorina.homework_01

import java.lang.Thread.sleep

/* Задание #3
 - Реализуйте функцию высшего порядка, которая вычисляет время выполнения функции-аргумента
   и возвращает результат в миллисекундах */

fun calculateTimeMs(action: () -> Unit): Long {
    val start = System.currentTimeMillis()
    action()
    return System.currentTimeMillis() - start
}

fun main() {
    val time = calculateTimeMs{ sleep(200) }
    println("Время выполнения: $time мс")
}