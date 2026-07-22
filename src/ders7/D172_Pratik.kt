package ders7

fun main() {
    val sesSeviyesi = 100

    if (sesSeviyesi !in 0..100){
        println("HATA: Ses Seviyesi sadece 0 ile 100 arasında olabilir")
    }else{
        println("Ses seviyesi başarıyla yarlandı")
    }
}