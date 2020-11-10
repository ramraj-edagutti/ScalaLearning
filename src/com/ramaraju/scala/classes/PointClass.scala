package com.ramaraju.scala.classes

class PointClass(var x: Int, var y: Int) {

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx; //No need of semicolor, but just trying...
    y = y + dy;
  }

  override def toString: String = s"($x, $y)"
}

class PointClassWithDefaultValues(var x: Int = 0, var y: Int = 0) {
  override def toString: String = s"($x, $y)"
}

object PointClassTest extends App {
  val pointClass = new PointClass(2, 3)
  println(pointClass.x)
  println(pointClass)
  pointClass.move(3, 2)
  println(pointClass)

  val defaultValues = new PointClassWithDefaultValues()
  val setValues = new PointClassWithDefaultValues(y = 9)
  println(defaultValues)
  println(setValues)
}
