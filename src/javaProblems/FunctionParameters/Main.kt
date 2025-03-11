package javaProblems.FunctionParameters

fun main() {

    val computeFunction: (Int, Int) -> Int = { a: Int, b: Int -> a * b }
    compute(10, 20, computeFunction)

    val computeFunction2: (Int, Int) -> Unit = { a: Int, b: Int -> println(a * b) }
    compute2(20, 20, computeFunction2)

    compute3 {
        print("hello world")
    }

}


fun compute(a: Int, b: Int, computeFunction: (Int, Int) -> Int) {
    println(computeFunction(a, b))
}

fun compute2(a: Int, b: Int, computeFunction: (Int, Int) -> Unit) {
    computeFunction(a, b)
}

fun compute3(computeFunction: () -> Unit) {
    computeFunction()
}