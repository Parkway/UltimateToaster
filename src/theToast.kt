/**
 * Created by parkway on 4/14/16.
 */
fun main(args: Array<String>) {
    println("I am a toast. Follow me on my quest to become the ultimate toast.")
    println("Do you accept?")
    var dicks = readLine()?.toLowerCase()
    if (dicks == "yes") {
        println("Lovely")
        println("\nNow, where should we get started?\nMiddlebury? \nWheatland? \nPumpernickelburg? \nNorth Sourton?")
        var dicks2 = readLine()?.toLowerCase()
            if (dicks2 == "Middlebury")
                middlebury()
            if (dicks2 == "Wheatland")
                wheatland()
            if (dicks2 == "Pumpernickelburg")
                pumpernickelburg()
            if (dicks2 == "North Sourton") {
                northsourton()
            }
    } else if (dicks == "no") {
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
    print("Test")
}
fun northsourton() {
    print("Cancer")
}