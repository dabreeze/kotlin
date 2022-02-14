fun main() {

    // creating an array of cloud services
    val cloudService = arrayOf("Microsoft", "Amazon", "Google", "Heroku")

    val cloudServices = arrayOf<String>("Microsoft", "Amazon", "Google", "Heroku")

    println(cloudServices.get(0))
    println("Size of cloudServices array ${cloudServices.size}")

    for(i in 0..3){
        println(cloudServices[i])
    }

//    how to declare an array
    val name = arrayOf<String>("Seyi", "Tunde", "Wunmi", "chuks","Becca")
    var myArray5: IntArray = intArrayOf(3,5,6,3,44,7)

    for(i in 0..5){
//        var sum += myArray5[i]
        print(myArray5[i])
    }
    println()

    if("Amazon" in cloudServices){
        println("Amazon exists in services")
    }else {
        println("Amazon does not exist in cloudServices")
    }


}

