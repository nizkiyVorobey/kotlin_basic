class Programmer(val language: String, name: String, age: Int): Worker(name, age),Cleaner {
    override fun work() {
        println("write code on {$language}")
    }

    override fun talk() {
        println("$language is the best language")
    }

    override fun clean() {
        println("programmer cleaning")
    }
}