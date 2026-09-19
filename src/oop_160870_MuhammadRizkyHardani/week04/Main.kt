package oop_160870_MuhammadRizkyHardani.week04

fun main(){
    println("--- Testing Vehicle ---")
    val generateVehicle = Vehicle("Sepeda Onthel")
    generateVehicle.honk()
    generateVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar("Tesla", 2, 95)
    myElectricCar.openTrunk()
    myElectricCar.accelerate()
    myElectricCar.honk()
}