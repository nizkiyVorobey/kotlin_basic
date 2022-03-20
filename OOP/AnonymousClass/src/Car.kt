
// У Transport є поле, воно має getter, але не має setter, проте ми його тут перевизначаємо, тож можемо його змінювати
class Car(override var name: String = "Car") : Transport(name) {
    override fun drive() {
        println("drive the car")
    }

    fun startEngine(): Boolean {
        println("start engine")
        return true
    }
}