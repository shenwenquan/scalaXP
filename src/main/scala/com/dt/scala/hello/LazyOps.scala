package com.dt.scala.hello

import scala.io.Source

/**
  * Created by apple on 15/11/14.
  */
object LazyOps {

  def main(args: Array[String]) {
    //延弛加载
    lazy val file = Source.fromFile("aa.txt")

//    println(file)
  }
}
