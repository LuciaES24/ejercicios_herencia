package FigurasGeometricas

abstract class Figura() {
    protected var color = ""

    constructor(c:String):this(){
        color = c
    }

    abstract fun calcular_area()

    abstract fun calcular_perimetro()
}