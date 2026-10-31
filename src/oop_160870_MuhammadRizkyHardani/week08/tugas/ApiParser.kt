package oop_160870_MuhammadRizkyHardani.week08.tugas

fun parseProduct(rawJson: Map<String, Any?>): Product? {
    val id = requireNotNull(rawJson["id"] as? String){
        "API Invalid: Missing ID"
    }
    val name = requireNotNull(rawJson["name"] as? String){
        "API Invalid: Missing name"
    }

    return when (rawJson["type"] as? String) {
        "Electronic" -> {
            val warranty = rawJson["warranty"] as? Int ?: 12
            Electronic(id, name, warranty)
        }
        "Clothing" -> {
            val size = rawJson["size"] as? String ?: "All Size"
            Clothing(id, name, size)
        }
        else -> null
    }
}