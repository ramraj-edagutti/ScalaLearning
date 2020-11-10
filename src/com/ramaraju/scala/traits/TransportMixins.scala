package com.ramaraju.scala.traits

/**
 * Class can extend only one class but can extends many mixins - traits which extends class
 */
abstract class Transport {
  val message: String
}

class AirTransport extends Transport {
  val message = "I am an air transport, and I am ready to send you to your destination FASTER!"
}

class WaterTransport extends Transport {
  override val message: String = "I am water transport, and I can cruise you to your destination PLEASANTLY!"
}

class RoadTransport extends Transport {
  val message = "I am road transport, and I am ready to GO!"
}

//This is mixin: trait extends abstract class
trait TravelAnnouncement extends Transport {
  def makeTravelAnnouncement = s"Attention! $message"
}

//The mixins and the super class may have the same super type.
class Airport extends AirTransport with TravelAnnouncement
class SeaPort extends WaterTransport with TravelAnnouncement
class BusStation extends RoadTransport with TravelAnnouncement

object Transport extends App {
  val airport = new Airport
  println(airport.makeTravelAnnouncement)
  val seaPort = new SeaPort
  println(seaPort.makeTravelAnnouncement)
  val busStation = new BusStation
  println(busStation.makeTravelAnnouncement)
}



