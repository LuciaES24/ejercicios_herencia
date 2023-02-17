package alquiler_vehiculos

import Coche

class Alquiler(num :Int) : Alquilable {
    var empresa = "Alquileres"
    var pedido : MutableList<Vehiculo> = mutableListOf()
    var numero_vehiculos = 0

    init {
        numero_vehiculos = num
    }

    constructor():this(1){
        numero_vehiculos = 0
    }

    fun menu_vehiculos() {
        for (i in 0..numero_vehiculos-1){
            println("Elija el/los vehículos que quiere alquilar:" +
                    "\n1) Coche\n2) Bus\n3) Furgoneta\n4) Camión")
            var numero_vehiculo_elegido = readln().toInt()
            when(numero_vehiculo_elegido){
                1 -> {
                    var vehiculo_elegido = Coche()
                    println("Escriba la matricula")
                    vehiculo_elegido.matricula = readln().toString()
                    println("Escriba los días que lo quiere alquilar")
                    vehiculo_elegido.duracion = readln().toInt()
                    println("Escriba el número de plazas")
                    vehiculo_elegido.plazas = readln().toInt()
                    var vehiculo = Coche(vehiculo_elegido.matricula, vehiculo_elegido.duracion,vehiculo_elegido.plazas)
                    pedido.add(vehiculo)
                }
                2 -> {
                    var vehiculo_elegido = Bus()
                    println("Escriba la matricula")
                    vehiculo_elegido.matricula = readln().toString()
                    println("Escriba los días que lo quiere alquilar")
                    vehiculo_elegido.duracion = readln().toInt()
                    println("Escriba el número de plazas")
                    vehiculo_elegido.plazas = readln().toInt()
                    var vehiculo = Bus(vehiculo_elegido.matricula, vehiculo_elegido.duracion,vehiculo_elegido.plazas)
                    pedido.add(vehiculo)
                }
                3 -> {
                    var vehiculo_elegido = Furgoneta()
                    println("Escriba la matricula")
                    vehiculo_elegido.matricula = readln().toString()
                    println("Escriba los días que lo quiere alquilar")
                    vehiculo_elegido.duracion = readln().toInt()
                    println("Escriba la tara")
                    vehiculo_elegido.tara = readln().toDouble()
                    var vehiculo = Furgoneta(vehiculo_elegido.matricula, vehiculo_elegido.duracion,vehiculo_elegido.tara)
                    pedido.add(vehiculo)
                }
                4 -> {
                    var vehiculo_elegido = Camion()
                    println("Escriba la matricula")
                    vehiculo_elegido.matricula = readln().toString()
                    println("Escriba los días que lo quiere alquilar")
                    vehiculo_elegido.duracion = readln().toInt()
                    println("Escriba la tara")
                    vehiculo_elegido.tara = readln().toDouble()
                    var vehiculo = Camion(vehiculo_elegido.matricula, vehiculo_elegido.duracion,vehiculo_elegido.tara)
                    pedido.add(vehiculo)
                }
            }
        }
    }

    override fun importeTotal() {
        var total = 0.0
        for (z in pedido){
            total += z.alquiler()
        }
        println("El importe total de su pedido es $total")
    }

    fun imprimir_recibos() {
        for (x in pedido){
            x.recibo()
        }
    }
}