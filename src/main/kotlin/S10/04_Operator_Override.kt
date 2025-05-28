package S10

// 연산자를 override
fun main() {

    1+1
    ""+""

    val coffee1 = OpCoffee("바나나레떼", "")
    val coffee2 = OpCoffee("고구마라떼", "")

    val result:String = coffee1 + coffee2
    println("result : $result")

    Board() + Post()

    val value = coffee1[10]
    println("value : ${value}")

}

class Board {

    operator fun plus(p: Post): Unit {
        println("게시물 추가 완료")
    }

}

class Post


class OpCoffee(val type: String, val size: String) {

    // +
    operator fun plus(other: OpCoffee): String {
        return "첫번쨰 커피 : ${this.type} , 두번째 커피 : ${other.type}"
    }

    // +=
    operator fun plusAssign(other: OpCoffee) {

    }

    // -
    operator fun minus(other: OpCoffee) {

    }

    //*
    operator fun times(other: OpCoffee) {

    }

    // /
    operator fun div(other: OpCoffee) {

    }

    // %
    operator fun rem(other: OpCoffee) {

    }

    // >  : 무조건 반환값 있어야하네
    operator fun compareTo(other: OpCoffee): Int {
        return -1
    }

    // 인덱싱
    operator fun get(index: Int):String {
        val sizeList = listOf("Tall", "Grande", "Venti", "Trante")
        return sizeList.getOrElse(index) {"그런 사이즈는 없습니다."}

    }

    // in
    operator fun contains(other: OpCoffee): Boolean {
        return false
    }
}