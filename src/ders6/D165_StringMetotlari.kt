package ders6

fun main() {
    val hamGirdi = "mERhaBa Kotlin"

    val temizMetin = hamGirdi.trim().lowercase()

    when {
        temizMetin == "merhaba kotlin" -> println("Eşleşme başarılı!")
        temizMetin.contains("merhaba") -> println("Sadece merhaba dendi.")
    }
    print("Adın: ")
    val ad = readln().trim().lowercase()
    val temizlenmisAd = ad.replaceFirstChar { it.uppercase()}
    println(temizlenmisAd)
}