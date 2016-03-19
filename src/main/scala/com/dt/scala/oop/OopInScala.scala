package com.dt.scala.oop

/**
  * Created by apple on 15/11/15.
  */


//1.默认构造器
class Teacher {

  var name: String = _
  private val age: Int = 27
  private[this] val gender = "man"

  def this(name: String) {
    this
    this.name = name
  }

  def sayHello(): Unit = {
    println(this.name + " :" + this.age + " :" + this.gender)
  }
}

//私有构造器
class Teacher2 private(val name: String, val age: Int) {
  println("this is primary construct!")
  var gender: String = _

  def this(name: String, age: Int, gender: String) {
    this(name, age)
    this.gender = gender
  }

  def sayHello(): Unit = {
    println(this.name + " :" + this.age + " :" + this.gender)
  }

}


//2.内部类：和java内部类不同，scala的内部隶属于外部对象

class Outer(val name: String) {
  out =>
  val age: Int = 20

  class Inner(val name: String) {
    def foo(): Unit = {
      println("Outer:" + out.name + " Inner:" + this.name)
    }

  }

}

//3.单例、伴生类、伴生对象
//  1)scala中的静态方法、静态类是通过object来提供的
//  2)class名和object名相同的为伴生类和伴生对象

object University {

  private var stundentNo = 0

  def newStdNo = {
    stundentNo += 1
    stundentNo
  }
}

class University {
  val id = University.newStdNo

  private var no = 0;

  def getNo(no: Int) = {
    this.no = no + id
    this.no
  }
}

//4.apply方法的使用
class ApplyTest {
  def atry {
    println("atry..")
  }
}

object ApplyTest {
  def apply() = {
    println("in object apply()")
    new ApplyTest
  }
}

//5.继承、超类

class Employer(val name: String, val age: Int) {
  println("Employer init....")

  val school = "8UJ"

  def sleep = "8 hour"

  override def toString = {
    "I am a employ.."
  }

}

class Worker(name: String, age: Int, val salary: Int) extends Employer(name, age) {

  println("worker init....")
  override val school = "spark"

  override def toString = "I am worker " + super.sleep + "  salary:" + this.salary

}

//6.抽象类、属性、方法

abstract class Hum(val name: String) {
  var age: Int

  def doWork
}

//7.接口：java中用interface作为接口的关键字，而在scala中用trait作为接口关键字。
trait Logger {
  def log(msg: String) {}
}

trait FilterLog extends Logger {
  override def log(msg: String): Unit = {
    println("FilterLog....." + msg)
  }
}

class ConcreLog extends Logger with Cloneable {
  //override def log(msg: String): Unit ={ println("concreLog ....."+msg)}

  def doJob(): Unit = {
    log("well done")
  }
}


//8.多重继承、多重继承构造器招待顺序
class Humen {
  println("Humen")
}

trait TTeacher extends Humen {
  println("TTeacher")

  def teach
}

trait PianoPlayer extends Humen {
  println("PianoPlayer")

  def playPinao = {
    println("I'm playing pinano")
  }
}

class PianoTeacher extends Humen with TTeacher with PianoPlayer {
  override def teach: Unit = {
    println("I'm trainning student")
  }
}


//AOP实现

trait Action {
  def doAction
}

trait TbeforAfter extends Action {
  override abstract def doAction: Unit = {
    println("initialization...")
    super.doAction
    println("destroy......")
  }
}


class Work extends Action {
  override def doAction: Unit = {
    println("working....")
  }
}


object OopInScala {

  def main(args: Array[String]) {

    val teacher = new Teacher();
    teacher.name = "swq"
    teacher.sayHello()


    val teacher2 = new Teacher2("swq", 30, "M")
    teacher2.sayHello();


    val out1 = new Outer("Spark")
    val out2 = new Outer("Hadoop")
    val inner1 = new out1.Inner("scala")
    val inner2 = new out2.Inner("java")

    inner1.foo()
    inner2.foo()

    println("==============")
    println(University.newStdNo)
    println(University.newStdNo)

    val u = new University();
    println(u.getNo(100))

    val a = ApplyTest()
    a.atry

    println("==============")


    val w = new Worker("swq", 30, 10000)
    println(w.toString)

    println("==============")


    val log = new ConcreLog
    log.doJob()

    println("********")

    val log2 = new ConcreLog with FilterLog

    log2.doJob()


    println("==============")

    val p = new PianoTeacher
    p.playPinao
    p.teach

    val p2 = new Humen with TTeacher with PianoPlayer {
      override def teach: Unit = {
        println("I 'am a teacher ,training piano!")
      }
    }
    p2.playPinao
    p2.teach


    println("==============")


    val aop = new Work with TbeforAfter
    aop.doAction
  }
}
