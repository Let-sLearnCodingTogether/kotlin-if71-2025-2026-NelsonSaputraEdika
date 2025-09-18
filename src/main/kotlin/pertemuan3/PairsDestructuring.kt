package pertemuan3
fun main() {
    val firstUser: Pair<String, Byte> = Pair("Megi", 20)

    // destructuring
    val (Nelson, age) = firstUser

    println(Nelson)
    println(age)
}