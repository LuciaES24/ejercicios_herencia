package herencia_reloj

fun main() {
    var relojinicial = Reloj_Alarma(18, 35, 23, 18, 52)
    for (i in 1..1000) {
        relojinicial.tictac()
        println(relojinicial.display())
    }
}