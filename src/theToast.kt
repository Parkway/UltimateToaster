import kotlin.system.exitProcess

fun main(args: Array<String>) {
    start()
}
fun start() {
    println("I am Butters the Toast. Follow me on my quest to become the ultimate toast.")
    println("Do you accept?")
    val play = readLine()?.toLowerCase()
    if(play!!.contains("y")) {
        println("Lovely.")
        yes() }
    else if (play.contains("n")) {
        no()
    } else {
        println("Please try again. It's a yes or no question.\n")
        start()
    }
}
fun yes() {
        println("\nNow, where should we get started?\n\nWheatland?[1] \nPumpernickelburg?[2] \nNorth Sourton?[3] \nMiddlebury?[4] ")
        val townName = readLine()?.toLowerCase()
        if (townName == "wheatland"|| townName == "1") {
            println("Ah, a very nice village.")
            wheatland()
        } else if (townName == "pumpernickelburg"|| townName == "2") {
            println("Alright, off to Pumpernickelburg we go!")
            pumpernickelburg()
        } else if (townName == "north sourton"|| townName == "3") {
            println("Ah, the tastiest village around.")
            northsourton()
        } else if (townName == "middlebury"|| townName == "4") {
        println("Literally not even a kind of bread..")
        middlebury()
    }
        else
            println("Please Try Again")
            yes()
}
fun no() {
    println("Well that's fine. I'll just be a boring toast. *sniffles*")
    exitProcess(1)
}
