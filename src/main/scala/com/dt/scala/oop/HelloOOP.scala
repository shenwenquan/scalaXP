package com.dt.scala.oop

/**
  * Created by apple on 15/11/15.
  */


//类的默认级别
class Person {

  private var age = 0

  def increament(): Unit = {
    age += 1
  }

  //没有参数的函数定义
  def current = age

}

class Student {
  val name = "swq"
  //当前对象私有[重点]
  // private [this]var p_age = 27
  private var p_age = 27

  def age = p_age

  def isYounger(other: Student) = p_age < other.p_age
}

object HelloOOP {
  def main(args: Array[String]) {
    val p = new Person()
    p.increament
    println(p.current)

    val student = new Student
    println(student.age)
    println(student.name)

  }

}
