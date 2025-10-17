package pertemuan11

// Class Player dengan properti dan fungsi sesuai deskripsi
class Player(val name: String) {
    var health: Int = 100
    var level: Int = 1

    fun takeDamage(damage: Int) {
        health = (health - damage).coerceAtLeast(0)

    }

    fun levelUp() {
        level++
        health = 100
    }

    fun showStatus() {
        println("Nama: $name, Level: $level, Health: $health")
    }
}

fun main() {

    val player = Player("Nelson")

    player.showStatus()


    player.takeDamage(30)


    player.showStatus()


    player.levelUp()

    player.showStatus()
}
