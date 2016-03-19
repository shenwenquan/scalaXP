package com.dt.scala.hello

;

/**
  *
  * 函数定义、流程控制、异常处理
  * Created by apple on 15/11/14.
  */
object ScalaBasic {

  def doWhile(): Unit = {
    var line = ""
    do {
      line = readLine();1
      println("line is :" + line)
    } while (line != "")
  }

  def looper(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {

      //了解 关键字 var 和 val 的区别
      // var 变量
      // val 不变量，final
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  def main(args: Array[String]): Unit = {

    //    println("This is spark !!!")

    //        doWhile

    //    print(looper(100, 298))

    //    var file = "scala.txt"
    //    if (!args.isEmpty) file = args(0)
    //
    //    printf(file)

    // 三元控制写法
    //        val file = if (!args.isEmpty) args(0) else "scala2.txt"
    //        println(file)

    //for 循环的两种写法
    //        for(i <- 1 to 10){
    //          println("num:"+i)
    //        }

    //    for(i <- 1.to(9)){
    //      println("num:"+i)
    //    }

    //    val files = (new File(".")).listFiles()
    //
    //    for (file <- files) {
    //      println(file)
    //    }

    //
    //    //异常处理
    val n = 9
    //val file="spark.txt"
    // openFile(file)
    try {
      val half = if (n % 2 == 0) n / 2
      else
        throw new RuntimeException("n must be event!")
    }
    catch {
      case e: Exception => println("The exception is :" + e.getMessage)
    }
    finally {
      //clone();
    }


  }

}
