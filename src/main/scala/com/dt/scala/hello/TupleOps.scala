package com.dt.scala.hello

;

/**
  * Created by apple on 15/11/14.
  */
object TupleOps {

  def main(args: Array[String]) {
    val triple = (100, "Scala", "Spark")
    //tuple的索引是从1开始的
    println(triple._1)
    println(triple._2)
    println(triple._3)

    print(triple.getClass)

  }
}
