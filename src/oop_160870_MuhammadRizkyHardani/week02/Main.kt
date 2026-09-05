package oop_160870_MuhammadRizkyHardani.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner( System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukan Nama: ")
    val name = scanner.nextLine()

    print("Masukan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine() // Bersihkan buffer newline

    if (nim.length != 5){
        println("ERROR: Pendaftaran dibatalkan . NIM harus 5 karakter")
        //Program akan berhenti di sini untuk mahasiswa ini, tidak membuat objek
    } else{
        print("Masukan Jurusan: ")
        val major = scanner.nextLine()

        //Instansiasi Objek karna data sudah aman
        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }

}