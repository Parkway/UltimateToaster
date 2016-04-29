fun main(args: Array<String>) {

}

fun exploremiddle(){
    println("After searching the town for several hours, you find: \nAn Inn\nAn Armory\nAn Altar")
    loop@println("Where would you like to go?")
    var midchoice = readLine()?.toLowerCase()
    if (midchoice == "armory")
        println("You chat up the blacksmith, and he offers you armor and a weapon. Do you accept?")
        var armorchoice = readLine()?.toLowerCase()
        if (armorchoice == "yes") {
            println("You dawn the armor, and take the finest sword available.")
        }
        else if (midchoice == "no") {
            println("Um, okay. Well, what do you want to do now? Continue your journey, or explore the rest of the town?")
        }
}