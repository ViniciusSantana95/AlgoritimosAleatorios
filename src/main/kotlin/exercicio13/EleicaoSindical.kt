package exercicio13

fun main(){

    var votosCandidatoA = 0
    var votosCandidatoB = 0
    var votosCandidatoC  = 0
    var votosNulos = 0
    var votosBrancos = 0
    var totalEleitores : Int
    var votosValidos : Int
    var percentualVotosValidos : Float
    var percentualcandidatoA : Float
    var percentualcandidatoB : Float
    var percentualcandidatoC : Float
    var percentualVotosNulos : Float
    var percentualVotosBrancos : Float

    fun leituraVotos(){
        println("Informe a quantidade de votos válidos para o candidato A")
        votosCandidatoA = readLine()?.toInt()!!

        println("Informe a quantidade de votos válidos para o candidato B")
        votosCandidatoB = readLine()?.toInt()!!

        println("Informe a quantidade de votos válidos para o candidato C")
        votosCandidatoC = readLine()?.toInt()!!

        println("Informe a quantidade de votos nulos")
        votosNulos = readLine()?.toInt()!!

        println("Informe a quantidade de votos brancos")
        votosBrancos = readLine()?.toInt()!!

    }

    fun calcularPercentuais(){
        votosValidos = votosCandidatoA.plus(votosCandidatoB).plus(votosCandidatoC)
        totalEleitores = votosValidos.plus(votosNulos).plus(votosBrancos)
        percentualVotosValidos = votosValidos.toFloat().div(totalEleitores).times(100)

        percentualcandidatoA = votosCandidatoA.toFloat().div(totalEleitores).times(100)
        percentualcandidatoB = votosCandidatoB.toFloat().div(totalEleitores).times(100)
        percentualcandidatoC = votosCandidatoC.toFloat().div(totalEleitores).times(100)

        percentualVotosBrancos = votosBrancos.toFloat().div(totalEleitores).times(100)
        percentualVotosNulos = votosNulos.toFloat().div(totalEleitores).times(100)

        println("O total de eleitores foi de $totalEleitores")
        println("O percentual de votos válidos em relação ao total de eleitores foi de $percentualVotosValidos")
        println("O percentual de votos validos do candidato A em relação a quantidade de eleitores foi de : $percentualcandidatoA")
        println("O percentual de votos validos do candidato B em relação a quantidade de eleitores foi de : $percentualcandidatoB")
        println("O percentual de votos validos do candidato C em relação a quantidade de eleitores foi de : $percentualcandidatoC")
        println("O percentual de votos brancos em relação a quantidade de eleitores foi de : $percentualVotosBrancos")
        println("O percentual de votos nulos em relação a quantidade de eleitores foi de : $percentualVotosNulos")
    }
    leituraVotos()
    calcularPercentuais()
}