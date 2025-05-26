package io.gffd94.S01

// val은 런타임 시점에 값이 들어있는 지 안들어 있는지 확인하고 const인 상수는 컴파일 시점에 값이 있어야 하기 때문에 val은 상수가 아니다
const val URL = "jdbc:mariadb://localhost:3306"
val V_1: String = genValue()

fun genValue(): String {
    return "Hello World!"
}

fun main() {
    println("NAME = $NAME")
    println("URL = ${URL}")
}
