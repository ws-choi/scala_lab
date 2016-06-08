package scala_30min

object Part1 {

  //Part 1. 변수와 계산
  def main(args: Array[String]): Unit = {

    //Hello, world!
    println("Hello, world!")

    //숫자와 같은 원시타입은 객체로 취급되며, 연산자는 메소드.
    //또한 메소드에도 우선순위가 있음. 컴파일 이후에는 자바원시타입으로 관리 (가능한 경우)
    println( 1 + 2 )
    println( 1.+(2) )


    // 변수는 var로 상수는 val로 선언한다.
    var xx = 1 + 2
    xx = 3 * 4
    println( xx )

    val yy = 1 + 2
    //yy = 3 * 4 // 이 줄은 상수에 값을 대입해서 에러가 나기 때문에 지워야 합니다.
    println( yy )

    // 한 번에 여러개의 변수를 선언하면서 값을 대입할 수도 있습니다.
    val a, b, c = 5
    println( a )
    println( b )
    println( c )

    //출력하기
    val x = 10
    val y = 1

    // ① println
    println("① " + x + " is bigger than " + y)

    // ② 문자열 앞에 s를 쓰면 $를 쓰고 변수이름을 바로 쓸 수 있습니다.
    println(s"② $x is bigger than $y")

    // ③ 수식을 입력하고 싶으면 ${ }사이에 식을 넣으면 됩니다.
    println(s"③ $x + $y = ${ x + y }")

    // ④ printf도 사용 가능합니다.
    //java.lang.*은 자동으로 import됩니다.
    //java.lang.Math도 포함입니다.
    printf("④ Pi is %f",Math.PI)

  }
}