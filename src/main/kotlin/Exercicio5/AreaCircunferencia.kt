package Exercicio5

fun main() {

    var raio : Float = 0f
    val π : Double = 3.14159265
    var area : Double = 0.0

    fun calculoCircunferencia(){

        println("Informe um valor para o raio")
        raio = readLine()?.toFloat()!!

        area = π.times(raio.times(raio))

        println("O calculo da area é : $area")
    }

    calculoCircunferencia()

}