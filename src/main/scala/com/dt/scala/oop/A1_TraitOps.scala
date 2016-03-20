package com.dt.scala.oop

/**
  * Created by Administrator on 2016/3/20.
  */

//trait类似于java里面的接口interface，但其可以有默认的实现，通过extends关键字进行实现
//多的接口 用with进行连接

trait Logger2 {
  def log(log: String)
}

trait Logger3{
  def log(log:String){}
}

trait Consolelogger extends Logger3{
  override def log(log: String): Unit = {
    println("Consolelogger:"+log)
  }
}
class DefaultLogger extends Logger2{
  override def log(log: String): Unit = {
    println("default log is "+log)
  }
}

class SimpleLogger extends Logger3{
  def desc={
    println("simpleLogger....")
  }
}




object A1_TraitOps {

  def main(args: Array[String]) {
    val logger2 =new DefaultLogger
    logger2.log("hello world !")


    val logger3=new SimpleLogger with Consolelogger
    logger3.log("hi")
    logger3.desc
  }
}
