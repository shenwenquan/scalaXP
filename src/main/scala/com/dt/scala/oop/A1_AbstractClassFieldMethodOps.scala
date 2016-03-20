package com.dt.scala.oop

/**
  * Created by Administrator on 2016/3/20.
  */


abstract class Component {
  val color: String

  def desc
}

class Ball extends Component {
  override val color: String = "ee"
  override def desc: Unit = {
    println("this is a ball!")
  }
}

object A1_AbstractClassFieldMethodOps {

  def main(args: Array[String]) {
    val b = new Ball();
    b.desc
  }
}
