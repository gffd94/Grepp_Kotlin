package S04



fun main() {

    // as 명시적 형변환
    val target1: Any = "Hello World!"
    val strTarget1: String = target1 as String
    println("strTarget1 type = ${strTarget1.javaClass.simpleName}")

    val target2: Any = 100
    val strTarget2 = target2 as? String // as? 캐스팅 실패시 null
    println("strTarget2 type = ${strTarget2}")

    val itemList: List<Any> = listOf("망고", 1000, "사과", 2000, "배", 5000)
    printStr(itemList)

}

fun printStr(target: List<Any>) {

    for (item in target) {
        val iStr = item as? String
        if( iStr != null){
            print("$iStr")
        }
    }
    println()

}

