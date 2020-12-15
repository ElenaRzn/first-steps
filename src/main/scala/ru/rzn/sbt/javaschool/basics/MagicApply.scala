package ru.rzn.sbt.javaschool.basics

/**
 * TODO
 * 1. проведите рефакторинг класса [[ru.rzn.sbt.javaschool.basics.Employee]], переименуйте методы create в apply.
 * 2. попробуйте создать объект case- класса [[ru.rzn.sbt.javaschool.basics.Department]] без использования new; с использоыанием apply.
 * case-классы автоматически генерируют класс компаньон с методом apply. Стало меньше магии?:)
 */
object MagicApply extends App {
  val foo = new Foo(10)
  println(foo.apply(10))
  //Обратите внимание - метод можно вызвать без имени!
  println(foo(10))

}

class Foo(x: Int) {
  def apply(y: Int) = x + y
}
