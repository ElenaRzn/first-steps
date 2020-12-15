package ru.rzn.sbt.javaschool.basics

/**
 * Рассмотрите хзадание значений по умолчанию и именованых параметров.
 * Почему не работает вызов метода processNumbers на строчке 17? Как его починить?
 */
object NamedDefaultArgs extends App {
  def add(x:Int, y:Int = 10): Int = x + y

  println(add(4, 3)) // 7
  println(add(x = 4, y = 3)) // 7
  println(add(4)) // 14


  def processNumbers(b: Boolean = true, x: Int, y: Int) = if (b) x else y

  //FIXME по умолчанию же b = true - в чем дело?
  //processNumbers(4, 5) //10


}
