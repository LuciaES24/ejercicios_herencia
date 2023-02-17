package CartasHerencia

fun main(){
    var carta_generica = CartaGenerica("Picas",12)
    var carta_espanola = CartaEspanola("Espadas",10)
    var carta_francesa = CartaFrancesa("Corazones",13)

    carta_generica.mostrar_Carta()
    println()
    carta_espanola.mostrar_Carta()
    println()
    carta_francesa.mostrar_Carta()
}