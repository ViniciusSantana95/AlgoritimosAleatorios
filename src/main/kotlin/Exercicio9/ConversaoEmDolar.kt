package Exercicio9

fun main() {
    var reais : Float = 0f
    var dolar : Float = 0f
    var conversaoDolar : Float = 0f
    var quantidadeReais : Int = 0

    fun ConversaoDolar(){
        println("Informe a cotação do dólar")
        dolar = readLine()?.toFloat()!!

        println("Informe quantos reais você tem")
        quantidadeReais = readLine()?.toInt()!!

        conversaoDolar = quantidadeReais.div(dolar)

        println("$quantidadeReais convertido em dólares é $conversaoDolar")
    }

    ConversaoDolar()
}