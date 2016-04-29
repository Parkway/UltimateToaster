fun middlebury() {
    println("What would you like to do?\nRest?\nContinue on your adventure?\nExplore the Town?")
    var middlechoice = readLine()?.toLowerCase()
    if (middlechoice == "rest")
        println("Resting...\nResting...\nResting...")
    if (middlechoice == "continue")
        println("Wow, you don't mess around.\nLet's go then.")
    if (middlechoice == "explore")
        exploremiddle()
    else
        println("That's not one of your options.")
        middlebury()
}
fun wheatland() {
    println("Ah, a lovely village.")
    println("Anyways, what would you like to do?\nRest?\nContinue on your adventure?\nExplore the Town?")
    var wheatchoice = readLine()?.toLowerCase()
    if (wheatchoice == "rest")
        println("Resting...\nResting...\nResting...")
    if (wheatchoice == "continue")
        println("Wow, you don't mess around.\nLet's go then.")
    exploremiddle()
}
fun pumpernickelburg() {
    println("Alright, off to Pumpernickelburg we go!")
    println("What would you like to do?\nRest?\nContinue on your adventure?\nExplore the Town?")
    var pumperchoice = readLine()?.toLowerCase()
    if (pumperchoice == "rest")
        println("Resting...\nResting...\nResting...")
    if (pumperchoice == "continue")
        println("Wow, you don't mess around.\nLet's go then.")
    return
}
fun northsourton() {
    println("Ah, the tastiest village around.")
    println("Anyways, what would you like to do?\nRest?\nContinue on your adventure?\nExplore the Town?")
    var northchoice = readLine()?.toLowerCase()
    if (northchoice == "rest")
        println("Resting...\nResting...\nResting...")
    if (northchoice == "continue")
        println("Wow, you don't mess around.\nLet's go then.")
}