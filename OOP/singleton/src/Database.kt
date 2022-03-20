
// singleton
object Database {
    private val data = mutableListOf<String>()

    fun insertData(string: String) {
        data.add(string)
    }
}