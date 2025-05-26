package S06

fun main (){

    for ( i in 1..10){
        if( i == 5){
            break
        }
        print("$i")
    }
    println()

    for ( i in 1 .. 3 ){
        for (j in 1.. 3){
            if (j == 2) break
            println("i = $i, j = $j")
        }
    }
    println()

    first@for ( i in 1 .. 3 ){
        for (j in 1.. 3){
            if (j == 2) break@first
            print("i = $i, j = $j")
        }
    }
    println()

    val board = listOf(
        listOf(1,2,3),
        listOf(4,5,6),
        listOf(7,8,9),
    )

    val target = 5

    search@for ( i in board.indices){ // indices : Collection 타입의 index 범위를 반환 ( 0,1,2 ) 반환
        for (j in board[i].indices){
            println("[${i}][${j}] = ${board[i][j]}")
            if(board[i][j] == target){
                println("타겟발견!")
                break@search
            }
        }
    }

}
