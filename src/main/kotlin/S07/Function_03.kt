package S07

var npCounter = 0

// 순수하지 않은 함수 : 다른 상태에 관여하는 함수
fun increaseNpCounter(x: Int): Int {
    npCounter++
    return x + npCounter
}

fun main () {

    val sayHello = fun() {
        println("Hello World!!")
    }

    sayHello()
    val sayBye: () -> Unit = { println("Bye World!") }
    sayBye()

    println()

    val sum: (Int, Int) -> Int = { a, b ->
        println("입력받은 값 : ${a}, ${b}")
        a + b }

    val sumReuslt:Int = sum (2,3)
    println("sumResult = $sumReuslt")

    // label : return 하려는 위치를 정해줌 -> 정해주지 않으면 어디서 return할지 몰라서 정상 동작하지 않음
    val ap: (Int, Int) -> Int = ap@{x, y ->
        if(x > y) {
            return@ap x
        }
        x+y
    }

    val app1 = ap(100,200)
    val app2 = ap(200,100)
    println("app1 = $app1")
    println("app2 = $app2")


    println(npCounter)
    println(power(3))
    println(power(3))
    println(power(5))
    println(power(3))

    println(npCounter)
    println()

    println(increaseNpCounter(10))
    println(increaseNpCounter(10))
    println(increaseNpCounter(10))
    println(npCounter)

}

// 순수함수 : 다른 어떠한 상태도 관여하지 않고 관여 받지도 않음
fun power(x :Int): Int {
    return x*x
}