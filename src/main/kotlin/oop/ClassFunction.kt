package oop

class MahasiswaFunctionOverLoading(val nama : String) {
    fun sayHello() {
        println("Selamat Malam $nama")
    }
    fun sayHello(word: String) {
        println("$word $nama")
    }

}

fun main() {
    val mahasiswaPertama = MahasiswaFunctionOverLoading("Mahasiswa")

    mahasiswaPertama.sayHello()
    mahasiswaPertama.sayHello("Selamat Pagi")
}