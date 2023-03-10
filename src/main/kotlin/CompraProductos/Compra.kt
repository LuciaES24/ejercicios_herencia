package CompraProductos

class Compra {
    var listaCompra = HashMap<Producto, Int>()

    fun comprar(product:Producto){
        for((key,value) in listaCompra){
            if(product.nombre == key.nombre){
                listaCompra.replace(key,value+1)
                break
            }else{
                print("Escriba la cantidad que quiere de ${product.nombre}:")
                val cantidadElegida = readln().toInt()
                listaCompra[product]=cantidadElegida
            }
        }
    }

    fun eliminarProducto(nombre:String){
        for((key, value)in listaCompra){
            if (key.nombre == nombre){
                listaCompra.remove(key)
                break
            }else{
                println("El producto no se encuentra en la compra")
            }
        }
    }

    fun calcularPrecio():Double{
        var precioFinal = 0.0
        for((key, value)in listaCompra){
            precioFinal += key.Calcular(value)
            }
        return precioFinal
    }

    fun imprimirCompra(){
        for ((key, value) in listaCompra){
            println(key.toString())
        }
    }

    fun imprimirTicket(){
        for((key, value)in listaCompra){
            println("$value ${key.nombre} -> ${key.Calcular(value)}")
        }
    }

    fun quitarCantidadProducto(producto: String){
        print("Escriba la cantidad que quiere quitar: ")
        val cantidadQuitar = readln().toInt()
        for ((key, value)in listaCompra){
            if (key.nombre == producto){
                val cantidadFinal  = value-cantidadQuitar
                listaCompra[key]=cantidadFinal
                println("Se ha actualizado la compra")
                break
            }else{
                println("Dicho producto no existe")
            }
        }
    }

    fun anadirCantidadProducto(producto: String){
        print("Escriba la cantidad que quiere añadir: ")
        val cantidadAnadir = readln().toInt()
        for ((key, value)in listaCompra){
            if (key.nombre == producto){
                val cantidadFinal  = value+cantidadAnadir
                listaCompra[key]=cantidadFinal
                println("Se ha actualizado la compra")
                break
            }else{
                println("Dicho producto no existe")
            }
        }
    }
}