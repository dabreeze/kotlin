fun main() {
    println("Enter a number")
    var number = readLine()!!.toInt()
    var result = number % 2
    if(result == 0){
        return println("$number is an even number")
    }else {
        println("$number is an odd number")
    }

}