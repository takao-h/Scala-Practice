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

