package herencia_persona

class Directivo:Empleado {
    private var plus_direccion = 0.0
    private var dietas = 0.0
    private var cargo = ""
    
    constructor(name:String, ape:String, dni:String, f_alta:String, s_base:Double,b_horas_e:Double,n_horas:Int, p_direccion:Double, diet:Double, puesto:String):super(name, ape, dni, f_alta, s_base, b_horas_e, n_horas){
        plus_direccion = p_direccion
        dietas = diet
        cargo = puesto
    }

    override fun calcular_sueldo():Double{
        sueldo_base = super.calcular_sueldo()+plus_direccion+dietas
        return sueldo_base
    }

    fun imprimir_nomina():String{
        return "-----------------\nNÓMINA\n-----------------\n${super.mostrar_info()}\nCargo: $cargo\nSueldo: ${calcular_sueldo()}"

    }
}