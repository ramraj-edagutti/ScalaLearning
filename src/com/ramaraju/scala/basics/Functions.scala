package com.ramaraju.scala.basics

object Functions extends App {

  println((5 * 10)) //calling annonymous function directly; function with no name
  val addOne = (x: Int) => x + 1
  println(addOne(4))

  val add = (x: Int, y: Int) => x + y
  println(add(5, 5))

  val getSomeValue = () => 100000
  println(getSomeValue())

  val saySomething = () => "Hello, Mr.Function with no parameters"
  println(saySomething())

}
