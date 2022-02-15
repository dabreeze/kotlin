import java.util.Scanner

fun main() {
    var reader = Scanner(System.`in`)

    println("vowel checker")
    var char = reader.next().single()

    when(char) {
        'a' -> println("Vowel")
        'e' -> println("vowel")
        'i' -> println("vowel")
        'o' -> println("vowel")
        'u' -> println("vowel")
        else -> println("Consonant")
    }


}