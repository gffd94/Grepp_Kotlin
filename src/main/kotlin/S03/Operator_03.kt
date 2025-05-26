package S03

fun main() {
    var a: Int = 0b0101
    var b: Int = 0b0011

    // and
    val andResult1: Int = a and b
    println("andResult1 = ${andResult1}")
    val andResult2: Int = a.and(b)
    println("andResult2 = ${andResult2}")

    val orResult1 = a or b
    println("orResult1 = ${orResult1}")
    val orResult2  = a.or(b)
    println("orResult2 = ${orResult2}")

    val xorResult1: Int = a xor b
    println("xorResult1 = ${xorResult1}")
    val xorResult2: Int = a.xor(b)
    println("xorResult2 = ${xorResult2}")

    a = 5
    val shlResult1 = a shl 1
    println("shlResult1 = ${shlResult1}")
    val shlResult2 = a.shl(1)
    println("shlResult2 = ${shlResult2}")


}