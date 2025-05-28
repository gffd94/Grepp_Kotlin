package S09

fun main() {



    val cat = OpAnimal()
    cat.sayName()

    cat.name = "러시안블루"
    cat.sayName()
}

class OpAnimal {

    lateinit var name: String

    fun sayName() {
        // 하지만 setter가 열려있다 그렇게 좋지 못함..
        if ( ::name.isInitialized ) {
            println("제이름은 ${name}입니다.")
        } else {
            println("저는 아직 이름이 없어요")
        }

    }
}