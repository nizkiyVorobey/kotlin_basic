import WeekDays.*

class MyRandom {
    companion object {
        private val weekDays = arrayListOf(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY)

        fun getNumber(from: Int, to: Int): Int {
            return (from..to).random()
        }

        fun getBoolean(): Boolean {
            val res = (0..1).random() // or randomInt(0,1)
            return res == 1
        }

        fun getWeekDay(): WeekDays {
            val index = (0..6).random()  // or randomInt(0,6)
            return weekDays[index]
        }
    }
}