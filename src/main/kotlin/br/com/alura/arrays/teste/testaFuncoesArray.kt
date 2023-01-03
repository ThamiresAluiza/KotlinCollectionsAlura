package br.com.alura.arrays.teste

fun testaFuncoesArray() {
    val idades = intArrayOf(10, 12, 18, 33, 40, 67)

    val maiorIdade = idades.max()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.min()
    println("Menor idade: $menorIdade")

    val media = idades.average()
    println("Média: $media")

    val todosMaiores = idades.all { it > 18 }
    println("Todos maiores?: $todosMaiores")

    val existeMaior = idades.any { it >= 18 }
    println("Algum alno é maior de idade? $existeMaior")

    //Só passa para a resposta quem satisfazer a condicao
    val maiores = idades.filter { it >= 18 }
    println("Maiores: $maiores")

    //Procura o primerio elemento que econtrar na condicao
    val busca = idades.find { it >= 18 }
    println("Busca: $busca")
}
