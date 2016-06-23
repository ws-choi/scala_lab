package week01

import scala.annotation.tailrec

object Factorial_Tail {

  def factorial(n: Int): Int = {

    if (n == 1 ) 1
    else n * factorial(n-1)

  }


  def factorial_tail(n: Int): Int = {
    //@tailrec
    def loop(acc:Int, n: Int): Int =
      if (n==0) acc
      else loop(acc*n, n-1 )

    loop(1, n)
  }

  def main(args: Array[String]) {

    println(factorial_tail(7))
    println(factorial(7))

  }
}
