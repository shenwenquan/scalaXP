package com.dt.scala.oop


/**
  * Created by Administrator on 2016/3/20.
  */

class User(val name: String, var age: Int) {
  println("user constructor begin init....")
  var occupation: String = ""

  override def toString() = {
    "name:" + this.name + " age:" + this.age + " occupation:" + this.occupation
  }
}

class Employee(name: String, age: Int, salary: Long) extends User(name, age) {

  println("employee constructor begin init....")
  //前面不能加 override?
  occupation = "software"

  override def toString() = {
    "name:" + this.name + " age:" + this.age + " occupation:" + this.occupation + " salary:" + this.salary
  }
}

object A1_ClassInheritOps {

  def main(args: Array[String]) {
    val u = new User("swq", 100)
    println(u.toString())

    println("============================")

    val e = new Employee("swq", 1000, 10000)
    println(e.toString())

  }

}
