package herencia_reloj

open class Reloj (h:Int, m:Int, s:Int){
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

    open fun tictac():String{
        segundo+=1
        return "Son las $hora:$minuto:$segundo"
    }
}
