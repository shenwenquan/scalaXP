package com.dt.scala.oop


//包的组织
package object study {
  val default_value = "111"
}

package study {

  class PP {
    var name = default_value;
  }

}

package ai {

  package alarm {

    class JavaService {

    }

    trait OO {

    }

  }

  package dog {

    class A {

    }

  }


}

//包的导入
import java.util.{HashMap => JavaHashMap}

import scala.{StringBuilder => _}


class PackageOps {

}
