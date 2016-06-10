package week01

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = if (c<1) 1 else if(c >= r) 1 else pascal(c-1, r-1) + pascal(c, r-1)


  /**
    * Exercise 2
    */

  def balance(chars: List[Char]): Boolean = {
    def balance(chars: List[Char], numOfLeft: Int) :Int = {

      if(numOfLeft<0) return numOfLeft
      else
        chars match {
          case '(' :: tail => balance(chars.tail, numOfLeft+1)
          case ')' :: tail => balance(chars.tail, numOfLeft-1)
          case _   :: tail => balance(chars.tail, numOfLeft)
          case Nil   => numOfLeft
        }
    }

    (balance(chars, 0) == 0)
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    if(money < 0 || coins.isEmpty) 0
    def count(money: Int, coins: List[Int]): Int = {
      (money, coins) match {
        case (0, _) => 1
        case (m, _) if m < 0 => 0
        case (_, c :: Nil) => count(money - c, coins)
        case (_, c :: cs) => count(money - c, coins) + count(money, cs)
      }
    }
    count(money, coins)
  }

}
