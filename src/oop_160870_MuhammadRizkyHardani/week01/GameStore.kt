package oop_160870_MuhammadRizkyHardani.week01

fun main(){
    val gameTitle: String = "Cyberpunk 2077"
    val price: Int = 600000
    printReceipt(title = gameTitle, priceAwal = price, finalPrice = calculateDiscount(price))
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price-price*20/100 else price-price*10/100

fun printReceipt(title: String, priceAwal: Int, finalPrice: Int) {
    println("Judul: $title, HargaAwal: $priceAwal, Harga Akhir: $finalPrice")
}