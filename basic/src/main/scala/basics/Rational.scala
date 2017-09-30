
class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val number: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1)

  override def toString: String = number + "/" + denom

  def +(that: Rational): Rational =
    new Rational(number * that.denom + that.number * denom,
      denom * that.denom)

  def +(i: Int): Rational =
    new Rational(number + i * denom, denom)

  def -(that: Rational): Rational =
    new Rational(number * that.denom - that.number * denom, denom * that.denom)

  def -(i: Int): Rational =
    new Rational(number - i * denom, denom)

  def *(that: Rational): Rational =
    new Rational(number * that.number, denom * that.denom)

  def *(i: Int): Rational =
    new Rational(number * i, denom)

  def /(that: Rational): Rational =
    new Rational(number * that.denom, denom * that.number)

  def /(i: Int): Rational =
    new Rational(number, denom * i)

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)

  }
}

object Rational {
  def main(args: Array[String]): Unit = {
    val a = new Rational(66, 42)
    val b = new Rational(66, 22)
    println(a.toString)
    println(a * b)
  }
}