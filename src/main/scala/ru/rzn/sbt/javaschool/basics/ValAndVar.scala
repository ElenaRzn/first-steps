package ru.rzn.sbt.javaschool.basics

object ValAndVar extends App {
  // 1. Аналог final в Java - нельзя поменять.
  val a = 100
  // a = 50
  val b = 400
  // 2. Scala - язык со статической типизацией - нельзя просто так взять и поменять тип.
  // b = "Hello"

  // 3. Если  вам хочется использовать var, возможно, вы делаете что-то не то.
  var x = "JavaSchool"
  x = "JavaSchool is cool!"

  // 4. Можно задать тип явно
  val f: Double = 400
  // в чем отличие?
  val r = 400 :Double

  // 5. Какого типа будет переменная question?
  val number = 100
  val str = "Hello"
  val question = number + ", " + str + "?"

  // 6. lazy val - объясните результат, который будет выведен на консоль.
  lazy val lazyVal = {println("Hello"); 5}
  println(lazyVal)
  println(lazyVal)
  println(lazyVal)

  // 7. Фокус с неопределенным значением
  lazy val wantToUse = 20 + defineLate
  lazy val defineLate = 19
  println(wantToUse)


  // 8. Scala дает нам второй шанс
  var division = 0
  lazy val quotient = 20 / division
  try {
    println(quotient)
  } catch {
    case e: ArithmeticException => println(e.getMessage)
  }
  division = 2
  println(quotient)
}
