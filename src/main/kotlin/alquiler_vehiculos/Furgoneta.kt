package alquiler_vehiculos

class Furgoneta(mat :String, tiempo :Int, t: Double) : VehiculoCarga(mat, tiempo, t) {
    init {
        matricula = mat
        duracion = tiempo
        tara = t
    }

    constructor():this("", 0, 0.0){
        matricula = ""
        duracion = 0
        tara = 0.0
    }

    override fun alquiler(): Double {
        return (50 * duracion) + (20 * tara)
    }

    override fun recibo() {
        println("-------------")
        println("FURGONETA")
        println("-------------")
        println("${super.recibo()}")
    }
}