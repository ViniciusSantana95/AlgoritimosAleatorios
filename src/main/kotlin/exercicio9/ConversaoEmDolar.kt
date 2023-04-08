package exercicio9

fun main() {
    var dolar : Float
    var conversaoDolar : Float
    var quantidadeReais : Int

    fun conversaoDolar(){
        println("Informe a cotação do dólar")
        dolar = readLine()?.toFloat()!!

        println("Informe quantos reais você tem")
        quantidadeReais = readLine()?.toInt()!!

        conversaoDolar = quantidadeReais.div(dolar)

        println("$quantidadeReais convertido em dólares é $conversaoDolar")
    }

    conversaoDolar()
}