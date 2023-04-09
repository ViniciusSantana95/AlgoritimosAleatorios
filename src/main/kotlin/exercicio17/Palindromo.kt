package exercicio17

fun main() {
    print("Digite uma palavra, frase ou número: ")
    val input = readLine()!!.trim()
    val isPalindrome = input == input.reversed()
    val palindromeMessage = if (isPalindrome) "é um palíndromo." else "não é um palíndromo."
    println("$input $palindromeMessage")
}
