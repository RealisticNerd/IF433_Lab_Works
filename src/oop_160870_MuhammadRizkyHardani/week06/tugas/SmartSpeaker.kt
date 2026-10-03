package oop_160870_MuhammadRizkyHardani.week06.tugas

class SmartSpeaker(override val id: String, override val name: String): SmartDevice, Switchable {
    override fun turnOn() {
        println("Speaker $name dinyalakan.")
    }

    override fun turnOff() {
        println("Speaker $name dimatikan.")
    }
    fun playMusic(song: String){
        println("memutar lagu $song dari Spotify")
    }
}