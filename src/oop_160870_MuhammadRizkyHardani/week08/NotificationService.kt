package oop_160870_MuhammadRizkyHardani.week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim Email ke: $emailAddress")
    }

    fun processUser(user: UserProfile){
        // sendEmail(user.email) // INI AKAN Error: type Mismatch

        if (user.email != null){
            // Success via Smart Case: Compiler tahu 'user.email' pasti tidak null di blok ini
            sendEmail(emailAddress = user.email)
        }else{
            println("User ${user.name} tidak memiliki Email.")
        }
    }
}