package pertemuan6

fun main() {
    val mataKuliahWajib : List<String> = listOf(
        "Kotlin",
        "Kalkulus",
        "Algoritma dan Struktur Data"
    )

    println("List matakuliah wajib : ${mataKuliahWajib}")
    println("Size List MataKuliah Wajib : ${mataKuliahWajib}")

    println("Index pertama matakuliah wajib : ${mataKuliahWajib[0]}")

    val mataKuliahUppercase = mataKuliahWajib.map {
        it.uppercase()
    }
    println("List matakuliah uppercase : $mataKuliahUppercase")

    val matakuliahLebihDariNKarakter = mataKuliahWajib.filter {
        it.length > 10
    }
    println("Matakuliah Lebih dari 10 Karakter : $matakuliahLebihDariNKarakter")
}