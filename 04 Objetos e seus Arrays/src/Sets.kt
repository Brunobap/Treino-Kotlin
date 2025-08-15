
/*
# Sets de Objetos

É possível criar arrays que se comportam como sets usando a função "setOf" no lugar de
"listOf".

Sets são capazes de fazer operações de conjunto (união, subtração e intersecção).
*/

fun main() {
    val g1 = setOf(pedro, ana)
    val g2 = setOf(bruno, pedro)

    println(g1)
    println(g2.find{ it.nome == "Bruno"})

    val uniao = g1.union(g2)
    println("\n$uniao")

    val subtracao = g1.subtract(g2)
    println("\n$subtracao")

    val interseccao = g1.intersect(g2)
    println("\n$interseccao")
}