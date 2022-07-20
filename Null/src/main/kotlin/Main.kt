fun main(args: Array<String>) {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor?.length)

    favoriteActor = null
    println(favoriteActor?.length)
}