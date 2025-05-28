package S07

fun main ( ){




    fun apply1(fn : (Int) -> Int, number: Int): Int {
        return fn(number)
    }

    apply1({x -> x*x}, 10)

    fun twoTimesAbs(x: Int) : () ->  Int {
        return {
            if( x > 0 ) x * 2 else ( x * -1) * 2

        }
    }

    val absV1 = twoTimesAbs(5)
    val absV2 = twoTimesAbs(-5)

    println(absV1())
    println(absV2())

    fun times(x: Int) : (Int) -> Int {
        return {
            t-> x * t
        }
    }

    val times = times(5)
    println(times(3))

}