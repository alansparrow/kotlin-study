fun main(args: Array<String>) {
    val trickFunction = trick
    trick()
    trickFunction()

    val treatFunction: () -> Unit = {
        println("Have a treat!")
    }

    treat()
    treatFunction()
}

var trick = {
    println("No treats!")
}

var treat = {
    println("Have a treat!")
}