package javaProblems.SealedClass

sealed class Shape {

    abstract fun area()

    class Rectangle(private val width: Int, private val height: Int) : Shape() {
        override fun area() {
            println(width * height)
        }
    }

    class Triangle(private val base: Int, private val height: Int) : Shape() {
        override fun area() {
            println(0.5 * base * height)
        }
    }

    class Circle(private val radius: Int) : Shape() {
        override fun area() {
            println(Math.PI * radius * radius)
        }
    }

}

fun main() {
    val shape: Shape = Shape.Rectangle(40, 40)

    when (shape) {

        is Shape.Rectangle -> {
            shape.area()
        }

        is Shape.Circle -> {
            shape.area()
        }

        is Shape.Triangle -> {
            shape.area()
        }
    }

}