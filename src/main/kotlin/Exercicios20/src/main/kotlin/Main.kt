import java.util.*

fun main() {
    val options = arrayOf("Pedra", "Papel", "Tesoura")
    val scanner = Scanner(System.`in`)
    var playerScore = 0
    var computerScore = 0

    println("Bem-vindo ao Jankenpon!")
    println("Você irá jogar contra o computador. Ganha quem chegar a 3 pontos primeiro.")

    while (playerScore < 3 && computerScore < 3) {
        // jogador escolhe uma opção
        print("\nEscolha uma opção (Pedra, Papel ou Tesoura): ")
        val playerOption = scanner.next()

        // computador escolhe uma opção aleatória
        val computerOption = options[Random().nextInt(options.size)]

        // determina o vencedor
        val result = when (playerOption) {
            "Pedra" -> when (computerOption) {
                "Pedra" -> "empate"
                "Papel" -> "computador"
                "Tesoura" -> "jogador"
                else -> "opção inválida"
            }
            "Papel" -> when (computerOption) {
                "Pedra" -> "jogador"
                "Papel" -> "empate"
                "Tesoura" -> "computador"
                else -> "opção inválida"
            }
            "Tesoura" -> when (computerOption) {
                "Pedra" -> "computador"
                "Papel" -> "jogador"
                "Tesoura" -> "empate"
                else -> "opção inválida"
            }
            else -> "opção inválida"
        }

        // exibe o resultado
        println("Você escolheu $playerOption e o computador escolheu $computerOption.")
        when (result) {
            "jogador" -> {
                playerScore++
                println("Você ganhou essa rodada!")
            }
            "computador" -> {
                computerScore++
                println("O computador ganhou essa rodada!")
            }
            "empate" -> {
                println("Empate!")
            }
            else -> {
                println("Opção inválida. Tente novamente.")
            }
        }
        // exibe a pontuação atual
        println("Placar: Jogador $playerScore X $computerScore Computador")
    }
    // exibe o resultado final
    if (playerScore > computerScore) {
        println("\nParabéns! Você ganhou o jogo!")
    } else {
        println("\nQue pena! O computador ganhou o jogo!")
    }
}
