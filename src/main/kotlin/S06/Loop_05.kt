package S06

fun main (){
    a1()
    a2()

}

fun a1(){
    val k = 7

    for (i in 1..9) {
        println("${k} x ${i} = ${k*i}")
    }
}

fun a2(){
    for (i in 1..5) {
        for (j in 1..5) {
            print("*")
        }
        println()
    }
}


