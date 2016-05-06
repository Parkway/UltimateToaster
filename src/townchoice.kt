fun wheatland() {
    println("What would you like to do?\nContinue on your adventure?[1]\nExplore the Town?[2]")
    val wheatchoice = readLine()?.toLowerCase()
    when (wheatchoice) {
        "continue","1" -> {
            println("Let's get going then!")
            adventure0()
        }"explore","2" -> {
            explorewheat()
        }
        else -> {
            println("Not an option, please try again.")
            wheatland()
        }
    }
}
fun pumpernickelburg() {
    println("What would you like to do?\nContinue on your adventure?[1]\nExplore the Town?[2]")
    val pumperchoice = readLine()?.toLowerCase()
    when (pumperchoice) {
         "continue","1" -> {
            println("Let's get going then!")
            adventure0()
        }"explore","2" -> {
            explorepump()
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
    println("You wake up feeling very refreshed.\n")
}