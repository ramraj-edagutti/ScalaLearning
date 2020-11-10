package com.ramaraju.scala.multiparamlist

object ResourceControl {

  /**
   * This can be used pass Db connection or File resource, and do operations,
   * and then automatically close the connection.
   *
   * @param param DB connection or File handler
   * @param f Function which take connection as an argument and do some operation
   * @tparam A Connection object
   * @tparam B Output from function "f"
   * @return returns B
   */
  def using[A <: {def close(): Unit}, B](param: A)(f: A => B): B = {
    try {
      f(param)
    } finally {
      param.close()
    }
  }

  //Example usage of above multi param function
  /*def saveStock(stock: Stock): Unit = {
    using(MongoFactory.getConnection()) { conn =>
          MongoFactory.getCollection(conn).save(buildMongoDbObject(stock))
    }
  }*/
}
