package scala_30min

object Part2_range_and_list {

  def main(args: Array[String]): Unit = {

    // ① to를 이용하면 1부터 10을 포함하는 Range를 생성합니다.
    val range1 = 1 to 10
    println(s"① 1 to 10 →\n\t $range1")

    // ② until을 이용하면 마지막 숫자를 포함하지 않는 Range를 생성합니다.
    val range2 = 1 until 10
    println(s"② 1 until 10 →\n\t $range2")

    // ③ by를 이용하면 숫자를 건너 띄는 Range를 생성합니다.
    val range3 = 1 until 10 by 3
    println(s"③ 1 until 10 by 3 →\n\t $range3")

    // ④ toList를 통해 List로 변환합니다.
    println(s"④ range1.toList →\n\t ${range1.toList}")

    // ⑤ filter: 조건에 맞는것만 모으기(4 이상인것만 모으기)
    val moreThan4 = range1.filter(_ > 4)
    println(s"⑤ range1.filter(_ > 4) →\n\t $moreThan4")

    // ⑥ map - 각 아이템의 값을 변경하기
    val doubleIt = range1.map(_ * 2)
    println(s"⑥ range1.map(_ * 2) →\n\t $doubleIt")
  }

}
