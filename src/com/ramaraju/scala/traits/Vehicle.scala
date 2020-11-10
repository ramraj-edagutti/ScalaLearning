package com.ramaraju.scala.traits

import scala.collection.mutable.ArrayBuffer

trait Vehicle {
  val name: String
}

class Truck(val name: String) extends Vehicle
class Bus(val name: String) extends Vehicle
class Car(val name: String) extends Vehicle

object Vehicle extends App {
  val truck = new Truck("Cold Goods Truck")
  val bus = new Bus("Sleeper Bus")
  val car = new Car("JLR Car")

  val vehicles = ArrayBuffer.empty[Vehicle]
  vehicles.append(truck)
  vehicles.append(bus)
  vehicles.append(car)

  vehicles.foreach(vehicle => println(vehicle.name))
}
