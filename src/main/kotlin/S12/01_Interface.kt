package S12

fun main() {
    val instanceA: OopA = OopAImpl()

    instanceA.a()
    instanceA.b()
//    instanceA.c()



}

interface OopA {
    // public abstract 가 생략되어있음.
    public abstract fun a() // open이 자동으로 붙어있음
    fun b()
}

class OopAImpl : OopA {
    override fun a() {
        println("OopAImpl.a()")
    }
    override fun b() {
        println("OopAImpl.b()")
    }
    fun c() {
        println("OopAImpl.c()")
    }
}
