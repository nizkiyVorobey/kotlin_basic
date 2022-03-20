package kot

import kotlin.math.min

//val name: String? = null

//fun main() {
//    val len = name?.length ?: 0
//    println(len)
//}


//fun main() {
//    var count = 600
//    val food = if (count > 500) {
//        count -= 500
//        "Pasta"
//    } else if (count > 300) {
//        count -= 400
//        "Pizza"
//    } else {
//        count -= 30
//        "Mivina"
//    }
//
//    println(food)
//}

//
//fun main() {
//    val name = "Senya"
//    val age: Int = when (name) {
//        "Senya", "Dmytro", "Igor" -> {
//            10
//        }
//        "Luba", "Kolya", "Vasyl" -> {
//            15
//        }
//        else -> {
//            0
//        }
//    }
//    println(age)
//
//
//    val temp = 80
//    val state = when {
//        temp < 0 -> "Лід"
//        temp in 0..100 -> "Рідкий стан"
//        else -> "Пара"
//    }
//    println(state)
//}


//fun main() {
//    // arrays
//    val arr = arrayOf(1, 2, 3, 4) // [1,2,3,4]
//    val arr2 = arrayOfNulls<Int>(10) // [null, null, null, null, null, ...]
//
//    // collection
//    val listOfNumber = arrayListOf<Int>(1, 2, 3, 34)
//
//
//    // Краще використовувати абстракті типи (краще List ніж ArrayList)
//    val arr3: List<Int> = ArrayList() // чи LinkedList, завдяки абстракції List теж будет працювати корректно
//    arr3.add(4) // List - не можна змінювати
//
//    val arr4: MutableList<Int> = ArrayList() // mutableListOf() - теж саме
//    arr4.add(4)
//
//
//    /**
//     *  List
//     *  Map
//     *  Set
//     * Не змінні, ми не можемо в них нічого записувати, якщо треба щось записати треба використовувати
//     *  mutableListOf
//     *  mutableMapOf
//     *  mutableSetOf
//     */
//}


//fun main() {
//    val arr = arrayOfNulls<Int>(101)
//    for(i in 0..100) {
//        arr[i] = i
//    }
//
//    for((index, item) in arr.withIndex()) {
//        arr[index] = item?.times(2)
//    }
//}


//fun main() {
//    println(max(10, 30))
//    println(firstFiveChar("HelloWorld"))
//}
//fun max(a: Int, b: Int) = if (a > b) a else b
//
//fun firstFiveChar(str: String): String = str.substring(0, min(5, str.length))



//fun main() {
////    println(sum("1","3"))
//    println(sum("1","frgfr"))
//}
//
//fun sum(a: String, b: String): Int {
//    return try {
//        val numA = a.toInt()
//        val numB = b.toInt()
//
//        numA + numB
//    } catch (e: Exception) {
//        0
//    }
//}


