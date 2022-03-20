fun main() {
    val worker1 = Seller("Senya", 24)
    val worker2 = Seller("Senya2", 22)
    val worker3 = Seller("Luba", 20)
    val programmer = Programmer("Kotlin", "Dima", 26)
    val director = Director("Nick", 50)

    val workerList = listOf<Worker>(worker1, worker2, worker3, programmer, director)

//    for (worker in workerList) {
//        worker.talk()
//
//        // Якщо worker реалізує метод Cleaner то викликати його
//        if (worker is Cleaner) {
//            worker.clean()
//        }
//    }

    val cleanerList = workerList.filter { it is Cleaner }.map { it as Cleaner }

    for (cleaner in cleanerList) {
        cleaner.clean()
    }
}

