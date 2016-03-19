import scala.collection.immutable.SortedMap


val m1 = Map("hadoop" -> 10, "spark" -> 1, "scala" -> 2)//Map  不可变的map
m1.hashCode()
val m2 = for ((k, v) <- m1) yield (k, v * 0.9)
m2.hashCode()

val v1 = m1.getOrElse("R", 0)
val v2 = m2.getOrElse("hbase", 0)
val m3 = scala.collection.mutable.Map("book" -> 111, "desk" -> 222)
m3 += ("window" -> 333)
val v3 = m3.getOrElse("window", -1)
//
//总结 ：scala貌似不能从语法上去b限制 Map的可变与不可变
//


val m4 = SortedMap("b" -> 2, "c" -> 3, "a" -> 1)
//m4 +=("f"->8)

val v4 = m4.getOrElse("f", -1)

//tuple
val tuple = (1, 2, 3.14, "Rocky", "Spark")
val (first, second, third, fourth, fifth) = tuple//将元组赋值给新的元组
fifth
val (f, _, _, _, _) = tuple
"Rocky Spark".partition(_.isUpper)
"Rocky Spark".partition(_.isUpper)._1
//zip
val symbols = Array("[", "-", "]")
val counts = Array(2, 5, 2)
val pairs = symbols.zip(counts)
//TODO 理解这个输出结果
for ((x, y) <- pairs) print(x * y)
val v5 = for ((x, y) <- pairs) yield x * y
v5(0)
v5(1)
v5(2)
