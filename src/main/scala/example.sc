34  + 90
def radius = 10
def pi = 3.14
radius * 2
def square (x: Double): Double =  x * x
square(square(square(square(2)))).toInt
def int: Int = 1
int
//def loop: Int = loop/2
//loop

def and(x: Boolean, y: Boolean) : Boolean = if(x) if(y) true else false else false

and(false, false)
and(true, false)
and(false , true)
and(true, true)

def or(x: Boolean, y: Boolean) : Boolean = if(x) true else if(y) true else false