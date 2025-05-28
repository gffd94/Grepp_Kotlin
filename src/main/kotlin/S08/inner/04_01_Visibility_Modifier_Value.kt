package S08.inner

fun main () {
    println("PUBLIC_VALUE = ${PUBLIC_VALUE}")
    println("INTERNAL_VALUE = ${INTERNAL_VALUE}")
    println("PRIVATE_VALUE = ${PRIVATE_VALUE}")

    publicFunction()
    internalFunction()
    privateFunction()

    val pType = PublicType()
    val priType = PrivateType()
    val iType = InternalType()

    println("pType = $pType")
    println("priType = $priType")
    println("iType = $iType")

    val publiclass = PublicClass()
    publiclass.publicMethod()
    publiclass.internalMethod()

    val childClass = ChildClass()
    childClass.callTest()

}

// public, protected, private, internal
public val PUBLIC_VALUE: String = "PUBLIC_VALUE"
internal val INTERNAL_VALUE: String = "INTERNAL_VALUE"
private val PRIVATE_VALUE: String = "PRIVATE_VALUE"

public fun publicFunction(): Unit {
    println("Public Function!")
}

internal fun internalFunction(): Unit {
    println("Internal Function!")
}

private fun privateFunction(): Unit {
    println("Private Function!")
}

public class PublicType
private class PrivateType
internal class InternalType

open class PublicClass {

    public fun publicMethod(){
        println("Public Methode!")
    }
    private fun privateMethod(){
        println("Private Methode!")
    }
    internal fun internalMethod(){
        println("Internal Methode!")
    }
    protected fun protectedMethod(){
        println("Protected Methode!")
    }

}


class ChildClass : PublicClass() {
    fun  callTest(){
        println("ChildClass.callTest")
        publicMethod()
        protectedMethod()
        internalMethod()
//        privateMethod()


    }
}
