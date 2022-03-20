fun main() {
    val student1 = Student("Senya", "Volkov", "1")
    val student2 = Student("Senya", "Volkov", "1")
    val student3 = student1.copy() // створює копію Data класу
    val student4 = student1.copy(id = "2") // створює копію Data класу, але поле id тепер буде 2

//    // Якщо Student це звичайний клас
//    println(student1) // Student@2a84aee7 - це адреса посилання, так працює метод toString по дефолту для обʼєктів
//    println(student2) // Student@a09ee92
//
//    println(student1.hashCode()) // 713338599
//    println(student2.hashCode()) // 168423058
//
//    println(student1 == student2) // порівняння об'єктів - false
//    println(student1 === student2) // порівняння посилань - false
//
//
//    // Якщо Student це data клас
//    println(student1) // Student(firstName=Senya, lastName=Volkov, id=1)
//    println(student2) // Student(firstName=Senya, lastName=Volkov, id=1)
//
//    println(student1.hashCode()) // 1647002966
//    println(student2.hashCode()) // 1647002966
//
//    println(student1 == student2) // порівняння об'єктів - true
//    println(student1 === student2) // порівняння посилань - false
//
//    // У Data класі перевизначені методи toString, equals, hashCode


    // Деструктор
    val (name, surname, id) = student1
    println("name: ${name}, last name: ${surname}, id: $id") // name: Senya, last name: Volkov, id: 1
}