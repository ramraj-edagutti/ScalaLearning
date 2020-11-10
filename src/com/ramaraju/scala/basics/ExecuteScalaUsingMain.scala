package com.ramaraju.scala.basics

/**
 * The main method is the entry point of a Scala program. The Java Virtual Machine
 * requires a main method, named "main", that takes one argument: an array of strings.
 *
 * Main method to execute scala code can only be defined in scala object.
 */
object ExecuteScalaUsingMain {

  def main(args: Array[String]): Unit = {
    println("Executing from scala object with Main method")

    if (args.length == 1)
      println("Hello, "+ args(0))
    else
      println("Hello, World!")
  }

}
