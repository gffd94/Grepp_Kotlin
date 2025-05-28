package S07



// main
fun main () {
    // 매개변수에 같은 타입을 줘야한다
    sayWord("Hello World!")
    sayName()
    sayName("펑신")
    orderCoffee("아메리카노", "tall", true)
    
    printCartList(4, "사과", "참외", "딸기", "수박")
    var cartList = arrayOf("감쟈","고구마", "계란", "파")
    printCartList(cartList.size , cartList.toString())
    // 스프레드 연산자 * : list의 안에 내부 값을 흐트려서 값을 넣어줌
    printCartList(cartList.size , *cartList)

    logging(msg = arrayOf("log1","log2","log3","log4"))
    logging(type = "Fatal", msg = arrayOf("error1","error2"))


}


fun sayWord(word: String) {
    println(word)
}

// default 값을 줄수 있으며 반환되는 타입을 선언 안하면 Unit
fun sayName(name : String = "민수") {
    println("안녕하세요 ${name} 님!")
}

fun orderCoffee(name: String, size: String, isIce: Boolean) {
    println("$size 사이즈 ${if(isIce) "아이스" else "핫"} $name (을)를 주문했습니다.")
}

// 가변인자
// 1. 가변인자는 매개변수 맨 마지막에 선언
// 2. 같은 타입을 계속 매개변수로 받을 때
fun printCartList(size: Int, vararg items: String) {
    println("$size 크기의 장바구니에 ${items.joinToString(", ")}가 들어왔습니다.")
}

fun logging(type: String = "INFO", vararg msg: String) {
    for (s: String in msg) {
        println("[${type}] $s")
    }
}