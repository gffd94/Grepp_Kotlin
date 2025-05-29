package io.gffd94.S01

fun main() {
    println("Hello World!")

    // var val
//    var two: Int? //(null을 허용만 하는 것! 선언을 해줘야함)
    var two: Int
    var twelve: Int

    two = 2
    twelve = 12

    println("two = $two")
    println("twelve = $twelve")
    println(two+twelve)

    two = 22
    twelve = 112

    println(two+twelve)

    val one: Int
    val ten: Int

    one = 1
    ten = 10

    println("one = ${one}")
    println("ten = ${ten}")

    var pi = 3.14
    val pi2 = 3.141592

    pi = 10.0

    var name = "Mango"
    name = "AppleMango"


}