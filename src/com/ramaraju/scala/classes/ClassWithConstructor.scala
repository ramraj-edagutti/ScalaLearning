package com.ramaraju.scala.classes

/**
 * Primary constructor with val or var are public.
 * Parameters without val or var are private values, visible only within the class.
 */
class ClassWithConstructor(prefix: String, suffix: String) {
  def sayHello(name: String): Unit = {
    println(prefix + name + suffix)
  }

  def sayHello(): Unit =
    println("Hello, ClassWithConstructor!")
}

object ClassWithConstructor extends App {
  val sayHello = new ClassWithConstructor("Hello ", " How are you!")
  sayHello.sayHello("Ramraj")
  sayHello.sayHello()
}