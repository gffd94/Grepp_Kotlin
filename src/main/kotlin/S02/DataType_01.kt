package S02

fun main() {

    // Long
    // 10l
    // 10L

//    val a = 10l
    val a = 10L

    // float
    // 3.14f
    // 3.14F

    var b = .1f
    b = .1F

    var c: Char = 'A'
//    c = 65
    c = 65.toChar()
    val d: Int = 'B'.code
    println("d = ${d}")


    val name: String = "Mango"
    println("name = ${name}")

    val desc: String = """
        aaa
        개행 문자 까지 다 인식해줌
        근데 trimIndent하면 개행 안해줌
        """.trimIndent()
    println(desc)

    // 문자열 템플릿
    // 1. $변수명
    val favorite: String = "Favorite $name"
    println(favorite)

    val sc = "제가제일 좋아하는 과일은 $name 입니다."
    // 2. ${표현식} : 변수명, 변수 + 연산자, 함수 ...
    val number = 20
    val sentence1 = "nem${number}ber"
    println(sentence1)

    val price: Int = 20
    val amount = 10

    val sentence2 = "총 금액은 = ${price * amount}입니다."

}