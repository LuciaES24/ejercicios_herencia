package almacenBebidas

class AguaMineral(l:Double, pr:Double, marc:String, manantial:String) : Bebida(l, pr, marc) {
    var manantialOrigen = ""

    init {
        manantialOrigen = manantial
    }

    override fun toString(): String {
        return "${super.toString()}|| Manantial de Origen=$manantialOrigen"
    }


}