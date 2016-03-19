package com.dt.scala.basics

import scala.io.Source

/**
  *
  *
  * 本地函数和作为一等公民的函数详解
  * Created by apple on 15/11/21.
  */
object FunctionOps {

  def main(args: Array[String]) {
    val width = args(0).toInt
    for (arg <- args.drop(1))
      processData(arg, width)

    var increase = (x: Int) => x + 1
    println(increase(10))

    increase = (x: Int) => x + 1000
    println(increase(10))

    val someNums = List(-11, -10, -5, 0, 5, 10)

    someNums.foreach((f: Int) => print(f + " "))
    println

    someNums.filter((x: Int) => x > 0).foreach((x: Int) => print(x + " "))
    println

    someNums.filter(x => x > 5).foreach(y => print(y + " "))
    println

    someNums.filter(_ > -10).foreach(print(_))
    println

    println("=============")
    val f = (_: Int) + (_: Int) / (_: Int)
    println(f(5, 12, 3))


  }

  def processData(fileName: String, width: Int): Unit = {
    def procLine(line: String): Unit = {
      if (line.length > width)
        println(fileName + ": " + line)
    }
    val source = Source.fromFile(fileName)
    for (line <- source.getLines())
      procLine(line)
  }
}
