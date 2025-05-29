package S13

class HelloRobot {

    // companion = class영역에 같이 올라가게 하는 키워드 ( static 과 동일 )
    // object = 싱글톤 처럼 사용이 가능
    companion object{
        fun hello() {
            println("Hello Robo")
        }
    }

}

class ByeRobot {
    companion object{
        @JvmStatic
        fun bye() {
            println("Bye Robo")
        }
    }
}

fun main() {
    HelloRobot.hello()
    ByeRobot.bye()

}