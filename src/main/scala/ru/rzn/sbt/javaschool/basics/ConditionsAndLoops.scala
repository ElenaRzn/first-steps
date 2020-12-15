package ru.rzn.sbt.javaschool.basics

/**
 * Комментарии:
 * object ... extends App - класс, который реализует main метод и является точкой входа в программу.
 * def methodName(param1: Int, param2: String): Int = { //body} - синтаксис определения метода в скала.
 * TODO переделать метод ifExample с java-style на scala-style
 */
object ConditionsAndLoops extends App {

  println(ifExample(3))
  println(ifExample(42))
  println(ifExample(10))


  println(whileExample(100))

  println(forExample(List(1,2,3,4,5)))

  // FIXME Скорее, исправь меня!
  def ifExample(a: Int): String = {
    var result = ""
    if (a > 10) {
      result = "Less than 10"
    } else if (a > 10) {
      result = "Greater than 0"
    } else {
     result = "It is 10!"
    }

    return result
  }

  //FIXME со мной что-то не так!
  def whileExample(n: Int): String = {
    var a = n
    var result = ""
    while(a > 10) {
      result = result + a
      if (a > 1) result = result + ","
      a = a - 1
    }
    return result
  }

  // FIXME используй yield
  def forExample(xs: List[Int]): List[Int] = {
    var result = List[Int]()
    for(a <- xs) {
      result = result :+ (a+1)
    }
    return result
  }


}
