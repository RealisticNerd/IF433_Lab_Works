package oop_160870_MuhammadRizkyHardani.week07.tugas

sealed class BattleState {
    data class MonsterEncounter (val monsterName: String) : BattleState()

    data class LootDropped(val item: GameItem) : BattleState()

    data class GameOver(val reason: String) : BattleState()

    object SafeZone : BattleState()
}
