package pertemuan4

import kotlin.io.println

fun main() {
    val hari : Array<String> = arrayOf("Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu")

    println("Jumlah Elemen : ${hari.size}")

    println("Hari Pertama = ${hari[0]}\nHari Terakhir = ${hari[6]}")
    hari[4] = "Jum'at Barokah"
    println("${hari[4]}")

}