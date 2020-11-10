package com.ramaraju.scala.basics

/**
 * Scala Type Heirarchy:
 *
 * Any -> AnyVal, Any -> AnyRef
 * AnyVal -> Double, Float, Long, Int, Short, Byte, Unit, Boolean, Char -> Nothing
 * AnyRef (java.lang.Object) ->List, Option, CustomClass(your own class)
 *
 * Any is supertype of all objects in Scala. It defines uiversal methods such as
 * equals, hashcode, and toString.
 *
 * Unit is a value type which carries no meaning information, there is exactly one
 * instance of Unit, and it can be declared literally like so: ()
 *
 * Nothing is sub type of all values types, and it does not have any value.
 *
 * Null is subtype of all ref types, and it has single value identifed by the keyword literal "null".
 * Null is provided for interoperability with JVM languages and should not be used in scala.
 */
object DataTypes extends App {

  //Different data type objects added into an list of items.
  val list: List[Any] = List(
    "A String",
    1000,
    123.45,
    'E',
    false,
    () => "an anonymous function returning a string"
  )

  list.foreach(item => println(item))

  // Type casting
  val long: Long = 100000222
  val longer: Long = 10000022222L
  val castLongToFloat: Float = longer
  println(castLongToFloat)
  //Casting is unidirectional, below code will not compile
  //val castFloatBackToLong: Long = castLongToFloat
}
