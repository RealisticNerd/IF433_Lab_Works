package oop_160870_MuhammadRizkyHardani.week07.tugas

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}!")
            println("Bersiaplah untuk bertarung!")
        }

        is BattleState.LootDropped -> {
            println("Item ditemukan: ${event.item.name}")
            println("Rarity: ${event.item.rarity}")
            println("Damage: ${event.item.damage}")
        }

        is BattleState.GameOver -> {
            println("Game Over!")
            println("Karena: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Kamu memasuki zona aman.")
        }
    }
}
