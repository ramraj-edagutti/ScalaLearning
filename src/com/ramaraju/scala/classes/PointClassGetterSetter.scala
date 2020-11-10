package com.ramaraju.scala.classes

class PointClassGetterSetter {

  private var _x = 0
  private var _y = 0
  private var bound = 100

  def x = _x
  def x_=(newValue: Int): Unit = {
    if(newValue < bound) _x = newValue else printWarning
  }

  def y = _y
  def y_=(newValue: Int): Unit = {
    if(newValue < bound && newValue > 0) _y = newValue else printWarning
  }

  //Java style getter setters
  def getBound: Int = bound
  def setBound(newValue: Int): Unit = {
    bound = newValue
  }

  private def printWarning = println("WARNING:Out of bounds")

  //override def toString: String = s"(${x}, ${y})" This is also valid
  override def toString: String = s"($x, $y)"

}
//Companion object
object PointClassGetterSetter extends App {
  val pointClassGetterSetter = new PointClassGetterSetter

  println(s"Initial bound value ${pointClassGetterSetter.getBound}")
  pointClassGetterSetter.setBound(20)
  println(s"Changed bound value ${pointClassGetterSetter.getBound}")

  pointClassGetterSetter.x = 50
  pointClassGetterSetter.y = 10
  println(pointClassGetterSetter)
  pointClassGetterSetter.y = 101

}
