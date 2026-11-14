package oop_160870_MuhammadRizkyHardani.week10.tugas

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> = items.toList()
}