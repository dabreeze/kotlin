fun main() {
    println("First Number to swap")
    var firstNumber = readLine()!!.toInt()
    println("Second Number to swap")
    var secondNumber = readLine()!!.toInt()

    var temp = 0

    temp = firstNumber
    firstNumber = secondNumber
    secondNumber = temp

    println("Your firstnumber is: $firstNumber and secondnumber is: $secondNumber")





}