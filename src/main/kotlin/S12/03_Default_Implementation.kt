package S12

// 인터페이스는 다중상속이 가능하다
// 그렇다면 같은 메서드를 같은 인터페이스르 다중상속 받게 된다면 어떻게 될까?
fun main() {

    val instance : DiInterfaceA = DiImple()
    instance.print()

    val instance2 = DiImple2()
    instance2.print()

    val instance3 = DiImple3()
    instance3.print()

}

class DiImple: DiInterfaceA {

}

// 둘다 print() 메서드가 있지만 둘중 아무거나 구현 하더라도 이상하지 않음
class DiImple2: DiInterfaceA, DiInterfaceB {
    override fun print() {
        println("D: 직접 구현한 것!")
    }
}

// 다만 각각의 내용이 달라서 구현받은 print를 사용하고 싶다면 명시해줄 것
class DiImple3: DiInterfaceA, DiInterfaceB {
    override fun print() {

        super<DiInterfaceA>.print()
        super<DiInterfaceB>.print()

        println("D: 직접 구현한 것!")
    }
}

interface DiInterfaceA {
    fun print() {
        println("A: 기본적으로 구현되어있는 내용입니다!")
    }
}

interface DiInterfaceB {
    fun print() {
        println("B: 기본적으로 구현되어있는 내용입니다!")
    }
}