package S07

fun main() {

    orderCoffee()
    orderCoffee("바닐라라떼")
    orderCoffee("Tall","고구마라떼")


}

fun orderCoffee(){
    println("아메리카노 한 잔 주문하셨습니다.")
}

fun orderCoffee(type: String){
    println("$type 한 잔 주문하셨습니다.")
}

fun orderCoffee(type: String, size: String){
    println("$size 사이즈 $type 한 잔 주문하셨습니다.")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum(a: Double, b: Double): Double {
    return a + b
}

