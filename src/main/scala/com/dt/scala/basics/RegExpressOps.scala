package com.dt.scala.basics

/**
  * Created by apple on 15/11/15.
  */
object RegExpressOps {

  def main(args: Array[String]) {

    val regex = """([0-9]+) ([a-z]+)""".r
    val numPattern = "[0-9]+".r
    val numberPattern ="""\s+[0-9]+\s+""".r

    for (ms <- numPattern.findAllIn("99463 Scala, 333 spark")) println(ms)

    println(numberPattern.findFirstIn("99ss java, 222 hadoop"))


    val numitemPattern ="""([0-9]+) ([a-z]+)""".r
    val numitemPattern(num, item) = "99 hadoop"

    val line = "999338 spark"

    line match {
      case numitemPattern(num, blog) => println(num + "\t" + blog)
      case _ => println("Ohh...")
    }
  }
}
