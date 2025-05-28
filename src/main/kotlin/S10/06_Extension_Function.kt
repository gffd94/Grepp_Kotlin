package S10

fun main() {

    val sentence = "Hello World!!"

    sentence.printUpperCase()

    val order1 = EfCoffeeOrder("아메리카노", "G")
    order1.printPrice()

    order1.changeSize("T")

}

fun String.printUpperCase() {
    println(this.uppercase())
}

class EfCoffeeOrder(var type: String, var size: String) {
    fun printPrice() = when(size) {
        "T" -> println("$type $size 는 3000원입니다.")
        "G" -> println("$type $size 는 3500원입니다.")
        else -> println("해당 사이즈는 없습니다.")
    }
}

fun EfCoffeeOrder.changeSize(size: String) {
    this.size = size
    this.printPrice()
}