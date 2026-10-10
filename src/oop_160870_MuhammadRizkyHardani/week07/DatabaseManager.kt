package oop_160870_MuhammadRizkyHardani.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is Ready.")
    }
}