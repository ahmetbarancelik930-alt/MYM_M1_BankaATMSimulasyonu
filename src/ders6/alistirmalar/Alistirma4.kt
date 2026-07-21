package ders6.alistirmalar

fun main() {
    print("Lütfen bir komut yazın: ")
    val kullaniciGirisi = readln().trim().lowercase()

    when{
        kullaniciGirisi == "merhaba" -> {
            println("Size de merhaba")
        }
        kullaniciGirisi == "saat kaç" -> {
            println("Şuan saat 14.00")
        }
        kullaniciGirisi.contains("hava") ->{
            println("Dışarıda harika bir hava var")
        }
        else -> println("Ne demek istediğinizi anlayamadım.")
    }
}