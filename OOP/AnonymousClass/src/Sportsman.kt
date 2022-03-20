
class Sportsman {
    fun callWaterBoy(waterBoy: WaterBoy) {
        waterBoy.giveWater()
    }

    // Додали inline, щоб не створювався анонімний клас
    inline fun invokeHelp(callDoctor: () -> Unit) {
        callDoctor()
    }
}