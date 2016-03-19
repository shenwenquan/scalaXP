package com.dt.scala.hello

import java.io.{File, PrintWriter}

import scala.io.Source


/**
  * Created by apple on 15/11/14.
  */
object FileOps {

  def main(args: Array[String]) {
    val file = Source.fromFile("src/com/dt/scala/hello/FileOps.scala")
    for (line <- file.getLines()) {
      println(line)
    }
    file.close

    println("===================")

    val net = Source.fromURL("http://www.apache.org")
    net.foreach(print(_))

    net.close

    val wr = new PrintWriter(new File("scala.txt"))
    for (i <- 1.to(10)) wr.println(i)

    wr.close()
  }
}
