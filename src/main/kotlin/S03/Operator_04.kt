package S03

fun main() {

    // 안전 호출 연산자
    // ?.
    val s1: String? = "Hello, World!"
    val result1: Int? = s1?.length
    println("result1 = $result1")

    val s2: String? = null
    val result2 = s2?.length
    println("result2 = $result2")

    // 엘비스 연산자
    // ?:
    var s3: String? = "Hello, World!"
    val result3 = s3 ?: "Bye" // s3에 null 이 할당 되어있으면 "Bye"가 출력된다
    println("result3 = $result3")

    s3 = null
    val result4 = s3 ?: "Bye"
    println("result4 = $result4")

    //orElseThrow()
//    val result5 = s3 ?: throw NoSuchElementException()
//    println("result5 = $result5")

    //Null 단정 연산자
    val s5: String? = null
    val result5 = s5!!.length
    println("result5 = $result5")





}