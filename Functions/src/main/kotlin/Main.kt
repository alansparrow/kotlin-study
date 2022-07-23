fun main(args: Array<String>) {
    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }

    val treatFunction = trickOrTreat(/* isTrick= */ false) { "$it quarters" }
    val trickFunction = trickOrTreat(/* isTrick= */ true, /* extraTreat= */ null)

    repeat(5) {
        println("Count: $it")
        treatFunction()
    }

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