fun adventure0() {
    println("Going on an adventure!\n*adventure intensifies*\n\n")
    adventure1()
}
fun adventure1() {
    println("After several hours of wandering in uncharted territories, you come across a well.\nWhat would you like to do?")
    println("Try to drink from the well?[1]\nThrow a penny in for good luck?[2]\nIgnore the well and continue on?[3]")
    val well = readLine()?.toLowerCase()
    when(well) {
        "drink","1" -> {
            println("You ")
        }
    }
}