package herencia_reloj

class Reloj_Alarma:Reloj {
    var hora_alarma = 0
    var minuto_alarma = 0

    constructor(h:Int, m:Int, s:Int, h_alarma:Int, m_alarma:Int):super(h, m, s){
        hora_alarma = h_alarma
        minuto_alarma = m_alarma
    }

    override fun tictac(): String {
        if (super.hora == hora_alarma) {
            if (super.minuto == minuto_alarma) {
                println("ALARMA SONANDO!!")
            }
        }
        return super.tictac()
    }
}