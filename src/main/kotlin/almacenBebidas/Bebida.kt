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


    open fun calcular(cantidad :Int){
        var precioFinal = precio*cantidad
        println("El precio final es $precioFinal")
    }

    override fun toString(): String {
        return "Bebida(identificador=$identificador, litro=$litro, precio=$precio, marca='$marca')"
    }

}