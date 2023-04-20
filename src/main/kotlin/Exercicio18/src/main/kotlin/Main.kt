fun main() {
    val letrasScore1 = "AEIOULNRST"
    val letrasScore2 = "DG"
    val letrasScore3 = "BCMP"
    val letrasScore4 = "FHVWY"
    val letrasScore5 = "K"
    val letrasScore8 = "JX"
    val letrasScore10 = "QZ"
    var score = 0

    println("Digite a palavra:")
    val palavra = readLine()?.toUpperCase()?.replace(" ", "")

    if (palavra != null) {
        for (letra in palavra) {
            when {
                letrasScore1.contains(letra) -> score += 1
                letrasScore2.contains(letra) -> score += 2
                letrasScore3.contains(letra) -> score += 3
                letrasScore4.contains(letra) -> score += 4
                letrasScore5.contains(letra) -> score += 5
                letrasScore8.contains(letra) -> score += 8
                letrasScore10.contains(letra) -> score += 10
            }
        }
        println("Score da palavra $palavra é $score")
    } else {
        println("Palavra inválida!")
    }
}
