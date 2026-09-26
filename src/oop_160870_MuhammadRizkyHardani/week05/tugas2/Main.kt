package oop_160870_MuhammadRizkyHardani.week05.tugas2

fun main(){
    val ewallet = EWallet("Pito Armadillo", 50000.0)
    val credcard = CreditCard("Pito Armadillo", 100000.0)

    val paymentMethod: List<PaymentMethod> = listOf(ewallet, credcard)

    for (payment in paymentMethod){
        println("Memproses pembayaran ${payment.accountName}")
        payment.processPayment(75000.0)

        when(payment) {
            is EWallet -> {
                payment.topUp(50000.0)
                payment.processPayment(75000.0)
            }
        }
    }


}