package CartasHerencia

open class CartaGenerica(p:String, n:Int) {
    var palo = ""
    var numero = 0
        set(value){
            if(value<1||value>13){
                println("Número no válido")
            }else{
                field = value
            }
        }
        get(){
            return field
        }
    init {
        palo = p
        numero = n
    }

    override fun toString(): String {
        return "CartaGenerica(palo='$palo'numero='$numero')"
    }

    open fun mostrar_Carta(){
        println("La carta es el $numero de $palo")
    }


}