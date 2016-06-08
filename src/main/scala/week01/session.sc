def abs( x: Double) = if (x>=0) x else -x
def improve(guess: Double, x: Double): Double = ((x/guess) + guess)/2
def isGoodEnough(guess: Double, x: Double): Boolean = (x - guess * guess).abs / x < 1e-10
def sqrtIter(guess: Double, x : Double): Double =
  if(isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x)

def sqrt(x : Double) = sqrtIter(1.0, x)

//Excecute:
sqrt(2)
sqrt(4)
sqrt(1e-6)
sqrt(1e60)
