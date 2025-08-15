
/*
# Arrays com objetos

Objetos funcionam normalmente, como em C# ou Java.

Para fazer arrays com objetos pode se usar as funções "Array()" e "listOf(...)".

As funções de ordenamento para esse tipo de array funcionam usando um dos parâmetros para a comparação.

Os objetos podem ser ordenados no array com "sortedBy" ou agrupados por informações iguais usando "groupBy" (o resultado é um dicionário para cada grupo).
*/

fun main() {
    val funcionarios = listOf(bruno, pedro, ana)

    funcionarios.forEach { println(it) }

    println("\nTem algum 'Pedro'? ${funcionarios.any{ it.nome == "Pedro"}}\n")

    // Ordenar pelo tamanho do salário
    funcionarios.sortedBy { it.salario }
        // E já printar esse grupo ordenado
        .forEach { println(it) }
    println()

    // Agrupar por tipo de funcionário
    // o resultado deixa se ser uma lista, é um mapa iterável
    val grupos = funcionarios.groupBy { it.cargo }
    // Printa cada grupo, e como valor os objetos transformados em String
    grupos.forEach { println(it) }
}