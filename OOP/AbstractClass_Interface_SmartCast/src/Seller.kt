class Seller(name: String, age: Int ): Worker(name, age),Cleaner {
    override fun talk() {
        println("I am a seller, I sell goods")
    }

    override fun clean() {
        println("seller cleaning")
    }
}