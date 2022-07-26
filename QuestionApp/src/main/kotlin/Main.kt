object StudentProgress {
    var total: Int = 10
    var answered: Int = 3
}

enum class Difficulty {
    EASY, MEDIUM, HARD
}

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

fun main(args: Array<String>) {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    println(question1)
    println(question2)
    println(question3)
    println("${StudentProgress.answered} of ${StudentProgress.total} answered.")
}