package com.ramaraju.scala.higherorderfunctions

object FunctionReturnsFunction extends App {

  def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
    val scheme = if (ssl) "https://" else "http://"
    (endpoint: String, query: String) => s"$scheme$domainName/$endpoint$query"
  }

  val domainName = "www.ramaraju.com"
  def getHTTPsUrl = urlBuilder(ssl=true, domainName)
  def getHTTPUrl = urlBuilder(ssl=false, domainName)
  val endpoint = "users"
  val query = "id=1000"
  val httpsUrl = getHTTPsUrl(endpoint, query)
  val httpUrl = getHTTPUrl(endpoint, query)
  println(httpsUrl)
  println(httpUrl)

}
