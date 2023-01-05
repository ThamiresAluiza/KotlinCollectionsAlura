package br.com.alura.listas.testes

import br.com.alura.listas.Livro

fun main () {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livros : MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

        livros.add(
            Livro(titulo = "Sagarama",
                autor = "Joāo Guimarāes Rosa",
                anoPublicacao = 1945,)
        )
    livros.imprimeComMarcadores()

    livros.remove(livro1)

    livros.imprimeComMarcadores()

    val ordenadoAnoPubli: List<Livro> = livros.sorted()
    ordenadoAnoPubli.imprimeComMarcadores()

    val ordenadoPorTitulo = livros.sortedBy { it.titulo }

    ordenadoPorTitulo.imprimeComMarcadores()

    livros.sortedBy { it.autor }.imprimeComMarcadores()

    val titulos : List<String> = listaDeLivros
        .filterNotNull()
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }

    println(titulos)
}


