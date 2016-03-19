package com.dt.scala.hello

;

/**
  * Created by apple on 15/11/14.
  */
object MapOps {

  def main(args: Array[String]) {
    val ages = Map("Rokey" -> 27, "Spark" -> 25)

    for ((k, v) <- ages) {
      println("key is " + k + " value is " + v)
    }
    println("======")

    for ((k, _) <- ages) {
      print("Key is " + k)
    }
  }
}
