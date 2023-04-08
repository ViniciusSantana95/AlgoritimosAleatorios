package exercicio2

fun main() {
    var a = ""
    var b = ""
    var provisoria : String
    fun lerVariaveis(){

        println("Informe um valor para o valor A")
        a = readLine().toString()

        println("Informe um valor para o valor B")
        b = readLine().toString()

    }

    fun trocarVariaveis() : String {
        provisoria = a
        a = b
        b = provisoria
        return "O novo valor de A é $a e o novo valor de b é $b"
    }

    lerVariaveis()
    println(trocarVariaveis())
}