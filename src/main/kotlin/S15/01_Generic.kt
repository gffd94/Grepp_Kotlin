package S15

fun main() {

    // java 의 Object와 긑음 Any
    geFunc1("A")
    geFunc1(1)
    geFunc1(false)
    geFunc1(.0)

}


fun geFunc1(params: Any) {
    // as 명시적 형변환
    val result = params as Int - 1000
    println("result: $result")
}
