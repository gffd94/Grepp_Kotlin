package S11

// 직접적으로 인스턴스화가 될 수 없다.
abstract class AbsClass {

    abstract fun absMethod() // body를 달 수 없음. , 상속받은 클래스는 abstract는 반드시 구현해줘야 한다.

    fun concreteMethod1() {
        println("정의가 되어있는 메서드 1")
    }

    open fun concreteMethod2() {
        println("정의가 되어있는 메서드 2")
    }

}

fun main() {

    val payment = listOf(KakaoPaymentProcessor(), NaverPaymentProcessor())

    for (payment in payment) {
        payment.pay(30000)
    }

}

// 추상클래스를 받는 구현클래스 , abstract는 open이 포함되어 있다.
class ImplClass : AbsClass() {

    override fun absMethod() {
        println("구현한 메서드! ")
    }

    override fun concreteMethod2() {
        println("정의가 되어있는 메서드 1")
    }

}

abstract class PaymentProcessor(val type: String) {

    abstract fun pay(amount: Int)

    open fun printReceipt() {
        println("==== 영수증 ====")
        println("=============")
    }

}

class KakaoPaymentProcessor : PaymentProcessor("Kakao") {
    override fun pay(amount: Int) {
        // 생성자 필드를 상속받았기 때문에 type 사용 가능
        println("${amount}원을 ${type}페이로 결제합니다!")
    }
}

class NaverPaymentProcessor : PaymentProcessor("Naver") {
    override fun pay(amount: Int) {
        println("${amount}원을 ${type}페이로 결제합니다!")
    }
}