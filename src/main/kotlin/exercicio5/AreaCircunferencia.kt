package exercicio5

fun main() {

    var raio : Float
    val pi = 3.14159265
    var area : Double

    fun calculoCircunferencia(){

        println("Informe um valor para o raio")
        raio = readLine()?.toFloat()!!

        area = pi.times(raio.times(raio))

        println("O calculo da area é : $area")
    }

    calculoCircunferencia()

}