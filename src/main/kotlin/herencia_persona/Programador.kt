package herencia_persona

class Programador:Empleado {
    constructor(name:String, ape:String, dni:String, f_alta:String, s_base:Double,b_horas_e:Double,n_horas:Int):super(name, ape, dni, f_alta, s_base, b_horas_e, n_horas){
    }

    fun pedir_vacaciones():String{
        return "Hay que llegar a la siguiente entrega como sea, hasta entonces nadie puede coger vacaciones"
    }

    fun pedir_aumento():String{
        return "El jefe de departamento está de vacaciones inténtelo de nuevo cuando vuelva"
    }

    fun imprimir_nomina_prog():String{
        return "-----------------\nNÓMINA\n-----------------\n${super.mostrar_info()}\n${super.calcular_sueldo()}"
    }
}