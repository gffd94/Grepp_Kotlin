package S09

fun main() {

    val 민수 = OpStudent()
    // 이때 최초 lazy 호출이 되면서 name 에 민수 들어감
    println("민수.name = ${민수.name}")
    // 그래서 이때는 name값 가져옴
    println("민수.name = ${민수.name}")

    val reader = OpFileReader()

    val contents1 = reader.contents
    println("content1 = $contents1")

    val contents2 = reader.contents
    println("contents2 = $contents2")

}

class OpStudent {

    val name: String by lazy {
        "민수"
    }

}

class OpFileReader {
    val contents: String by lazy {
        println("파일을 읽어들이는 무거운 작업을 시작합니다.")
        "엄청 무거운 작업 잉후 읽어들인 파일 내용"
    }
}