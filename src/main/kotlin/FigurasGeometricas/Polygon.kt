package FigurasGeometricas

open class Polygon(a:Double) : Figura() {
    protected var apotema = 0.0

    constructor(a : Double, c : String):this(a){
        apotema = a
        color = c
    }

    override fun calcular_perimetro() {
        println("No se puede calcular el perímetro")
    }

    override fun calcular_area() {
        println("No se puede calcular el área")
    }
}