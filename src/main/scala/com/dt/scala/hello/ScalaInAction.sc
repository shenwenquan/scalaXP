import scala.collection.mutable.ArrayBuffer

println("Welcome to the scala worksheet")
val s = Array("hello", "world")
s(0) = "Goodbye"
for (elem <- s) println(elem)
val nums = new Array[Int](10)//定长数组
val a = new Array[String](10)//定长数组

for (i <- 0 until a.length) println(i + ": " + a(i))
var b = ArrayBuffer[Int]()//变长数组
b += 1
b +=(1, 2, 3, 5)
b ++= Array(8, 13, 21)  //TODO 查找它的意义
b.trimEnd(5)
b
b.insert(2, 6)
b
b.insert(2, 7, 8, 9)
b
b.remove(2)
b
b.remove(2, 3)
b
b.toArray

val c = Array(2, 3, 5, 7, 11)
//2 * elem 只是个表达式，所以返回unit
val result1 = for (elem <- c) 2 * elem
//如果对结果* 2，加yield
val result2 = for (elem <- c) yield 2 * elem
//取偶数（一般用法）
val result3 = for (elem <- c if elem % 2 == 0) yield 2 * elem
//推荐用法
val result4 = c.filter(_ % 2 == 1).map(_ * 2)
//不推荐
val result5 = c.filter(elem => elem % 2 == 1).map(_ * 2)

val result6 = result5.sum
val d = Array(4, 1, 3, 7)
//Sorting.quickSort(d)
d.sorted
d.mkString(" and ")
var e = ArrayBuffer(6, 1, 2, 9)
val e2 = e.sorted;
e2.mkString("< ", " and ", " >")

//矩阵
val matrix = Array.ofDim[Int](3,4)
matrix(2)(1) = 42
matrix
val triangle = new Array[Array[Int]](10)
for (i <- 0 until triangle.length)
  triangle(i) = new Array[Int](i + 1)
triangle