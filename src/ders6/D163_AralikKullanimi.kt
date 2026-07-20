package ders6

fun main() {
    val sinavNotu = 85

    val harfNotu = when (sinavNotu) {
        in 90..100 -> "AA"
        in 80..89 -> "BA"
        in 0..79 -> "Geliştirilebilir"
        else -> "Geçersiz not!"
    }
    println("Notunuz: $harfNotu")
}