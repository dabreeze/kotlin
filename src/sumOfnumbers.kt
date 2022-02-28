fun main() {
    println("Enter first number to add: ")
    var numberOne = readLine()!!.toInt()
    println("Enter second number to add: ")
    var numberTwo = readLine()!!.toInt()

    var result = numberOne + numberTwo
    print("sum of numbers: $result")

}