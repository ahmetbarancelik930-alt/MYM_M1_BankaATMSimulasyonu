package ders6.alistirmalar

fun main() {
    print("Lütfen toplam sepet tutarınızı giriniz: ")
    val sepetTuatari = readln().toDoubleOrNull()

    if (sepetTuatari != null) {

        when (sepetTuatari) {
            in 0.00..99.99 -> {
                val kargoUcreti = 30.00
                println("Kargo ücreti $kargoUcreti Toplam ödenecel tutar ${sepetTuatari + kargoUcreti} TL")
            }

            in 100.0..299.99 -> {
                val kargoUcreti = 15.0
                println("Kargo ücreti $kargoUcreti Toplam ödenecel tutar ${sepetTuatari + kargoUcreti} TL")

            }

            in 300.0..Double.MAX_VALUE -> {
                val kargoUcreti = 15
                println("Kargo ücreti $kargoUcreti Toplam ödenecel tutar ${sepetTuatari + kargoUcreti} TL")

            }else -> println("Sepet tutarı negatif bir değer olamaz")
        }
    }else{
        println("Lütfen geçerli bir sayısal tutar giriniz")
    }
}