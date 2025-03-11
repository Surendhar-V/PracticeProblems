package javaProblems.ScopeFunctions

fun main() {

    /*
        Property 1 : Returns => context Object
        Property 2 : Context Object => This
     */

    var person = Person().apply {
        name = "surendhar"
        age = 4
    }

//    person.let {
////        context -> it
//        it.name = "sanjay"
//        it.age = 10
//    }

//    person?.let {
//        it.name = "sanjay"
//        it.age = 10
//    }

//    (6).let {
//        println(it.hashCode())
//        println(it.dec())
//        println(it.inc())
//        println(it.times(6))
//        println(it.toBigDecimal())
//    }

    /*

        Scope Function : 'with'
            Property 1 : Refer to the context object mentioned in the with
            Property 2 : The return value is the 'lambda result' (the last vale is returned)

     */

//    with(person) {
////        context -> this
//        name = "sanjay"
//        this.age = 10
//    }

//    val a: Int = with(person) {
//        println(name)
//        println(this.age)
//        age
//    }

    /*
        Used in the place where the chained operations are needed
        returned Object is the context Object
     */

    val numbersList: MutableList<Int> = mutableListOf(1, 2, 3)

    // both list and numbersList will point to the same object even after changing one another

    val list = numbersList.also {
        numbersList.add(4)
        println(numbersList.sum())
        println(numbersList.max())
    }


//    run is the combination of with and let

//    person.run {
//        println(name)
//    }


//    val list: MutableList<Person> = mutableListOf(person, Person(), Person(), Person())
//    println(list.firstOrNull())


}


class Person {
    var name: String = "defaultName"
    var age: Int = 0

    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }

}