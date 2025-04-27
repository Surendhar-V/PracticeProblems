package kotlinProblems.extenstionFunction

// This is not always preferred But it is good to know.

data class UserDetails(val name: String, val age: Int)
data class IdentityCard(val name: String, val age: Int, val join: Long)

fun UserDetails(identityCard: IdentityCard): UserDetails {
    return UserDetails(identityCard.name, identityCard.age)
}

fun main() {
    val userDetails = UserDetails("Suren", 23)
    val userDetails2 = UserDetails(IdentityCard("Suren", 23, 123456L))
}
