package reloj_sin_herencia

class Reloj_Sin_Herencia(h:Int, m:Int, s:Int) {
    var hora = 0
        set(value){
            if (value>24){
                field = value%24
            }else {
                field = value
            }
        }
        get():Int{
            return field
        }
    var minuto = 0
        set(value){
            if (value>59){
                hora += value/60
                field = value%60
            }else {
                field = value
            }
        }
        get():Int{
            return field
        }
    var segundo = 0
        set(value){
            if (value>59){
                minuto += value/60
                field = value%60

            }else {
                field = value
            }
        }
        get():Int{
            return field
        }

    init {
        hora = h
        minuto = m
        segundo = s
    }

    fun display():String{
        return "Son las $hora:$minuto:$segundo"
    }

    fun tictac():String{
        segundo+=1
        return "Son las $hora:$minuto:$segundo"
    }
}