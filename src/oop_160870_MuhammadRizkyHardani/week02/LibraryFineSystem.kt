package oop_160870_MuhammadRizkyHardani.week02

import java.util.Scanner

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDurration: Int = 1
) {
    fun calculateFine(): Int {
        return if (loanDurration > 3) {
            (loanDurration - 3) * 2000
        } else {
            0
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Judul Buku: ")
    val judul = scanner.nextLine()

    print("Nama Peminjam: ")
    val name = scanner.nextLine()

    print("Lama Pinjam (Hari): ")
    var lama = scanner.nextInt()
    if (lama < 0) {
        lama = 1
    }
    val loan = Loan(judul, name, lama)
    val denda = loan.calculateFine()

    println("Detail Peminjaman")
    println("Judul Buku    : ${loan.bookTitle}")
    println("Nama Peminjam : ${loan.borrower}")
    println("Lama Pinjam   : ${loan.loanDurration} hari")
    println("Total Denda   : Rp. $denda")
}