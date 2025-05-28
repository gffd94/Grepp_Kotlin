package S10

fun main() {
    val animal = OrdAnimal()
    animal.eat("pizza")

    animal.play()

    val play = animal.play()
    println(play)

    animal.sleep(2)

    val huskey = OrdHuskey()
    huskey.eat("간식")
    huskey.play()
    huskey.sleep(1)

}

open class OrdAnimal {

    open fun eat(sth: String) = println("${sth}를 먹습니다.")
//    fun eat(sth: String) {
//        println("${sth}를 먹습니다.")
//    }
    open fun play() : () -> Unit = {
        println("동물이 뛰어다닙니다.")
        println("굉장히 행복해합니다.")
    }

    fun sleep(hour: Int) = println("${hour}시간만큼 잠을 잡니다.")

}


open class OrdDog : OrdAnimal() {

    override fun eat(sth: String) {
        println("${sth}을 먹습니다.")
        println("기분이 좋아보입니다.")
    }

    // overloading - 가능
    fun sleep() {
        println("낮잠을 잡니다.")
        println(".........")
    }

}


open class OrdHuskey : OrdAnimal() {

}