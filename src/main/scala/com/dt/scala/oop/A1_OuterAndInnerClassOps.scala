package com.dt.scala.oop

/**
  * Created by Administrator on 2016/3/20.
  */

class Outer2(val name: String) {
  out =>
  val age: Int = 20

  class Inner(val name: String) {
    def foo(): Unit = {
      println("outer:" + out.name + " inner:" + name)
    }
  }

}

object A1_OuterAndInnerClassOps {
  def main(args: Array[String]) {
    val outerA=new Outer2("spark")
    val outerB=new Outer2("hadoop")

    val innerA=new outerA.Inner("scala")
    val innerB=new outerB.Inner("java")


    innerA.foo()
    innerB.foo()
  }
}
