package CompraProductos

class Perecedero(name:String, price:Double, dias:Int):Producto(name, price) {
    var diasParaCaducar = 0
        set(value) {
            if (value < 1) {
                println("El producto ya está caducado, introduzca una fecha válida")
                diasParaCaducar = readln().toInt()
            }else{
                field = value
            }
        }
        get() {
            return field
        }

    init {
        diasParaCaducar = dias
    }

    override fun Calcular(cantidad: Int): Double {
        var preciofinal = 0.0
        when(diasParaCaducar){
            1 -> preciofinal = super.Calcular(cantidad)/4
            2 -> preciofinal = super.Calcular(cantidad)/3
            3 -> preciofinal = super.Calcular(cantidad)/2
            else -> preciofinal = super.Calcular(cantidad)
        }
        return preciofinal
    }

    override fun toString(): String {
        return super.toString()+" || Dias para caducar=$diasParaCaducar"
    }
}