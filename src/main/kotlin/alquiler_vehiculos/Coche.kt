import alquiler_vehiculos.VehiculoTransporte

class Coche(mat :String, tiempo :Int, pl:Int) : VehiculoTransporte(mat, tiempo, pl) {
    init {
        matricula = mat
        duracion = tiempo
        plazas = pl
    }

    constructor():this("", 0, 0){
        matricula = ""
        duracion = 0
        plazas = 0
    }

    override fun alquiler(): Double {
        return (50 * duracion) + (1.5 * plazas)
    }

    override fun recibo() {
        println("-------------")
        println("COCHE")
        println("-------------")
        println("${super.recibo()}")    }
}