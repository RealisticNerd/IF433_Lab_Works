package oop_160870_MuhammadRizkyHardani.week03.tugas1

fun main(){
    val g = Weapon("Dragonslayer")

    g.Damage = -50 // Untuk test setter damage jika minus

    g.Damage = 9999 // test setter damage jika lebih dari 1000
    println("${g.Damage}")
    println("${g.tier}")
}