package oop_160870_MuhammadRizkyHardani.week5

fun main(){
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        //Panggilan Runtime Polymorph
        pegawai.bekerja()
        //pegawai.bekerja ini akan Error karena tipe referensinya adalah Pegawai
        //Smartcasting dengan is dan when
        when (pegawai){
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn}) ")
                pegawai.mengajar() // smartcast
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------------------")

    }
}