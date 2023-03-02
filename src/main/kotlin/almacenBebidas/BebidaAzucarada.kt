package almacenBebidas

class BebidaAzucarada(l:Double, pr:Double, marc:String, azucar:Double, prom:Boolean) : Bebida(l, pr, marc) {
    var porcentajeAzucar = 0.0
    var promocion : Boolean

    init {
        porcentajeAzucar = azucar
        promocion = prom
    }

    override fun calcular(cantidad: Int) {
        var precioFinal = 0.0
        if (promocion == true){
            precioFinal = precio*cantidad - (precio*0.1)
        }else{
            precioFinal = precio*cantidad
        }
        println("El precio final es $precioFinal")
    }

    override fun toString(): String {
        return "${super.toString()}||BebidaAzucarada(porcentajeAzucar=$porcentajeAzucar, promocion=$promocion)"
    }


}