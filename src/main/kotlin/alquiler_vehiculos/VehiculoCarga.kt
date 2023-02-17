package alquiler_vehiculos

abstract class VehiculoCarga(mat :String, tiempo :Int, t:Double) : Vehiculo(mat, tiempo) {
    var tara = 0.0
        set(value) {
            if (value<0){
                println("Tara inválida")
            }else{
                field = value
            }
        }
        get() {
            return field
        }

    init {
        tara = t
        matricula = mat
        duracion = tiempo
    }

    constructor():this("", 0, 0.0){
        matricula = ""
        duracion = 0
        tara = 0.0
    }

    override fun recibo() {
        println("${super.recibo()}\nTara: $tara\nImporte: ${alquiler()}")
    }
}