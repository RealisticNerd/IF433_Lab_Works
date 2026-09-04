package oop_160870_MuhammadRizkyHardani.week01

fun main(){
    val gameTitle: String = "Cyberpunk 2077"
    val price: Int = 600000

}

fun calculateDiscount(price: Int): Int = if (price > 500000) price-price*20/100 else price-price*10/100

