package alquiler_vehiculos

class Bus(mat :String, tiempo :Int, pl:Int) : VehiculoTransporte(mat, tiempo, pl) {
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
        return (50 * duracion) + (1.5 * plazas) + (2*plazas)
    }

    override fun recibo() {
        println("-------------")
        println("BUS")
        println("-------------")
        println("${super.recibo()}")
    }
}