package kotlinProblems

class Person(val name: String, val age: Int)

operator fun Person.component1(): String {
    return "${this.name} From Chennai"
}

operator fun Person.component2(): String {
    return "${this.name} From  Chennai"
}


fun main() {

    val person = Person("Suren", 20)
    val (name, age) = person
    println(name)
    println(age)

}
