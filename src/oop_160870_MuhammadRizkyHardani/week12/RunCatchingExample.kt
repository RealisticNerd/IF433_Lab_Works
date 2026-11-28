package oop_160870_MuhammadRizkyHardani.week12

fun main(){
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42".toInt()
    }
}