package com.example.rockpaperscissorgame

fun main(){
    var computerChoice = ""
    var playerChoice = ""

    println("Enter Rock, Paper or Scissor")
    playerChoice = readln()

    val randomNumber = (1 .. 3).random()



//    if(randomNumber == 1){
//        computerChoice = "Rock"
//    }
//    else if(randomNumber == 2){
//        computerChoice = "Paper"
//    }
//    else if(randomNumber == 3){
//        computerChoice = "Scissor"
//    }


    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissor"
        }
    }

    println(computerChoice)

    val winner = when{
        playerChoice == computerChoice -> "Draw"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Rock" && computerChoice == "Scissor" -> "Player"
        playerChoice == "Scissor" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }


    if(winner == "Draw") print("Its a Draw")
    else print("$winner Won!")

}