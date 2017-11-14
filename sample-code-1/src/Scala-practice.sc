//　メソッド定義
def concatAsString(a: Int, b: Int): String = {
  val a_ = a.toString();
  val b_ = b.toString();

  return a_.+(b_);
}

//引数を持たないかつ定義時に()ありで定義したメソッドは呼び出し時に()を省略できる
def concatString2(a: Int, b: Int):String = {
  val a_ = a.toString
  val b_ = b.toString

  return a_. + (b_)
}

/**
  * 理想
  * - 副作用を伴わないメソッドは（）をつけない
  * - 副作用を伴うメソッドは（）をつける
  * */


def concatString3(a: Int, b: Int):String = {
  val a_ = a.toString
  val b_ = b.toString

  a_. + (b_)
}

def concatString4(a: Int, b: Int): String = {
  val a_ = a.toString
  val b_ =b.toString
  a_ + b_
}

// ドットを省略した場合、ドットを使った呼び出しよりも結合が弱くなります。
def concatString5(a: Int, b: Int):String = {
  a.toString + b.toString
}

// こんな風に書いても一緒（ただpublicなメソッドは省力しない方がいい）
def concatString6(a: Int, b: Int): String = a.toString +b.toString
def concatString7(a: Int, b: Int) = a.toString +b.toString

/**
  * 関数の省略と基本的なsyntax
  */


val f: Function1[Int, String] = new Function1[Int, String] {
  def apply(args: Int): String = args.toString
}
f.apply(10)

val f1: (Int) => String = new Function1[Int, String] {
  def apply(args: Int): String = args.toString
}
f1.apply(10)

val f2: Int => String = args => args.toString
f2.apply(10)

val f3: Int => String = _.toString
f3.apply(10)

//applyは省略できる
val f4: Int => String = _.toString
f4(10)

