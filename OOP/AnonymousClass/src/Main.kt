fun main() {
    val car: Transport = Car()
    val car2: Transport = Car()
    val bicycle: Transport = Bicycle()

//    car.name = "BMW" // Помилка, тому що car приведено до типу Transport

    if (car2 is Car) {
        car2.name = "Nisan" // тепер все добре
    }


    travel(bicycle) // drive the bicycle


    // create anonymous class
    // На приклад, якщо нам не треба створювати клас skuter, оскільки ми використаєм його лише тут
    travel(object : Transport("skuter") {
        override fun drive() {
            println("drive skuter")
        }

    })


    /**
     * Homework
     * Створити інтерфейс водоноса з методом "принеси води", і клас Sportsman з методом "покликати водоноса",
     * який в якості аргументу приймає об'єкт анонімного класу
     */
    val sportsman = Sportsman()
    sportsman.callWaterBoy(object : WaterBoy {
        override fun giveWater() {
            println("give me some water")
        }
    })


    // Теж саме, але без інтерфейсу
    sportsman.invokeHelp {
        println("Call the doctor")
    }
}


fun travel(transport: Transport) {
    transport.drive()
}