package ders6.alistirmalar

fun main() {
    print("Lütfen yaşınızı giriniz: ")
    val girdi = readln().toIntOrNull()

    if (girdi != null) {
        val biletBilgisi =
            when (girdi) {
                in 0..6 -> "Ücretsiz tarife 0 TL"
                in 7..18 -> "Öğrenci Tarifesi 50 Tl"
                in 19..64 -> "Tam tarife 100 TL"
                in 65..120 -> "Emekli İndirimi 40 TL"
                else -> "Geçersiz yaş girdiniz"
            }
        println(biletBilgisi)
    }
}