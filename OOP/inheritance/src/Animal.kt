
// open - ставимо, якщо хочемо, щоб від класу можна було успадковуватися, по дефолту вони всі final
open class Animal (val name: String, var weight: Float, val habitat: String) {
    open fun eat() {
        println("Eating...")
    }

    fun run() {
        println("running...")
    }
}