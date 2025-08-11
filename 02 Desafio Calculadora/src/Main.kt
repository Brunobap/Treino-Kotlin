
/* Desafio 1:
    Com os conhecimentos apresentados, vamos criar uma calculadora que dado dois valores Float ou e um número que
    corresponde a operação (constante), retorne e imprima o resultado como Float ou uma mensagem de erro caso um
    dos valores seja nulo. Use a criatividade! Adicionar outras operações como fatorial, porcentagem, potenciação etc.
 */

fun main() {
    // Varáveis para os tipos de operação e números a serem usados
    var n1: Float? ; var n2: Float?
    var op: Int?

    println("Qual o primeiro número?")
    n1 = readln().toFloatOrNull()

    println("\nQual o segundo número?")
    n2 = readln().toFloatOrNull()

    println("\nOperações:\n" +
            "        1 Soma\n" +
            "        2 Subtração\n" +
            "        3 Multiplicação\n" +
            "        4 Divisão\n" +
            "        5 Fatorial (só usa o 1o número digitado)\n" +
            "        6 Porcentagem (*valor 1*% de *valor 2*)\n" +
            "        7 Potenciação (*valor 1* elevado a *valor 2*)")
    println("Qual o número da operação?")
    op = readln().toIntOrNull()

    /* Operações:
        1 Soma
        2 Subtração
        3 Multiplicação
        4 Divisão
        5 Fatorial
        6 Porcentagem
        7 Potenciação
     */

    // Verificação de erro
    if ((n1 == null) or (n2 == null) or (op == null)){
        // Se algum valor for nulo, printar o erro e encerrar aqui
        print("Erro: algum dos valores é nulo")
        return
    }

    // Decisão da operação
    var res: Float? = when(op){
        1 -> (n1!! + n2!!)
        2 -> (n1!! - n2!!)
        3 -> (n1!! * n2!!)
        4 -> (n1!! / n2!!)
        5 -> Fatorial(n1!!)
        6 -> ((n1!! / 100) * n2!!)
        7 -> Potencia(n1, n2!!)
        else -> -Float.MIN_VALUE
    }
    println("\n --- Resultado: $res ---")
}

// Auxiliar que faz a fatoriação, é recursiva
fun Fatorial(num:Float): Float{
    if (num == 1f) return 1f
    return (num * Fatorial(num-1))
}

// Auxiliar que faz a potenciação, é recursiva
fun Potencia(num1: Float?, num2: Float): Float{
    if (num2 == 0f) return 1f
    return num1!! * Potencia(num1, num2-1f)
}
