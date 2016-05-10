fun main(args: Array<String>) {

}

fun explorewheat() {
    println("After searching Wheatland for several hours, you find: \nAn Inn[1] and an Armory[2]\n" +
            "If you're ready to leave, you can Exit[3] the town, or Continue[4] on your adventure.\n" +
            "What would you like to do?")
    val wheatchoice = readLine()?.toLowerCase()
    when(wheatchoice) {
        "inn","1" -> {
            inn()
            println("What would you like to do next? Visit the Armory[2], or visit Pumpernickelburg[3]? Or Continue[4] on your adventure?")
            var wheatchoice2 = readLine()!!.toLowerCase()
            when(wheatchoice2) {
                "armory","2" -> {
                    armory()
                    println("You've now explored the whole town.\nWould you like to visit Pumpernickelburg[3], or get on with your Adventure[4]?")
                    var leavestay = readLine()!!.toLowerCase()
                        if(leavestay == "3" || leavestay == "pumpernickelburg")
                            println("You arrive at Pumpernickelburg.")
                            explorepump()
                }"pumpernickelburg","3" -> {
                    println("You arrive at Pumpernickelburg.")
                    explorepump()
                }"adventure","4","continue" -> {
                    adventure0()
                }else -> {
                    println("Please try again.")
                    explorewheat()
                }
            }
        }"armory","2" -> {
            armory()
            println("What would you like to visit next?\n" +
                    "Go to the Inn[1]? Go to Pumpernickelburg[3]? Continue[4] on your adventure?")
                    var wheatchoice4 = readLine()!!.toLowerCase()
                    when(wheatchoice4) {
                        "inn","1" -> {
                            inn()
                            println("You've now explored the whole town.\nWould you like to visit Pumpernickelburg[3], or get on with your Adventure[4]?")
                                var wheatchoice5 = readLine()?.toLowerCase()
                                when(wheatchoice5) {
                                    "pumpernickelburg","3" -> {
                                        pumpernickelburg()
                                    }"continue","adventure","4" -> {
                                        adventure0()
                                    }
                                }
                        }"pumpernickelburg","3" -> {
                        println("You arrive at Pumpernickelburg.")
                        explorepump()
                        }"continue","4","adventure" -> {
                        adventure0()
                        }else -> {
                            println("Please try again.")
                    }
                    }
        }"exit","3" -> {
            yes()
        }"continue","4" -> {
            adventure0()
        }else -> {
            println("Please try again.")
            explorewheat()
        }
    }
}
fun explorepump() {
    println("After searching Pumpernickelburg for several hours, you find an Altar[1] \n" +
            "If you're ready to leave, you can Exit[2] the town or Continue[3] at any time.\n" +
            "Where would you like to go?\n")
    val pumpchoice = readLine()?.toLowerCase()
    when (pumpchoice) {
        "altar","1" -> {
            println("The inscription beneath the massive stone shrine reads\n" +
                    "\"In honor of our creator, the Hobart Toaster.\"\n" +
                    "The statue has a stange, surreal mist surrounding it.")
            println("It wasn't a very exciting town, and you've explored everything of value.\nWould you like to Continue[1] your adventure or go to Wheatland[2]?")
            var pumpchoice2 = readLine()!!.toLowerCase()
            when(pumpchoice2) {
                "continue","1" -> {
                    adventure0()
                }"wheatland","2" -> {
                explorewheat()
                }
            }
        }"exit","2" -> {
            yes()
        }"continue","3" -> {
            println("Better get going.")
            adventure0()
        }else -> {
            println("Please try again.")
            explorepump()
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
    if (choice!!.contains("y")) {
        println("\"We only have one room remaining. Here is the key. Room 7.\n" +
                "Is this acceptable?\"")
                val choice2 = readLine()?.toLowerCase()
                if (choice2!!.contains("y")) {
                    println("\"Perfect. Enjoy your stay.\"\n")
                    rest()
                } else {
                    println("Oh, well unfortunately that's all we have. Are you sure it doesn't suffice?")
                    var choice3 = readLine()?.toLowerCase()
                        if (choice3!!.contains("y")) {
                            println("\"I'm sorry about that. I hope somewhere else will be more accomodating.\"\n")
                        } else {
                            println("\"Great! Please enjoy your stay.\"")
                            rest()
                        }
                }

    } else {
        println("Oh, uh okay.")

    }

}