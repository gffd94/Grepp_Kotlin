package S02

fun main() {
    val number: Int? = null
    println(number)

    // 타입? : null을 허용한다고 선언 -> 나중에 사용하는 값이 null이 아니여도 된다.
    val name: String?
    name = "Mango"
    println("name = $name")

    val s1: String = "s1"

    println(s1 is String )
    println(s1 is String?)

    val s2: String? = "s2"

    println(s2 is String )
    println(s2 is String?)

    val s3: String? = null
    println(s3 is String )
    println(s3 is String?)

    printLength(s1)
//    printLength(s2)
//    printLength(s3)

    _printLength(s1)
    _printLength(s2)
    _printLength(s3)

}

fun printLength(target: String): Unit {
    println("target 길이 : ${target.length}")
}

fun _printLength(target: String?): Unit {
    println("target 길이 : ${target?.length}")
}