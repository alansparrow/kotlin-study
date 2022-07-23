fun main(args: Array<String>) {
    val treatFunction = trickOrTreat(/* isTrick= */ false)
    val trickFunction = trickOrTreat(/* isTrick= */ true)

    treatFunction()
    trickFunction()
}

fun trickOrTreat(isTrick: Boolean): () -> Unit {
    if (isTrick) {
        return trick;
    } else {
        return treat;
    }
}

var trick = {
    println("No treats!")
}

var treat = {
    println("Have a treat!")
}