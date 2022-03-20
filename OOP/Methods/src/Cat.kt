class Cat(val name: String, var age: Int, val weight: Float = 0f) {

    // Ініціалізується один раз, при створенні класу, тому якщо ми потім змінемо age, це ніяк не змынить цю змінну
    val isHappy: Boolean = age < 6

    // коли ми будемо до неї звертатися ми будем завжди мати актуальну інфу, хоча сама змінна буде містити старе значення, але ми переписали get
    val isHappy2: Boolean
    get() = age < 6

    fun printInfo() {
        println("Name: ${name}, age ${age}, weight: $weight")
    }

    fun isOld(): Boolean = age > 12
}