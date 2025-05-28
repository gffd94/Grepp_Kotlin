package S08

class 붕어빵 {

    var 속재료: String? = null

    fun 어떤_붕어빵() {
        println("속재료: $속재료")
        println("저는, $속재료 가 들어간 붕어빵입니다.")
    }

    fun main () {
        // new 키워드를 하지 않고도 클래스를 인스턴스로 생성할 수 있다.
        val 팥붕어빵: 붕어빵 = 붕어빵()

        팥붕어빵.속재료 = "팥"
        팥붕어빵.어떤_붕어빵()
    }

}