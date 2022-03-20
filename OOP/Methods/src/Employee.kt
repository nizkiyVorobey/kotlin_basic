import java.util.Calendar

class Employee (val name: String, val position: String, val yearOfStartWork: Int) {

    val experience: Int
    get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfStartWork

    fun work() {
        println("Work")
    }

}