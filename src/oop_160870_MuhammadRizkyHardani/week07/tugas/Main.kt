package oop_160870_MuhammadRizkyHardani.week07.tugas

fun main(){
    println("=== GameManager ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== Rarity dan Weapon Factory ===")
    println("Legendary Drop Chance: ${ItemRarity.LEGENDARY.dropChance}%")
    val starterSword = Weapon.forgeStarterSword()
    println("Senjata Awal:")
    println("Nama: ${starterSword.item.name}")
    println("Damage: ${starterSword.item.damage}")
    println("Rarity: ${starterSword.item.rarity}")
    println("Durability: ${starterSword.durability}")

}