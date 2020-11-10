package com.ramaraju.scala.classes

/**
 * Objects are single instances of their own definitions.
 */
object IdFactory {
  private var counter = 0
  def create(): Int = {
    counter += 1
    counter
  }
}

object IdFactoryTest extends App {

  val newId = IdFactory.create()
  println(newId)

  val newerId: Int = IdFactory.create()
  println(newerId)
}