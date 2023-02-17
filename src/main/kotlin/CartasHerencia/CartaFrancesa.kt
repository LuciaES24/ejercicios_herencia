package CartasHerencia

class CartaFrancesa(p:String, n:Int) : CartaGenerica(p, n) {
    var palof = p
        set(value){
            if (value != "Corazones" || value != "Picas" || value != "Rombos" || value != "Tréboles"){
                println("Palo no válido")
            }else{
                field = value
            }
        }
        get() {
            return field
        }
    var numerof = n

    override fun mostrar_Carta() {
        var numerof_mostrar = ""
        when(numerof){
            in 1..9 -> println("La carta es el $numerof de $palof")
            11 -> {
                numerof_mostrar = "Jota"
                println("La carta es el $numerof_mostrar de $palof")
            }
            12 -> {
                numerof_mostrar = "Reina"
                println("La carta es el $numerof_mostrar de $palof")
            }
            13 -> {
                numerof_mostrar = "Rey"
                println("La carta es el $numerof_mostrar de $palof")
            }
        }
    }

}