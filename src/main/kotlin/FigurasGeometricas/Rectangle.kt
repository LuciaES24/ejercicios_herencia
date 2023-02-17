package FigurasGeometricas

class Rectangle(ancho : Double, alto:Double) : Figura() {
    private var long_ancho = 0.0
    private var long_alto = 0.0

    constructor(ancho : Double, alto:Double, c:String):this(ancho,alto){
        long_alto = alto
        long_ancho = ancho
        color = c
    }

    override fun calcular_area() {
        val area = long_ancho * long_alto
        println("El área del rectángulo es $area")
    }

    override fun calcular_perimetro() {
        val perimetro = 2 * (long_alto * long_ancho)
        println("El perímetro del rectángulo es $perimetro")
    }

}