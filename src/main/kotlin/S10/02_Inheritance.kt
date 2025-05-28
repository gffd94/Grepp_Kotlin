package S10

fun main() {
    OopDog("흰둥이")
    val oopCat = OopCat()
    println("oopCat.name = ${oopCat.name}")
}

open class OopAnimal(val name: String)


class OopDog(name: String) : OopAnimal(name)

class OopCat : OopAnimal {

    constructor() : super("까망이")

}