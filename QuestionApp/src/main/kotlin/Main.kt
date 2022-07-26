class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
)

fun main(args: Array<String>) {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", "medium")
    val question2 = Question<Boolean>("The sky is green. True or false", false, "easy")
    val question3 = Question<Int>("How many days are there between full moons?", 28, "hard")

    println(question1)
    println(question2)
    println(question3)
}