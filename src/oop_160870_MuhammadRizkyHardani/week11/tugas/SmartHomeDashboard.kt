package oop_160870_MuhammadRizkyHardani.week11.tugas

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    val light = SmartDevice("", "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    val camera = SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }


    val ac = run {
        SmartDevice(
            "Daikin Inverter (Kabel 3x2.5)",
            "HVAC",
            false,
            800
        )
    }

    homeDevices.add(ac)

    homeDevices.add(
        SmartDevice(
            "Picolo's Auto Feeder",
            "Pet Care",
            true,
            10
        )
    )

    val searchResult = homeDevices.find {
        it.category == "Camera"
    }

    searchResult?.let {
        println("\n=== DEVICE SEARCH RESULT ===")
        println(it.diagnose())
    }


    with(homeDevices) {
        println("\n=== SMART HOME SUMMARY ===")
        println("Total perangkat: ${this.size}")
    }

    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }
    println("\nTotal daya: $totalPower")


    println("\n=== SMART HOME DEVICE DIAGNOSTICS ===")

    homeDevices.forEach {
        println(it.diagnose())
    }

}