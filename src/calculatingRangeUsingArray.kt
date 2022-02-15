fun main() {
    var myArray = arrayOf(5,4,3,1)
    var sum = 0
    var arrayLenght = myArray.size
    var range = 0;

    for(num in myArray){
        sum += num
       range = sum / arrayLenght
    }
    println(range)

}