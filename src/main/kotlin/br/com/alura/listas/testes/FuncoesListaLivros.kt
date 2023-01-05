package br.com.alura.listas.testes

import br.com.alura.listas.Livro

fun List<Livro?>.imprimeComMarcadores(){
    val joinToString = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        "- ${it.titulo} de ${it.autor}"
    }

    println(" #### LISTA DE LIVROS #### \n$joinToString")
}
