package scala_30min

object Part2_String {

  def main(args: Array[String]): Unit = {
    // ① 뒤집기
    val reverse = "Scala".reverse
    println(s"① $reverse")

    // ② 첫글자를 대문자로
    val cap = "scala".capitalize
    println(s"② $cap")

    // ③ 7번 반복
    val multi = "Scala! " * 7
    println(s"③ $multi")

    // ④ 정수로 변환
    val int = "123".toInt
    println(s"④ ${int * 10}")
  }

}
