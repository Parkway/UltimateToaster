fun main(args: Array<String>) {
    println("I am a toast. Follow me on my quest to become the ultimate toast.")
    println("Do you accept?")
    var play = readLine()?.toLowerCase()
    if (play == "yes") {
        println("Lovely")
        println("\nNow, where should we get started?\nMiddlebury? \nWheatland? \nPumpernickelburg? \nNorth Sourton?")
        var townName = readLine()?.toLowerCase()
            if (townName == "middlebury")
                middlebury()
            if (townName == "wheatland")
                wheatland()
            if (townName == "pumpernickelburg")
                pumpernickelburg()
            if (townName == "north sourton") {
                northsourton()
            }
    } else if (play == "no") {
        println("That's fine, I guess.")
        return
    }
}
fun middlebury() {
    println("That's not even a goddamn bread.")
    println("Anyways, what are you wanting to do here?\nRest?\nContinue on your adventure?\nExplore the Town?")
    var middlechoice = readLine()?.toLowerCase()
    if (middlechoice == "Rest")
            println("Resting...\nResting...\nResting...")
            println("Resting...\nResting...\nResting...")
    if (middlechoice == "Continue")
            println("Wow, you don't mess around.\nLet's go then.")
}
fun wheatland() {
    println("Ah, a lovely village.")
    println("Anyways, what are you wanting to do here?\nRest?\nContinue on your adventure?\nExplore the Town?")
    var wheatchoice = readLine()?.toLowerCase()
    if (wheatchoice == "Rest")
        println("Resting...\nResting...\nResting...")
        println("Resting...\nResting...\nResting...")
    if (wheatchoice == "Continue")
        println("Wow, you don't mess around.\nLet's go then.")

}
fun pumpernickelburg() {
    println("Alright, off to Pumpernickelburg we go!")
    println("Anyways, what are you wanting to do here?\nRest?\nContinue on your adventure?\nExplore the Town?")
    var pumperchoice = readLine()?.toLowerCase()
    if (pumperchoice == "Rest")
        println("Resting...\nResting...\nResting...")
        println("Resting...\nResting...\nResting...")
    if (pumperchoice == "Continue")
        println("Wow, you don't mess around.\nLet's go then.")
}
fun northsourton() {
    println("Ah, the tastiest village around.")
    println("Anyways, what are you wanting to do here?\nRest?\nContinue on your adventure?\nExplore the Town?")
    var northchoice = readLine()?.toLowerCase()
    if (northchoice == "Rest")
        println("Resting...\nResting...\nResting...")
        println("Resting...\nResting...\nResting...")
    if (northchoice == "Continue")
        println("Wow, you don't mess around.\nLet's go then.")
}