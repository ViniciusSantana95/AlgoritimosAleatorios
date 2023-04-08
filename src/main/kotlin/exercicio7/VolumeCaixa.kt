package exercicio7

fun main(){

    var volume : Float
    var comprimento : Float
    var largura : Float
    var altura : Float

    fun calculoVolume(){

        println("Informe o comprimento")
        comprimento = readLine()?.toFloat()!!

        println("Informe a largura")
        largura = readLine()?.toFloat()!!

        println("Informe a altura")
        altura = readLine()?.toFloat()!!

        volume = comprimento.times(largura.times(altura))

        println("O valor do volune é $volume")

    }

    calculoVolume()
}