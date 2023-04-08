package exercicio10

fun main() {

    var valor1 : Int
    var valor2 : Int
    var valor3 : Int
    var resultado : Int

    fun receberValores(){
        println("Informe o primeiro valor")
        valor1 = readLine()?.toInt()!!

        println("Informe o segundo valor")
        valor2 = readLine()?.toInt()!!

        println("Informe o terceiro valor")
        valor3 = readLine()?.toInt()!!

        resultado = (valor1.times(valor1)) + (valor2.times(valor2)) + (valor3.times(valor3))

        println("O resultado da soma dos quadrados dos três valores é $resultado")

    }

    receberValores()
}