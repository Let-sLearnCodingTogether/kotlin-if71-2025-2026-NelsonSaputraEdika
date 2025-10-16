package oop

class MahasiswaConstructor(
    val npm: String,
    val nama: String,
    var ipk: Float
)

fun main() {
    val mahasiswaPertama = MahasiswaConstructor(
        "2226250034",
        "mahasiswa 1",
        3.9f
    )
    println(mahasiswaPertama.npm)
    println(mahasiswaPertama.nama)
    println(mahasiswaPertama.ipk)

    mahasiswaPertama.ipk = 1.4f
    println(mahasiswaPertama.ipk)

}