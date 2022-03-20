import java.util.*
import kotlin.math.sqrt

//fun main() {
//    // щоб присвоїти змінній функцію треба написати {} і там прописати параметри, потім -> і що поверне функція
//    // Це анонімна функція, або лямбда вираз
//    val sum = {a: Int, b: Int -> a + b}
//    val sum2: (Int, Int) -> Int = {a, b -> a + b} // те саме, тільки ми наявно вказали тип змінної
//
//    val square: (Int) -> Int = {it * it} // у нас лише одие параметр, тому ми можемо його не прописувати, Kotlin зробить це за нас ы назве його it
//    println(square(5))
//}


//fun main() {
//    val names = arrayOf("Senya", "Dmytro", "Anna", "Yulia", "Andrii")
//
//    val filterNames = names.filter { it -> it.substring(0,1) == "A" }
//
//    for ((index, i) in filterNames.withIndex()) {
//        println(filterNames[index]) // Andrii, Anna
//    }
//}


//fun main() {
//    val number = (0..100).toList()
//    val doubledNumber = number.map { it * 2 }
//    val employees = number.map { "Employee #$it" }
//
//    for (i in doubledNumber) {
//        println(i)
//    }
//}

//fun main() {
//    val number = arrayOf(3,13,4,1,31,45,41,12,55,2,1)
//    val sorted = number.sorted()
//    for (i in sorted) {
//        println(i)
//    }
//}


// Нескінченні послідовності

//fun main() {
//    val number = (0..1000).toList()
//    val employees = number.map { "Employee #$it" }
//    val first30 = employees.take(30) // takeLast - буде брати з кінця
//    val restEmployee = employees.drop(30) // викине перші 30, і поверне всі що йдуть після них
//
////    for (employee in first30) {
////        println(employee) // only first 30 employee
////    }
//
//    for (employee in restEmployee) {
//        println(employee) // Employee #30 .. Employee #1000
//    }
//}

//fun main() {
//    var arr = generateSequence(0) { it + 2 }
//    val evenList = arr.take(10)
//    for (i in evenList) {
//        println(i) // 0 2 4 6 ... 18
//    }
//
//}


//fun main() {
//    var sequence = generateSequence( 1) { it + 1 }.map { "Співробітник №${it}" }
//    val employeeList = sequence.take(100)
//    for (i in employeeList) {
//        println(i) // Співробітник №1 .. Співробітник №100
//    }
//
//}


// zip створює колекцію пар. Це буде массив зі значенняями Pair з першого массиа і другого

//fun main() {
//    var names = mutableListOf<String>()
//    var phones = mutableListOf<Long>()
//
//    for (i in 0..1000) {
//        names.add("Name$i")
//        phones.add(38_000_000_000 + (Math.random() * 1_000_000_000).toLong())
//    }
//
//    val users = names.zip(phones)
//
//    for (i in users.take(30)) {
//        println(
//            "\n" +
//                    "User: ${i.first}" +
//                    "\n" +
//                    "Phone: ${i.second}"
//        )
//    }
//}
//
//fun main() {
//    val names = mutableListOf<String>()
//    val firstNames = mutableListOf<String>()
//    val lastNames = mutableListOf<String>()
//
//    for (i in 0..1000) {
//        names.add("lastName${i * 2} firstName$i")
//    }
//
//    for (name in names) {
//        val arr = name.split(" ")
//        firstNames.add(arr[0])
//        lastNames.add(arr[1])
//    }
//
//// інший спосіб розділити firstName i lastName
//// vaд users = names.map { Pair(it.substringBefore(" "), it.substringAfter("")) }
//
//    val users = firstNames.zip(lastNames)
//
//    for (i in users.take(30)) {
//        println(
//            "\n" +
//                    "lastName: ${i.first}" +
//                    "\n" +
//                    "firstName: ${i.second}"
//        )
//    }
//}


//// FLAT_MAP з масива масивів робить однорівневий масив
//fun main() {
////    val revenueByWeek = listOf(
////        listOf(4,1,9,11,4),
////        listOf(4,4,7,9,0),
////        listOf(8,2,9,2,6),
////        listOf(1,3,3,9,8),
////    )
////
////    val total = revenueByWeek.flatMap { it }
//
//    val data = mapOf(
//        "file1" to listOf(4, 25, 61, 4, 1),
//        "file2" to listOf(5, 6, -2, 46, 1),
//        "file3" to listOf(8, 5, 7, 9, 3)
//    )
//
//    val averageAge = data.filter { it.value.all { age -> age > 0 } }.flatMap { it.value }.average()
//    println(averageAge)
//
//}


