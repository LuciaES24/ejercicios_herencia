package CompraProductos

open class Producto(name:String, price:Double) {
    var nombre = ""
        set(value) {
            if(value == ""){
                println("Debe introducir un nombre válido")
                nombre = readln()
            }else{
                field = value
            }
        }
        get() {
            return field
        }
    var precio = 0.0
        set(value) {
            if(precio<0.0){
                println("Debe introducir un precio válido")
                field = readln().toDouble()
            }else{
                field = value
            }
        }
        get() {
            return field
        }

    init {
        nombre = name
        precio = price
    }

    open fun Calcular(cantidad:Int):Double{
        return precio*cantidad
    }

    override fun toString(): String {
        return "Nombre=$nombre || Precio=$precio"
    }


}