package kotlinProblems.extenstionFunction

private data class User(val firstName: String, val secondName: String) {
    companion object
}

class UserRecords(val firstName: String, val secondName: String, val age: Int)


fun main() {

    fun User.Companion.fromRecord(userRecords: UserRecords): User {
        return User(userRecords.firstName, userRecords.secondName)
    }

    val userRecord = UserRecords("Suren", "V", 23)
    println(User.fromRecord(userRecord))

}
