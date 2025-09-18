package pertemuan3

fun main() {
    var totalBelanja : Double = 0.0
    println("Status Awal -> Total Belanja : $totalBelanja")
    val belanja1 = 3 * 25000
    totalBelanja += belanja1
    println("Status Item1 -> Total Belanja : $totalBelanja")
    val belanja2 = 2 * 15000
    totalBelanja += belanja2
    println("Status item2 -> Total Belanja : $totalBelanja")
    val diskon = 10000
    totalBelanja -= diskon
    println("Setelah Diskon -> Total Belanja : $totalBelanja")
    val biayalayanan = totalBelanja/100
    totalBelanja += biayalayanan
    println("Biaya Layanan : $totalBelanja")
    println("Total Akhir : $totalBelanja")
    totalBelanja += biayalayanan



}