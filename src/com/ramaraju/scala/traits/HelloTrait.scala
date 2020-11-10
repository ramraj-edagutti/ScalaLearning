package com.ramaraju.scala.traits

/**
 * Traits are abstract data types containing certain fields and methods.
 *
 * Traits in Scala are just like Java 8's Interfaces.
 */
trait HelloTrait {
  def sayHello(name: String): Unit

  def saidHello(name: String): Unit =
    println("Howdy, HelloTrait!")
}

class ClassExtendHelloTrait(prefix: String, suffix: String) extends HelloTrait {
  override def sayHello(name: String): Unit = {
    println(prefix + name + suffix)
  }
}

object ClassExtendHelloTrait extends App {
  val classExtendHelloTrait = new ClassExtendHelloTrait("How are you, ", " Edagutti!")
  classExtendHelloTrait.sayHello("Ramaraju")
}

