package ru.rzn.sbt.javaschool.basics

/**
 * 1. Реализуйте метод factorial, который возвращает факториал числа.
 * 2. Поставьте аннотацию @tailrec над этим методом. Попробуйте запустить ошибку? Есть ли ошибки?
 * 3. Реализуйте этот меотд factorial, используя хвостовую рекурсию. Вам понадобится вспомогательный метод fact.
 * 4. Обязательна ли аннотация @tailrec?
 * 5. Какой недостаток вы видите в подобной реализации?
 */
object RecursionMethods extends App {
  println(factorial(5))
  println(factorial(100))
  println(factorial(100500))

  def factorial(n: BigInt):BigInt = {
    //FIXME меня нужно реализовать...
    1
  }

  def fact(n: BigInt, acc: BigInt): BigInt = {
    //FIXME я вспомогательный метод для реализации хвостовой рекурсии.
    1
  }

}
