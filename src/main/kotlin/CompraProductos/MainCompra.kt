package CompraProductos

fun main(){
    val compraFinal = Compra()

    fun gestionarCompra(){
        var actual = true
        while (actual == true){
            println()
            println("1) Añadir producto a la compra\n2) Eliminar producto de la compra\n3) Imprimir ticket\n4) Imprimir compra\n5) Añadir cantidad de un producto\n6) Eliminar cantidad de un producto\n7) Salir")
            print("-->")
            val opcion = readln().toInt()
            when(opcion){
                1 ->{
                    println("AÑADIR PRODUCTO")
                    println("1) Producto perecedero\n2) Producto no perecedero")
                    val opcion_tipo = readln().toInt()
                    var producto_elegido = Producto("Producto", 1.0)
                    when(opcion_tipo){
                        1 -> {
                            print("Nombre -> ")
                            val nombre_elegido = readln()
                            print("Precio -> ")
                            val precio_elegido = readln().toDouble()
                            print("Fecha de caducidad -> ")
                            val fecha = readln().toInt()
                            producto_elegido = Perecedero(nombre_elegido, precio_elegido, fecha)
                        }
                        2 -> {
                            print("Nombre -> ")
                            val nombre_elegido = readln()
                            print("Precio -> ")
                            val precio_elegido = readln().toDouble()
                            print("Tipo -> ")
                            val tipo_elegido  = readln()
                            producto_elegido = NoPerecedero(nombre_elegido, precio_elegido, tipo_elegido)
                        }
                        else -> println("Valor no válido")
                    }
                    compraFinal.comprar(producto_elegido)
                }
                2 ->{
                    println("BORRAR PRODUCTO")
                    print("Escriba el nombre del producto que quiere eliminar: ")
                    val producto_elegido = readln()
                    compraFinal.eliminarProducto(producto_elegido)
                }
                3 ->{
                    println("TICKET DE COMPRA")
                    compraFinal.imprimirTicket()
                    print("TOTAL -> ")
                    print(compraFinal.calcularPrecio())
                }
                4 ->{
                    println("COMPRA")
                    compraFinal.imprimirCompra()
                }
                5 ->{
                    println("AÑADIR CANTIDAD DE UN PRODUCTO")
                    print("Escriba el nombre del producto del que quiere añadir cantidad: ")
                    val producto_elegido = readln()
                    compraFinal.anadirCantidadProducto(producto_elegido)
                }
                6 ->{
                    println("ELIMINAR CANTIDAD DE UN PRODUCTO")
                    print("Escriba el nombre del producto del que quiere eliminar cantidad: ")
                    val producto_elegido = readln()
                    compraFinal.quitarCantidadProducto(producto_elegido)
                }
                7 ->{
                    actual = false
                }
            }
        }
    }

    gestionarCompra()
}