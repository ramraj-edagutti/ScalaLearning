package com.ramaraju.scala.multiparamlist

/**
 * This implicit technique works really when you need to refer to a shared
 * resource several times, and you want to keep your code clean.
 *
 * Examples:
 * 1. If you need to refer DB connection several times
 * 2. When you need an "execution context" during multi-threaded coding
 */
object ImplicitParamater extends App {

  def printIfTrue(a: Int)(implicit b: Boolean) = if(b) println(a)

  printIfTrue(100)(true)
  //printIfTrue(101) without 2nd param or implicit varibale it won't compile
  implicit var isTrue: Boolean = true
  printIfTrue(101) //Now it works as we have deined implict variable
}
