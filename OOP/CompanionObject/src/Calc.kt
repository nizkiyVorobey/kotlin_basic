class Calc {
    val a = 42

    //  companion object не має доступу до того, що оза ним
    companion object {
        // val PI = .. иає getter, const це getter прибирає
        private const val PI = 3.14
        fun plusTwo(num: Int) = num + 2

        //        val b = a + 10 // Не бачить змінну а
        fun lengthOfCircle(rad: Float) = 2 * PI * rad
    }

    fun square(num: Int) = num * num
}