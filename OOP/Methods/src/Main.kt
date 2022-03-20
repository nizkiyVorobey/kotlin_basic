
fun main() {
//    val cat = Cat("Bomb", 5, 3f)
//    cat.printInfo()
//    println("is cat old: ${cat.isOld()}")
//    println("is cat fat: ${cat.isFat()}")
//
//    println("is cat happy: ${cat.isHappy}") // true
//    println("is cat happy2: ${cat.isHappy2}") // true
//    cat.age = 7
//    println("is cat happy: ${cat.isHappy}") // true
//    println("is cat happy2: ${cat.isHappy2}") // false


    val employee = Employee("Senya", "software engineer", 2_000)
    employee.printInfo()

}

fun Cat.isFat() = weight > 6f
fun Employee.printInfo() = print("Name: ${name}, position: ${position}, start working at ${yearOfStartWork}, experience $experience")