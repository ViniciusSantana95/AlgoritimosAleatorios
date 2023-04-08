package exercicio6

fun main() {

    var valorHora = 0f
    var horasTrabalhadas = 0
    var descontoInss = 0f
    var salarioBruto : Float
    var totalDesconto : Float
    var salarioLiquido : Float

    fun dadosProfessor(){

        println("Informe a quantidade de horas trabalhadas")
        horasTrabalhadas = readLine()?.toInt()!!

        println("Informe o valor da hora-aula")
        valorHora = readLine()?.toFloat()!!

        println("Informe o percentual de desconto do INSS")
        descontoInss = readLine()?.toFloat()!!
    }

    fun calculoSalario(){
        salarioBruto = horasTrabalhadas.times(valorHora)
        totalDesconto = salarioBruto.times(descontoInss.div(100))
        salarioLiquido = salarioBruto.minus(totalDesconto)

        println("O total de descontos foi de $totalDesconto")
        println("O salario bruto é : $salarioBruto")
        println("O salario líquido é : $salarioLiquido")

    }

    dadosProfessor()
    calculoSalario()
}