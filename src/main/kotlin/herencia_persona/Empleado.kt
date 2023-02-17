package herencia_persona

open class Empleado: Persona {
    protected var fecha_alt = ""
    protected var sueldo_base = 0.0
        get() {
            return field
        }
        set(value) {
            if(value<0){
                println("El sueldo base no puede ser negativo")
            }else{
                field=value
            }
        }
    protected var base_horas_extras = 0.0
        get() {
            return field
        }
        set(value) {
            if(value>56){
                println("No puede haber realizado tantas horas extras")
            }else{
                field=value
            }
        }
    protected var num_horas = 0
        get() {
            return field
        }
        set(value) {
            if (value>7){
                println("No puede realizar más de 7 horas extras al mes")
            }else{
                field=value
            }
        }

    constructor(name:String, ape:String, dni:String, f_alta:String, s_base:Double,b_horas_e:Double,n_horas:Int):super(name, ape, dni){
        fecha_alt=f_alta
        sueldo_base=s_base
        base_horas_extras=b_horas_e
        num_horas=n_horas
    }

    open fun calcular_sueldo():Double{
        sueldo_base += (base_horas_extras*num_horas)
        return sueldo_base
    }
}