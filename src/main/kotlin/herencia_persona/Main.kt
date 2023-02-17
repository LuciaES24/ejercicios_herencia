package herencia_persona


fun main() {
    val persona1 = Persona("Pepe", "Garcia", "73628192H")
    println(persona1.mostrar_info())
    println()

    val empleado = Empleado("Maria", "Perez", "72625294P","12/2/2012",1100.75,3.4,5)
    println(empleado.calcular_sueldo())
    println()

    val directivo = Directivo("Pedro","Gutierrez","29463728T","23/7/2007",1225.5,24.6,3,250.70,76.80,"Director Ejecutivo")
    println(directivo.imprimir_nomina())
    println()

    val programador = Programador("Laura","Martínez","83720574D","06/12/2017", 1100.75,30.4,6)
    println(programador.pedir_aumento())
    println()
    println(programador.pedir_vacaciones())
    println()
    println(programador.imprimir_nomina_prog())
}