package alquiler_vehiculos

abstract class VehiculoTransporte(mat :String, tiempo :Int, pl:Int) : Vehiculo(mat, tiempo) {
    var plazas = 0
        set(value) {
            if (value>30){
                println("Número de plazas inválido")
            }else{
                field = value
            }
        }
        get() {
            return field
        }

    init {
        matricula = mat
        duracion = tiempo
        plazas = pl
    }

    constructor():this("",0,0){
        matricula = ""
        duracion = 0
        plazas = 0
    }


    override fun recibo() {
        println("${super.recibo()}\nPlazas: $plazas\nImporte: ${alquiler()}")
    }
}