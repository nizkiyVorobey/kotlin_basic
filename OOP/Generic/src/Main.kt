import kotlin.io.println as println1

fun main() {
//    val list = MyArrayList<String>()
//    list.add("1")
//    list.add("2")
//    list.add("3")
//    list.add("4")
//    list.removeByIndex(1) // remove 2
//    list.remove("1") // remove 1
//
//    for (i in 0 until  list.size()) {
//        println1(list.get(i))
//    }


//    val list = MyArrayList<Int>()
//    list.add(1)
//    list.add(2)
//    list.add(3)
//    list.add(4)
//    list.removeByIndex(1) // remove 2
//    list.remove(1) // remove 1
//
//    for (i in 0 until  list.size()) {
//        println1(list.get(i))
//    }


    val list = MyArrayList.myArrayListOf<Int>(1,2,3,4,5)
    for (i in 0 until  list.size()) {
        println1(list.get(i))
    }
}