package S07

fun main () {
    _sayName("민수")
    func1() { println("1Hello world") }
    func1{ println("2Hello world") }
    func2(10, {println("$it")})

    func1_1("Tag"){
        println("Tag World")
    }

    func1_2("Tag", { println("후방 함수?")} ,"name")

    placeBookOrder(3) {
        println("책을 ${it}권 주문합니다.")
    }


//    println("저는 func의 시작점입니다.")
//    fn(number)
//    println("저는 func의 끝점입니다.")
}

fun _sayName(name:String) {
    println("안녕하세요 ${name}님")
}

// inline : compile할때 함수가 호출되는 게 아니라 안에 본문이 그 함수 호출부분에 자리함
inline fun func2(number: Int, fn: (Int)-> Unit){
    println("저는 func2의 시작점입니다.")
    fn(number)
    println("저는 func2의 끝점입니다.")
}

fun func1(fn : () -> Unit){
    println("저는 func1의 시작점입니다.")
    fn()
    println("저는 func1의 끝점입니다.")
}

fun func1_1(tag:String, fn: ()->Unit){
    println("tag = $tag")
    fn()
}

fun func1_2(tag:String, fn: () -> Unit, name :String){
    println("tag = $tag")
    fn()
    println("name = $name")
}

inline fun placeBookOrder(quantity: Int, order:(Int)->Unit){

    order(quantity)
}