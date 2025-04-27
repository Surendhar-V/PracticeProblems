package kotlinProblems



fun main() {
    val person = Person("Suren" , 1)
    println(person)
    println(person.component1())
    person.greeting()
}

data class Person(val name : String , val age : Int)

fun Person.greeting(){
    println("Hi Hello")
}