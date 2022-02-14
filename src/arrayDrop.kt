fun main() {
    val name = arrayOf<String>("Seyi", "Tunde", "Wunmi", "chuks","Becca")

//    Drops first two elements
    val result = name.drop(2)

//    drops the last two
    val results = name.dropLast(2)


    for(name in result){
        print(name)
    }
}

