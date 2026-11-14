package oop_160870_MuhammadRizkyHardani.week10

fun main(){
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Hello World")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")
}
