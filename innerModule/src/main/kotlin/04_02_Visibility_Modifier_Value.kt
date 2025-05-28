package io.gffd94

// public, protected, private, internal
public val OTHER_PUBLIC_VALUE: String = "OTHER_PUBLIC_VALUE"
internal val OTHER_INTERNAL_VALUE: String = "OTHER_INTERNAL_VALUE"
private val OTHER_PRIVATE_VALUE: String = "OTHER_PRIVATE_VALUE"

public fun otherPublicFunction(): Unit {
    println("Other Public Function!")
}

internal fun otherInternalFunction(): Unit {
    println("Other Internal Function!")
}

private fun otherPrivateFunction(): Unit {
    println("Other Private Function!")
}

public class OtherPublicType
private class OtherPrivateType
internal class OtherInternalType

open class OtherPublicClass {

    public fun publicMethod(){
        println("Other Public Methode!")
    }
    private fun privateMethod(){
        println("Other Private Methode!")
    }
    internal fun internalMethod(){
        println("Other Internal Methode!")
    }
    protected fun protectedMethod(){
        println("Other Protected Methode!")
    }

}


class OtherChildClass : OtherPublicClass() {
    fun  callTest(){
        println("OtherChildClass.callTest")
        publicMethod()
        protectedMethod()
        internalMethod()
//        privateMethod()


    }
}
