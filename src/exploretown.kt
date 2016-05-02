import kotlin.system.exitProcess

fun main(args: Array<String>) {

}

fun exploremiddle() {
    println("After searching the town for several hours, you find: \nAn Inn[1]\nAn Armory[2]")
    println("Where would you like to go?")
    var midchoice = readLine()?.toLowerCase()
    if (midchoice == "armory"|| midchoice == "2")
        println("You chat up the blacksmith, and he offers you armor and a weapon. Do you accept?")
        var armorchoice = readLine()?.toLowerCase()
        if(armorchoice!!.contains("y"))
            println("You dawn the armor, and take the finest sword available.\n")

            else if(armorchoice.contains("n"))
            println("Um, okay. Well, what do you want to do now? Continue your journey, or explore the rest of the town?")

}
fun explorenorth() {

}
fun explorepump() {

}
fun explorewheat() {
    println("Fuck you.")
    exitProcess(1)
}