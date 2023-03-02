package almacenBebidas

class Almacen(estant:Int) {
    var estanteria = 0
        set(value) {
            if (value > 100){
                println("Estantería no válida")
            }else{
                field = value
            }
        }
        get() {
            return field
        }
    var mapaAlmacen = HashMap<Int,MutableList<Bebida>>()

    init {
        estanteria = estant
    }

    fun agregarProducto(estant: Int, lista:MutableList<Bebida>){
        mapaAlmacen[estant]= lista
    }

    fun calcularPrecioTotal(){
        var precioTotal = 0.0
        for ((key, value) in mapaAlmacen){
            for (bebida in value){
                println("Escriba la cantidad que quiere de ${bebida.toString()}")
                var cantidad = readln().toInt()
                precioTotal += bebida.calcular(cantidad)
            }
        }
        println("El precio total del almacén es $precioTotal")
    }

    fun calcularPrecioMarca(){
        var precioTotal = 0.0
        println("Elige la marca que quieras: ")
        var marcaElegida = readln().toString()
        for ((key, value) in mapaAlmacen) {
                for (bebida in value) {
                    if(bebida.marca == marcaElegida) {
                        println("Escriba la cantidad que quiere de ${bebida.toString()}")
                        var cantidad = readln().toInt()
                        precioTotal += bebida.calcular(cantidad)
                    }
                }
            }
        println("El precio total del almacén según la estantería es $precioTotal")
    }

    fun calcularPrecioEstanteria(){
        var precioTotal = 0.0
        println("Elige la estantería que quieras: ")
        var estanteriaElegida = readln().toInt()
        for ((key, value) in mapaAlmacen){
            if(key == estanteriaElegida){
                for (bebida in value){
                    println("Escriba la cantidad que quiere de ${bebida.toString()}")
                    var cantidad = readln().toInt()
                    precioTotal += bebida.calcular(cantidad)
                }
            }
        }
        println("El precio total del almacén según la marca es $precioTotal")
    }

    fun eliminarProducto(){

    }

    fun mostrarInfo(){
        for ((key, value) in mapaAlmacen){
            for(bebida in value){
                println(bebida.toString())
            }
        }
    }
}