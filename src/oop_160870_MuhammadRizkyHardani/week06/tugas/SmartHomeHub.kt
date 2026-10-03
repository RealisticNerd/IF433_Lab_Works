package oop_160870_MuhammadRizkyHardani.week06.tugas

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat '${device.name}' ID: ${device.id} ditambahkan ke Hub.")
    }
    fun turnOffAllSwitches(){
        for (device in devices) {
            if(device is Switchable){
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord()
            }
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }

}