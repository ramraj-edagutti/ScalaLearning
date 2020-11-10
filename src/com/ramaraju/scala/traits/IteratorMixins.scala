package com.ramaraju.scala.traits

abstract class AbsIterator {
  type T
  def hasNext: Boolean
  def next(): T
}

class StringIterator(str: String) extends AbsIterator {
  type T = Char
  private var i = 0
  def hasNext: Boolean = i < str.length
  def next() = {
    val ch = str.charAt(i) //antoher valid syntax "str charAt i"
    i += 1
    ch
  }
}

//Traits does not have to extends to abstract class members
trait RichIterator extends AbsIterator {
  //Higher order function/method: takes another function as an argument or returns a function
  def foreach(func: T => Unit) = while (hasNext) func(next())
}

class RichStringIterator extends StringIterator("Scala") with RichIterator

object IteratorMixins extends App {
  val richStringIterator = new RichStringIterator
  richStringIterator.foreach(println)
}