//// Контрольна
//fun main() {
//    val data = mapOf(
//        "Январь" to listOf(100, 100, 100, 100),
//        "Февраль" to listOf(200, 200, -190, 200),
//        "Март" to listOf(300, 180, 300, 100),
//        "Апрель" to listOf(250, -250, 100, 300),
//        "Май" to listOf(200, 100, 400, 300),
//        "Июнь" to listOf(200, 100, 300, 300),
//    )
//
//
//    fun printInfoData(data: Map<String, List<Int>>) {
//        val invalidData = mutableListOf<String>()
//
//        val correctData = data.filter {
//            it.value.all { money ->
//                if (money < 0) {
//                    invalidData.add(it.key)
//                }
//                money > 0
//            }
//        }
//
//        val averageInWeek = correctData.flatMap { it.value }.average()
//        val averageInMonth = correctData.map { it.value.sum() }.average()
//
//        val sumInMonth = correctData.map {
//            Pair(it.key, it.value.sum())
//        }
//        val minInMonth = sumInMonth.minByOrNull { it.second }!!
//        val maxInMonth = sumInMonth.maxByOrNull { it.second }!!
//
//        println("Середній прибуток за тиждень $averageInWeek")
//        println("Середній прибуток за місяць $averageInMonth")
//        println("Максимальний прибуток в місяць ${maxInMonth.second}")
//        println("Був у місяці ${maxInMonth.first}")
//        println("Мінімальний прибуток в місяць ${minInMonth.second}")
//        println("Був у місяці ${minInMonth.first}")
//        println("Помилки були в таких місяцях $invalidData")
//
//    }
//
//    printInfoData(data)
//
//}


//// LET / WITH
//var name: String? = null
//
//fun main() {
////    if (name == null) { // Навіць це не допоможе, бо змінна ініціалізована поза функцією і її можуть змінити з іншого потоку
////        return
////    }
////
////    if (name?.length > 5) { // we have an error
////        println("Weee")
////    }
//
//    name?.let {
//        if (it.length > 5) {
//            println("Wee")
//        }
//    }
//
//    val list = mutableListOf<Int>()
//
//
//    // Вивестисереднє , суму,  мак, мін, перше і останнє
//    // with потріба коли на треба сзробити багато опервцій з одним обєктом
//
//    with(list) {
//        for(i in 0..1000) {
//            this.add((Math.random() * 100).toInt()) // or just add. Thi it is optional, is it link to parameter (list in our case)
//        }
//        println(sum())
//        println(average())
//        println(minOrNull())
//        println(maxOrNull())
//        println(first())
//        println(last())
//    }
//
//}


//// ДЗ. Заповнити нулабельну колекцію рандомними числами і вивести перші 100 кратних 2
//val list: MutableList<Int>? = mutableListOf<Int>()
//fun main() {
//    list?.let { it ->
//        with(it) {
//            for (i in 0..1000) {
//                add((Math.random() * 1000).toInt())
//            }
//            val result = filter { it % 2 == 0 }.take(100)
//            println(result)
//        }
//    }
//
//}


//// Створення функції вищого порядка
//
//fun main() {
//    val text = modifyString("Hello world") { it.uppercase(Locale.getDefault()) }
//    println(text)
//
//    val list = listOf<Int>(1, 2, 3, 4, 5)
//    modifySum(list) {
//        println(it.sum())
//    }
//    // зараз такий виклик створює анонімний клас, це погіршує перформанс, щоб цього позбутися треба до функції modifySum дописати inline
//}
//
//fun modifyString(string: String, modify: (String) -> String): String {
//    return modify(string)
//}
//
//fun modifySum(list: List<Int>, operator: (list: List<Int>) -> Unit) {
//    operator(list)
//}
//
////inline fun modifySum(list: List<Int>, operator: (list: List<Int>) -> Unit) {
////    operator(list)
////}


// Extention Funtion

//fun main() {
//    val age = 8;
//
////    if (age.isAgeValid()) {
////        println("Age is valid!")
////    }
//
//    println(3.isPrime())
//}
//
//fun Int.isAgeValid() = this in 6..100
//fun Int.isPrime(): Boolean = run {
//    if (this >= 3) return true
//
//    for (i in 2 until this) {
//        if (this % i == 0) return false
//    }
//    return true
//}


fun main() {
    val list = listOf<Int>(1,2,3,4,5)
    with(list) {
        sum()
        average()
    }

    myWith(list) {
        sum()
        average()
    }
}

// // work only with List<Int>
// inline fun myWith(list: List<Int>, operation: List<Int>.() -> Unit) {
//    list.operation()
//}

//// with Generic type. Work with any types
//inline fun<T> myWith(list: T, operation: T.() -> Unit) {
//    list.operation()
//}

// with Generic type. Work with any types, and return generic type
inline fun<T, R> myWith(list: T, operation: T.() -> R): R {
    return list.operation()
}