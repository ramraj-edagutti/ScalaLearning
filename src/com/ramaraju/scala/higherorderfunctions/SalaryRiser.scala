package com.ramaraju.scala.higherorderfunctions

object SalaryRiserTest extends App {

  val salaries = Seq(10000, 30000, 50000)
  val doubleSalary = (x: Int) => x * 2
  val newSalaries = salaries.map(doubleSalary)//map is a higher order function
  println(newSalaries)
  println(salaries.map(x => x * 2))
  //Scala compiler already knows the type of the parameters (a single Int),
  // You just need to provide the right side of the function.
  println(salaries.map(_ * 2))

  val salariesDouble: List[Double] = List(200000, 20000, 2000)
  println(BetterSalaryRiser.smallPromotion(salariesDouble))
  println(BetterSalaryRiser.greatPromotion(salariesDouble))
  println(BetterSalaryRiser.hugePromotion(salariesDouble))

}

object SalaryRiser {
  def smallPromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * 1.1)

  def greatPromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * math.log(salary))

  def hugePromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * salary)
}

object BetterSalaryRiser {
  private def promotion(salaries: List[Double], promotionFunction: Double => Double): List[Double] =
    salaries.map(promotionFunction)

  def smallPromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * 1.1)

  def greatPromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * math.log(salary))

  def hugePromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * salary)
}


