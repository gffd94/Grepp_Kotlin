package S13

// signton이나 익명객체를 만들기위한 객체


// 단하나의 싱글톤 객체로 생성 하고 생성자를 만들 수 없다.
object Logger {

    fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")

}

object Config {
    val appName : String
    val version: String
    init {
        println("Config initialized")
        appName = "MyApp"
        version = "1.0"
    }
}

interface ClickListener{
    fun onClick()
}

fun handleClick(listener: ClickListener) {
    listener.onClick()
}

class Game {
    companion object Settings{
        val difficulty = "Hard"
        fun printSettings() = println("Settings = ${difficulty}")
    }
}

open class ObjAnimal (val name: String) {
    open fun eat(sth :String) = println("$sth 를 먹는다")
}

object Dog :ObjAnimal("포리"){
    override fun eat(sth: String) {
        println("${name}가 배고프다")
        super.eat(sth)
    }
}
    

fun main() {

    Logger.log("Hello")

    Config.appName

    handleClick(object : ClickListener{
        override fun onClick() {
            println("onCLick을 직접 구현해서 사용 가능하다")
        }
    })

    Game.Settings.difficulty
    Game.Settings.printSettings()

    Game.difficulty
    Game.printSettings()

    Dog.name
    Dog.eat("뼈다귀")

    
}