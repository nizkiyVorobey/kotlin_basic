class Dog(weight: Float): Animal("Dog", weight, "land") {
    override fun eat() {
        println("eat a bone")
    }
}