package com.ramaraju.scala.basics

object Methods extends App {

  def add(x: Int, y: Int): Int = x + y
  println(add(3, 7))

  def addThenMultiply(x: Int, y: Int) (multiplier: Int) = (x + y) * multiplier
  println(addThenMultiply(2,3)(5))

  def name: String = System.getProperty("user.name")
  println("Hello, "+ name + "!")
  println(s"Hi, ${name}!")

  def getSquareString(x: Int): String = {
    val square = x * x
    square.toString //last statement in a method always returns without return keyword.
  }
  println(getSquareString(1024))
}
