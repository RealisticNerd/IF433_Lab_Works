package oop_160870_MuhammadRizkyHardani.week05.tugas1

fun main(){
    val math = MathHelper()


    println("Jika sisi kotak sepanjang 2m maka luasnya: ${math.hitungLuas(2)}m")

    println("Jika balok dengan panjang 3m dan lebar 2m maka luasnya: ${math.hitungLuas(3, 2)}m")

    println("Jika sebuah lingkaran memiliki panjang jari jari 7m luasnya: ${math.hitungLuas(7.0)}m")
}