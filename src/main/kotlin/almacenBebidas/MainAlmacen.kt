package almacenBebidas

fun main(){
    var bebida1 = BebidaAzucarada(2.0,2.1,"Coca Cola", 60.5,true)
    var bebida2 = AguaMineral(5.4, 1.1,"Fontnatura","Granada")
    var bebida3 = BebidaAzucarada(1.5, 1.9,"Fanta",46.7,false)
    var bebida4 = BebidaAzucarada(3.2,2.3,"Sprite",34.2,false)
    var bebida5 = AguaMineral(2.5,0.9,"Solan","Jaen")

    bebida1.calcular(5)
    println()
    bebida2.calcular(3)
    println()
    bebida3.calcular(2)
    println()
    bebida4.calcular(4)
    println()
    bebida5.calcular(8)
}