def sqrt(x : Double): Double = {

  def improve(guess: Double): Double = ((x / guess) + guess) / 2
  def isGoodEnough(guess: Double): Boolean = (x - guess * guess).abs / x < 1e-10
  def sqrtIter(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))

  sqrtIter(1.0)
}

sqrt(2)
sqrt(4)
sqrt(1e-6)
sqrt(1e60)