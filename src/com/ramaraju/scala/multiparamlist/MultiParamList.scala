package com.ramaraju.scala.multiparamlist

/**
 * Scala lets you create functions that have multiple input parameter groups, like this
 *    def foo(a: Int, b: String)(c: Double)
 *
 * Uses or use cases:
 * 1. You can write custom or your own control structions like custom while loops etc
 * 2. Custom control structures in turn can help write your own DSLs
 * 3. They let you have both implicit and non-implicit parameters
 * 4. They facilitate type inference
 * 5. A parameter in one group can use a parameter from a previous group as a default value
 */
object MultiParamList extends App {

  //Scala bulitin collections method with take multiple param lists or groups
  val numbers = List(1,2,3,4,5,6,7,8,9,10)
  val res = numbers.foldLeft(0)((m ,n) => m + n)
  println(res) //sum of all list elements: 55

  //Very basic example
  def sum(a: Int)(b: Int)(c:Int): Int = a + b +c
  println(sum(1)(2)(7))//yields 10

  //Custom while loop
  def myWhile(condition: => Boolean)(codeBlock: => Unit) = {
    while(condition) {
      codeBlock
    }
  }
  var i = 0
  myWhile(i < 5){
    println(i)
    i += 1
  }

  //With three parameter groups
  def ifBothTrue3(test1: => Boolean)(test2: => Boolean)(codeBlock: => Unit): Unit = {
    if (test1 && test2) {
      codeBlock
    }
  }
  //With four parameter groups
  def ifBothTrue4(test1: => Boolean)(test2: => Boolean)(codeBlock1: => Unit)(codeBlock2: => Unit): Unit = {
    if (test1 && test2) {
      codeBlock1
    } else {
      codeBlock2
    }
  }
  val age = 37
  val numAccidents = 1
  ifBothTrue3(age > 21)(numAccidents == 0) {println("You are eligible for DISCOUNT! from ifBothTrue3")}
  ifBothTrue3(age > 20)(numAccidents < 2) (println("Your DISCOUNT has been reduced due to accidents!"))
  ifBothTrue4(age > 21)(numAccidents == 0) {
    println("You are eligible for DISCOUNT! from ifBothTrue4")
  } {
    println("No Discount!")
  }
  ifBothTrue4(age > 20)(numAccidents > 4) (println("you DISCOUNT is just 5%")) (println("Your DISCOUNT is 25%"))

}
