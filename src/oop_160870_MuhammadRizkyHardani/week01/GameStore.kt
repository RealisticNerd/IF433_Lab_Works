package oop_160870_MuhammadRizkyHardani.week01

fun main(){
    val gameTitle: String = "Cyberpunk 2077"
    val price: Int = 600000
    val userNote: String? = null
    printReceipt(title = gameTitle, priceAwal = price, finalPrice = calculateDiscount(price), userNote = userNote )
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price-price*20/100 else price-price*10/100

fun printReceipt(title: String, priceAwal: Int, finalPrice: Int, userNote: String?) {
    println("Judul: $title, HargaAwal: $priceAwal, Harga Akhir: $finalPrice")
    println("Usernote: ${userNote ?: "Tidak Ada Catatan"}")
}