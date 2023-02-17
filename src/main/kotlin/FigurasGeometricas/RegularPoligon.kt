package FigurasGeometricas

class RegularPoligon(nlados : Int, b : Double, a:Double) : Polygon(a) {
    var lados = 0
        set(value) {
            if (value<=4){
                println("El polígono regular no puede tener 4 lados o menos")
            }else{
                field = value
            }
        }
        get() {
            return field
        }
    var base = 0.0

    constructor(nlados: Int, c : String, a : Double, b: Double):this(nlados, b, a){
        apotema = a
        base = b
        lados = nlados
        color = c
    }

    override fun calcular_perimetro() {
        val perimetro = lados * base
        println("El perímetro del polígono regular es $perimetro")
    }

    override fun calcular_area() {
    }
}