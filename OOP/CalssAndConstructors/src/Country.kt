//// Old variant like in JAVA
//class Country {
//    var name: String
//    var population: Long
//
//    constructor(name: String, population: Long) {
//        this.name = name
//        this.population = population
//    }
//}

// Correct variant
//class Country(var name: String, var population: Long) {
//
//}


//class Country(var name: String, var population: Long) {
//
//    // Це вторинний конструктор, в ньому ми спочатку ініціалізуємо первинний конструктор з якимись значеннями
//    // Він спрацює коли ми викличемо класс без параметрів
//    constructor() : this("", 0) {
//
//    }
//}

// Теж саме, що і в верху, але значення за замовченням ми вкажемо в первиннному конструкторі
class Country(var name: String = "", var population: Long = 0) {

}