package ru.rzn.sbt.javaschool.basics

/**
 * 1. Имеем метод, который принимает параметры типа Any и возвращает значение типа Any. Вроде бы все хорошо, все работает.
 * 2. Определяем метод getNextChar(c: Char). Пытаемся сделать вызов как на строчке 17. Но получаем ошибку компиляции.  Почему?
 * 3.
 */
object ParameterizedTypesOnMethod extends App {
//  1. "Универсальный метод".
  def describe(d: Boolean, x: Any, y: Any): Any = if(d) x else y

  println(describe(true, "A", "B"))
  println(describe(false, 3, 10))
  println(describe(true, 'c', 'd'))

//   2. Упс... Hе работает?
  def getNextChar(c: Char) = (c + 1).toChar
//  println(getNextChar(describe(true, 'c', 'f')))

//  3. Workaround. Но мы и так используем Parameterized Type - [Char]...
  var result = describe(true, 'c', 'd')
  if(result.isInstanceOf[Char]) {
    var charResult = result.asInstanceOf[Char]
    println(getNextChar(charResult))
  }

//  4. Переделать метод describe, добавив в него Parameterized Type - [Char]
//  def describe[T](b:Boolean, x:T, y:T):T = {
//    FIXME добавь реализацию. Убери метод на строчке 10. Для проверки раскомментируй строчку 18. Профит.
//  }


}
