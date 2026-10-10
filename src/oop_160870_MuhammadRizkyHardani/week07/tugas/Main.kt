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


    println("\n=== Upgrade dan Battle Events ===")
    val upgradedSword = starterSword.item.copy(damage = 25)
    println("Senjata setelah upgrade:")
    println("Nama: ${upgradedSword.name}")
    println("Damage: ${upgradedSword.damage}")
    println("Rarity: ${upgradedSword.rarity}")

    println("\n--- Simulasi Event ---")
    processEvent(BattleState.SafeZone)

    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))

    processEvent(BattleState.LootDropped(upgradedSword))

    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}