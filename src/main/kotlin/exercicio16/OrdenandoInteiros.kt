package exercicio16

fun main() {
    val numeros = IntArray(12)

    // Lê os números
    for (i in numeros.indices) {
        print("Digite o ${i+1}º número: ")
        numeros[i] = readLine()!!.toInt()
    }

    // Ordena em ordem decrescente
    numeros.sortDescending()

    // Imprime os números ordenados
    println("Números em ordem decrescente:")
    for (numero in numeros) {
        println(numero)
    }
}
