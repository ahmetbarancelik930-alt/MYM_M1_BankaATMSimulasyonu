package ders6

fun main() {
    val gun = 3
    val gunTuru = when (gun) {
        1, 2, 3, 4, 5 -> "Hafta içi – Çalışmaya devam!"
            6, 7 -> "Hafta sonu – Dinlenme zamanı!"
        else -> "Geçersiz bir gün!"
    }
    println(gunTuru)
}