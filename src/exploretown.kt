fun main(args: Array<String>) {

}

fun explorewheat() {
    println("After searching Wheatland for several hours, you find: \nAn Inn[1] and an Armory[2]\n" +
            "If you're ready to leave, you can Exit[3] the town, or Continue[4] on your adventure." +
            "What would you like to do?")
    val wheatchoice = readLine()?.toLowerCase()
    when(wheatchoice) {
        "inn","1" -> {
            inn()
            explorewheat()
        }"armory","2" -> {
            armory()
            explorewheat()
        }"exit","3" -> {
            yes()
        }"continue","4" -> {
            adventure0()
        }
    }
}
fun explorepump() {
    println("After searching Pumpernickelburg for several hours, you find: \nAn Altar[1]" +
            "If you're ready to leave, you can Exit[2] the town or Continue[3] at any time." +
            "Where would you like to go?\n")
    val pumpchoice = readLine()?.toLowerCase()
    when (pumpchoice) {
        "altar","1" -> {
            println("The inscription beneath the massive stone shrine reads\n" +
                    "\"In honor of our creator, the Hobart Toaster.\"\n" +
                    "The statue has a stange, surreal mist surrounding it.")
            explorepump()
        }"exit","2" -> {
            yes()
        }"continue","3" -> {
            println("Better get going.")
            adventure0()
        }
    }
}
fun armory() {
    println("You chat up the blacksmith, and he offers you armor and a weapon. Do you accept?")
    val armorchoice = readLine()?.toLowerCase()
    if(armorchoice!!.contains("y")) {
        println("You dawn the armor, and take the finest sword available.\n")
    }
    else if(armorchoice.contains("n")) {
        println("Um, okay. Well, what do you want to do now? Continue your journey, or explore the rest of the town?")
    }
}
fun inn() {
    println("You walk into the inn and are greeted by an older sourdough toast.")
    println("\"My name is Jefferson, and I'm the Innkeeper. Are you in need of a place to stay?\"")
    val choice = readLine()?.toLowerCase()
    if (choice == "yes") {
        println("\"We only have one room remaining. Here is the key. Room 7.\"")

    }

}