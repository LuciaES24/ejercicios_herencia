package CartasHerencia

class CartaEspanola(p:String, n:Int) : CartaGenerica(p, n) {
    var paloe = p
        set(value){
            if (value != "Oros" || value != "Bastos" || value != "Copas" || value != "Espadas"){
                println("Palo no válido")
            }else{
                field = value
            }
        }
        get() {
            return field
        }
    var numeroe = n
        set(value) {
            if(value>12){
                println("Palo no válido")
            }else{
                field = value
            }
        }
        get() {
            return field
        }

    override fun mostrar_Carta() {
        var numeroe_mostrar = ""
        when(numeroe){
            in 1..9 -> println("La carta es el $numeroe de $paloe")
            10 -> {
                numeroe_mostrar = "Sota"
                println("La carta es el $numeroe_mostrar de $paloe")
            }
            11 -> {
                numeroe_mostrar = "Caballo"
                println("La carta es el $numeroe_mostrar de $paloe")
            }
            12 -> {
                numeroe_mostrar = "Rey"
                println("La carta es el $numeroe_mostrar de $paloe")
            }
        }
    }
}