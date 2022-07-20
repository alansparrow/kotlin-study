fun main(args: Array<String>) {
    var favoriteActor: String? = "Sandra Oh"

    var lengthOfName = favoriteActor?.length ?: 0
    println("Length is: $lengthOfName")

    favoriteActor = null
    lengthOfName = favoriteActor?.length ?: 0
    println("Length is: $lengthOfName")
}