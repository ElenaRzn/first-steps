package ru.rzn.sbt.javaschool.basics


/**
 * TODO
 * 1. Создайте в классе два строковых поля - firstName и lastName;
 * полю firstName обеспечьте доступ на чтение,  lastName - на чтение и запись.
 * Раскомментируйте класс Main. Проверьте.
 * 2. Добасьте поле title так, чтобы не сломался код класса Main.
 * 3. добавьте в класс метод fullName, который возвращает строку, состоящую из firstName и lastName через пробел.
 * 4. Создайте rклсс Manager, наследника класса Employee, добавив в него информацию об отделе (объект класса Department)
 * 5. Переопределите метод fullName, чтобы он также возвращал информацию об отеле.
 */
class Employee {

}


object Main extends App {
//  val alice = new Employee("Alice", "Grapes")
//  println(alice.firstName)
//  println(alice.lastName)

//  alice.lastName = "Cherry"
//  println(alice.firstName)
//  println(alice.lastName)

}

case class Department(name: String)
