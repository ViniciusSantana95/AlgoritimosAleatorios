package exercicio15

fun main() {
    // Solicita ao usuário os valores de início e fim do intervalo
    print("Informe o valor de início do intervalo: ")
    val inicio = readLine()?.toIntOrNull() ?: 1

    print("Informe o valor de fim do intervalo: ")
    val fim = readLine()?.toIntOrNull() ?: 100

    // Imprime o intervalo informado
    println("Intervalo: $inicio - $fim")

    // Soma todos os valores do intervalo
    var soma = 0
    for (i in inicio..fim) {
        soma += i
    }

    // Imprime o resultado da soma
    println("Soma: $soma")
}


