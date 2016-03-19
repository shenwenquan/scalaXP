package com.dt.scala.hello

;

/**
  * Created by apple on 15/11/14.
  */
object ArrayOperation {

  def main(args: Array[String]) {

    val array = Array(9, 2, 9, 4, 5)
    for (i <- 0 until array.length) {
      println(array(i))
    }



    println("====================")

    for (elem <- array) {
      println(elem)
    }
  }

}
