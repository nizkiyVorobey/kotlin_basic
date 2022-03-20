import Month.*
import Season.*

fun main() {
    val month: Month = APRIL

    val season = when(month) {
        DECEMBER, JANUARY, FEBRUARY -> WINTER
        MARCH, APRIL, MAY -> SPRING
        JUNE, JULY, AUGUST -> SUMMER
        SEPTEMBER, OCTOBER, NOVEMBER -> FALL
    }

    println(season)
    println(season.tempAverage)
}