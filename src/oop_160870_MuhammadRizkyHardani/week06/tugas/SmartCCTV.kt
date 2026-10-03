package oop_160870_MuhammadRizkyHardani.week06.tugas

class SmartCCTV(override val id: String, override val name: String): SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        startRecord()
    }

    override fun turnOff() {
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV $name menyala dan mulai merekam")
    }
}