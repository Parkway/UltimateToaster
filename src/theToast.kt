fun main(args: Array<String>) {
    println("I am a toast. Follow me on my quest to become the ultimate toast.")
    println("Do you accept?")
    var play = readLine()?.toLowerCase()
    if (play == "yes") {
        println("Lovely")
        println("\nNow, where should we get started?\nMiddlebury? \nWheatland? \nPumpernickelburg? \nNorth Sourton?")
        var townName = readLine()?.toLowerCase()
            if (townName == "Middlebury")
                middlebury()
            if (townName == "Wheatland")
                wheatland()
            if (townName == "Pumpernickelburg")
                pumpernickelburg()
            if (townName == "North Sourton") {
                northsourton()
            }
    } else if (play == "no") {
        println("That's fine, I guess. *cough*cunt*cough*")
        return
    }
}
fun middlebury() {
    println("That's not even a goddamn bread.")
}
fun wheatland() {
    print("Ah, a lovely village.")
}
fun pumpernickelburg() {
    print("Alright, off to Pumpernickelburg we go!")
}
fun northsourton() {
    print("Cancer")
}