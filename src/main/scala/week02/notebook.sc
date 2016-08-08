def fact(n: Int): Int = {
  //@tailrec
  def loop(acc:Int, n: Int): Int =
    if (n==0) acc
    else loop(acc*n, n-1 )

  loop(1, n)
}

def cube(x:Int): Int = x * x * x


def sumInt (a:Int, b: Int): Int =
  if(a>b) 0 else a + sumInt(a+1, b)

def sumFactorials (a: Int, b: Int): Int =
  if(a>b) 0  else fact(a) + sumFactorials(a+1, b)

def sumCubes (a:Int, b: Int): Int =
  if(a>b) 0 else cube(a) + sumCubes(a+1, b)

def sum( f: Int=>Int, a:Int, b:Int) :Int =
  if(a>b) 0 else f(a) + sum(f, a+1, b)

def sum_tail(f: Int => Int, a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a>b) acc
    else loop(a+1, acc+f(a))
  }
  loop(a, 0)
}

def sumInt_2 (a:Int, b: Int): Int = sum( (x:Int)=>x, a,b)
def sumInt_3 (a:Int, b: Int): Int = sum_tail( (x:Int)=>x, a,b)

def sumFactorials_2 (a: Int, b: Int): Int = sum (fact,a,b)
def sumFactorials_3 (a:Int, b: Int): Int = sum_tail(fact,a,b)

def sumCubes_2 (a:Int, b: Int): Int = sum (cube, a,b)
def sumCubes_3 (a:Int, b: Int): Int = sum_tail(cube, a,b)

sumInt(1, 10)
sumInt_2(1, 10)
sumInt_3(1,10)

sumFactorials(1, 10)
sumFactorials_2(1, 10)
sumFactorials_3(1, 10)

sumCubes(1, 10)
sumCubes_2(1, 10)
sumCubes_3(1, 10)
