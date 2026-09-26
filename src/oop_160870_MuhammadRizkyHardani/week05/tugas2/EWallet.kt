package oop_160870_MuhammadRizkyHardani.week05.tugas2

class EWallet (accountName: String, var balance: Double): PaymentMethod(accountName){
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            println("Sukses")
            balance -= amount
        } else {
            println("Saldo Tidak Cukup")
        }

        fun topUp(amount: Double) {
            if (amount > 0) {
                balance += amount
                println("Top up berhasil!")
            } else {
                println("Jumlah top up tidak valid.")
            }
        }
    }
}