package Exercicio7

fun main(){

    var volume : Float = 0f
    var comprimento : Float =0f
    var largura : Float =0f
    var altura : Float = 0f

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