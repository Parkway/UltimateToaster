fun main(args: Array<String>) {

}
fun explorenorth() {
    println("After searching North Sourton for several hours, you find: \nAn Inn[1]\nAn Altar\nAn Armory[3]")
    println("Where would you like to go?")
    var northchoice = readLine()?.toLowerCase()
    if (northchoice == "armory" || northchoice == "2") {
        armory()
    }
}
fun explorepump() {
    println("After searching Pumpernickelburg for several hours, you find: \nAn Inn[1]\nAn Armory[2]")
    println("Where would you like to go?")
    var pumpchoice = readLine()?.toLowerCase()
    if (pumpchoice == "armory"|| pumpchoice == "2") {
        armory()
        explorepump()
    }
}
fun explorewheat() {
    println("After searching Wheatland for several hours, you find: \nAn Inn[1]\nAn Armory[2]")
    println("Where would you like to go?")
    var wheatchoice = readLine()?.toLowerCase()
    if (wheatchoice == "armory" || wheatchoice == "2") {
        armory()
    }
}
fun exploremiddle() {
    println("After searching Middlebury for several hours, you find: \nAn Inn[1]\nAn Armory[2]")
    println("Where would you like to go?")
    var midchoice = readLine()?.toLowerCase()
    if (midchoice == "inn" || midchoice == "1") {
        inn()
    } else if (midchoice == "armory" || midchoice == "2") {
        armory()
    }
}

fun armory() {
    println("You chat up the blacksmith, and he offers you armor and a weapon. Do you accept?")
    var armorchoice = readLine()?.toLowerCase()
    if(armorchoice!!.contains("y")) {
        println("You dawn the armor, and take the finest sword available.\n")
    }
    else if(armorchoice.contains("n")) {
        println("Um, okay. Well, what do you want to do now? Continue your journey, or explore the rest of the town?")
    }
}
fun inn() {
    println("You walk into the inn and are greeted by an older sourdough toast.")
    println("\"My name is Jefferson, and I'm the Innkeeper. Are you in need of a place to stay?\"")
    var choice = readLine()?.toLowerCase()
    if (choice == "yes") {
        println("\"We only have one room remaining. Here is the key. Room 7.\"")
    }

}