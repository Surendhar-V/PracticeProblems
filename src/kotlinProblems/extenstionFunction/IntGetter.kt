package kotlinProblems.extenstionFunction

import kotlin.math.pow

fun main() {

    operator fun Int.get(index: Int): Int {
        return this.div(10.0.pow(index)).rem(10).toInt()
    }

    val num = 9876
    println(num[0])
    println(num[1])
    println(num[2])
    println(num[3])


}