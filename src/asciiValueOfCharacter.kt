import java.util.Scanner

fun main() {
    var reader = Scanner(System.`in`)

    println("enter a character: ")
    var char = reader.next().single()


    var ascii = char.code

    print("$char = $ascii")
}