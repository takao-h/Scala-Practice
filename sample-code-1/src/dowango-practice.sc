//Q. ¥3,950,000を年利率2.3％の単利で8か月間借り入れた場合の利息はいくらか（円未満切り捨て

val x = 3950000
val interesRate = 2.3
x * interesRate / 12 * 8

// Q. 定価¥1,980,000の商品を値引きして販売したところ、原価1.6％にあたる¥26,400の損失となった。割引額は定価の何パーセントであったか

val price = 1980000
val loss = 26400
val cost = loss * 1.6


/**
  * トレイト
   */

trait TraitA {
  val name: String
  def printName(): Unit = println(name)
}

//　クラスにしてname に上書き
class ClassA(val name: String) extends TraitA

object ObjectA {
  val a = new ClassA("takao")

  val a2 = new TraitA {
    override val name: String = "はやし"
  }
}



trait A {
  val foo: String
}

trait B extends A {
  val bar = foo + "World"
}

class C extends B {
  val foo = "Hello"

  def printBar(): Unit = println(bar)
}

(new C).printBar()
