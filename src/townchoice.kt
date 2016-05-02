import kotlin.system.exitProcess

fun middlebury() {
    println("What would you like to do?\nRest?[1][1]\nContinue on your adventure?[2][2]\nExplore the Town?[3][3]")
    var middlechoice = readLine()?.toLowerCase()
    if (middlechoice == "rest"|| middlechoice == "1") {
        rest()
        middlebury()
    } else if (middlechoice == "continue"|| middlechoice == "2") {
        println("\nLet's go then.")
        adventure()
        exitProcess(1)
    } else if (middlechoice == "explore"|| middlechoice == "3") {
        exploremiddle()
    } else {
        println("That's not one of your options.")
        middlebury()
    }
}
fun wheatland() {
    println("Anyways, what would you like to do?\nRest?[1]\nContinue on your adventure?[2]\nExplore the Town?[3]")
    var wheatchoice = readLine()?.toLowerCase()
    if (wheatchoice == "rest" || wheatchoice == "1") {
        rest()
        wheatland()
    } else if (wheatchoice == "continue"|| wheatchoice == "2") {
        println("Wow, you don't mess around.\nLet's go then.")
        adventure()
    } else if (wheatchoice == "explore"|| wheatchoice == "3") {
        explorewheat()
    }
}
fun pumpernickelburg() {
    println("What would you like to do?\nRest?[1]\nContinue on your adventure?[2]\nExplore the Town?[3]")
    var pumperchoice = readLine()?.toLowerCase()
    if (pumperchoice == "rest" || pumperchoice == "1") {
        rest()
        pumpernickelburg()
    } else if (pumperchoice == "continue") {
        println("Wow, you don't mess around.\nLet's go then.")
        adventure()
    } else if (pumperchoice == "explore")
        explorepump()
}
fun northsourton() {
    println("Now, what would you like to do?\nRest?[1]\nContinue on your adventure?[2]\nExplore the Town?[3]")
    var northchoice = readLine()?.toLowerCase()
    if (northchoice == "rest" || northchoice == "1") {
        rest()
        northsourton()
    } else if (northchoice == "continue"|| northchoice == "2") {
        println("Wow, you don't mess around.\nLet's go then.")
        adventure()
    } else if (northchoice == "explore"|| northchoice == "2") {
        explorenorth()
    }
}
fun rest() {
    var i = 3
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