
/**
 * Worker це якийсь абстрактний клас, тому нам варто заборонити створювати його екземпляр, він все одно не має сенсу
*/

abstract class Worker(val name: String, val age: Int) {
    open fun work() {
        println("work...")
    }

    // Цей метод повинен перевизначини кожен, хто наслідується від класу Worker
    abstract fun talk()
}