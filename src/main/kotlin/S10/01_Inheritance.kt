package S10

fun main() {

    val subIns = SubClass()

    println("subIns.name = ${subIns.name}")
    subIns.introduce()
}

// 코틀린은 기본적으로 Class, field, method 는 final
open class BaseClass {

    private val uniqueName: String = "BaseClass"

    open var name: String = "BaseClass"

    open fun introduce() {
        println("Hello Wolrd!!")
    }

}

// 다중 상속이 가능!
open class SubClass : BaseClass() {

    override var name: String = "SubClass"

    override fun introduce() {
        println("Hello Wolrd!!_Sub")
    }

}

class SubSubClass : SubClass() {

    // BaseClass에 있는 name을 override한것임! 착각 ㄴㄴ
    override var name: String = "SubSubClass"

}