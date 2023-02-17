package herencia_persona

open class Persona (name:String, ape:String, dni:String) {
    protected var nombre = ""
    protected var apellido = ""
    protected var DNI = ""
        get(){
            return field
        }
        set(value){
            if (value.length!=9){
                println("DNI erróneo")
            }else{
                field=value
            }
        }

    init {
        nombre=name
        apellido = ape
        DNI = dni
    }

    open fun mostrar_info():String{
        return "DNI: $DNI\nNombre: $nombre $apellido"
    }
}