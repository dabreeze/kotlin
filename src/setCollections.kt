fun main() {
    val intSet = setOf(2,5,28,5,4)
    val mySet : Set<Any> = setOf(2,4,5,6,3,4,6,4,"Lagos", "Abeokuta")
    println(".....print Int set.....");
    for (element in intSet){
        println(element);
    }
    println(".....print Any set.....")
    for (element in mySet){
        println(element)
    }
    println("...mySet.contains\"Lagos...")
    println(mySet.contains("Lagos"))
    println("...mySet.contains(10)...")
    println(mySet.contains(10))
    println("...mySet.containsALl(intSet)...")
    println(mySet.containsAll(intSet))

    val remainList = mySet.drop(4)
    println("..... print Set after mySet.drop(4)......")
    for (element in remainList){
        println(element)
    }



}