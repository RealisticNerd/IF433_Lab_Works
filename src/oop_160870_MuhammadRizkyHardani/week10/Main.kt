package oop_160870_MuhammadRizkyHardani.week10

fun main(){
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Hello World")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")

    println("=== TEST MULTIPLE PARAMETERS ===")
    val itemPrice = PairBox("Bitcoin", 65000)
    println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")

    println("=== TEST GENERIC FUNCTIONS ===")
    printData(3.14)
    val result = proccessData("Stable Coin")
    println("Hasil proses: $result")
}
