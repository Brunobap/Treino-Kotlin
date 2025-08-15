// Como a classe é de dados, o nome da classe já deve ter os parâmetros do construtor padrão
data class Pessoa (
    val nome: String,
    val salario: Double,
    val cargo: String
){
    // Função chamada quando tenta printar o objeto
    override fun toString(): String {
        return "$nome - R$ $salario"
    }
}

// Dummies para usar de exemplo
val bruno = Pessoa("Bruno", 1000.00, "TI")
val pedro = Pessoa("Pedro", 700.00, "TI")
val ana = Pessoa("Ana", 5500.00, "RH")
