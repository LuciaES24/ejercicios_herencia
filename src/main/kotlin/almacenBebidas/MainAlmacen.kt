package almacenBebidas

fun main(){

    val lista1 = mutableListOf<Bebida>()
    val lista2 = mutableListOf<Bebida>()
    val bebida1 = BebidaAzucarada(2.0,2.1,"Coca Cola", 60.5,true)
    lista1.add(bebida1)
    val bebida2 = AguaMineral(5.4, 1.1,"Fontnatura","Granada")
    lista2.add(bebida2)
    val bebida3 = BebidaAzucarada(1.5, 1.9,"Fanta",46.7,false)
    lista1.add(bebida3)
    val bebida4 = BebidaAzucarada(3.2,2.3,"Sprite",34.2,false)
    lista1.add(bebida4)
    val bebida5 = AguaMineral(2.5,0.9,"Solan","Jaen")
    lista2.add(bebida5)

    val almacen = Almacen()
    almacen.agregarProducto(2,lista1)
    almacen.agregarProducto(4,lista2)
    almacen.mostrarInfo()
    println()
    //almacen.eliminarProducto(0)
    //almacen.mostrarInfo()
    almacen.calcularPrecioTotal()
    println()
    almacen.calcularPrecioMarca()
    println()
    almacen.calcularPrecioEstanteria()

}