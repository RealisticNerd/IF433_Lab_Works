package oop_160870_MuhammadRizkyHardani.week05.tugas2

abstract class PaymentMethod(val accountName: String){
    abstract fun processPayment(amount: Double)
}