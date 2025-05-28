package S09

fun main () {

    val memberV1 = MemberV1("memberA", 10, 3)

    println("MemberV1.name = ${memberV1.name}")

    memberV1.name = "memberB"

    val memberV2 = MemberV2("memberA", 10, 3)

    println("MemberV2.name = ${memberV2.name}")

//    memberV2.name = "memberB" // setter가 닫힘
    
    val memberV3 = MemberV3("memberA", 10, 3)
    memberV3.grade = 0
    println("memberV3.grade = ${memberV3.grade}")

}

// getter, setter 를 따로 선언하지 않아도 위와 같은 방식으로 값을 꺼내고 넣고를 할 수 있다
class MemberV1(var name: String , var age: Int, var grade: Int)

// val 읽기 전용 변수로 선언한다면 setter닫히게 된다.
class MemberV2(val name: String , val age: Int, val grade: Int)

class MemberV3(val name: String , val age: Int, grade: Int){
    // field : 순환 참조 방지
    var grade: Int = grade
        set(value) {
            field = if( value <= 0) 1 else value
        }
}
