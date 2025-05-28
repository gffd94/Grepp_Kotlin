package S08

//main
fun main () {
    val carA = AClsCar("벤츠", 300, true)
    val carB = BClsCar("BMW", 500, true)
    val carC = CClsCar("아우디 컴버터블", 200, true)

    carA.intro()
    carB.intro()
    carC.intro()

    println("주문 생성합니다.")
    val orderLv1 =
        CoffeeOrderLv1(name = "아메리카노", size = "T", extraShot = true, extraCream = false)
    val orderLv2 =
        CoffeeOrderLv2(name = "아메리카노", size = "T", extraShot = true, extraCream = false)
    val orderLv3 =
        CoffeeOrderLv3(name = "아메리카노", size = "G", extraShot = true, extraCream = false)
    println("주문 종료합니다.")
}

// 주 생성자
class AClsCar constructor(
    name: String, size: Int, isGasoline: Boolean
){

    val name : String = name
    val size : Int = size
    val isGasoline : Boolean = isGasoline

    fun intro() {
        // "이름" 이름의 "사이즈"크기의 "가솔린"/"디젤" 차 입니다.
      println("$name 이름의 $size 크기의 ${if(isGasoline) "가솔린" else "디젤"} 차 입니다.")
      println(name)
    }

}

class BClsCar (
    name: String, size: Int, isGasoline: Boolean
){

    val name : String = name
    val size : Int = size
    val isGasoline : Boolean = isGasoline

    fun intro() {
        // "이름" 이름의 "사이즈"크기의 "가솔린"/"디젤" 차 입니다.
      println("$name 이름의 $size 크기의 ${if(isGasoline) "가솔린" else "디젤"} 차 입니다.")
      println(name)
    }

}

// 생성자에 매개변수에 변수를 선언하는 키워드를 넣어주면 속성처럼 사용할 수 있다.
class CClsCar (
    val name: String, val size: Int, val isGasoline: Boolean
){

//    val name : String = name
//    val size : Int = size
//    val isGasoline : Boolean = isGasoline

    fun intro() {
        // "이름" 이름의 "사이즈"크기의 "가솔린"/"디젤" 차 입니다.
      println("$name 이름의 ${size} 크기의 ${if(isGasoline) "가솔린" else "디젤"} 차 입니다.")
    }

}

class DClsCar {

    val name: String
    val size: Int
    val color: String
    val isGasoline: Boolean

    // 부 생성자 -> 주 생성자를 한번 호출
    constructor() {
        this.name = "D Class Car"
        this.color = "Black"
        this.size = 10
        this.isGasoline =  true
    }

    // 부 생성자는 Overloading 가능
    constructor(name: String) {
        this.name = name
        this.color = "Black"
        this.size = 10
        this.isGasoline =  true
    }

    constructor(name: String, color: String) {
        this.name = name
        this.color = color
        this.size = 10
        this.isGasoline =  true
    }

    constructor(name: String, color: String, size: Int) {
        this.name = name
        this.color = color
        this.size = size
        this.isGasoline =  true
    }

    constructor(name: String, color: String, size: Int, isGasoline: Boolean) {
        this.name = name
        this.color = color
        this.size = size
        this.isGasoline =  isGasoline
    }

}


class ConsMember(idCard: String){

    var idCard: String = idCard
    var name: String = ""
    var address: String = ""

    constructor(
        name: String, address: String, idCard: String
    ) : this(idCard){
        this.name = name
        this.address = address
    }
}

class CoffeeOrderLv1(
    val name: String, var size: String, val extraShot: Boolean, val extraCream: Boolean
) {

    var price = 0

    init {

        println("현재가격 = ${price}")
        println("현재사이즈 = ${size}")

        size = when(size){
            "T" -> "Tall"
            "G" -> "Grancde"
            "V" -> "Venti"
            else -> "Tall"
        }

        price = when (size) {
            "Tall" -> 4500
            "Grande" -> 5500
            "Venti" -> 6500
            else -> 3500
        }

        if (extraShot){
            price += 1000
        }

        if(extraCream){
            price += 500
        }

        println("""
            주문한 커피
            이름           : $name
            사이즈         : $size 
            샷 추가        : ${if (extraShot) "추가" else "추가 안함"}
            크림 추가       : ${if (extraCream) "추가" else "추가 안함"}
            가격           : $price
        """.trimIndent())
        println()


    }


}

class CoffeeOrderLv2(
    val name: String, var size: String, val extraShot: Boolean, val extraCream: Boolean
) {

    var price = 0

    init {

        println("현재가격 = ${price}")
        println("현재사이즈 = ${size}")

//        if (!(size.equals("T") || size.equals("G") || size.equals("V")))
        if (size !in arrayOf("T" , "G", "V")){
            throw IllegalArgumentException("사이즈는 T , G, V 중 하나여야만 합니다.")
        }

        size = when(size){
            "T" -> "Tall"
            "G" -> "Grancde"
            "V" -> "Venti"
            else -> "Tall"
        }

        price = when (size) {
            "Tall" -> 4500
            "Grande" -> 5500
            "Venti" -> 6500
            else -> 3500
        }

        if (extraShot){
            price += 1000
        }

        if(extraCream){
            price += 500
        }

        println("""
            주문한 커피
            이름           : $name
            사이즈         : $size 
            샷 추가        : ${if (extraShot) "추가" else "추가 안함"}
            크림 추가       : ${if (extraCream) "추가" else "추가 안함"}
            가격           : $price
        """.trimIndent())
        println()


    }


}

class CoffeeOrderLv3(
    val name: String, var size: String, val extraShot: Boolean, val extraCream: Boolean
) {

    var price = 0
// init 블록은 여러개를 만들 수 있고 순서대로 작동한다.
    init {
        println("size를 확인합니다.")
        if (size !in arrayOf("T" , "G", "V")){
            throw IllegalArgumentException("사이즈는 T , G, V 중 하나여야만 합니다.")
        }

        size = when(size){
            "T" -> "Tall"
            "G" -> "Grancde"
            "V" -> "Venti"
            else -> "Tall"
        }
        println("$name 을 ${size}로 하겠습니다.")
        println()

    }

    
    init {

        price = when (size) {
            "Tall" -> 4500
            "Grande" -> 5500
            "Venti" -> 6500
            else -> 3500
        }


    }


    init {
        println("샷 추가하겠습니까?")

        if (extraShot){
            price += 1000
            println("샷 추가하셔서 ${price}입니다.")
        }else {
            println("샷 추가 안하셔서 ${price}입니다.")
        }
        println()
    }

    init {
        println("크림 추가하겠습니까?")

        if (extraCream){
            price += 500
            println("크림 추가하셔서 ${price}입니다.")
        }else {
            println("크림 추가 안하셔서 ${price}입니다.")
        }
        println()
    }

    init {
        println("커피 주문 영수증입니다.")

        println("""
            주문한 커피
            이름           : $name
            사이즈         : $size 
            샷 추가        : ${if (extraShot) "추가" else "추가 안함"}
            크림 추가       : ${if (extraCream) "추가" else "추가 안함"}
            가격           : $price
        """.trimIndent())
        println()

    }

}




