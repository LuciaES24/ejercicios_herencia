package almacenBebidas

abstract class Bebida(l:Double, pr:Double, marc:String) {
    var identificador = 0
    var litro = 0.0
    var precio = 0.0
    set(value) {
        if(value<=0.0){
            println("Precio erróneo")
        }else{
            field = value
        }
    }
        get() {
            return field
        }
    var marca = ""

    companion object Bebida{
        var contador = 0
    }

    init {
        identificador = contador
        Bebida.contador ++
        litro = l
        precio = pr
        marca = marc
    }


    open fun calcular(cantidad :Int):Double{
        var precioFinal = precio*cantidad
        return precioFinal
    }

    override fun toString(): String {
        return "Marca=$marca || Identificador=$identificador || Litros=$litro || Precio=$precio"
    }

}