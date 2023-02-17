package FigurasGeometricas

class Square(lado : Double) : Figura() {
    private var long_lados = 0.0

    constructor(lado : Double, c : String):this(lado){
        long_lados = lado
        color = c
    }

    override fun calcular_area() {
        val area = long_lados * long_lados
        println("El área del cuadrado es $area")
    }

    override fun calcular_perimetro() {
        val perimetro = 4 * long_lados
        println("El perímetro del cuadrado es $perimetro")
    }
}