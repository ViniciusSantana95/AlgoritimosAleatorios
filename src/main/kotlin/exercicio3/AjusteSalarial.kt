package exercicio3

fun main() {

    var salario = 0F
    var reajuste = 0F

    fun receberDadosSalario(){
        println("Informe o salario mensal do colaborador")
        salario = readLine()?.toFloat()!!

        println("Informe o percentual de reajuste salarial")
        reajuste = readLine()?.toFloat()!!.div(100)

    }

    fun calcularAumento(salario : Float , reajuste: Float) : Float{
        return salario.plus(salario.times(reajuste))
    }

    receberDadosSalario()
    print("O valor do novo salário é : " + calcularAumento(salario, reajuste))
}