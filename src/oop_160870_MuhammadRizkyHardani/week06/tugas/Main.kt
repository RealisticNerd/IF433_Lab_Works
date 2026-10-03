package oop_160870_MuhammadRizkyHardani.week06.tugas

fun main(){
    val lamp = SmartLamp("SL1", "Ruang Tamu")
    val speaker = SmartSpeaker("SS01", "Google Nest Dapur")
    val cctv = SmartCCTV("CCTV01", "Ezviz Garasi")

    println("\nMenambahkan semua Devices ke Smarthub")
    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)
    println("\n- Activate Security Mode -")
    hub.activateSecurityMode()
    println("- Turn Off All -")
    hub.turnOffAllSwitches()

}