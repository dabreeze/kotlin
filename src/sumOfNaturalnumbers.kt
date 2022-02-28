fun main() {

        println("enter number")
        var numbers = readLine()!!.toInt();
        println("enter second number")
        var numTwo = readLine()!!.toInt();

    var sum = numTwo + numbers;
    if(sum <= 0){
        println("number is not a real number")
    }else{
        println("Sum = "+ sum)
    }








}