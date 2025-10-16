package oop

data class Product(val name: String, val price: Double) {
    val isAvailable: Boolean = true
}

fun main() {
    val product1 = Product("Laptop 1", 5000_000.0)
    println(product1)
    println(product1.isAvailable)

}