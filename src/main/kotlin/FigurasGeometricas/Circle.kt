package FigurasGeometricas

class Circle(r:Double) : Figura() {
    private var radio = 0.0

    constructor(r:Double, c:String):this(r){
        radio = r
        color = c
    }

    override fun calcular_area() {
        val area = 3.14 * (radio*radio)
        println("El área del círculo es $area")

    }

    override fun calcular_perimetro() {
        val perimetro = 2 * 3.14 * radio
        println("El perímetro del círculo es $perimetro")
    }
}