package S07

fun main() {

    myFunction1()
    myFuction2(5 ,5)
    var result1 = myFunction3()
    println(result1)

    var result2 = myFunction4(2,3)
    println(result2)
}

fun myFunction1() {
    println("Hello World!")
}

fun myFuction2(a: Int, b: Int) {
    println("a와 b의 합은 ${a+b} 입니다")
}

fun myFunction3() :String {
    return "Hello, World!"
}

fun myFunction4(a: Int, b : Int):Int {
    return a+b
}