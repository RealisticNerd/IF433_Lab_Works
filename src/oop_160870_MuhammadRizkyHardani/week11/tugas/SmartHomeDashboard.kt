package oop_160870_MuhammadRizkyHardani.week11.tugas

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    val light = SmartDevice("", "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
}