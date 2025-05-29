package S12

// 인터페이스 간의 상속

interface InInterfaceA
interface InInterfaceB

interface InInterfaceC: InInterfaceA, InInterfaceB

class IhImpl: InInterfaceC

fun main() {
    val a:InInterfaceA = IhImpl()
    val b:InInterfaceA = IhImpl()
    val c:InInterfaceA = IhImpl()
    val d:InInterfaceA = IhImpl()

}

