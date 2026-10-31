package oop_160870_MuhammadRizkyHardani.week08

fun main(){
    println("=== TEST SAFE CALLS & ELVIS")
    val emptyOrder = Order(null, null)

    //Rantai Safe Calls yang elegan
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let {price ->
        //Hanya jalan jika totalPrice tidak Null
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di Set"

    println(receipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )

    for (item in mixedData) {
        val text = item as? String

        //Hanya cetak jika cast sukses (text tidak Null)
        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }
    val someObject: Any = 100 // Tipe aslinya Integer
    //Coba castke String . Jika gagal (null), ganti dengan "Unknown String"
    val safeString = someObject as? String ?: "Unknown String"
    println("Hasil cast + fallback: $safeString")

    println("\n=== TEST THE RED BUTTON ===")
    val toxicData: String? = null
    try {
        //Dangerous: Memaksa compiler percaya data ini tidak null
        val length = toxicData!!.length
    }catch (e: NullPointerException){
        println("CRASH (NPE)! Jangan gunakan !! secara sembarangan")
    }

    //Alternatif Aman pakai RequireNotNull
    val apiResponse: Map<String, String?> = mapOf("Status" to "200", "token" to null)
    try{
        // alih - alih apiResponse["token"]!!
        val token = requireNotNull(apiResponse["Token"]){
            "CRITICAL EXCEPTION: Token otentikasi tidak ditemukan dari server!"
        }
    }catch (e: IllegalArgumentException){
        println(e.message) //Mencetak pesan custom kita, bukan crash buta
    }

}