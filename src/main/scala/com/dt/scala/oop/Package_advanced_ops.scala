package com.dt.scala.oop


package spark {
  package navigation {

    private[spark] class Navigator {
      protected[navigation] def useStartChar() {}

      class LegOfJourney {
        private[Navigator] val distance = 100
      }

      private[this] var speed = 200
    }

  }

  package launch {

    import com.dt.scala.oop.spark.navigation._

    object Vehicle {
      private[launch] val guide = new Navigator
    }

  }

}


class Package_advanced_ops {

  import Package_advanced_ops.power

  private def canMakeTrue = power > 10001
}

object Package_advanced_ops {
  private def power = 10000

  def makeTrue(p: Package_advanced_ops): Boolean = {
    p.canMakeTrue
  }
}