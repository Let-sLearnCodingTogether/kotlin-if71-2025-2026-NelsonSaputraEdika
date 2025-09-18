package pertemuan3
fun main() {
    val firstUser: Triple<String, Int, Boolean> = Triple("Nelson", 20, true)

    val (username, age, handsome) = firstUser

    println(username)
    println(age)
    println(handsome)

}