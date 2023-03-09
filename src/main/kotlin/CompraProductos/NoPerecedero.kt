package CompraProductos

class NoPerecedero(name:String, price:Double, type:String):Producto(name, price) {
    var tipo = ""
        set(value) {
            if(value == ""){
                println("Debe introducir un tipo válido")
                field = readln()
            }else if(value in tipos_productos){
                field = value
            }else{
                tipos_productos.add(value)
                field = value
            }
        }
        get() {
            return field
        }

    companion object NoPerecedero{
        var tipos_productos = mutableListOf("Legumbres", "Verduras", "Bebidas")
    }

    init {
        tipo = type
    }

    override fun toString(): String {
        return super.toString()+" || Tipo=$tipo"
    }
}