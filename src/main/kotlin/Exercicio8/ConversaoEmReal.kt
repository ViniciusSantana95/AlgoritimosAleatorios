package Exercicio8

fun main() {
    var reais : Float = 0f
    var dolar : Float = 0f
    var quantidadeDolar : Int = 0

    fun conversaoReal(){
        println("Informe a cotação do dólar")
        dolar = readLine()?.toFloat()!!

        println("Informe quantos dólares você tem")
        quantidadeDolar = readLine()?.toInt()!!

        reais = quantidadeDolar.times(dolar)
        println("O valor convertido em real é $reais")
    }

    conversaoReal()
}