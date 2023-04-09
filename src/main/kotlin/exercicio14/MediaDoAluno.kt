package exercicio14

fun main() {
    println("Digite as quatro notas bimestrais do aluno:")
    val nota1 = readLine()?.toDoubleOrNull() ?: 0.0
    val nota2 = readLine()?.toDoubleOrNull() ?: 0.0
    val nota3 = readLine()?.toDoubleOrNull() ?: 0.0
    val nota4 = readLine()?.toDoubleOrNull() ?: 0.0

    val media = (nota1 + nota2 + nota3 + nota4) / 4
    println("Média: $media")

    if (media >= 5) {
        println("Aprovado")
    } else {
        println("Reprovado")
    }
}
