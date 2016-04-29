fun main(args: Array<String>) {
    start()
}
fun start() {
    println("I am Butters the Toast. Follow me on my quest to become the ultimate toast.")
    println("Do you accept?")
    var play = readLine()?.toLowerCase()
    if (play == "yes")
        yes()
    else if (play == "no")
        no()
    else
        println("Please try again. It's a yes or no question.")
        start()
}
fun yes() {
        println("Lovely")
        println("\nNow, where should we get started?\nMiddlebury? \nWheatland? \nPumpernickelburg? \nNorth Sourton?")
        var townName = readLine()?.toLowerCase()
        if (townName == "middlebury")
        middlebury()
        if (townName == "wheatland")
        wheatland()
        if (townName == "pumpernickelburg")
        pumpernickelburg()
        if (townName == "north sourton")
        northsourton()
}
fun no() {
    println("Well that's fine. I'll just be a boring toast. *sniffles*")
}
