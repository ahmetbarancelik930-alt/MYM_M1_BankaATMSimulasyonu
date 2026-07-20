package ders6

fun main() {
    val gizemliObje: Any = "Merhaba Kotlin"

    when (gizemliObje) {
        is String -> {
            println("Bu bir metin. Uzunluğu: ${gizemliObje.length}")
        }
        is Int -> {
            println("Bu bir sayı. Karesi: ${gizemliObje * gizemliObje}")
        }
        else -> println("Bilinmeyen bir tip!")
    }
}