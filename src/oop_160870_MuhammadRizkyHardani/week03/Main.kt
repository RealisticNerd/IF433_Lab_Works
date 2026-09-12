package oop_160870_MuhammadRizkyHardani.week03

fun main(){
    val e = Employee("Budi")

    // 1. Test Validasi Salary
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // 2. Test Encapsulation
    e.increasePerformance()
    // e.increasePerformance = 5 // Test Uncomment (pasti merah)

    // 3. Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")

}