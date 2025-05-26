package S05

fun main () {
    val score: Int = 95

    val result: String = if(score > 90) {
        "A"
    }else if(score < 90) {
        "B"
    }else {
        "C"
    }

    println("result: $result")

    val result2 = if( score > 90) 'A' else if(score > 80 ) 'B' else 'C'
    
    val result3: String = if( score > 90){
        println("A로 합격하셨습니다.!")
        "A"
    }else if (score > 80){
        println("B로 합격하셨습니다.!")
        "B"
    }else {
        println("C로 불합격하셨습니다.!")
        "C"
    }

    println("result3 = ${result3}")

        

}