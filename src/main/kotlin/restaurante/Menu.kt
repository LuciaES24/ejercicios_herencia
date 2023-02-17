package restaurante

class Menu {
    var IVA = 0.21
    var descuento = 0.1
    var principales = mapOf("Entrecot" to 15, "Pez Espada" to 12, "Carrillada" to 10, "Dorada" to 20, "Otros" to 13)
    var principal = ""
    var bebidas_total = mapOf(1 to 1.0, 2 to 1.5, 3 to 2.0)
    var bebida = 0
    var postres_total = mapOf(1 to 2, 2 to 3, 3 to 4)
    var postre = 0
    var importe = 0.0


    constructor(desc : Double, plato : String, drink : Int, post : Int){
        descuento = desc
        principal = plato
        bebida = drink
        postre = post
    }

    fun importe(){
        println("PRINCIPAL\n-----------------\nEntrecot (15€)\nPez Espada (12€)\nCarrillada (10€)\nDorada (20€)\nOtros (13€)")
        principal = readln().toString()
        importe += principales.getOrDefault(principal, 13)

        println("BEBIDA\n-----------------\n1. Refresco (1€)\n2. Vino (1.5€)\n3. Otros (2€)")
        var bebida = readln().toInt()
        for ((beb, precio2) in bebidas_total){
            if(beb == bebida) {
                importe += precio2
            }else{
                println("Bebida no disponible")
            }
        }
        println("POSTRE\n-----------------1. Fruta (2€)\n2. Helado (3€)\n3. Otros (4€)")
        var postre = readln().toInt()
        for ((postr, precio3) in postres_total){
            if(postr == postre){
                importe += precio3
            }else{
                println("Postre no disponible")
            }
        }
        importe += importe*IVA
        importe -= importe*descuento
        println("El importe total es $importe")
    }

    fun mostrar(){
        println("El plato principal elegido es $principal\nLa bebida elegida es $bebida\nEl postre elegido es $postre\nEl importe total es $importe")
    }
}