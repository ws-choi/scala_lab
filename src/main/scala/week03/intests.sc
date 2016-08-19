
object intests {
  val t1 = Empty
  val t2 = t1 incl 3
  val t3 = t2 incl 4
  val t4 = t3 incl 2
  val t5 = t4 incl 1
  t2.contains(4)
  t3.contains(4)
  t4.contains(4)



  abstract class Intset{
    def incl(x: Int): Intset
    def contains(x: Int): Boolean
    def union(that: Intset): Intset
  }

  object Empty extends Intset{
    def incl(x: Int): Intset = new NonEmpty(x,  Empty,  Empty)
    def contains(x: Int): Boolean = false
    def union(that: Intset): Intset = that
    override def toString() = "."
  }

  class NonEmpty(elem:Int, left: Intset , right: Intset) extends Intset{
    def incl(x: Int): Intset =
      if(x < elem) new NonEmpty(elem, left incl x, right)
      else if (x > elem) new NonEmpty(elem, left, right incl x)
      else this

    def contains(x: Int): Boolean =
      if(x < elem) left contains x
      else if ( x >elem) right contains x
      else true

    def union(that: Intset): Intset = if(this == Empty) that else  ( (left union that) incl elem ) union right
    //def union(that: Intset): Intset = if(this == Empty) that else  ( (left union right) union other) incl elem


    override def toString() =  "{" + left  + elem + right + "}"

  }

}
