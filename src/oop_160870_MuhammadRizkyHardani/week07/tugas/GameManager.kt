package oop_160870_MuhammadRizkyHardani.week07.tugas

object GameManager {
    var isGameRunning: Boolean = false
    fun startGame(){
        if (isGameRunning == true) {
            println("Game sudah berjalan! Mencegah instansiasi ganda")
        }else{
            isGameRunning = true
            println("Memulai Game Engine")
        }
    }
}