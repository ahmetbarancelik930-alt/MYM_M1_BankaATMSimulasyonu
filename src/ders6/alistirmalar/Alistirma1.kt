package ders6.alistirmalar

fun main() {
    print("1 ile 12 arasında bir ay numarası girin: ")
    val numara = readln().toIntOrNull()

    if (numara == null){
        val aylar = when (numara) {
            12, 1, 2 -> "Kış"
            3, 4, 5 -> "İlkbahar"
            6,7,8 -> "Yaz"
            9,10,11 -> "Sonbahar"
            else -> "Geçersiz bir sayı girdiniz"
        }
        println(aylar)
    }else{
        println("Geçerli bir sayı giriniz")
    }


}