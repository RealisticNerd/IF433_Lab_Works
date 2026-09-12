package oop_160870_MuhammadRizkyHardani.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            // KODE SALAH
            // RECURSIVE
            this.salary = value
        }
}