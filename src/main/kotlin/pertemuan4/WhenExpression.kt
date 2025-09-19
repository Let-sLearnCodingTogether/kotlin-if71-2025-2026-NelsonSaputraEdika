package pertemuan4

fun main () {
    val finalExam = 'A'

    when(finalExam) {
        'A' -> println("Lulus")
        'B' -> println("Lulus juga")
        'C' -> println("Ya bisa lulus")
        else -> println("Tidak lulus")
    }
    when(finalExam) {
        'A','B' -> println("Lulus")
        'C' -> println("Ya bisa lulus")
        else -> println("Tidak lulus")
    }

    when {
        finalExam == 'A' || finalExam == 'B' -> println("lulus")
        finalExam == 'C' -> println("Ya Bisa lulus")
        else -> println("Tidak Lulus")
    }
    var tesKriuk = 6

    when  {
        tesKriuk > 2 -> tesKriuk = 20
    }
    println(tesKriuk)
}
