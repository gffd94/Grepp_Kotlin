package S14

import java.awt.Robot

fun main() {

    val result: Result<Int> = runCatching {
        10/0
    }

    result.onSuccess {
        println("나눗셈한 결과 ${it}")
    }

    result.onFailure {
        println("오류가 발생한 결과 : ${it}")
    }


//    runCatching {
//        10/0
//    }.onSuccess {
//        println("나눗셈한 결과 ${it}")
//    }.onFailure {
//        println("오류가 발생한 결과 : ${it}")
//    }


    class RobotFactory {
        fun make(mat: Int = 10): Robot {
            val parts = makeParts(mat)
            result
        }

        private fun assemble(parts: List<String>) : Robot {
            println("부품을 이용하여 조립합니다.")
             if ((1..10).random() <= 2){
                 throw IllegalArgumentException("유감스럽게도 로봇 조립에 실패했습니다.")
             }

            return Robot(parts)
        }

        private fun makeParts(materialAmount: Int): List<String> {
            var remain = materialAmount

            println("${remain}만큼의 금속을 이용해서 로봇의 부품을 조립힙니다")

            remain -= (1..10).random()
            println("로봇의 팔을 생성했습니다.")
            if(remain < 8) {
                throw IllegalArgumentException("몸통 재료가 부족합니다.")
            }

            remain -= (1..8).random()
            println("로봇의 몸통을 생성했습니다.")
            if (remain < 6) {
               throw IllegalArgumentException("몸통 재료가 부족합니다.")
            }

            remain -= (1..4).random()
            println("로봇의 머리를 생성했습니다.")

            if(remain < 2) {
                throw IllegalArgumentException("다리 재료가 부족합니다.")
            }

            remain -= (1..2).random()
            println("로봇의 다리를 생성했습니다.")

            println("로봇을 재료를 완성했습니다.")

            return listOf("몸통", "머리", "다리", "팔")
        }

    }

    class Robot(val parts: List<String>) {
        fun activate(){
            for (part in parts){
                println("${part}의 이상유무를 확인하빈디ㅏ.!")
            }
            println("동작합니다")

        }
    }


}