package oop_160870_MuhammadRizkyHardani.week06.tugas

class SmartLamp(override val id: String, override val name: String): SmartDevice,Switchable{
    override fun turnOn() {
        println("Smartlamp $name menyala!!")
    }

    override fun turnOff() {
        println("Smartlamp $name dimatikan.")
    }
}