class Director(name: String, age: Int):Worker(name, age) {
    override fun talk() {
        println("I'm managed the company")
    }
}