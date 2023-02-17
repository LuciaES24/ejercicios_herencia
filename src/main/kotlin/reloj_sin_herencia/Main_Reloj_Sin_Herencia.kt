package reloj_sin_herencia

fun main(){
    var reloj1 = Reloj_Sin_Herencia(18,35,23)
    var reloj_alarma = Reloj_Alarma_Sin_Herencia(reloj1,18,52)
    for(i in 1..1000){
        reloj_alarma.tictac()
        println(reloj_alarma.display())

    }
}