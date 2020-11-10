package com.ramaraju.scala.traits

trait Iterator[T] {
  def hasNext: Boolean
  def next(): T
}

class IntIterator(toInt: Int) extends Iterator[Int] {
  private var current = 0
  override def hasNext: Boolean = current < toInt

  override def next(): Int = {
    if(hasNext) {
      val t = current
      current += 1
      t
    } else 0
  }
}

object IntIterator extends App {
  val iterator = new IntIterator(10)
  while (iterator.hasNext) {
    println(iterator.next)
  }
}