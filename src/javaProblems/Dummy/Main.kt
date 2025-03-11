package javaProblems.Dummy

fun main() {

    val list: MutableList<Int> = mutableListOf<Int>()

    for (i in 0 until 10 step 2) {
        list.add(i)
    }

    println(list)

}
