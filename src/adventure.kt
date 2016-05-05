import kotlin.system.exitProcess

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
            println("You lower the dangling bucket into the well, and submerge it in the stagnant water.\n" +
                    "You grab the bucket and begin to slurp loudly when it occurs to you that you're a toast, and drop the bucket quickly.\n" +
                    "But it's to late. You begin to decompose into a soggy mess and crumble to the ground.\n" +
                    "You have died.")
            exitProcess(1)
        } "throw penny","2" -> {
            println("You reach into your pocket and produce a small copper disc, and chuck it into the well.\n" +
                    "You listen to the penny ricochet from wall to wall while it falls into the dark nothingness.")
    }
    }
}