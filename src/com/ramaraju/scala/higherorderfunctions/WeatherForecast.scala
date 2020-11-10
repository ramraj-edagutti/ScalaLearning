package com.ramaraju.scala.higherorderfunctions

object WeatherForecast extends App {
  val weeklyWeatherForecast = new WeeklyWeatherForecast(Seq(24.5, 30.9, 35, 16))
  println(weeklyWeatherForecast.forecastInFahrenheit)
}

//Coercing methods into functions
case class WeeklyWeatherForecast(temperatures: Seq[Double]) {
  private def convertCtoF(temp: Double) = temp * 1.8 + 32

  //convertCtoF will be converted to x => convertCtoF(x) function
  def forecastInFahrenheit: Seq[Double] = temperatures.map(convertCtoF)
}