import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Bem-vindo ao Juiz de Jokenpo!")
    println("Digite a jogada do Jogador 1: ")
    val player1 = scanner.nextLine()
    println("Digite a jogada do Jogador 2: ")
    val player2 = scanner.nextLine()

    // determina o vencedor
    val result = when (player1) {
        "pedra" -> when (player2) {
            "tesoura", "lagarto" -> "Jogador 1"
            "papel", "Spock" -> "Jogador 2"
            else -> "Empate"
        }
        "papel" -> when (player2) {
            "pedra", "Spock" -> "Jogador 1"
            "tesoura", "lagarto" -> "Jogador 2"
            else -> "Empate"
        }
        "tesoura" -> when (player2) {
            "papel", "lagarto" -> "Jogador 1"
            "pedra", "Spock" -> "Jogador 2"
            else -> "Empate"
        }
        "lagarto" -> when (player2) {
            "papel", "Spock" -> "Jogador 1"
            "tesoura", "pedra" -> "Jogador 2"
            else -> "Empate"
        }
        "Spock" -> when (player2) {
            "tesoura", "pedra" -> "Jogador 1"
            "papel", "lagarto" -> "Jogador 2"
            else -> "Empate"
        }
        else -> "Opção inválida"
    }

    // exibe o resultado
    println("Jogador 1 escolheu $player1")
    println("Jogador 2 escolheu $player2")
    println("Resultado: $result")
}
