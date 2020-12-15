package ru.rzn.sbt.javaschool.basics

/**
 * /TODO
 * 1. Добавьте в класс [[ru.rzn.sbt.javaschool.basics.Employee]] дополнительное поле  hireDate типо [[java.time.LocalDate]]
 * 2. Создайте для класса Employee класс-компаньон с методом create, который будет создавать объект класса Employee
 * с полем hireDate - текущей датой (LocalDate.now).
 * Каклой шаблон проектирования при этом используется?
 * 3. Как запретить создание объекта напрямую, но разрешить через класс-компаньон?
 */
object ObjectExample extends App {

  //object - singleton
  val a = MyObject
  val b = MyObject

  // аналог equals
  println(a == b)
  // сравнение по ссылке
  println(a eq b)

  //статических классов и методов нет!
  println(MyObject.foo(5, 10))

}

object MyObject {
  def foo(x: Int, y: Int): Int = x+y
}
