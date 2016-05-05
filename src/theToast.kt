import kotlin.system.exitProcess

fun main(args: Array<String>) {
    start()
}
fun start() {
    println("You are Butters, the most heroic Toast in all the land.\n" +
            "Your king has tasked you with one goal.\n" +
            "Find the fabled Strawberry Jam Mountains, and bring back it's plentiful bounty to your kingdom.")
    println("Do you accept?")
    val play = readLine()?.toLowerCase()
    if(play!!.contains("y")) {
        println("Excellent!")
        yes() }
    else if (play.contains("n")) {
        no()
    } else {
        println("Please try again. It's a yes or no question.\n")
        start()
    }
}
fun yes() {
    println("\nNow, where should we get started?\n\nWheatland?[1] \nPumpernickelburg?[2] \nNorth Sourton?[3] \nMiddlebury?[4]")
    var x = readLine()?.toLowerCase()
    when (x) {
        "wheatland","1" -> {
            println("Ah, a lovely village.")
            wheatland()
        }
        "pumpernickelburg","2" -> {
            println("Off to Pumpernickelburg we go.")
            pumpernickelburg()
        }
        "north sourton","3" -> {
            println("Delicious.")
            northsourton()
        }
        "middlebury","4" -> {
            println("Literally not even a kind of bread.")
            middlebury()
        }
        else -> {
            println("Please try again.")
            yes()
        }
    }
}
fun no() {
    println("Well that's fine. I'll just be a boring toast. *sniffles*")
    exitProcess(1)
}
