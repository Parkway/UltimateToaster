import kotlin.system.exitProcess

fun middlebury() {
    println("What would you like to do?\nRest?\nContinue on your adventure?\nExplore the Town?")
    var middlechoice = readLine()?.toLowerCase()
    if (middlechoice == "rest") {
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
            println("\n")
            i--
        }
        middlebury()
    } else if (middlechoice == "continue") {
        println("\nLet's go then.")
        adventure()
        exitProcess(1)
    } else if (middlechoice == "explore") {
        exploremiddle()
    }else
        println("That's not one of your options.")
        middlebury()
}
fun wheatland() {
    println("Ah, a lovely village.")
    println("Anyways, what would you like to do?\nRest?\nContinue on your adventure?\nExplore the Town?")
    var wheatchoice = readLine()?.toLowerCase()
    if (wheatchoice == "rest") {
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
            println("\n")
            i--
        }
    } else if (wheatchoice == "continue") {
        println("Wow, you don't mess around.\nLet's go then.")
        adventure()
    } else if (wheatchoice == "explore")
        explorewheat()
}
fun pumpernickelburg() {
    println("Alright, off to Pumpernickelburg we go!")
    println("What would you like to do?\nRest?\nContinue on your adventure?\nExplore the Town?")
    var pumperchoice = readLine()?.toLowerCase()
    if (pumperchoice == "rest") {
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
            println("\n")
            i--
        }
        pumpernickelburg()
    } else if (pumperchoice == "continue") {
        println("Wow, you don't mess around.\nLet's go then.")
        adventure()
    } else if (pumperchoice == "explore")
        explorepump()
}
fun northsourton() {
    println("Ah, the tastiest village around.")
    println("Anyways, what would you like to do?\nRest?\nContinue on your adventure?\nExplore the Town?")
    var northchoice = readLine()?.toLowerCase()
    if (northchoice == "rest") {
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
            println("\n")
            i--
        }
        northsourton()
    } else if (northchoice == "continue") {
        println("Wow, you don't mess around.\nLet's go then.")
        adventure()
    } else if (northchoice == "explore") {
        explorenorth()
    }
}