package oop_160870_MuhammadRizkyHardani.week10.tugas

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    response.data.forEach { coin ->
        println("- ${coin.name}: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 0.5))
    txRepo.add(Transaction("TX002", 250.0))
    txRepo.add(Transaction("TX003", 1000.0))

    println("\n=== TRANSACTION LIST ===")
    txRepo.getAll().forEach { println("- ${it.id}: ${it.amount}") }
    println("Total transaksi: ${txRepo.getAll().sumOf { it.amount }}")

    println("\n=== SEARCH 'et' ===")
    println(coinRepo.searchByName("et") { it.name })
}