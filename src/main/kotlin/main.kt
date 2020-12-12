fun main() {
    val dateString = DateString("2000-02-22-13-45")
    fun DateString.toDateNumber(): DateNumber {
        val (year, month, day, hour, minute) = this.Date.split("-").map { Integer.valueOf(it) }
        return DateNumber(year, month, day, hour, minute)
    }
    val printer = DatePrinter()
    printer.print(dateString.toDateNumber())
}