package com.ramaraju.scala.basics

/**
 * Main methods can be defined in object only as scala generates java compatible static methods
 * from methods which are defined in Object.
 *
 * Mian method defined in Scala class can't generate java compatible static class hence it is not an
 * entry point for JVM to execute the class.
 *
 * In scala, extneding App trait is clearner way to use define main entry point for execution.
 */
object ExecuteScalaUsingAppTrait extends App {

  println("Executing scala code using object with App Trait")

  if (args.length == 1)
    println(s"Hello, ${args(0)}")
  else
    println("Hello, World!")
}
