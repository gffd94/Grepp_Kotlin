package S11

fun main() {

    val people1 = People("영희")

    people1 eat "햄버거"
    People("철수") eat "콜라"

    people1 a 1 b 2

}

class People(val name: String) {

    infix fun eat(sth: String) {
        println("${name}가 ${sth}를 맛있게 먹습니다.")
    }

    //체이닝도 가능
    infix fun a(t: Int): People {
        return this
    }

    infix fun b(t: Int): People {
        return this
    }


}
