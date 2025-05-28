package S08

import S08.inner.*
import io.gffd94.*


fun main() {

    println("PUBLIC_VALUE = ${PUBLIC_VALUE}")
    println("INTERNAL_VALUE = ${INTERNAL_VALUE}")
//  println("PRIVATE_VALUE = ${PRIVATE_VALUE}")
    println("OTHER_PUBLIC_VALUE = ${OTHER_PUBLIC_VALUE}")
    // 다른 module에 있기 때문에 접근할 수 없다
//  println("OTHER_INTERNAL_VALUE = ${OTHER_INTERNAL_VALUE}")


    publicFunction()
    internalFunction()
//  privateFunction()

    otherPublicFunction()

    val pType = PublicType()
    val iType = InternalType()
//  val priType = PrivateType()

    val opType = OtherPublicType()

    val publicClass = PublicClass()
    publicClass.publicMethod()
    publicClass.internalMethod()
//  publicClass.privateMethod()
//  publicClass.protectedMethod()

    val otherPublicClass = OtherPublicClass()
    otherPublicClass.publicMethod()
//    otherPublicClass.internalMethod()


    val childClass = ChildClass()
    childClass.callTest()

    val otherChildClass = OtherChildClass()
    otherChildClass.callTest()


}