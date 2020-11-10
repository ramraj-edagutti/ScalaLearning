package com.ramaraju.scala.classes

/**
 * By default, case classes are immutable, and they are compared by value.
 *
 * Normal classes are compared by reference unlike case classes.
 *
 * Case classes are useful for patter matching.
 *
 * @param x
 * @param y
 */
case class PointCaseClass(x: Int, y: Int)

object PointCaseClass extends App {
  //Point case class
  val point = PointCaseClass(1, 2)
  val anotherPoint = PointCaseClass(1, 2)
  val yetAnotherPoint = PointCaseClass(2, 3)

  if (point == anotherPoint)
    println(s"${point} and ${anotherPoint} are the same.")
  else
    println(s"${point} and ${anotherPoint} are different.")

  if (point == yetAnotherPoint)
    println(s"${point} and ${yetAnotherPoint} are the same.")
  else
    println(s"${point} and ${yetAnotherPoint} are different.")
}