package Exercicio4

import kotlin.system.exitProcess

fun main() {
    var num1: Int = 0
    var num2: Int = 0

    fun principal() {
        println("Informe o numero inicial do intervalo")
        num1 = readLine()?.toInt()!!

        println("Informe o numero final do intervalor")
        num2 = readLine()?.toInt()!!

    }

    fun fizzBuzz() {
        if (num2 <= num1)
            println("O segundo número não pode ser menor ou igual ao primeiro numero!")
        for (i in num1..num2) {
            if(i == 0){
                println(i)
            } else if(i % 3 == 0 && i % 5 == 0) {
                println("FizzBuzz")
            }else if(i % 5 == 0) {
                println("Buzz")
            }else if(i % 3 == 0){
                println("Fizz")
            }else {
                println(i)
            }
        }

    }

    principal()
    fizzBuzz()
}