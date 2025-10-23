package oop

class NilaiUjian(nilaiUts : Double) {
    val nilaiUts : Double = nilaiUts
        get() = field * 0.1 //backing field

    val nilaiAkhir : Double
        get() = nilaiUts * 2
}

fun main() {
    val nilaiMhs1 = NilaiUjian(80.3)
    println(nilaiMhs1.nilaiUts)
    println(nilaiMhs1.nilaiAkhir)
}