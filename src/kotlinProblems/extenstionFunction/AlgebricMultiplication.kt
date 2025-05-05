package kotlinProblems.extenstionFunction

fun main() {

    operator fun Int.invoke(other: Int): Int {
        return this * other;
    }

    val res = 5(3 + 2)
    println(res)

}