package alquiler_vehiculos

abstract class Vehiculo(mat :String, tiempo :Int) {
    var matricula = ""
        set(value){
            if (matricula.length>7){
                println("Matrícula no válida")
            }else{
                field=value
            }
        }
        get() {
            return field
        }
    var duracion = 0

    init {
        matricula = mat
        duracion = tiempo
    }

    constructor():this("",0)

    abstract fun alquiler():Double

    open fun recibo(){
        println("Matrícula: $matricula\nDuración: $duracion")
    }
}