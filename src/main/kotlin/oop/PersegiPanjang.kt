package oop

class PersegiPanjang (val panjang: Double, val lebar: Double) {

    val luasPersegiPanjang : Double
        get() = panjang * lebar
}

class Mahasiswa(ipkAwal: Double) {
    var ipk: Double = ipkAwal
        get() = field
        set(value) {
            field = if (value < 0.0) {
                0.0
            } else if (value > 4.0) {
                4.0
            } else {
                value
            }
        }
}


fun main() {
    val persegiPanjang = PersegiPanjang(5.7, 4.5)
    println(persegiPanjang.luasPersegiPanjang)

    val mahasiswa = Mahasiswa(3.5)
    mahasiswa.ipk = 7.0
    println(mahasiswa.ipk)
}