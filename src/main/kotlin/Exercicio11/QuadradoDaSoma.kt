package Exercicio11

fun main() {

    var valor1 : Int
    var valor2 : Int
    var valor3 : Int
    var soma : Int
    var resultado : Int

    fun receberValores(){
        println("Informe o primeiro valor")
        valor1 = readLine()?.toInt()!!

        println("Informe o segundo valor")
        valor2 = readLine()?.toInt()!!

        println("Informe o terceiro valor")
        valor3 = readLine()?.toInt()!!

        soma = valor1.plus(valor2).plus(valor3)

        resultado = soma.times(soma)

        println("O resultado da soma dos quadrados dos três valores é $resultado")

    }

    receberValores()
}