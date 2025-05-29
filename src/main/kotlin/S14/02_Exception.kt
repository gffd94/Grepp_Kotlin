package S14

fun main() {
    try {
        throw IllegalArgumentException("예외발생했습니다.")
    } catch (e: IllegalArgumentException) {
        println("예외에서 온 메세지 : ${e.message}")
    } finally {
        println("예외 발생 여부와 상관없이 반드시 실행된다!")
    }
}