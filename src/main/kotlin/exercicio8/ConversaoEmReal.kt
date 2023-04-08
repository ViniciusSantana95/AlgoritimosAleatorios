package exercicio8

fun main() {
    var reais : Float
    var dolar : Float
    var quantidadeDolar : Int

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