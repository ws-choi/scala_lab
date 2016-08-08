package week02

import math.abs

/**
  * Created by wschoi on 2016-08-08.
  */
object excercise {

  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, init: Int)(a:Int, b:Int): Int=
    if(a>b) init
    else combine(f(a), mapReduce(f,combine,init)(a+1,b))

  def fact(n: Int): Int = product(x=>x)(1,n)

  def product(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1
    else f(a) * product(f)(a + 1, b)

  def product2(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x,y) => x*y, 1)(a,b)
  def product_fat (a: Int, b :Int): Int = product(fact)(a,b)

  val tolerance = 0.0001

  def isCloseEnough(x: Double, y: Double) =
    abs((x - y) / x) / x < tolerance

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {

    def iterate(guess: Double): Double = {
      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }

    iterate(firstGuess)
  }

  def main(args: Array[String]) {
    println(product2(x=>x*x)(3,4))
    println(fact(5))
    println(fixedPoint(x => 1 + x/2)(1)
    )
  }
}
