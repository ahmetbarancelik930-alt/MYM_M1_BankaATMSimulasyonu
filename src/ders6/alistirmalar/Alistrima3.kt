package ders6.alistirmalar

fun main() {
    val gelenVeri: Any = true

    when(gelenVeri){
        is String -> {
            println("Metin uzunluğu: ${gelenVeri.length}")
        }
        is Int ->{
            println("Sayının 10 katı: ${gelenVeri * 10}")
        }
        is Boolean ->{
            val durumMesahi = if (gelenVeri) "Doğru" else "Yanlış"
            println("Durum $durumMesahi")
        }
        else -> println("Desteklenmeyen veri tipi")
    }
}