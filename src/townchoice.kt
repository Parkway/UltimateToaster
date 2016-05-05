fun wheatland() {
    println("What would you like to do?\nRest?[1]\nContinue on your adventure?[2]\nExplore the Town?[3]")
    val wheatchoice = readLine()?.toLowerCase()
    when (wheatchoice) {
        "rest","1" -> {
            rest()
            wheatland()
        } "continue","2" -> {
            println("Let's get going then!")
            adventure0()
        } "explore","3" -> {
            explorewheat()
        }
        else -> {
            println("Not an option, please try again.")
            wheatland()
        }
    }
}
fun pumpernickelburg() {
    println("What would you like to do?\nRest?[1]\nContinue on your adventure?[2]\nExplore the Town?[3]")
    val pumperchoice = readLine()?.toLowerCase()
    when (pumperchoice) {
        "rest","1" -> {
            rest()
            pumpernickelburg()
        } "continue","2" -> {
            println("Let's get going then!")
            adventure0()
        } "explore","3" -> {
            explorepump()
        }
    }
}
fun northsourton() {
    println("Now, what would you like to do?\nRest?[1]\nContinue on your adventure?[2]\nExplore the Town?[3]")
    val northchoice = readLine()?.toLowerCase()
    when (northchoice) {
        "rest","1" -> {
            rest()
            northsourton()
        } "continue","2" -> {
            println("Let's get going then!")
            adventure0()
        } "explore","3" -> {
            explorenorth()
        }
    }
}
fun middlebury() {
    println("What would you like to do?\nRest?[1]\nContinue on your adventure?[2]\nExplore the Town?[3]")
    val middlechoice = readLine()?.toLowerCase()
    when (middlechoice) {
        "rest","1" -> {
            rest()
            middlebury()
        } "continue","2" -> {
            println("Let's get going then!")
            adventure0()
        } "explore","3" -> {
            exploremiddle()
        }
        else -> {
            println("Not one of the options.")
            middlebury()
        }
    }
}
fun rest() {
    println("How many hours would you like to rest?")
    var i = readLine()!!.toInt()
    if (i > 20) {
        println("That's too much sleep. The adventure will be over before you even wake up.")
        rest()
    }
    if (i < 0) {
        println("You can't sleep negative hours, numbnuts.")
        rest()
    }
    while (i > 0) {
        print("Resting")
        Thread.sleep(400)
        print(".")
        Thread.sleep(400)
        print(".")
        Thread.sleep(400)
        print(".")
        Thread.sleep(800)
        println("")
        i--
    }
    println("\n")
}