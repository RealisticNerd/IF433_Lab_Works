package oop_160870_MuhammadRizkyHardani.week08.tugas

sealed class Product

data class Electronic(val id: String, val name: String, val warrantyMonths: Int) : Product()

data class Clothing(val id: String, val name: String, val size: String) : Product()