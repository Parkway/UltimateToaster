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
    }else {
        println("Please try again. It's a yes or no question.\n")
        start()
    }
}
fun yes() {
    println("\nThe great kingdom of Wholegrain consists of two towns:\nWheatland[1] and Pumpernickelburg[2]\nWhere would you like to go?")
    val x = readLine()?.toLowerCase()
    when (x) {
        "wheatland","1" -> {
            println("Ah, a lovely village.")
            wheatland()
        }
        "pumpernickelburg","2" -> {
            println("Off to Pumpernickelburg we go.")
            pumpernickelburg()
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
