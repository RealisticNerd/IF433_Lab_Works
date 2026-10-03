package oop_160870_MuhammadRizkyHardani.week06

// Abstract Class = Is-A (Core Identity)
abstract class Watch{
    abstract fun showTime()
}

//Interface = Can-do (Behaviour)
interface BluetoothConnectable{
    fun connectToBluetooth()
}

interface Rechargeable{
    fun chargeBattery()
}
