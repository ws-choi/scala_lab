object rationals {
  val x = new Rational (1,3)
  val y = new Rational (5,7)
  val z = new Rational (3,2)

  x-y
  x+y
  x-y-z
  x<y
  -x
  y - x *  new Rational(3)

  class Rational(x: Int, y: Int){

    require(y != 0, "denominator must be nonzero")
    //if(y==0) throw new Exception();

    def this (x: Int) = this (x,1)

    private val sign = if(x*y>0) 1 else if (x==0) 0 else -1
    private val gcd_ = gcd(x,y)

    val numer = abs(x/gcd_) * sign
    val denom = abs(y/gcd_)

    def + (that: Rational) = new Rational(numer * that.denom + that.numer *denom, denom * that.denom)
    def - (that: Rational):Rational = this + -that
    def * (that: Rational) = new Rational(numer*that.numer, denom*that.denom)
    def / (that: Rational) = this * that.reverse()
    def unary_- () = new Rational (-x, y)
    def reverse() = new Rational (y, x)
    def < (that:Rational) = this.numer * that.denom < that.numer * this.denom
  //def less2 (that:Rational) = (this-that) less new Rational (0,1)
    def max (that:Rational) = if( this < that ) that else this

    private def abs (x:Int) = if(x>0) x else -x
    private def gcd (x: Int, y:Int):Int = if(y==0) x else gcd (y, x%y)

    override def toString = numer + "/" + denom

  }

}