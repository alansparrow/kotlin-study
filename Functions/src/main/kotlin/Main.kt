fun main(args: Array<String>) {
    val coins: (Int) -> String = {
        "$it quarters"
    }

    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }

    val treatFunction = trickOrTreat(/* isTrick= */ false, coins)
    val trickFunction = trickOrTreat(/* isTrick= */ true, null)

    treatFunction()
    trickFunction()
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick;
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat;
    }
}

var trick = {
    println("No treats!")
}

var treat = {
    println("Have a treat!")
}