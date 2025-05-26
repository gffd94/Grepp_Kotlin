package S06

var i: Int = 1
var j: Int = 1

fun main() {
    // while

    var count: Int = 0
    while (count <= 10) {
        print("$count ")
        count++
    }

    println()
    while ( i <= 10) printHello()
}


fun printHello() {
    print("Hello ")
    i++
}