package Exercicio1

fun main() {
    var nome = ""
    fun receberNomes() {
        println("Informe um nome")
        nome = readLine().toString()
    }

    fun imprimirResultado(): String{

        if(nome == "" || nome == null){
            return "Um para você, um para mim."
        }
        return "um para $nome, um para mim"
    }

    receberNomes();
    println(imprimirResultado())
}
