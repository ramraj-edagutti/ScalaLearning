package com.ramaraju.scala.multiparamlist

/**
 * When a method is called with fewer number of parameter lists, then this will
 * yield a function taking the missing parameter lists as its arguments.
 */
object PartialApplication extends App {

  val numbers = List(1,2,3,4,5,6,7,8,9,10)
  val numberFunc = numbers.foldLeft(List[Int]()) _

  val squares = numberFunc((xs, x) => xs :+ x*x )
  println(squares)

  val cubes = numberFunc((xs, x) => xs :+ x*x*x )
  println(cubes)
}
