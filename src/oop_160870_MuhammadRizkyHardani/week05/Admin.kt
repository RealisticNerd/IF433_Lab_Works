package oop_160870_MuhammadRizkyHardani.week05

class Admin (nama: String): Pegawai (nama){
    override fun bekerja() {
        println("[$nama] sedang duduk didepan komputer melayani administrasi.")
    }

    fun doAdminWork(){
        println("[$nama] sedang merekap data absensi mahasiwswa")
    }
}