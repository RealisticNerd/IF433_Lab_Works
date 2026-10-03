package oop_160870_MuhammadRizkyHardani.week06

//Error: Class Smartphone inherits multiple implementation of turnOn()
class Smartphone : Camera, Phone{
    // Manually override to resolve ambiguity
    override fun turnOn() {
        super<Camera>.turnOn() // Menjalankan logika camera
        super<Phone>.turnOn() // Menjalankan logika Phone
        println("Sistem operasi Smartphone berhasil booting.")
    }
}