package oop_160870_MuhammadRizkyHardani.week11.tugas

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)