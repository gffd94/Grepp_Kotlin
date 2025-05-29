package S14

fun main() {
    runCatching {
        throw CustomException("에러메세지 입니다.")
    }.onFailure {
        println("${it.message}")
    }
}

class CustomException(message :String): Exception(message)