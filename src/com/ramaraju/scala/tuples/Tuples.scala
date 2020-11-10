package com.ramaraju.scala.tuples

/**
 * A tuple is a value with fixed number of elements, each with distinct type.
 * Tuples are immutable.
 *
 * Tuples are especially handy for returning multiple vlaues from a method.
 *
 * Scala uses a series of classes: Tuple1, Tuple2, etc... through Tuple22.
 * Each class has as many paratemers as it has elements.
 */
object Tuples extends App {

  val ingredients = ("Full Cream Milk", "Brown Sugar", 1, 100, true) //Tuple4[String, String, Int, Boolean]

  println(s"Milk: ${ingredients._1}")
  println(s"Milk Quantity in litres: ${ingredients._3}")
  println(s"Sugar: ${ingredients._2}")
  println(s"Sugar Quantity in Kgs: ${ingredients._4}")
  println(s"Blend it: ${ingredients._5}")

  //pattern matching using tuples
  val (milk, sugar, milkQuantity, sugarQuantity, isBlend) = ingredients;
  //println(s"Milk: $milk, Milk quantity: $milkQuantity")
  //println(s"Sugar: $sugar, Sugar quantity: $sugarQuantity")
  //println(s"Blend milk and sugar: $isBlend")

  /**
   * Case class is best used in this case as it has named parameters which improves
   * readability
   */
  val planets = List(
    ("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6),
    ("Mars", 227.9), ("Jupiter", 778.3)
  )
  planets.foreach {
    case ("Earth", distance) =>
      println(s"Our planet is $distance million kilometers from the Sun.")
    case ("Mars", distance) =>
      println(s"Mars planets is $distance million kilometers from the Sun.")
    case _ =>
  }

  val numPairs = List((2, 5), (3, -7), (20, 36))
  for ((a ,b) <- numPairs) {
    println(a * b)
  }
}
