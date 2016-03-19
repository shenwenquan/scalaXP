package com.dt.scala.oop

/**
  * Created by Administrator on 2016/3/19.
  */


class Teacher3 {

  val name: String = "swq"

  private[this] var age: Int = 27

  var salary: Float = _

  println("construct init...outer.")

  def this(age: Int, salary: Float) {
    this
    this.age = age
    this.salary = salary
    println("construct init...inner.")

  }

  def show = {
    println("name:" + this.name + " age:" + this.age + " salary:" + salary)
  }
}


//私有构造器
//构造器中参数加上val后，此参数将作为类的一个属性存在
class Teacher4 private(val name: String) {

  private[this] var age: Int = 27

  var salary: Float = _

  println("construct init...outer.")

  def this(name: String, age: Int, salary: Float) {
    this(name)
    this.age = age
    this.salary = salary
    println("construct init...inner.")

  }

  def show = {
    println("name:" + this.name + " age:" + this.age + " salary:" + salary)
  }
}


object A1_ConstructorOps {

  def main(args: Array[String]) {
    val t = new Teacher3(33, 3.14f * 10000)
    t.show
    println(t.name)
    println(t.salary)
    println()

    val t2 = new Teacher4("swq", 20, 1111f)
    t2.show
  }
}
