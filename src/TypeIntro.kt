const val MAX_EXPERIENCE: Int = 5000

fun main( args: Array<String>) {
    val playerName = "John" // unreassignable variable
    val playerNameMirror = "John".reversed()
    var experiencePoints = 5 // basic variable
    var hasSteed = false
    var pubName = "The Unicorn's Horn"
    var drinks = mutableListOf ("mead", "wine", "LaCroix")
    var publicanName = "Joey"
    experiencePoints += 5
    println(experiencePoints)
    println(playerName)
    println(hasSteed)
    println(pubName)
    println(publicanName)
    println(drinks)
    println(playerNameMirror)
}