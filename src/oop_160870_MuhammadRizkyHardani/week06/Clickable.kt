package oop_160870_MuhammadRizkyHardani.week06

interface Clickable {
    //ERROR: Property in interface cant have backing field
    val name: String

    // Function without body (Implicit Abstract)
    fun click()
}