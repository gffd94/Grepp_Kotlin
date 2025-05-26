package S06

fun main() {

    // .. 연산자 ( 범위 생성 연산자)
    val range1  = 1 .. 5
    println(range1)

    val range2 = 1L .. 5L
    println(range2)

    val range3  = 'a'..'z'
    println(range3)

    val range4 = "AA" .. "ZZ"
    println(range4)


    // 역방향 범위
    val range5 = 5 downTo 1
    println(range5)

    // 범위 간격 조절
    val range6 = 1 .. 10 step 2
    println(range6)

    // 열림 범위 연산자 ( 끝 값을 뺌 ) -> index
    val range7 = 0 until 5

    // 포함 여부
    // in
    val s1 = 1 .. 10 step 2
    val t1 = 10

    println("t1 in s1? = ${t1 in s1}")
    println("t1 not in s1? = ${t1 !in s1}")

    // 어떠한 범위가
    // 어떠한 범위안에 포함되는가?
    val c1 = 1..5
    val c2 = 2..4

    println("c1 include c2? = ${c2.first in c1 && c2.last in c1 }")



}