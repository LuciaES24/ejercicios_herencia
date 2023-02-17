package reloj_sin_herencia

class Reloj_Alarma_Sin_Herencia(reloj:Reloj_Sin_Herencia, hora_A : Int, min_A:Int) {
    var reloj_actual = reloj
    var hora_alarma = 0
        get() {
            return field
        }
        set(value) {
            if (value > 24) {
                println("Error")
            } else {
                field = value
            }
        }
    var minuto_alarma = 0
        get() {
            return field
        }
        set(value) {
            if (value > 59) {
                println("Error")
            } else {
                field = value
            }
        }

    init {
        hora_alarma = hora_A
        minuto_alarma = min_A
    }

    fun display(): String {
        return "Son las ${reloj_actual.hora}:${reloj_actual.minuto}:${reloj_actual.segundo}"
    }

    fun setAlarma(): String {
        return "La alarma está establecida a las $hora_alarma:$minuto_alarma"
    }

    fun tictac(): String {
        reloj_actual.segundo += 1
        if (reloj_actual.hora == hora_alarma) {
            if (reloj_actual.minuto == minuto_alarma) {
                println("ALARMA SONANDO!!")
            }
        }
        return "Son las ${reloj_actual.hora}:${reloj_actual.minuto}:${reloj_actual.segundo}"

    }
}