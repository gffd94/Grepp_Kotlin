package S14

fun main() {
    try {
        throw IllegalArgumentException("예외발생했습니다.")
    } catch (e: IllegalArgumentException) {
        println("예외에서 온 메세지 : ${e.message}")
    } finally {

    }
}