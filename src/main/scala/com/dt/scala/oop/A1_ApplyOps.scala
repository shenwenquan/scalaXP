package com.dt.scala.oop

/**
  * Created by Administrator on 2016/3/20.
  */

class MyApplyTest {
  def apply(): Unit = {
    println("apply method in class!")
  }


  def show: Unit = {
    println("I'm in the class !")
  }
}

//对象的静态创建方式：在类的伴生对象中提供apply()方法
object MyApplyTest {
  def apply() = {
    new MyApplyTest()
  }
}

object A1_ApplyOps {
  def main(args: Array[String]) {
    val a = MyApplyTest()
    a.show

    println("============================")
    val a2 = new MyApplyTest
    a2.show
    a2()
  }
}
