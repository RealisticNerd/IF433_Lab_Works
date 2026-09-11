package oop_160870_MuhammadRizkyHardani.week02

import java.util.Scanner

class Hero(
    val name: String,
    var hp: Int = 100,
    var baseDamage: Int
){
    fun attack(targetName: String){
        println("$name menyerang $targetName!")
    }

    fun takeDamage(damage: Int){
        hp -= damage
        if (hp < 0){
            hp = 0
        }
    }

    fun isAlive(): Boolean{
        return hp > 0
    }
}

fun main(){
    val scanner = Scanner(System.`in`)

    print("Masukkan nama Hero: ")
    val name = scanner.nextLine()

    print("Masukkan Damage Hero: ")
    val baseDamage = scanner.nextInt()

    val hero = Hero(name, baseDamage = baseDamage)

    var enemyHp = 100

    println("\n STATS KARAKTER MU")
    println("Hero: ${hero.name}")
    println("HP: ${hero.hp}")
    println("Damage: ${hero.baseDamage}")


    while (hero.isAlive() && enemyHp > 0){
        println("\n Pilih Aksi")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        val pilihan = scanner.nextInt()

        if (pilihan == 1){
            hero.attack("Enemy")

            enemyHp -= hero.baseDamage

            if (enemyHp < 0){
                enemyHp = 0
            }

            println("HP Enemy tersisa: $enemyHp")

            if (enemyHp > 0){
                val enemyDamage = (10..20).random()

                println("Enemy menyerang ${hero.name}!")
                println("Damage yang diterima: $enemyDamage")

                hero.takeDamage(enemyDamage)

                println("HP ${hero.name} tersisa: ${hero.hp}")
            }
        }
        else if (pilihan == 2){
            println("${hero.name} memilih untuk kabur!")
            break
        }
        else{
            println("Pilihan tidak valid!")
        }
    }


    if (hero.hp > 0 && enemyHp <= 0){
        println("${hero.name} menang!")
    }
    else if (hero.hp <= 0){
        println("${hero.name} kalah!")
    }
    else if (enemyHp > 0){
        println("${hero.name} kabur dari pertarungan.")
    }

    println("HP Hero: ${hero.hp}")
    println("HP Enemy: $enemyHp")

    scanner.close()
}