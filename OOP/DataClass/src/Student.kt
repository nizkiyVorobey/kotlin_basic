data class Student (val firstName: String, val lastName: String, val id: String) {
}

//
//// Якщо клас не Data, то щоб працював Деструктор треба перевизначить component1, номер component це номер параметра, їх може бути скільки завгодно
//class Student (val firstName: String, val lastName: String, val id: String) {
//    operator fun component1() = firstName
//    operator fun component2() = lastName
//    operator fun component3() = id
//}