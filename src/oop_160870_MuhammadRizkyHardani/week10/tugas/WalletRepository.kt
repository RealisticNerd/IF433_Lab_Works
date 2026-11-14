package oop_160870_MuhammadRizkyHardani.week10.tugas

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> = items.toList()

    fun searchByName(keyword: String, nameOf: (T) -> String): List<T> =
        items.filter { nameOf(it).contains(keyword, ignoreCase = true) }
}