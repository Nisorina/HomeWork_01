package ru.otus.nisorina.homework_01
/* Задание #2
 - Реализуйте свой дата класс Person
 - Добавьте в него следующие проперти name:String, surname:String, age:Int
 - Реализуйте экстеншен функцию на список типизированный Person, которая сортирует список по возрасту в порядке убывания
 - Реализуйте экстеншен функцию на список типизированный Person, которая сортирует список в алфавитном порядке по имени.
   Если имена одинаковые, то учитывается фамилия */

class Person(val surname: String, val name: String, val age: Int) {
    override fun toString(): String {
        return "$name $surname ($age)"
    }
}

fun List<Person>.sortByAge() = sortedByDescending { it.age }
fun List<Person>.sortByName() = sortedBy { it.surname }.sortedBy { it.name }

fun main() {
    val persons = listOf(
        Person("Иванов", "Иван", 35),
        Person("Сергеев", "Сергей", 21),
        Person("Петров", "Петр", 38),
        Person("Алехин", "Иван", 15),
        Person("Булкин", "Сергей", 45),
    )
    println("По возрасту:")
    persons.sortByAge().forEach { println(it) }
    println("\nПо имени:")
    persons.sortByName().forEach { println(it) }
}

