package oop_160870_MuhammadRizkyHardani.week06.tugas

interface SmartDevice{
    val id: String
    val name: String
}

interface Switchable{
    abstract fun turnOn()
    abstract fun turnOff()
}

interface Recordable{
    abstract fun startRecord()
    fun stopRecord(){
        println("Perekaman dihetinkan dan disimpan ke Cloud")
    }
}