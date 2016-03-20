package com.dt.scala.oop

/**
  * Created by Administrator on 2016/3/20.
  */

//  伴生类、伴生对象
//  1)scala中的静态方法、静态类是通过object来提供的
//  2)class名和object名相同的为伴生类和伴生对象


object School {
  private var stdNO = 0

  def getNewStdNO = {
    stdNO += 1
    stdNO
  }

}

class School {
  def receiveStudent(): Unit = {
    println(School.getNewStdNO)
  }
}


object A1_Single_Objec_ClassOpsOps {

  def main(args: Array[String]) {
    val s=new School()
    s.receiveStudent()
    s.receiveStudent()
    s.receiveStudent()

  }

}
