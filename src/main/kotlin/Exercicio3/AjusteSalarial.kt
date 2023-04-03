package Exercicio3

fun main() {

    var salario : Float = 0F
    var reajuste : Float = 0F

    fun receberDadosSalario(){
        println("Informe o salario mensal do colaborador")
        salario = readLine()?.toFloat()!!

        println("Informe o percentual de reajuste salarial")
        reajuste = readLine()?.toFloat()!!.div(100)

    }

    fun calcularAumento(salario : Float , reajuste: Float) : Float{
        var salarioReajustado =  salario.plus(salario.times(reajuste))
        return salarioReajustado
    }

    receberDadosSalario()
    print("O valor do novo salário é : " + calcularAumento(salario, reajuste))
}