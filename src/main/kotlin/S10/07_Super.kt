package S10

fun main() {

}

open class SpAnimal {

    open fun eat(amount: Int) {
        println("${amount}만큼 먹었습니다!")
    }

    fun sleep(hour: Int){
        println("${hour}시간만큼 잠을 잡니다.")
    }

}

class SpDog: SpAnimal() {
    override fun eat(amount: Int) {
        super.eat(amount) // 부모에서 적용한 기능 그대로 수행이 가능하다.
        println("배가 부릅니다!")
    }
}