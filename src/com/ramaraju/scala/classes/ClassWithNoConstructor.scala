package com.ramaraju.scala.classes

class ClassWithNoConstructor {
  def sayHello(): Unit = println("Hello, ClassWithNoConstructor!")
}

object ClassWithNoConstructor extends App {
  val classWithNoConstructor = new ClassWithNoConstructor()
  classWithNoConstructor.sayHello()
}