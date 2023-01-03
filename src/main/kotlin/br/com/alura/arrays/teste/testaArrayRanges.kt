package br.com.alura.arrays.teste

fun testaArrayRanges() {
    val serie: IntRange = 1.rangeTo(10)
    for (i in serie) {
        print("$i")
    }

    val numerosPares = 0..100 step 2
    //2.until(100) step 2
    for (numeroPar in numerosPares) {
        println("$numeroPar")
    }

    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach { println("$it") }

    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    if (salario in intervalo) {
        println("Está no intervalo")
    } else {
        ("Eāo está no intervalo")
    }
}
