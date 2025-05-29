package S13

// Data Transfer Object
// data 클래스는 equals, hashcode, tostring을 자동으로 override해준다!
data class MemberLabel(var name: String, var code: String)

data class CustomerInfo(var name: String, var grade: String) {
    init {
        if (grade == "GOLD") name = "*${name}*"
    }
}

fun main() {

    val member1 = MemberLabel("MemberA", "MEMBER_A")
    val member2 = MemberLabel("MemberA", "MEMBER_A")

    println(member1 == member2)
    println(member1 === member2)

    println("member1.hashCode() = ${member1.hashCode()}")
    println("member2.hashCode() = ${member2.hashCode()}")

    val member3 = member2.copy("MemberB")

    println(member2.toString())
    println(member3.toString())

    val (member1Name, member1Code) = member1
    println("$member1Name $member1Code")

    val (member2Name, _) = member2
    println("$member2Name")
    val (_, member2Code) = member2
    println("$member2Code")

    val member3Name = member3.component1()

    println("member3Name = ${member3Name}")


}