package com.dt.scala.hello

;

/**
  * Created by apple on 15/11/14.
  */
object For_Function_Advanced {

  def main(args: Array[String]): Unit = {

    //for 循环的用法
    for (i <- 1 to 2; j <- 1 to 3) {
      print(100 * i + j + " ")
    }

    println
    //for循环的条件用法
    for (i <- 1 to 2; j <- 1 to 3 if i != j) {
      print(100 * i + j + " ")
    }

    println

    //有名函数
    def addA(x: Int) = x + 100

    //匿名函数
    val add = (x: Int) => x + 200

    println("the result from addA is " + addA(1))

    println("the result from add is " + add(1))


    println

    //在递归 定义的时候，必须加入返回值类型
    def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)
    println("the result from fac is " + fac(10))

    //函数参数的默认值
    def combine(content: String, left: String = "[", right: String = "]") = left + content + right
    println(combine("swq"))

    //可变参数
    def connected(args: Int*) = {

      var result = 0
      for (arg <- args) {
        result += arg
      }
      result
    }
    println(connected(1, 2, 3))

  }
}
