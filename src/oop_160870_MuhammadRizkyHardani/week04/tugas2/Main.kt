package oop_160870_MuhammadRizkyHardani.week04.tugas2

fun main(){
    println("Employee")
    val employee = Employee("John Dick", 800000)
    employee.work()
    println("${employee.name} mendapat bonus sebesar ${employee.calculateBonus()}")

    println("\nManager")
    val manager = Manager("Ben Dover", 1000000)
    manager.work()
    println("${manager.name} mendapat bonus sebesar ${manager.calculateBonus()}")

    println("\nDeveloper")
    val dev = Developer("Sum Ting Wong", 200000, "Kotlin")
    dev.work()
    println("${dev.name} mendapat bonus sebesar ${dev.calculateBonus()}")

}