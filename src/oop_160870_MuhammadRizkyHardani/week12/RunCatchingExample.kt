package oop_160870_MuhammadRizkyHardani.week12

fun main(){
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42".toInt()
    }

    // Pattern: getOrElse
    val safeValue = result.getOrElse { -1 }
    println("Safe Value (getOrElse): $safeValue")

    // Pattern: recover (bisa mengubah tipe kegagalan menjadi sukses)
    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered Value: $recovered")

    runCatching {
        "100".toInt()
    }.onSuccess { v ->
        println("Berhasil dikonversi: $v")
    }.onFailure { e ->
        println("Gagal konversi: ${e.message}")
    }
}